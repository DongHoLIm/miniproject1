package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.controller.PointController;
import com.kh.miniProject.model.vo.Point;
import com.kh.miniProject.model.vo.RoundOpen;


public class AffRandom extends JPanel{
	private JFrame start;
	private JPanel aff;
	private JButton[] affBnt;
	private JButton but;
	private int butY = 180;
	private int butY2 = 180;
	private int j;
	private int i = 0;
	private TextField affArea = new TextField();
	
	public AffRandom(JFrame start) {
		this.start = start;
		aff = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		affArea.setBounds(50, 50, 800, 50);
		this.add(affArea);
		
		affBnt = new JButton[Main.ic.getExper().getLev()];
		Image[] namebut = new Image[10];
		namebut[0] = new ImageIcon("images/1but.png").getImage().getScaledInstance(120, 80, 0);
		namebut[1] = new ImageIcon("images/2but.png").getImage().getScaledInstance(120, 80, 0);
		namebut[2] = new ImageIcon("images/3but.png").getImage().getScaledInstance(120, 80, 0);
		namebut[3] = new ImageIcon("images/4but.png").getImage().getScaledInstance(120, 80, 0);
		namebut[4] = new ImageIcon("images/5but.png").getImage().getScaledInstance(120, 80, 0);
		namebut[5] = new ImageIcon("images/6but.png").getImage().getScaledInstance(120, 80, 0);
		namebut[6] = new ImageIcon("images/7but.png").getImage().getScaledInstance(120, 80, 0);
		namebut[7] = new ImageIcon("images/8but.png").getImage().getScaledInstance(120, 80, 0);
		namebut[8] = new ImageIcon("images/9but.png").getImage().getScaledInstance(120, 80, 0);
		namebut[9] = new ImageIcon("images/10but.png").getImage().getScaledInstance(120, 80, 0);
		if(affBnt.length < 5) {
	         for(int i = 0; i < affBnt.length; i++) {
	        	 j = i;
	            System.out.println("쩔횒�횑횄횪째짧" + butY);
	            affBnt[i] = new JButton(new ImageIcon(namebut[i]));
	            affBnt[i].setBounds(50, butY, 120, 80);
	            butY += 100;
	            this.add(affBnt[i]);
	            this.repaint();
	         }
	      }else {
	         for(int i = 0; i < affBnt.length; i++) {
	            if(i < 5) {
	            	j = i;
	               affBnt[i] = new JButton(new ImageIcon(namebut[i]));
	               affBnt[i].setBounds(50, butY, 120, 80);
	               butY += 100;
	               this.add(affBnt[i]);
	               this.repaint();
	            }else {
	            	j = i;
	               affBnt[i] = new JButton(new ImageIcon(namebut[i]));
	               affBnt[i].setBounds(450, butY2, 120, 80);
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
			Main.lc.random(0);
			if(PointController.p.getResultcoin()>=1500) {
				affArea.setText(Main.lc.getStrlove());
				Main.pc.pointDown(1500);
			}else if (PointController.p.getResultcoin()<1499) {
				ChangePanel.ChangePanel(start, aff,new CoinShop(start));
			}
		}
    	
    }
	class Random1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.lc.random(1);
			if(PointController.p.getResultcoin()>=1500) {
				affArea.setText(Main.lc.getStrlove());
				Main.pc.pointDown(1500);
			}else if (PointController.p.getResultcoin()<1499) {
				ChangePanel.ChangePanel(start, aff,new CoinShop(start));
			}
		}
    	
    }
	class Random2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.lc.random(2);
			if(PointController.p.getResultcoin()>=1500) {
				affArea.setText(Main.lc.getStrlove());
				Main.pc.pointDown(1500);
			}else if (PointController.p.getResultcoin()<1499) {
				ChangePanel.ChangePanel(start, aff,new CoinShop(start));
			}
		}
    	
    }
	class Random3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.lc.random(3);
			if(PointController.p.getResultcoin()>=1500) {
				affArea.setText(Main.lc.getStrlove());
				Main.pc.pointDown(1500);
			}else if (PointController.p.getResultcoin()<1499) {
				ChangePanel.ChangePanel(start, aff,new CoinShop(start));
			}
		}
    	
    }
	class Random4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.lc.random(4);
			if(PointController.p.getResultcoin()>=1500) {
				affArea.setText(Main.lc.getStrlove());
				Main.pc.pointDown(1500);
			}else if (PointController.p.getResultcoin()<1499) {
				ChangePanel.ChangePanel(start, aff,new CoinShop(start));
			}
		}
    	
    }
	class Random5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.lc.random(5);
			if(PointController.p.getResultcoin()>=1500) {
				affArea.setText(Main.lc.getStrlove());
				Main.pc.pointDown(1500);
			}else if (PointController.p.getResultcoin()<1499) {
				ChangePanel.ChangePanel(start, aff,new CoinShop(start));
			}
		}
    	
    }
	class Random6 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.lc.random(6);
			if(PointController.p.getResultcoin()>=1500) {
				affArea.setText(Main.lc.getStrlove());
				Main.pc.pointDown(1500);
			}else if (PointController.p.getResultcoin()<1499) {
				ChangePanel.ChangePanel(start, aff,new CoinShop(start));
			}
		}
    	
    }
	class Random7 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.lc.random(7);
			if(PointController.p.getResultcoin()>=1500) {
				affArea.setText(Main.lc.getStrlove());
				Main.pc.pointDown(1500);
			}else if (PointController.p.getResultcoin()<1499) {
				ChangePanel.ChangePanel(start, aff,new CoinShop(start));
			}
		}
    	
    }
	class Random8 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.lc.random(8);
			if(PointController.p.getResultcoin()>=1500) {
				affArea.setText(Main.lc.getStrlove());
				Main.pc.pointDown(1500);
			}else if (PointController.p.getResultcoin()<1499) {
				ChangePanel.ChangePanel(start, aff,new CoinShop(start));
			}
		}
    	
    }
	class Random9 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.lc.random(9);
			if(PointController.p.getResultcoin()>=1500) {
				affArea.setText(Main.lc.getStrlove());
				Main.pc.pointDown(1500);
			}else if (PointController.p.getResultcoin()<1499) {
				ChangePanel.ChangePanel(start, aff,new CoinShop(start));
			}
		}
    	
    }
}
