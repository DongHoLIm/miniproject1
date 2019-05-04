package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.PointMinus;
import com.kh.miniProject.model.vo.RoundOpen;

public class AffOk extends JPanel{
	private JPanel affOk;
	private JFrame start;
	private JButton[] affBut;
	private int butY = 50;
	private int butY2 = 50;
	private int yy2;
	JPanel shopmain = new StoreMain(start);
	PointMinus pm = new PointMinus();
	TextField affArea = new TextField();
	

	public AffOk(JFrame start) {
		this.start = start;
		this.affOk = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		//this.setBackground(Color.black);
		affArea.setBounds(50, 500, 800, 50);
		this.add(affArea);
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

		if(affBut.length < 5) {
			for(int i = 0; i < affBut.length; i++) {
				affBut[i] = new JButton(RoundOpen.glist.get(i).getName());
				affBut[i].setBounds(butY, 180, 120, 80);
				Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
				affBut[i].setFont(font);
				butY += 170;
				this.add(affBut[i]);
				this.repaint();
			}
		}else {
			for(int i = 0; i < affBut.length; i++) {
				if(i < 5) {
					affBut[i] = new JButton(RoundOpen.glist.get(i).getName());
					affBut[i].setBounds(butY, 180, 120, 80);
					Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
					affBut[i].setFont(font);
					butY += 170;
					this.add(affBut[i]);
					this.repaint();
				}else {
					affBut[i] = new JButton(RoundOpen.glist.get(i).getName());
					affBut[i].setBounds(butY2, 300, 120, 80);
					Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
					affBut[i].setFont(font);
					butY2 += 170;
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
            if (PointMinus.resultcoin<500) {
                ChangePanel.ChangePanel(start, affOk ,new CoinShop(start));
             }else if (PointMinus.resultcoin>=500) {
            	affArea.remove(null);
            	affArea.setText(RoundOpen.glist.get(0).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
            	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
            	affArea.setFont(font);
                pm.pointMinus(500);
                
             }

		}
	}

	class CheckAff1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(1).getGlovePer()).toString();
            if (PointMinus.resultcoin<1000) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointMinus.resultcoin>=1000) {
            	affArea.remove(null);
             	affArea.setText(RoundOpen.glist.get(1).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
             	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
             	affArea.setFont(font);
                pm.pointMinus(1000);
                
             }

		}
	}

	class CheckAff2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(2).getGlovePer()).toString();
            if (PointMinus.resultcoin<1500) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointMinus.resultcoin>=1500) {
            	affArea.remove(null);
              	affArea.setText(RoundOpen.glist.get(2).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
              	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
              	affArea.setFont(font);
                pm.pointMinus(1500);
                
             }
		}
	}

	class CheckAff3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(3).getGlovePer()).toString();
            if (PointMinus.resultcoin<2000) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointMinus.resultcoin>=2000) {
            	affArea.remove(null);
              	affArea.setText(RoundOpen.glist.get(3).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
              	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
              	affArea.setFont(font);
                pm.pointMinus(2000);
                
             }

		}
	}

	class CheckAff4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(4).getGlovePer()).toString();
            if (PointMinus.resultcoin<2500) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointMinus.resultcoin>=2500) {
            	affArea.remove(null);
               	affArea.setText(RoundOpen.glist.get(4).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
               	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
               	affArea.setFont(font);
                pm.pointMinus(2500);
                
             }
			
		}
	}

	class CheckAff5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(5).getGlovePer()).toString();
            if (PointMinus.resultcoin<3000) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointMinus.resultcoin>=3000) {
            	affArea.remove(null);
               	affArea.setText(RoundOpen.glist.get(5).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
               	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
               	affArea.setFont(font);
                pm.pointMinus(3000);
                
             }
			
		}
	}

	class CheckAff6 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(6).getGlovePer()).toString();
            if (PointMinus.resultcoin<3500) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointMinus.resultcoin>=3500) {
            	affArea.remove(null);
               	affArea.setText(RoundOpen.glist.get(6).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
               	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
               	affArea.setFont(font);
                pm.pointMinus(3500);
                
             }
		}
	}

	class CheckAff7 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(7).getGlovePer()).toString();
            if (PointMinus.resultcoin<4000) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
            }else if (PointMinus.resultcoin>=4000) {
            	affArea.remove(null);
            	affArea.setText(RoundOpen.glist.get(7).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
            	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
            	affArea.setFont(font);
            	pm.pointMinus(4000);

             }

		}
	}

	class CheckAff8 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(8).getGlovePer()).toString();
			if (PointMinus.resultcoin<4500) {
				ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
			}else if (PointMinus.resultcoin>=4500) {
				affArea.remove(null);
				affArea.setText(RoundOpen.glist.get(8).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
				Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
				affArea.setFont(font);
				pm.pointMinus(4500);

             }

		}
	}

	class CheckAff9 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(RoundOpen.glist.get(9).getGlovePer()).toString();
            if (PointMinus.resultcoin<5000) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
            }else if (PointMinus.resultcoin>=5000) {
            	affArea.remove(null);
            	affArea.setText(RoundOpen.glist.get(9).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
            	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
            	affArea.setFont(font);
            	pm.pointMinus(5000);

            }

		}
	}
}
