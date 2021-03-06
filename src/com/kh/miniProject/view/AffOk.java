package com.kh.miniProject.view;

import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kh.miniProject.controller.PointController;
import com.kh.miniProject.model.vo.Point;
import com.kh.miniProject.model.vo.RoundOpen;

public class AffOk extends JPanel{
	private JPanel affOk;
	private JFrame start;
	private JButton[] affBut;
	private int butY = 50;
	private int butY2 = 50;
	JPanel shopmain = new StoreMain(start);
	TextField affArea = new TextField();
	

	public AffOk(JFrame start) {
		this.start = start;
		this.affOk = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
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
		
		affBut = new JButton[Main.ic.getExper().getLev()];
		
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
		
		
		if(affBut.length < 5) {
			for(int i = 0; i < affBut.length; i++) {
				affBut[i] = new JButton(new ImageIcon(namebut[i]));
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
					affBut[i] = new JButton(new ImageIcon(namebut[i]));
					affBut[i].setBounds(butY, 180, 120, 80);
					Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
					affBut[i].setFont(font);
					butY += 170;
					this.add(affBut[i]);
					this.repaint();
				}else {
					affBut[i] = new JButton(new ImageIcon(namebut[i]));
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
			String lovePer = Integer.valueOf(Main.oc.ro.getGlist().get(0).getGlovePer()).toString();
            if (PointController.p.getResultcoin()<500) {
                ChangePanel.ChangePanel(start, affOk ,new CoinShop(start));
             }else if (PointController.p.getResultcoin()>=500) {
            	affArea.remove(null);
            	affArea.setText(Main.oc.ro.getGlist().get(0).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
            	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
            	affArea.setFont(font);
                Main.pc.pointDown(500);
                
             }

		}
	}

	class CheckAff1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(Main.oc.ro.getGlist().get(1).getGlovePer()).toString();
            if (PointController.p.getResultcoin()<1000) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointController.p.getResultcoin()>=1000) {
            	affArea.remove(null);
             	affArea.setText(Main.oc.ro.getGlist().get(1).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
             	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
             	affArea.setFont(font);
             	Main.pc.pointDown(1000);
                
             }

		}
	}

	class CheckAff2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(Main.oc.ro.getGlist().get(2).getGlovePer()).toString();
            if (PointController.p.getResultcoin()<1500) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointController.p.getResultcoin()>=1500) {
            	affArea.remove(null);
              	affArea.setText(Main.oc.ro.getGlist().get(2).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
              	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
              	affArea.setFont(font);
              	Main.pc.pointDown(1500);
                
             }
		}
	}

	class CheckAff3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(Main.oc.ro.getGlist().get(3).getGlovePer()).toString();
            if (PointController.p.getResultcoin()<2000) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointController.p.getResultcoin()>=2000) {
            	affArea.remove(null);
              	affArea.setText(Main.oc.ro.getGlist().get(3).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
              	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
              	affArea.setFont(font);
              	Main.pc.pointDown(2000);
                
             }

		}
	}

	class CheckAff4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(Main.oc.ro.getGlist().get(4).getGlovePer()).toString();
            if (PointController.p.getResultcoin()<2500) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointController.p.getResultcoin()>=2500) {
            	affArea.remove(null);
               	affArea.setText(Main.oc.ro.getGlist().get(4).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
               	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
               	affArea.setFont(font);
               	Main.pc.pointDown(2500);
                
             }
			
		}
	}

	class CheckAff5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(Main.oc.ro.getGlist().get(5).getGlovePer()).toString();
            if (PointController.p.getResultcoin()<3000) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointController.p.getResultcoin()>=3000) {
            	affArea.remove(null);
               	affArea.setText(Main.oc.ro.getGlist().get(5).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
               	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
               	affArea.setFont(font);
               	Main.pc.pointDown(3000);
                
             }
			
		}
	}

	class CheckAff6 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(Main.oc.ro.getGlist().get(6).getGlovePer()).toString();
            if (PointController.p.getResultcoin()<3500) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
             }else if (PointController.p.getResultcoin()>=3500) {
            	affArea.remove(null);
               	affArea.setText(Main.oc.ro.getGlist().get(6).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
               	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
               	affArea.setFont(font);
               	Main.pc.pointDown(3500);
                
             }
		}
	}

	class CheckAff7 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(Main.oc.ro.getGlist().get(7).getGlovePer()).toString();
            if (PointController.p.getResultcoin()<4000) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
            }else if (PointController.p.getResultcoin()>=4000) {
            	affArea.remove(null);
            	affArea.setText(Main.oc.ro.getGlist().get(7).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
            	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
            	affArea.setFont(font);
            	Main.pc.pointDown(4000);

             }

		}
	}

	class CheckAff8 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(Main.oc.ro.getGlist().get(8).getGlovePer()).toString();
			if (PointController.p.getResultcoin()<4500) {
				ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
			}else if (PointController.p.getResultcoin()>=4500) {
				affArea.remove(null);
				affArea.setText(Main.oc.ro.getGlist().get(8).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
				Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
				affArea.setFont(font);
				Main.pc.pointDown(4500);

             }

		}
	}

	class CheckAff9 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String lovePer = Integer.valueOf(Main.oc.ro.getGlist().get(9).getGlovePer()).toString();
            if (PointController.p.getResultcoin()<5000) {
                ChangePanel.ChangePanel(start, affOk,new CoinShop(start));
            }else if (PointController.p.getResultcoin()>=5000) {
            	affArea.remove(null);
            	affArea.setText(Main.oc.ro.getGlist().get(9).getName() + "�쓽 �븷�젙�룄�뒗 " + lovePer + "�엯�땲�떎");
            	Font font =new Font("�쑕癒쇳렪吏�泥�", Font.BOLD, 15);
            	affArea.setFont(font);
            	Main.pc.pointDown(5000);

            }

		}
	}

}
