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

import com.kh.miniProject.view.PlusCoin.Change;

public class PlusCoin extends JPanel{
	private JFrame start;
	private JPanel plus;
	private JPanel plusIn;

	public PlusCoin(JFrame start) {
		this.start = start;
		this.plus = this;
		
		this.setLocation(0,0);
		this.setSize(960, 720);
		this.setLayout(null);
		
		plusIn=new JPanel();
		plusIn.setLayout(null);
		plusIn.setLocation(400,180);
		plusIn.setSize(300,200);
		plusIn.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));

		JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
	    icon1.setBounds(0, 0, 960, 720);
	    

		
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

		JLabel pluscoin= new JLabel("구매하시겠습니까???");
		pluscoin.setLocation(75,45);
		pluscoin.setSize(300,50);
		Font font =new Font("휴먼편지체", Font.BOLD, 15);
		pluscoin.setFont(font);

		JButton exit=new JButton(new ImageIcon(img6)); 
		exit.setLocation(250,10);
		exit.setSize(30,30);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);


		JButton btn5=new JButton("Yes"); 
		btn5.setLocation(50,125);
		btn5.setSize(70,30);
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		btn5.setFont(font1);

		JButton btn6=new JButton("no"); 
		btn6.setLocation(150,125);
		btn6.setSize(70,30);
		Font font2 =new Font("휴먼편지체", Font.BOLD, 15);
		btn6.setFont(font2);

		exit.addActionListener(new Change());
		btn5.addActionListener(new Change2());

		plusIn.add(pluscoin);
		plusIn.add(exit);
		plusIn.add(btn5);
		plusIn.add(btn6);
		
		this.add(map);
		this.add(info);
		this.add(coin);
		this.add(shop);
		this.add(aff);
	    this.add(plusIn);
	    this.add(icon1);
	}
	
//	class Delete implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			DeletePanel.DeletePanel(main, plus);
//			
//		}
//		
//	}
	class Change implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, plus, new Main(start));			
		}

		
	}
	class Change2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			ChangePanel.ChangePanel(start, plus, new Card(start));
			
		}
		
	}

}
