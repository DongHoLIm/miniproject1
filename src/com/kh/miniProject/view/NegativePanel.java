package com.kh.miniProject.view;


import java.awt.Font;
import java.awt.Color;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.vo.Exper;
import com.kh.miniProject.model.vo.GirllovePer;
import com.kh.miniProject.model.vo.GrilNumber;
import com.kh.miniProject.model.vo.MylovePer;

public class NegativePanel extends JPanel{
	private JFrame start;
	private JPanel negativePanel;
	private Image img;
	private JTextArea tf;
	
	
	public NegativePanel(JFrame start) {
	      System.out.println("şÎÁ¤şÎÁ¤");
	      
	     negativePanel = new JPanel();
	        this.start = start;
	        negativePanel = this;
			this.setBounds(0, 0, 960, 720);
			this.setLayout(null);
			
			Toolkit t = Toolkit.getDefaultToolkit();
	    	this.img = t.getImage("images/NegativePanel1.gif").getScaledInstance(960, 720, 0);;
	    	
	    	String negativeMent = null;
			int mentRan = (int)(Math.random()*5)+1;
			switch(mentRan) {
			case 1 : negativeMent = "\n\n 경현씨 센스 정말 구리네요;;?"; break;
			case 2 : negativeMent = "\n\n 저 정말 상처 받았어요"; break;
			case 3 : negativeMent = "\n\n 저의 경현씨의 대한 호감도가 내려갔어요."; break;
			case 4 : negativeMent = "\n\n 정말 미워요!!"; break;
			case 5 : negativeMent = "\n\n 경현씨는 여성의 마음을 잘 모르시는것 같네요."; break;
			}
			tf = new JTextArea(negativeMent);
			tf.setBounds(150,450, 600,150);
			tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
			//tf.addKeyListener(this);
			tf.setCaretColor(Color.cyan);
			tf.setFont(getFont().deriveFont(15.0f));
			Font font =new Font("휴먼편지체", Font.BOLD, 20);
			tf.setFont(font);
	    	
	      
			JButton but = new JButton("x");
			but.setLocation(850, 50);
			but.setSize(30, 30);
			but.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ChangePanel.StartChangePanle(start, negativePanel, new Main(start));
					
				}
				
			});
	      int girlnum = GrilNumber.grilnumber;
	      
	      
	      
	      
	      Exper ex = new Exper();
	      ex.plusExper(2);
	      
	      MylovePer mlp = new MylovePer();
	      mlp.plusMylove(girlnum, 2);
	      
	      GirllovePer glp = new GirllovePer();
	     glp.ninusGirllove(girlnum);
	     
	    JLabel icon1 = new JLabel(new ImageIcon(img));
		  icon1.setBounds(0, 0, 960, 720);
	     JLabel girl = new JLabel(new ImageIcon(GirlImages.girlImage3[GrilNumber.grilnumber]));
			girl.setBounds(110, 5, 700, 550);
			negativePanel.add(tf);
			negativePanel.add(girl);
			negativePanel.add(but);
			negativePanel.add(icon1);
			
			
			
	      
			
	   }





}
