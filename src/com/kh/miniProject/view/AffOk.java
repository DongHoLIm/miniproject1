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

import com.kh.miniProject.model.vo.RoundOpen;

public class AffOk extends JPanel{
	private JPanel affOk;
	private JFrame start;
	private JButton[] affBut;
	private int butY = 180;
	private int butY2 = 180;
	private int yy2;
	
	public AffOk(JFrame start) {
		this.start = start;
		this.affOk = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		//this.setBackground(Color.black);
		Image img6 = new ImageIcon("images/back.png").getImage().getScaledInstance(30, 30, 0);
		JButton exit = new JButton(new ImageIcon(img6));
		exit.setBounds(850, 50, 50, 50);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ChangePanel(start, affOk, new StoreMain(start));
				
			}
		});
		
		affBut = new JButton[PlayerInfo.lev];
		String[] grilName = new String[10];
		grilName[0] = new String("박지선");
		grilName[1] = new String("박나래");
		grilName[2] = new String("장도연");
		grilName[3] = new String("이국주");
		grilName[4] = new String("이수현");
		grilName[5] = new String("정유미");
		grilName[6] = new String("벤");
		grilName[7] = new String("모모");
		grilName[8] = new String("고준희");
		grilName[9] = new String("아이린");
		if(affBut.length < 5) {
			for(int i = 0; i < affBut.length; i++) {
				System.out.println("와이축값" + butY);
				affBut[i] = new JButton(grilName[i]);
				affBut[i].setBounds(50, butY, 80, 80);
				butY += 100;
				this.add(affBut[i]);
				this.repaint();
			}
		}else {
			for(int i = 0; i < affBut.length; i++) {
				if(i < 5) {
					affBut[i] = new JButton(grilName[i]);
					affBut[i].setBounds(50, butY, 80, 80);
					butY += 100;
					this.add(affBut[i]);
					this.repaint();
				}else {
					affBut[i] = new JButton(grilName[i]);
					affBut[i].setBounds(450, butY2, 80, 80);
					butY2 += 100;
					this.add(affBut[i]);
					this.repaint();
				}
			}
		}

		if(affBut.length == 1) {
			affBut[0].addActionListener(new CheckAff0());
		}else if(affBut.length == 2) {
			affBut[0].addActionListener(new CheckAff0());
			affBut[1].addActionListener(new CheckAff1());
		}else if(affBut.length == 3) {
			affBut[0].addActionListener(new CheckAff0());
			affBut[1].addActionListener(new CheckAff1());
			affBut[2].addActionListener(new CheckAff2());
		}else if(affBut.length == 4) {
			affBut[0].addActionListener(new CheckAff0());
			affBut[1].addActionListener(new CheckAff1());
			affBut[2].addActionListener(new CheckAff2());
			affBut[3].addActionListener(new CheckAff3());
		}else if(affBut.length == 5) {
			affBut[0].addActionListener(new CheckAff0());
			affBut[1].addActionListener(new CheckAff1());
			affBut[2].addActionListener(new CheckAff2());
			affBut[3].addActionListener(new CheckAff3());
			affBut[4].addActionListener(new CheckAff4());
		}else if(affBut.length == 6) {
			affBut[0].addActionListener(new CheckAff0());
			affBut[1].addActionListener(new CheckAff1());
			affBut[2].addActionListener(new CheckAff2());
			affBut[3].addActionListener(new CheckAff3());
			affBut[4].addActionListener(new CheckAff4());
			affBut[5].addActionListener(new CheckAff5());
		}else if(affBut.length == 7) {
			affBut[0].addActionListener(new CheckAff0());
			affBut[1].addActionListener(new CheckAff1());
			affBut[2].addActionListener(new CheckAff2());
			affBut[3].addActionListener(new CheckAff3());
			affBut[4].addActionListener(new CheckAff4());
			affBut[5].addActionListener(new CheckAff5());
			affBut[6].addActionListener(new CheckAff6());
		}else if(affBut.length == 8) {
			affBut[0].addActionListener(new CheckAff0());
			affBut[1].addActionListener(new CheckAff1());
			affBut[2].addActionListener(new CheckAff2());
			affBut[3].addActionListener(new CheckAff3());
			affBut[4].addActionListener(new CheckAff4());
			affBut[5].addActionListener(new CheckAff5());
			affBut[6].addActionListener(new CheckAff6());
			affBut[7].addActionListener(new CheckAff7());
		}else if(affBut.length == 9) {
			affBut[0].addActionListener(new CheckAff0());
			affBut[1].addActionListener(new CheckAff1());
			affBut[2].addActionListener(new CheckAff2());
			affBut[3].addActionListener(new CheckAff3());
			affBut[4].addActionListener(new CheckAff4());
			affBut[5].addActionListener(new CheckAff5());
			affBut[6].addActionListener(new CheckAff6());
			affBut[7].addActionListener(new CheckAff7());
			affBut[8].addActionListener(new CheckAff8());
		}else if(affBut.length == 10) {
			affBut[0].addActionListener(new CheckAff0());
			affBut[1].addActionListener(new CheckAff1());
			affBut[2].addActionListener(new CheckAff2());
			affBut[3].addActionListener(new CheckAff3());
			affBut[4].addActionListener(new CheckAff4());
			affBut[5].addActionListener(new CheckAff5());
			affBut[6].addActionListener(new CheckAff6());
			affBut[7].addActionListener(new CheckAff7());
			affBut[8].addActionListener(new CheckAff8());
			affBut[9].addActionListener(new CheckAff9());
		}
		
		this.add(exit);
	}

	class CheckAff0 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(0).getGlovePer()).toString();
			JLabel afflabel0 = new JLabel(RoundOpen.glist.get(0).getName() + " 의 애정도는 " + lovePer + "입니다");
			System.out.println("***************");
			afflabel0.setBounds(170, 200, 300, 50);
			afflabel0.setBackground(Color.BLACK);
			affOk.add(afflabel0);
			affOk.repaint();

		}
	}

	class CheckAff1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(1).getGlovePer()).toString();
			JLabel afflabel1 = new JLabel(RoundOpen.glist.get(1).getName() + " 의 애정도는 " + lovePer + "입니다");
			System.out.println("***************");
			afflabel1.setBounds(170, 300, 300, 50);
			afflabel1.setBackground(Color.BLACK);
			affOk.add(afflabel1);
			affOk.repaint();

		}
	}
	
	class CheckAff2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(2).getGlovePer()).toString();
			JLabel afflabel2 = new JLabel(RoundOpen.glist.get(2).getName() + " 의 애정도는 " + lovePer + "입니다");
			System.out.println("***************");
			afflabel2.setBounds(170, 400, 300, 50);
			afflabel2.setBackground(Color.BLACK);
			affOk.add(afflabel2);
			affOk.repaint();

		}
	}
	
	class CheckAff3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(3).getGlovePer()).toString();
			JLabel afflabel3 = new JLabel(RoundOpen.glist.get(3).getName() + " 의 애정도는 " + lovePer + "입니다");
			System.out.println("***************");
			afflabel3.setBounds(170, 500, 300, 50);
			afflabel3.setBackground(Color.BLACK);
			affOk.add(afflabel3);
			affOk.repaint();

		}
	}
	
	class CheckAff4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(4).getGlovePer()).toString();
			JLabel afflabel4 = new JLabel(RoundOpen.glist.get(4).getName() + " 의 애정도는 " + lovePer + "입니다");
			System.out.println("***************");
			afflabel4.setBounds(170, 600, 300, 50);
			afflabel4.setBackground(Color.BLACK);
			affOk.add(afflabel4);
			affOk.repaint();

		}
	}
	
	class CheckAff5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(5).getGlovePer()).toString();
			JLabel afflabel5 = new JLabel(RoundOpen.glist.get(5).getName() + " 의 애정도는 " + lovePer + "입니다");
			System.out.println("***************");
			afflabel5.setBounds(570, 200, 300, 50);
			afflabel5.setBackground(Color.BLACK);
			affOk.add(afflabel5);
			affOk.repaint();

		}
	}
	
	class CheckAff6 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(6).getGlovePer()).toString();
			JLabel afflabel6 = new JLabel(RoundOpen.glist.get(6).getName() + " 의 애정도는 " + lovePer + "입니다");
			System.out.println("***************");
			afflabel6.setBounds(570, 300, 300, 50);
			afflabel6.setBackground(Color.BLACK);
			affOk.add(afflabel6);
			affOk.repaint();

		}
	}
	
	class CheckAff7 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(7).getGlovePer()).toString();
			JLabel afflabel7 = new JLabel(RoundOpen.glist.get(7).getName() + " 의 애정도는 " + lovePer + "입니다");
			System.out.println("***************");
			afflabel7.setBounds(570, 400, 300, 50);
			afflabel7.setBackground(Color.BLACK);
			affOk.add(afflabel7);
			affOk.repaint();

		}
	}
	
	class CheckAff8 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(8).getGlovePer()).toString();
			JLabel afflabel8 = new JLabel(RoundOpen.glist.get(8).getName() + " 의 애정도는 " + lovePer + "입니다");
			System.out.println("***************");
			afflabel8.setBounds(570, 500, 300, 50);
			afflabel8.setBackground(Color.BLACK);
			affOk.add(afflabel8);
			affOk.repaint();

		}
	}
	
	class CheckAff9 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(9).getGlovePer()).toString();
			JLabel afflabel9 = new JLabel(RoundOpen.glist.get(9).getName() + " 의 애정도는 " + lovePer + "입니다");
			System.out.println("***************");
			afflabel9.setBounds(570, 600, 300, 50);
			afflabel9.setBackground(Color.BLACK);
			affOk.add(afflabel9);
			affOk.repaint();

		}
	}
}
