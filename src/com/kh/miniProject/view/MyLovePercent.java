package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.kh.miniProject.model.vo.Girl;
import com.kh.miniProject.model.vo.RoundOpen;


public class MyLovePercent extends JPanel{
	private JFrame start;
	private JPanel love;
	private JPanel loveIn;

	public MyLovePercent(JFrame start) {
		this.start = start;
		this.love = this;
		
		loveIn = new JPanel();
		loveIn.setLocation(150,50);
		loveIn.setSize(400,500);
		loveIn.setLayout(null);
		loveIn.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));
		
		JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
	    icon1.setBounds(0, 0, 960, 720);
		this.setLocation(0,0);
		this.setSize(960,720);
		this.setLayout(null);

		JLabel label0 = new JLabel("나의 애정도 입니다!!");
		label0.setSize(300,50);
		label0.setLocation(10,10);
		Font font=new Font("한컴 백제 M", Font.PLAIN, 15);
		label0.setFont(font);

		Image img6 = new ImageIcon("images/back.png").getImage().getScaledInstance(30, 30, 0);
		JButton exit = new JButton(new ImageIcon(img6)); 
		exit.setLocation(350,20);
		exit.setSize(30,30);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);

		loveIn.add(exit);
		

		//System.out.println(ro.getGlist().size());
		int lev =RoundOpen.getGlist().size();
		
		JLabel label1 = new JLabel("경현이는 지금 " + lev + "명과 썸타는중~~");
		label1.setSize(300, 50);
		label1.setLocation(10, 30);
		Font font1=new Font("한컴 백제 M", Font.PLAIN, 15);
		label1.setFont(font1);

		loveIn.add(label0);
		loveIn.add(label1);
		
		
		JPanel scrollback = new JPanel();
		scrollback.setLayout(null);
		scrollback.setBounds(3, 80, 390, 415);
		scrollback.setBorder(BorderFactory.createLineBorder(Color.green, 1));

		JPanel scrollpanel = new JPanel();
		scrollpanel.setLayout(null);
		scrollpanel.setPreferredSize(new Dimension(380,60*RoundOpen.getGlist().size()));
		scrollpanel.setBorder(BorderFactory.createLineBorder(Color.magenta,1));
		
		JPanel[] backpan = new JPanel[lev];  
		Image[] img = new Image[lev];        
		JLabel[] imglabel = new JLabel[lev];  
		JPanel[] mlpview = new JPanel[lev]; 
		JLabel[] redlabel = new JLabel[lev];
		
		Girl g;
		String str;
		int a = 1;
		int b = 0;
		
		int mlper=0;
		Image red = new ImageIcon("images/red.jpg").getImage().getScaledInstance(300, 30, 0);
		
		for(int i=0 ; i<lev ; i++) {
			
			backpan[i] = new JPanel();
			backpan[i].setLayout(null);
			backpan[i].setBounds(a,b, 380,50);
			backpan[i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
			
			
			//이미지 라벨
			g = RoundOpen.getGlist().get(i); //Girl 타입 g에 i번째 girl 가져오기
			str = g.getImage();  //str에 i번째 여자 이미지 디렉토리 담기
			img[i] = new ImageIcon(str).getImage().getScaledInstance(50, 50, 0);  //img[i]에 로드한 이미지 저장
			imglabel[i] = new JLabel(new ImageIcon(img[i])); //i번째 라벨에 i번째 이미지 저장
			imglabel[i].setBounds(10,3, 50, 50);
//			imglabel[i].setLocation(, );
//			imglabel[i].setSize(50,50);
			
			//애정도 패널
			mlper = g.getMylovePer();
			//mlper=50;
			mlpview[i] = new JPanel();
			mlpview[i].setLayout(null);
			mlpview[i].setBounds(70,22, 300, 12);
			mlpview[i].setBorder(BorderFactory.createLineBorder(Color.red,1));
			
			redlabel[i] = new JLabel(new ImageIcon(red));
			redlabel[i].setBounds(0,0,(mlper*3),12);
			
			mlpview[i].add(redlabel[i]);
			
			
			backpan[i].add(imglabel[i]);
			backpan[i].add(mlpview[i]);
			
			scrollpanel.add(backpan[i]);
			
			b+=60;


		}
		
		//scrollpanel.setBackground(Color.white);
		JScrollPane glistscroll = new JScrollPane(scrollpanel);
		glistscroll.setBounds(0, 0,390,415);
		glistscroll.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
		//glistscroll.setPreferredSize(new Dimension(380,50));
	
		//glistscroll.getVerticalScrollBar().setUnitIncrement(16);
		glistscroll.requestFocus();
		
		scrollback.add(glistscroll);
		loveIn.add(scrollback);
		
		this.add(loveIn);
		
		
		
		Image img1 = new ImageIcon("images/store.png").getImage().getScaledInstance(60, 60, 0);
		Image img2 = new ImageIcon("images/inventory.png").getImage().getScaledInstance(80, 80, 0);
		Image img3 = new ImageIcon("images/heart.png").getImage().getScaledInstance(60, 60, 0);
		Image img4 = new ImageIcon("images/coin.png").getImage().getScaledInstance(60, 60, 0);
		Image img5 = new ImageIcon("images/map.png").getImage().getScaledInstance(80, 80, 0);
		
		
		JButton info = new JButton((new ImageIcon(img2)));
		info.setLocation(50,50);
		info.setSize(70,70);
		JButton shop = new JButton(new ImageIcon(img1));
		shop.setLocation(50,130);
		shop.setSize(70,70);
		JButton aff = new JButton(new ImageIcon(img3));
		aff.setLocation(50,210);
		aff.setSize(70,70);
		JButton coin = new JButton(new ImageIcon(img4));
		coin.setLocation(600,50);
		coin.setSize(70,70);
		JButton map = new JButton(new ImageIcon(img5));
		map.setLocation(850,50);
		map.setSize(70,70);
		
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
		
		exit.addActionListener(new Change());
		
		this.add(info);
		this.add(shop);
		this.add(aff);
		this.add(coin);
		this.add(map);
		this.add(icon1);
		
		
		

	}
	
class Change implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, love, new Main(start));
		}
		
	}

}
