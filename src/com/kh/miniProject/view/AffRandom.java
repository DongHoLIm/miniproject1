package com.kh.miniProject.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.GirllovePer;
import com.kh.miniProject.model.vo.RoundOpen;

public class AffRandom extends JPanel{
	private JFrame start;
	private JPanel aff;
	private JButton[] affBnt;
	private int butY = 180;
	private int butY2 = 180;
	private int j;
	
	public AffRandom(JFrame start) {
		this.start = start;
		aff = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		
		affBnt = new JButton[PlayerInfo.lev];
		if(affBnt.length < 5) {
	         for(int i = 0; i < affBnt.length; i++) {
	        	 j = i;
	            System.out.println("와이축값" + butY);
	            affBnt[i] = new JButton(RoundOpen.glist.get(i).getName());
	            affBnt[i].setBounds(50, butY, 80, 80);
	            affBnt[i].addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new GirllovePer().random(j);
						
					}
	            	
	            });
	            butY += 100;
	            this.add(affBnt[i]);
	            this.repaint();
	         }
	      }else {
	         for(int i = 0; i < affBnt.length; i++) {
	            if(i < 5) {
	            	j = i;
	               affBnt[i] = new JButton(RoundOpen.glist.get(i).getName());
	               affBnt[i].setBounds(50, butY, 80, 80);
	               affBnt[i].addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							new GirllovePer().random(j);
							
						}
		            	
		            });
	               butY += 100;
	               this.add(affBnt[i]);
	               this.repaint();
	            }else {
	            	j = i;
	               affBnt[i] = new JButton(RoundOpen.glist.get(i).getName());
	               affBnt[i].setBounds(450, butY2, 80, 80);
	               affBnt[i].addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							new GirllovePer().random(j);
							
						}
		            	
		            });
	               butY2 += 100;
	               this.add(affBnt[i]);
	               this.repaint();
	            }
	      
	         }
	}
		JButton but = new JButton("x");
		but.setBounds(850, 50, 50,50);
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ChangePanel(start, aff, new StoreMain(start));
				
			}
		});
		
		this.add(but);
		

}
}
