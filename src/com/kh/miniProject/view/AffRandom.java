package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	JButton but;
	
	public AffRandom(JFrame start) {
		this.start = start;
		aff = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		
		affBnt = new JButton[PlayerInfo.lev];
		if(affBnt.length < 5) {
	         for(int i = 0; i < affBnt.length; i++) {
	        	 j = i;
	            System.out.println("¿ÍÀÌÃà°ª" + butY);
	            affBnt[i] = new JButton(RoundOpen.glist.get(i).getName());
	            affBnt[i].setBounds(50, butY, 80, 80);
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
	               butY += 100;
	               this.add(affBnt[i]);
	               this.repaint();
	            }else {
	            	j = i;
	               affBnt[i] = new JButton(RoundOpen.glist.get(i).getName());
	               affBnt[i].setBounds(450, butY2, 80, 80);
	               butY2 += 100;
	               this.add(affBnt[i]);
	               this.repaint();
	            }
	      
	         }
	}
		if(affBnt.length == 1) {
			affBnt[0].addActionListener(new Random0());
		}else if(affBnt.length == 2) {
			affBnt[0].addActionListener(new Random0());
			affBnt[1].addActionListener(new Random1());
		}else if(affBnt.length == 3) {
			affBnt[0].addActionListener(new Random0());
			affBnt[1].addActionListener(new Random1());
			affBnt[2].addActionListener(new Random2());
		}else if(affBnt.length == 4) {
			affBnt[0].addActionListener(new Random0());
			affBnt[1].addActionListener(new Random1());
			affBnt[2].addActionListener(new Random2());
			affBnt[3].addActionListener(new Random3());
		}else if(affBnt.length == 5) {
			affBnt[0].addActionListener(new Random0());
			affBnt[1].addActionListener(new Random1());
			affBnt[2].addActionListener(new Random2());
			affBnt[3].addActionListener(new Random3());
			affBnt[4].addActionListener(new Random4());
		}else if(affBnt.length == 6) {
			affBnt[0].addActionListener(new Random0());
			affBnt[1].addActionListener(new Random1());
			affBnt[2].addActionListener(new Random2());
			affBnt[3].addActionListener(new Random3());
			affBnt[4].addActionListener(new Random4());
			affBnt[5].addActionListener(new Random5());
		}else if(affBnt.length == 7) {
			affBnt[0].addActionListener(new Random0());
			affBnt[1].addActionListener(new Random1());
			affBnt[2].addActionListener(new Random2());
			affBnt[3].addActionListener(new Random3());
			affBnt[4].addActionListener(new Random4());
			affBnt[5].addActionListener(new Random5());
			affBnt[6].addActionListener(new Random6());
		}else if(affBnt.length == 8) {
			affBnt[0].addActionListener(new Random0());
			affBnt[1].addActionListener(new Random1());
			affBnt[2].addActionListener(new Random2());
			affBnt[3].addActionListener(new Random3());
			affBnt[4].addActionListener(new Random4());
			affBnt[5].addActionListener(new Random5());
			affBnt[6].addActionListener(new Random6());
			affBnt[7].addActionListener(new Random7());
		}else if(affBnt.length == 9) {
			affBnt[0].addActionListener(new Random0());
			affBnt[1].addActionListener(new Random1());
			affBnt[2].addActionListener(new Random2());
			affBnt[3].addActionListener(new Random3());
			affBnt[4].addActionListener(new Random4());
			affBnt[5].addActionListener(new Random5());
			affBnt[6].addActionListener(new Random6());
			affBnt[7].addActionListener(new Random7());
			affBnt[8].addActionListener(new Random8());
		}else if(affBnt.length == 10) {
			affBnt[0].addActionListener(new Random0());
			affBnt[1].addActionListener(new Random1());
			affBnt[2].addActionListener(new Random2());
			affBnt[3].addActionListener(new Random3());
			affBnt[4].addActionListener(new Random4());
			affBnt[5].addActionListener(new Random5());
			affBnt[6].addActionListener(new Random6());
			affBnt[7].addActionListener(new Random7());
			affBnt[8].addActionListener(new Random8());
			affBnt[9].addActionListener(new Random9());
		}
		
		
		Image img6 = new ImageIcon("images/back.png").getImage().getScaledInstance(30, 30, 0);
		but = new JButton(new ImageIcon(img6));	

		but.setBounds(850, 50, 50,50);
		but.setContentAreaFilled(false);
		but.setFocusPainted(false);
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ChangePanel(start, aff, new StoreMain(start));
				
			}
		});
		
		this.add(but);


}
	class Random0 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GirllovePer().random(0);
			JLabel random = new JLabel(GirllovePer.str);
			random.setBounds(170, 200, 300, 50);
			random.setBackground(Color.BLACK);
			aff.add(random);
			aff.repaint();
			
		}
    	
    }
	class Random1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GirllovePer().random(1);
			JLabel random = new JLabel(GirllovePer.str);
			random.setBounds(170, 300, 300, 50);
			random.setBackground(Color.BLACK);
			aff.add(random);
			aff.repaint();
			
		}
    	
    }
	class Random2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GirllovePer().random(2);
			JLabel random = new JLabel(GirllovePer.str);
			random.setBounds(170, 400, 300, 50);
			random.setBackground(Color.BLACK);
			aff.add(random);
			aff.repaint();
			
		}
    	
    }
	class Random3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GirllovePer().random(3);
			JLabel random = new JLabel(GirllovePer.str);
			random.setBounds(170, 500, 300, 50);
			random.setBackground(Color.BLACK);
			aff.add(random);
			aff.repaint();
			
		}
    	
    }
	class Random4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GirllovePer().random(4);
			JLabel random = new JLabel(GirllovePer.str);
			random.setBounds(170, 600, 300, 50);
			random.setBackground(Color.BLACK);
			aff.add(random);
			aff.repaint();
			
		}
    	
    }
	class Random5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GirllovePer().random(5);
			JLabel random = new JLabel(GirllovePer.str);
			random.setBounds(570, 200, 300, 50);
			random.setBackground(Color.BLACK);
			aff.add(random);
			aff.repaint();
			
		}
    	
    }
	class Random6 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GirllovePer().random(6);
			JLabel random = new JLabel(GirllovePer.str);
			random.setBounds(570, 300, 300, 50);
			random.setBackground(Color.BLACK);
			aff.add(random);
			aff.repaint();
			
		}
    	
    }
	class Random7 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GirllovePer().random(7);
			JLabel random = new JLabel(GirllovePer.str);
			random.setBounds(570, 400, 300, 50);
			random.setBackground(Color.BLACK);
			aff.add(random);
			aff.repaint();
			
		}
    	
    }
	class Random8 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GirllovePer().random(8);
			JLabel random = new JLabel(GirllovePer.str);
			random.setBounds(570, 500, 300, 50);
			random.setBackground(Color.BLACK);
			aff.add(random);
			aff.repaint();
			
		}
    	
    }
	class Random9 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new GirllovePer().random(9);
			JLabel random = new JLabel(GirllovePer.str);
			random.setBounds(570, 600, 300, 50);
			random.setBackground(Color.BLACK);
			aff.add(random);
			aff.repaint();
			
		}
    	
    }
}
