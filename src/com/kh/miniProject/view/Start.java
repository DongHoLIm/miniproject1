package com.kh.miniProject.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Start extends JFrame {
   
    private JFrame start;
    private JPanel startmain;
    private Image  img;
    
    
 
    public Start() {
    	this.start = this;
    	ImageIcon icon = new ImageIcon("images/Main.png");
    	Toolkit t = Toolkit.getDefaultToolkit();
    	this.img = t.getImage("images/GIF.gif");
    	this.setSize(960, 720);
    	
    
    	
        //배경 Panel 생성후 컨텐츠페인으로 지정      
    	startmain = new JPanel() {
            public void paintComponent(Graphics g) {
            	g.drawImage(img,0,0,960,730,this);
                g.drawImage(icon.getImage(), 0, 0,960,720, null);
                setOpaque(false); 
                super.paintComponent(g);
            }
        };
        
     
        startmain.setLayout(null);
       
       
       JButton button = new JButton(new ImageIcon("images/START.png"));
        button.setLocation(420,430);
        button.setSize(120,40);
        button.addMouseListener(new MouseListener() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setIcon(new ImageIcon("images/START.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setIcon(new ImageIcon("images/START1.png"));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
	
		});
        
        JButton button1 = new JButton(new ImageIcon("images/EXIT.png"));
        button1.setLocation(428, 470);
        button1.setSize(100,40);
        button1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				button1.setIcon(new ImageIcon("images/EXIT.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				button1.setIcon(new ImageIcon("images/EXIT1.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
        button1.setFocusPainted(false);
        
        
       
        startmain.add(button);
        startmain.add(button1);
        
        
        button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.StartChangePanle(start, startmain, new Main(start));
				
			}
        	
        });
        button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
        	
        });
        
        this.add(startmain);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }
 
    

	
}