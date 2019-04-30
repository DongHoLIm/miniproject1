package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
	    coinShop.setLocation(210,50);
	    coinShop.setSize(120,50);

	    JButton exit=new JButton(new ImageIcon(img6)); 
	    exit.setLocation(450,25);
	    exit.setSize(35,35);
	    exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
	    
	    JButton btn1=new JButton("500"); 
	    btn1.setLocation(50,280);
	    btn1.setSize(75,30);
	    btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point1 =500;
				Card.plusCoin = point1;
								
			}
		});

	    JButton btn2=new JButton("1000"); 
	    btn2.setLocation(150,280);
	    btn2.setSize(75,30);
	    btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point2 =1000;
				Card.plusCoin =point2;
				
			}
		});

	    JButton btn3=new JButton("1500"); 
	    btn3.setLocation(250,280);
	    btn3.setSize(75,30);
	    btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point3 =1500;
				Card.plusCoin = point3;
				
			}
		});

	    JButton btn4=new JButton("2000"); 
	    btn4.setLocation(350,280);
	    btn4.setSize(75,30);
	    btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int point4 = 2000;
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

}
