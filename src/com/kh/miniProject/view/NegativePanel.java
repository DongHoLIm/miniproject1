package com.kh.miniProject.view;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.vo.Exper;
import com.kh.miniProject.model.vo.GirllovePer;
import com.kh.miniProject.model.vo.GrilNumber;
import com.kh.miniProject.model.vo.MylovePer;

public class NegativePanel extends JPanel{
	private JFrame start;
	private JPanel negativePanel;
	private ImageIcon img;
	
	public NegativePanel(JFrame start) {
	      System.out.println("şÎÁ¤şÎÁ¤");
	      
	     negativePanel = new JPanel();
	        this.start = start;
	        negativePanel = this;
			this.setBounds(0, 0, 960, 720);
			this.setLayout(null);
	      
			JButton but = new JButton("x");
			but.setLocation(850, 50);
			but.setSize(30, 30);
			Font font =new Font("한컴 백제 M", Font.PLAIN, 10);
			but.setFont(font);
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
	     
	     JLabel icon1 = new JLabel(new ImageIcon("images/NegativePanel.png"));
		  icon1.setBounds(0, 0, 960, 720);
	     JLabel girl = new JLabel(new ImageIcon(GirlImages.girlImage3[GrilNumber.grilnumber]));
			girl.setBounds(110, 5, 700, 550);
			negativePanel.add(girl);
			negativePanel.add(but);
			negativePanel.add(icon1);
			
			
	      
			
	   }


}
