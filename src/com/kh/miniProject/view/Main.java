
package com.kh.miniProject.view;

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Calendar;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.kh.miniProject.model.vo.GirlImageOut;
import com.kh.miniProject.model.vo.PointMinus;

public class Main extends JPanel{
	private JFrame start;
	private JPanel main;
	public static String str = "아침";
	public static int day = 0;
	public static int dayBreak =0;
    public static int totalDay =10;  
    public static int day2 = 0;
   // static int totalDay2 = 1;
    public static String coinstr;
    private Clip clip;
   
	public Main(JFrame start) {
	
		this.start = start;
		this.main = this;

		this.setLocation(0,0);
		this.setSize(960,720);
		this.setLayout(null);

		

		Image icon = new ImageIcon("images/people.png").getImage().getScaledInstance(200, 300, 0);;
		JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
	    icon1.setBounds(0, 0, 960, 720);

		
		String startMent = null;
		int mentRan = (int)(Math.random()*5)+1;
		
		switch(mentRan) {
		case 1 : startMent = "\n\n 아 연애 하고싶다~"; break;
		case 2 : startMent = "\n\n 오늘은 어떤 여자를 만날까~?";
		try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/2.wav"));
            clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            
        } catch(Exception e) {
            
            e.printStackTrace();
        }break;
		case 3 : startMent = "\n\n 오늘은 누구와 데이트 해볼까~?"; break;
		case 4 : startMent = "\n\n 모쏠 탈출 가즈아~~"; break;
		case 5 : startMent = "\n\n 아 여자친구 사귀고 싶다~"; 
		try {
            
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/5.wav"));
            clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            
        } catch(Exception e) {
            
            e.printStackTrace();
        }break;
			
		}
		Image img = new ImageIcon("images/store.png").getImage().getScaledInstance(60, 60, 0);
		Image img2 = new ImageIcon("images/inventory.png").getImage().getScaledInstance(80, 80, 0);
		Image img3 = new ImageIcon("images/heart.png").getImage().getScaledInstance(60, 60, 0);
		Image img4 = new ImageIcon("images/coin.png").getImage().getScaledInstance(60, 60, 0);
		Image img5 = new ImageIcon("images/map.png").getImage().getScaledInstance(80, 80, 0);
		
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(icon));
		label.setLocation(350,310);
		label.setSize(200,300);
		JButton info = new JButton((new ImageIcon(img2)));
		info.setLocation(50,50);
		info.setSize(70,70);
		JButton shop = new JButton(new ImageIcon(img));
		shop.setLocation(50,130);
		shop.setSize(70,70);
		shop.addActionListener(new Change5()); 
		JButton aff = new JButton(new ImageIcon(img3));
		aff.setLocation(50,210);
		aff.setSize(70,70);
		JButton coin = new JButton(new ImageIcon(img4));
		coin.setLocation(600,50);
		coin.setSize(70,70);
		JButton map = new JButton(new ImageIcon(img5));
		map.setLocation(850,50);
		map.setSize(70,70);
		map.addActionListener(new Change6()); 
		JTextArea textArea = new JTextArea(10,30);
		textArea.setLocation(200,500);
		textArea.setSize(500,100);
		textArea.setText(startMent);
		textArea.setEditable(false);
		
		
		TitledBorder oneTb = new TitledBorder(new LineBorder(Color.BLUE), "경현");
		oneTb.setTitleColor(Color.BLACK);
		textArea.setBorder(oneTb);
		textArea.setCaretColor(Color.cyan);
		textArea.setFont(getFont().deriveFont(15.0f));
		textArea.setBackground(Color.LIGHT_GRAY);
		Font font =new Font("휴먼편지체", Font.BOLD, 20);
		textArea.setFont(font);
		
		JLabel textlabel = new JLabel();
		textlabel.setText(str);
		textlabel.setLocation(350,20);
		textlabel.setSize(50,20);
		Font font3 =new Font("휴먼편지체", Font.BOLD, 20);
		textlabel.setFont(font3);
		JLabel textlabel2 = new JLabel();
		textlabel2.setLocation(290,20);
		textlabel2.setSize(50,20);
		textlabel2.setText(totalDay + "일차");
		Font font1 =new Font("휴먼편지체", Font.BOLD, 19);
		textlabel2.setFont(font1);
		JLabel textLabel2 = new JLabel();
		Font font4 =new Font("휴먼편지체", Font.BOLD, 20);
		textLabel2.setFont(font4);
		coinstr = Integer.valueOf(PointMinus.resultcoin).toString();
		textLabel2.setLocation(680,40);
		textLabel2.setSize(100,50);
		if(!coinstr.equals(0)) {
			textLabel2.setText(coinstr);			
		}else {
			textLabel2.setText("0");	
		}
		
		info.setContentAreaFilled(false);
		info.setFocusPainted(false);
		shop.setContentAreaFilled(false);
		shop.setFocusPainted(false);
		aff.setContentAreaFilled(false);
		aff.setFocusPainted(false);
		coin.setContentAreaFilled(false);
		coin.setFocusPainted(false);
		map.setContentAreaFilled(false);
		map.setFocusPainted(false);
	
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH )+1;
		int date = c.get(Calendar.DATE)+totalDay-1;
		String days = year + "년" + month + "월" + date + "일";
		JLabel dayday = new JLabel(days);
		dayday.setBounds(400, 20, 400, 20);
		this.add(dayday);
		Font font2 =new Font("휴먼편지체", Font.BOLD, 20);
		dayday.setFont(font2);
		
		
		
		info.addActionListener(new Change());

		//aff.addActionListener(new PlusLove());
		coin.addActionListener(new Change2());

		aff.addActionListener(new Change1());
		//coin.addActionListener(new PlusCoin());

		
		this.add(map);
		this.add(textArea);
		this.add(textlabel);
		this.add(textlabel2);
		this.add(textLabel2);
		this.add(label);
		this.add(info);
		this.add(shop);
		this.add(aff);
		this.add(coin);
		this.add(icon1);
		//start.add(this);
		
//		Main main = this;
		
	}
//	class PlusInfo implements ActionListener{
//		
//		@Override
//		public void actionPerformed(ActionEvent arg0) {
//			new PlayerInfo(main);
//			
//		}
//		
//	}
//	
//	class PlusLove implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			new MyLovePercent(main);
//			
//		}
//		
//	}
//	
//	class PlusCoin implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			new CoinShop(main);
//			
//		}
//		
//	}
	
	class Change implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, main, new PlayerInfo(start));			
		}

		
	}

	class Change2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e1) {
			ChangePanel.ChangePanel(start, main, new CoinShop(start));
			
		}

	}
	

	
	
	class Change1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, main, new MyLovePercent(start));
		}

	}
	class Change5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, main, new StoreMain(start));
			
		}
		
	}
	class Change6 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if(day == 3 && totalDay != 11) {
					
					day = 0;
					dayBreak = 0;
					for(int clear = 0 ; clear < MiniMap.temp.length ; clear++) {
						MiniMap.temp[clear] = 0;
//						MiniMap.temp2[clear] = 0;
//						MiniMap.temp3[clear] = 0;
						
					}
					
				}else if(totalDay == 11) {
					
					ChangePanel.ChangePanel(start, main, new Ending(start));
				}
				else if(dayBreak == 0 && totalDay != 11 ) {
					dayBreak = 1;
					ChangePanel.ChangePanel(start, main, new MiniMap(start));
				}else if(dayBreak == 3 && day == 1 && totalDay != 11) {
					dayBreak += 1;
					ChangePanel.ChangePanel(start, main, new MiniMap(start));
					
				}else if(dayBreak == 6 && day == 2 && totalDay != 11) {
					dayBreak += 1;
					ChangePanel.ChangePanel(start, main, new MiniMap(start));
				}else if(totalDay != 11) {
					ChangePanel.ChangePanel(start, main, new MiniMap(start));
				}
				
			
			
			}
			
		}
		
	
	


}

