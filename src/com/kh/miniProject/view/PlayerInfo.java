
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


public class PlayerInfo extends JPanel{
	private JFrame start;
	private JPanel pinfo;
	private JPanel playerInfoIn;
	public static int lev = 1;
	public static int exper=0;
	public static int charmm=0;
	

	public static int levBreak = 0;
	public static int getLevBreak() {
		return levBreak;
	}

	public static void setLevBreak(int levBreak) {
		PlayerInfo.levBreak = levBreak;
	}


	private JLabel levelIn;

	public PlayerInfo(JFrame start) {
		this.start = start;
		this.pinfo = this;    
		
		this.setLocation(0,0);
		this.setSize(960,720);
		this.setLayout(null);
		JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
	    icon1.setBounds(0, 0, 960, 720);
		playerInfoIn = new JPanel();
		playerInfoIn.setLayout(null);
		playerInfoIn.setLocation(150, 50);
		playerInfoIn.setSize(400,500);
		playerInfoIn.setBorder(BorderFactory.createLineBorder(Color.black,1));
		
		
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
		
		Image icon = new ImageIcon("images/people.png").getImage().getScaledInstance(200, 300, 0);;
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(icon));
		label.setLocation(100,200);
		label.setSize(200,300);
		JButton exit = new JButton(new ImageIcon(img6));		
		exit.setLocation(350,20);
		exit.setSize(25,25);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		JButton cloth = new JButton("옷장");		
		cloth.setLocation(310, 420);
		cloth.setSize(70,30);
		Font font=new Font("한컴 백제 M", Font.PLAIN, 15);
		cloth.setFont(font);
		JLabel level = new JLabel("Leve l :");
		level.setLocation(180,180);
		level.setSize(110,30);
		Font font1=new Font("한컴 백제 M", Font.PLAIN, 15);
		level.setFont(font1);
		JLabel charm = new JLabel("쨍횇쨌횂쨉쨉 : ");
		charm.setLocation(100,130);
		charm.setSize(50,20);
		Font font2=new Font("한컴 백제 M", Font.PLAIN, 15);
		charm.setFont(font2);
		JLabel exper = new JLabel("째챈횉챔횆징 : ");
		exper.setLocation(100,150);
		exper.setSize(50,20);
		Font font3=new Font("한컴 백제 M", Font.PLAIN, 15);
		exper.setFont(font);
		String strlev = String.valueOf(lev).toString();
		levelIn = new JLabel(strlev);
		levelIn.setBounds(210,145,100,100);
		
		exit.addActionListener(new Change());
		cloth.addActionListener(new Change2());
		
		playerInfoIn.add(label);
		playerInfoIn.add(exit);
		playerInfoIn.add(cloth);
		playerInfoIn.add(level);
		playerInfoIn.add(charm);
		playerInfoIn.add(exper); 
		playerInfoIn.add(levelIn);
		
		this.add(map);
		this.add(info);
		this.add(coin);
		this.add(shop);
		this.add(aff);
		this.add(playerInfoIn);
		this.add(icon1);
		
//		main.add(this);
//		main.repaint();
	}
	
	public JFrame getStart() {
		return start;
	}

	public void setStart(JFrame start) {
		this.start = start;
	}

	public JPanel getPinfo() {
		return pinfo;
	}

	public void setPinfo(JPanel pinfo) {
		this.pinfo = pinfo;
	}

	public JPanel getPlayerInfoIn() {
		return playerInfoIn;
	}

	public void setPlayerInfoIn(JPanel playerInfoIn) {
		this.playerInfoIn = playerInfoIn;
	}

	public static int getLev() {
		return lev;
	}

	public static void setLev(int lev) {
		PlayerInfo.lev = lev;
	}

	public JLabel getLevelIn() {
		return levelIn;
	}

	public void setLevelIn(JLabel levelIn) {
		this.levelIn = levelIn;
	}
	
	public int getExper() {
		return exper;
	}

	public void setExper(int exper) {
		this.exper = exper;
	}





	class Change implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, pinfo, new Main(start));			
		}

		
	}
	
	class Change2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, pinfo, new ClothRoom(start));
			
		}
		
	}

}

