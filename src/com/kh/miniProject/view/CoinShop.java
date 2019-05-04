
package com.kh.miniProject.view;

import java.awt.Color;
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

import com.kh.miniProject.view.PlayerInfo.Change3;
import com.kh.miniProject.view.PlayerInfo.Change4;
import com.kh.miniProject.view.PlayerInfo.Change5;

public class CoinShop extends JPanel{
	private JFrame start;
	private JPanel coin;
	private JPanel coinIn;
	Card d = new Card(start);
	
	public CoinShop(JFrame start) {
		this.start = start;
		this.coin = this;
		
		
		this.setLocation(0,0);
		this.setSize(960,720);
		this.setLayout(null);
		
		JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
	    icon1.setBounds(0, 0, 960, 720);
		
		coinIn=new JPanel();
		coinIn.setLayout(null);
		coinIn.setLocation(400, 170);
		coinIn.setSize(500,400);
		coinIn.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));
		
		Image img = new ImageIcon("images/store.png").getImage().getScaledInstance(60, 60, 0);
		Image img2 = new ImageIcon("images/inventory.png").getImage().getScaledInstance(80, 80, 0);
		Image img3 = new ImageIcon("images/heart.png").getImage().getScaledInstance(60, 60, 0);
		Image img4 = new ImageIcon("images/coin.png").getImage().getScaledInstance(60, 60, 0);
		Image img5 = new ImageIcon("images/map.png").getImage().getScaledInstance(80, 80, 0);
		Image img6 = new ImageIcon("images/back.png").getImage().getScaledInstance(30, 30, 0);
		
		
		
		JButton info = new JButton((new ImageIcon(img2)));
		info.setLocation(50,50);
		info.setSize(70,70);
		JButton shop = new JButton(new ImageIcon(img));
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
		
	    JLabel coinShop= new JLabel("\ncoinShop");
	    coinShop.setLocation(165,50);
	    coinShop.setSize(200,50);
	    Font font =new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 30);
	    coinShop.setFont(font);

	    JButton exit=new JButton(new ImageIcon(img6)); 
	    exit.setLocation(450,25);
	    exit.setSize(35,35);
	    exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
	    
		Image icon11=new ImageIcon("images/5000.png").getImage()
				.getScaledInstance(150, 150, 0);
		JLabel label1=new JLabel(new ImageIcon(icon11));
		label1.setLocation(15,120);
		label1.setSize(150, 150);
	    JButton btn1=new JButton("5000"); 
	    btn1.setLocation(50,280);
	    btn1.setSize(75,30);
	    Font font1 =new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 15);
	    btn1.setFont(font1);
	    btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point1 =5000;
				Card.plusCoin = point1;
								
			}
		});
	    
	    Image icon12=new ImageIcon("images/10000.png").getImage()
				.getScaledInstance(100, 150, 0);
		JLabel label2=new JLabel(new ImageIcon(icon12));
		label2.setLocation(120,120);
		label2.setSize(100, 150);
	    JButton btn2=new JButton("10000"); 
	    btn2.setLocation(150,280);
	    btn2.setSize(75,30);
	    Font font2 =new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 15);
	    btn2.setFont(font2);
	    btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point2 =10000;
				Card.plusCoin =point2;
				
			}
		});
	    Image icon13=new ImageIcon("images/30000.png").getImage()
				.getScaledInstance(150, 150, 0);
		JLabel label3=new JLabel(new ImageIcon(icon13));
		label3.setLocation(200,120);
		label3.setSize(150, 150);
	    JButton btn3=new JButton("30000"); 
	    btn3.setLocation(250,280);
	    btn3.setSize(75,30);
	    Font font3 =new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 15);
	    btn3.setFont(font3);
	    btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point3 =30000;
				Card.plusCoin = point3;
				
			}
		});

	    Image icon14=new ImageIcon("images/5000.png").getImage()
				.getScaledInstance(150, 150, 0);
		JLabel label4=new JLabel(new ImageIcon(icon14));
		label4.setLocation(300,120);
		label4.setSize(150, 150);
	    JButton btn4=new JButton("50000"); 
	    btn4.setLocation(350,280);
	    btn4.setSize(75,30);
	    Font font4 =new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 15);
	    btn4.setFont(font4);
	    btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point4 = 50000;
				Card.plusCoin =point4;
				
			}
		});
	    
	    exit.addActionListener(new Change());
	    btn1.addActionListener(new Change2());
	    btn2.addActionListener(new Change2());
	    btn3.addActionListener(new Change2());
	    btn4.addActionListener(new Change2());
	    
	    
	    coinIn.add(coinShop);
	    coinIn.add(exit);
	    coinIn.add(btn1);
	    coinIn.add(btn2);
	    coinIn.add(btn3);
	    coinIn.add(btn4);
	    coinIn.add(label1);
	    coinIn.add(label2);
	    coinIn.add(label3);
	    coinIn.add(label4);
	    
	    info.addActionListener(new Change3()); 
		shop.addActionListener(new Change4());
		aff.addActionListener(new Change5());
		map.addActionListener(new Change6());

	    
	    
	    this.add(map);
		this.add(info);
		this.add(coin);
		this.add(shop);
		this.add(aff);
	    this.add(coinIn);
	    this.add(icon1);
//	    main.add(this);
//	    main.repaint();
	}
	
//	class Change implements ActionListener{
//
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			ChangePanel.ChangePanel(main, coin, new PlusCoin(main));			
//		}
//
//		
//	}
	
//	class Delete implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			DeletePanel.DeletePanel(main, coin);
//			
////		}
//	
//			
//		}
	
	class Change implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, coin, new Main(start));			
		}

		
	}
	
	class Change2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			ChangePanel.ChangePanel(start, coin, new PlusCoin(start));
			
		}
		
	}
	
	class Change3 implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, coin, new PlayerInfo(start));			
		}

		
	}
	
	class Change4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, coin, new StoreMain(start));
			
		}
		
	}
	
	
	class Change5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, coin, new MyLovePercent(start));
		}

	}
	
	class Change6 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(Main.totalDay == 11) {
				ChangePanel.ChangePanel(start, coin, new Ending(start));
			}else {
				ChangePanel.ChangePanel(start, coin,new MiniMap(start));

			}
		}

	}
	

}
