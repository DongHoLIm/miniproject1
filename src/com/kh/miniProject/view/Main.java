
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

import com.kh.miniProject.controller.DayController;
import com.kh.miniProject.controller.EpilogueController;
import com.kh.miniProject.controller.GirlImageController;
import com.kh.miniProject.controller.GirlNumberController;
import com.kh.miniProject.controller.InfoController;
import com.kh.miniProject.controller.LovePerController;
import com.kh.miniProject.controller.PointController;
import com.kh.miniProject.controller.RandomPlaceController;
import com.kh.miniProject.controller.RoundOpenController;


public class Main extends JPanel{
	private JFrame start;
	private JPanel main;
    public  Clip clip2;
    public static PointController pc = new PointController();
    public static InfoController ic = new InfoController();
    public static DayController dc = new DayController();
    public static LovePerController lc = new LovePerController();
    public static RandomPlaceController rc = new RandomPlaceController();
    public static RoundOpenController oc = new RoundOpenController();
    public static GirlNumberController gc = new GirlNumberController();
    public static EpilogueController ec = new EpilogueController();
    public static GirlImageController mc = new GirlImageController();
    
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
		case 1 : startMent = "\n 아 연애 하고싶다~";
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/1.wav"));
			clip2 = AudioSystem.getClip();
			clip2.open(stream);
			clip2.start();  
		} catch(Exception e) {

			e.printStackTrace();
		}break;
		
		case 2 : startMent = "\n 오늘은 어떤 여자를 만날까~?";
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/2.wav"));
			clip2 = AudioSystem.getClip();
			clip2.open(stream);
			clip2.start();
        } catch(Exception e) {
            
            e.printStackTrace();
        }break;
		
		case 3 : startMent = "\n 오늘은 누구와 데이트 해볼까~?";
		try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/3.wav"));
            clip2 = AudioSystem.getClip();
            clip2.open(stream);
            clip2.start();
        } catch(Exception e) {
            
            e.printStackTrace();
        }break;
		
		case 4 : startMent = "\n 모쏠 탈출 가즈아~~"; 
		try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/4.wav"));
            clip2 = AudioSystem.getClip();
            clip2.open(stream);
            clip2.start();
        } catch(Exception e) {
            
            e.printStackTrace();
        }break;
		
		case 5 : startMent = "\n 아 여자친구 사귀고 싶다~"; 
		try {

			AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/5.wav"));
			clip2 = AudioSystem.getClip();
			clip2.open(stream);
			clip2.start();
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
		textlabel.setText(dc.getDate().getStr());
		textlabel.setLocation(350,20);
		textlabel.setSize(50,20);
		Font font3 =new Font("휴먼편지체", Font.BOLD, 20);
		textlabel.setFont(font3);
		
		JLabel textlabel2 = new JLabel();
		textlabel2.setLocation(290,20);
		textlabel2.setSize(100,20);
		textlabel2.setText(dc.getDate().getTotalDay() + "일차");
		Font font1 =new Font("휴먼편지체", Font.BOLD, 19);
		textlabel2.setFont(font1);
		
		JLabel textLabel2 = new JLabel();
		Font font4 =new Font("휴먼편지체", Font.BOLD, 20);
		
		textLabel2.setFont(font4);
		textLabel2.setLocation(680,40);
		textLabel2.setSize(100,50);
		
		if(!Integer.valueOf(pc.getP().getResultcoin()).toString().equals(0)) {
			textLabel2.setText(Integer.valueOf(pc.getP().getResultcoin()).toString());			
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
		int date = c.get(Calendar.DATE)+dc.getDate().getTotalDay()-1;
		String days = year + "년" + month + "월" + date + "일";
		JLabel dayday = new JLabel(days);
		dayday.setBounds(400, 20, 400, 20);
		this.add(dayday);
		Font font2 =new Font("휴먼편지체", Font.BOLD, 20);
		dayday.setFont(font2);
		
		
		
		info.addActionListener(new Change());
		aff.addActionListener(new Change1());
		coin.addActionListener(new Change2());

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
		
	}
	
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
				if(dc.getDate().getDay() == 3 && dc.getDate().getTotalDay() != 11) {
					
					dc.getDate().setDay(0);
					dc.getDate().setDayBreak(0);
					
				}else if(dc.getDate().getTotalDay() == 11) {
					
					ChangePanel.ChangePanel(start, main, new Ending(start));
				}
				else if(dc.getDate().getDayBreak() == 0 && dc.getDate().getTotalDay() != 11 ) {
					dc.getDate().setDayBreak(1);
					ChangePanel.ChangePanel(start, main, new MiniMap(start));
				}else if(dc.getDate().getDayBreak() == 3 && dc.getDate().getDay() == 1 && dc.getDate().getTotalDay() != 11) {
					dc.getDate().setDayBreak(dc.getDate().getDayBreak()+1);
					ChangePanel.ChangePanel(start, main, new MiniMap(start));
					
				}else if(dc.getDate().getDayBreak() == 6 && dc.getDate().getDay() == 2 && dc.getDate().getTotalDay() != 11) {
					dc.getDate().setDayBreak(dc.getDate().getDayBreak()+1);
					ChangePanel.ChangePanel(start, main, new MiniMap(start));
				}else if(dc.getDate().getTotalDay() != 11) {
					ChangePanel.ChangePanel(start, main, new MiniMap(start));
				}
				
			
			
			}
			
		}

}

