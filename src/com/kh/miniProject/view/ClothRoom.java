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
import javax.swing.JTabbedPane;

import com.kh.miniProject.view.Main.Change5;

public class ClothRoom extends JPanel{
		private JFrame start;
		private JPanel colthroom;
		private JPanel colthroomIn;
		
		public ClothRoom(JFrame start) {
			
			this.start = start;
			this.colthroom = this;
			
			this.setLocation(0,0);
			this.setSize(960,720);
			this.setLayout(null);	
			
			JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
		    icon1.setBounds(0, 0, 960, 720);
			
			colthroomIn = new JPanel();
			colthroomIn.setLayout(null);
			colthroomIn.setLocation(150, 50);
			colthroomIn.setSize(400,500);
			colthroomIn.setBorder(BorderFactory.createLineBorder(Color.black,1));
			
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
			
			JButton exit=new JButton(new ImageIcon(img6)); 
		    exit.setLocation(350,20);
		    exit.setSize(35,35);
		    exit.setContentAreaFilled(false);
			exit.setFocusPainted(false);

		    
		    exit.addActionListener(new Change());
		    
		    JButton cloth = new JButton("ø ");
		    cloth.setBounds(10, 70, 60, 30);
		    Font font =new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 10);
			cloth.setFont(font);
		    JButton shoes = new JButton("Ω≈πﬂ");
		    shoes.setBounds(70, 70, 60, 30);
		    Font font1 =new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 10);
			shoes.setFont(font1);
		    JButton acc = new JButton("æ«ººªÁ∏Æ");
		    acc.setBounds(130, 70, 80, 30);
		    Font font2 =new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 10);
			acc.setFont(font2);
		    JButton item = new JButton("æ∆¿Ã≈€");
		    item.setBounds(190, 70, 70, 30);
		    Font font3 =new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.PLAIN, 10);
			item.setFont(font3);
		    
		    cloth.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					colthroomIn.remove(AccPanel.acc);
					colthroomIn.remove(ItemPanel.item);
					colthroomIn.remove(ShoesPanel.shoes);
					colthroomIn.add(ClothPanel.cloth);
					colthroomIn.repaint();
				}
			});
		    
		    shoes.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					colthroomIn.remove(ClothPanel.cloth);
					colthroomIn.remove(AccPanel.acc);
					colthroomIn.remove(ItemPanel.item);
					colthroomIn.add(ShoesPanel.shoes);
					colthroomIn.repaint();
					
				}
			});
		    
		    acc.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					colthroomIn.remove(ClothPanel.cloth);
					colthroomIn.remove(ShoesPanel.shoes);
					colthroomIn.remove(ItemPanel.item);
					colthroomIn.add(AccPanel.acc);
					colthroomIn.repaint();
					
				}
			});
		    
		    item.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					colthroomIn.remove(ClothPanel.cloth);
					colthroomIn.remove(ShoesPanel.shoes);
					colthroomIn.remove(AccPanel.acc);
					colthroomIn.add(ItemPanel.item);
					colthroomIn.repaint();
					
				}
			});
		    
		    
		    this.add(info);
		    this.add(shop);
		    this.add(aff);
		    this.add(coin);
		    this.add(map);
		    colthroomIn.add(exit);
		    colthroomIn.add(shoes);
		    colthroomIn.add(acc);
		    colthroomIn.add(item);
		    colthroomIn.add(cloth);
			
			this.add(colthroomIn);
			this.add(icon1);
			
		}
		
		class Change implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ChangePanel(start, colthroom, new Main(start));		
				
			}
			
		}
}
