package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
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
import com.kh.miniProject.model.vo.CharmPer;
import com.kh.miniProject.model.vo.Exper;
import com.kh.miniProject.model.vo.GirllovePer;
import com.kh.miniProject.model.vo.GrilNumber;
import com.kh.miniProject.model.vo.MylovePer;

public class PositivePanel extends JPanel{
	
	private Image img;
	private JTextArea tf;
	JFrame start = new JFrame();
	JPanel positivePanel;
	MylovePer mlp = new MylovePer();
	GirllovePer glp = new GirllovePer();
	CharmPer cp = new CharmPer();
	
	public PositivePanel(JFrame start) {
			
			 positivePanel = new JPanel();
			 this.start = start;
			 positivePanel = this;
			 this.setBounds(0, 0, 960, 720);
			 this.setBackground(Color.black);
			this.setLayout(null);
		      
			System.out.println("긍정");
			
			Toolkit t = Toolkit.getDefaultToolkit();
	    	this.img = t.getImage("images/PositivePanel.gif").getScaledInstance(960, 720, 0);;
	    	
	    	JLabel jl = new JLabel(new ImageIcon(img));
			  jl.setBounds(0, 0, 960, 720);

			int girlnum = GrilNumber.grilnumber;
			JButton but = new JButton("x");
			but.setLocation(850, 50);
			but.setSize(30, 30);
			
			but.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ChangePanel.StartChangePanle(start, positivePanel, new Main(start));
					
				}
				
			});
			String positiveMent = null;
			int mentRan = (int)(Math.random()*5)+1;
			switch(mentRan) {
			case 1 : positiveMent = "\n\n 경현씨 센스 좋은대요?"; break;
			case 2 : positiveMent = "\n\n 고마워요 감동이에요"; break;
			case 3 : positiveMent = "\n\n 저의 경현씨의 대한 호감도가 올라간것같은대요?"; break;
			case 4 : positiveMent = "\n\n 고마워요 ㅎㅎ~"; break;
			case 5 : positiveMent = "\n\n 경현씨는 여성의 마음을 잘 아시는것같아요."; break;
				
			}
			tf = new JTextArea(positiveMent);
			tf.setBounds(150,450, 600,150);
			tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
			//tf.addKeyListener(this);
			tf.setCaretColor(Color.cyan);
			tf.setFont(getFont().deriveFont(15.0f));
			Font font =new Font("휴먼편지체", Font.BOLD, 20);
			tf.setFont(font);
			Exper ex = new Exper();
			ex.plusExper(1);

			
			mlp.plusMylove(girlnum, 1);

			glp.plusGirllove(girlnum);
			
			int cha = (int)(Math.random()*10)+1;
			cp.plusCharm(cha);

			JLabel girl = new JLabel(new ImageIcon(GirlImages.girlImage2[GrilNumber.grilnumber]));
			girl.setBounds(110, 5, 700, 550);
			positivePanel.add(tf);
			positivePanel.add(girl);
			positivePanel.add(but);
			positivePanel.add(jl);





		}
	}
