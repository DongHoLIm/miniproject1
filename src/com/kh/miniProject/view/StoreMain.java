package com.kh.miniProject.view;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.kh.miniProject.model.vo.CharmPer;
import com.kh.miniProject.model.vo.Exper;
import com.kh.miniProject.model.vo.PointMinus;
import com.kh.miniProject.model.vo.ReRandom;




public class StoreMain extends JPanel {
	private JFrame start;
	private JPanel shopmain;
	private JLabel iteminfo;
	private JLabel ClothRoom;
	ClothPanel cp = new ClothPanel();
	ShoesPanel sp = new ShoesPanel();
	AccPanel ap = new AccPanel();
	ItemPanel ip = new ItemPanel();
	PointMinus pm = new PointMinus();
	CharmPer cap = new CharmPer();

	public StoreMain(JFrame start) {
		this.start = start;
		this.shopmain = this;
		this.setBackground(new Color(175,35,72));

		this.setSize(960,720);
		this.setLayout(null);


		JPanel clothItems = new JPanel();
		clothItems.setLayout(null);

		Image img = new ImageIcon("images/cloth1.png").getImage().getScaledInstance(120, 120, 0);
		Image img2 = new ImageIcon("images/cloth2.png").getImage().getScaledInstance(120, 120, 0);
		Image img3 = new ImageIcon("images/cloth3.png").getImage().getScaledInstance(120, 120, 0);
		Image img4 = new ImageIcon("images/cloth4.png").getImage().getScaledInstance(135, 135, 0);


		JButton citem1 = new JButton(new ImageIcon(img));
		citem1.setSize(120,120);
		citem1.setLocation(20,20);
		clothItems.add(citem1);

		iteminfo = new JLabel("<html>경현이가 자주 안입는옷  특정 여성 을 꼬실때 입는다 <br> 3000 코인 <br> 매력도 25 상승");

		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 20);
		Font font =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font);
		clothItems.add(iteminfo);
		citem1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);

				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<2999) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if (PointMinus.resultcoin>=3000) {
							ChangePanel.ChangePanel(start, check,shopmain );
							cp.test(1);
							pm.pointMinus(3000);
							cap.plusCharm(25);
							
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);



			}
		});

		JButton citem2 = new JButton(new ImageIcon(img2));
		citem2.setSize(120,120);
		citem2.setLocation(20,160);
		clothItems.add(citem2);
		iteminfo = new JLabel("<html>경현이가 즐겨 입는 후드티 <br> 2500 코인 <br> 매력도 15 상승 ");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 160);
		Font font2 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font2);
		clothItems.add(iteminfo);
		citem2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<2499) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if (PointMinus.resultcoin>=2500) {
							ChangePanel.ChangePanel(start, check,shopmain );
							cp.test(2);
							pm.pointMinus(2500);
							cap.plusCharm(15);
							
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});

		JButton citem3 = new JButton(new ImageIcon(img3));
		citem3.setSize(120,120);
		citem3.setLocation(380,20);
		clothItems.add(citem3);
		iteminfo = new JLabel("<html> 바지 <br> 1800 코인 <br> 매력도 15 상승");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 20);
		Font font3 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font3);
		clothItems.add(iteminfo);
		citem3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<1800) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if (PointMinus.resultcoin>=1800) {
							ChangePanel.ChangePanel(start, check,shopmain );
							cp.test(3);
							pm.pointMinus(1800);
							cap.plusCharm(15);
							
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});

		JButton citem4 = new JButton(new ImageIcon(img4));
		citem4.setSize(120,120);
		citem4.setLocation(380,160);
		clothItems.add(citem4);
		iteminfo = new JLabel("<html> 바지 <br> 2000 코인 <br> 매력도 20 상승");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 160);
		Font font4 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font4);
		clothItems.add(iteminfo);
		citem4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<1999) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if (PointMinus.resultcoin>=2000) {
							ChangePanel.ChangePanel(start, check,shopmain );
							cp.test(4);
							pm.pointMinus(2000);
							cap.plusCharm(20);
							
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});
		citem1.setContentAreaFilled(false);
		citem1.setFocusPainted(false);
		citem2.setContentAreaFilled(false);
		citem2.setFocusPainted(false);
		citem3.setContentAreaFilled(false);
		citem3.setFocusPainted(false);
		citem4.setContentAreaFilled(false);
		citem4.setFocusPainted(false);

		JPanel shoesItems = new JPanel();
		shoesItems.setLayout(null);
		
		Image img5 = new ImageIcon("images/shoes1.png").getImage().getScaledInstance(120, 120, 0);
		Image img6 = new ImageIcon("images/shoes2.png").getImage().getScaledInstance(120, 120, 0);
		Image img7 = new ImageIcon("images/shoes3.png").getImage().getScaledInstance(120, 120, 0);
		Image img8 = new ImageIcon("images/shoes4.png").getImage().getScaledInstance(145, 145, 0);
		JButton sitem1 = new JButton(new ImageIcon(img5));
		sitem1.setSize(120,120);
		sitem1.setLocation(20,20);
		shoesItems.add(sitem1);
		iteminfo = new JLabel("<html> 뉴 발란스 신발 <br> 코인 1000 <br> 매력도 5 상승");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 20);
		Font font5 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font5);
		shoesItems.add(iteminfo);
		sitem1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<1000) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if (PointMinus.resultcoin>=1000) {
							ChangePanel.ChangePanel(start, check,shopmain );
							sp.test(5);
							pm.pointMinus(1000);
							cap.plusCharm(5);
							
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});

		JButton sitem2 = new JButton(new ImageIcon(img6));
		sitem2.setSize(120,120);
		sitem2.setLocation(20,160);
		shoesItems.add(sitem2);
		iteminfo = new JLabel("<html> 뉴 발란스 신발 <br> 1200 코인 <br> 매력도 13 상승");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 160);

		Font font6 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font6);
		shoesItems.add(iteminfo);
		sitem2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<1199) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if (PointMinus.resultcoin>=1200) {
							ChangePanel.ChangePanel(start, check,shopmain );
							sp.test(6);
							pm.pointMinus(1200);
							cap.plusCharm(13);
							
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});

		JButton sitem3 = new JButton(new ImageIcon(img7));
		sitem3.setSize(120,120);
		sitem3.setLocation(380,20);
		shoesItems.add(sitem3);
		iteminfo = new JLabel("<html> 나이키 신발 <br> 1500 코인 <br> 매력도 15 상승");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 20);
		Font font7 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font7);
		shoesItems.add(iteminfo);
		sitem3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<1499) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if(PointMinus.resultcoin>=1500) {
							ChangePanel.ChangePanel(start, check,shopmain );
							sp.test(7);
							pm.pointMinus(1500);
							cap.plusCharm(15);
							
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});

		JButton sitem4 = new JButton(new ImageIcon(img8));
		sitem4.setSize(120,120);
		sitem4.setLocation(380,160);
		shoesItems.add(sitem4);
		iteminfo = new JLabel("<html> 나이키 신발 <br> 2500 코인 <br> 매력도 20 상승");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 160);
		Font font8 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font8);
		shoesItems.add(iteminfo);
		sitem4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<2499) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if(PointMinus.resultcoin>=2500) {
							ChangePanel.ChangePanel(start, check,shopmain );
							sp.test(8);
							pm.pointMinus(2500);
							cap.plusCharm(20);
							
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);	
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});
		sitem1.setContentAreaFilled(false);
		sitem1.setFocusPainted(false);
		sitem2.setContentAreaFilled(false);
		sitem2.setFocusPainted(false);
		sitem3.setContentAreaFilled(false);
		sitem3.setFocusPainted(false);
		sitem4.setContentAreaFilled(false);
		sitem4.setFocusPainted(false);

		JPanel jewerlyItems = new JPanel();
		jewerlyItems.setLayout(null);
		
		
		Image img9 = new ImageIcon("images/acc1.png").getImage().getScaledInstance(120, 120, 0);
		Image img10 = new ImageIcon("images/acc2.png").getImage().getScaledInstance(120, 120, 0);
		Image img11 = new ImageIcon("images/acc3.png").getImage().getScaledInstance(120, 120, 0);
		Image img12 = new ImageIcon("images/acc4.png").getImage().getScaledInstance(120, 120, 0);

		JButton jitem1 = new JButton(new ImageIcon(img9));
		jitem1.setSize(120,120);
		jitem1.setLocation(20,20);
		jewerlyItems.add(jitem1);
		iteminfo = new JLabel("<html> 넥타이 <br> 500 코인 <br> 매력도 5 상승");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 20);
		Font font9 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font9);
		jewerlyItems.add(iteminfo);
		jitem1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<499) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if(PointMinus.resultcoin>=500) {
							ChangePanel.ChangePanel(start, check,shopmain );
						ap.test(9);
						pm.pointMinus(500);
						cap.plusCharm(5);
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});

		JButton jitem2 = new JButton(new ImageIcon(img10));
		jitem2.setSize(120,120);
		jitem2.setLocation(20,160);
		jewerlyItems.add(jitem2);
		iteminfo = new JLabel("<html> 고오급 시계 <br> 3000 코인 <br> 매력도 25 상승");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 160);
		Font font10 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font10);
		jewerlyItems.add(iteminfo);
		jitem2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<2999) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if(PointMinus.resultcoin>=3000) {
							ChangePanel.ChangePanel(start, check,shopmain );
							ap.test(10);
							pm.pointMinus(3000);
							cap.plusCharm(25);
							
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});

		JButton jitem3 = new JButton(new ImageIcon(img11));
		jitem3.setSize(120,120);
		jitem3.setLocation(380,20);
		jewerlyItems.add(jitem3);
		iteminfo = new JLabel("<html> 피어싱 <br> 1000 코인 <br> 매력도 10 상승");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 20);
		Font font11 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font11);
		jewerlyItems.add(iteminfo);
		jitem3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<999) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if(PointMinus.resultcoin>=1000) {
							cap.plusCharm(10);
							pm.pointMinus(1000);
							ap.test(11);
							ChangePanel.ChangePanel(start, check,shopmain );
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});

		JButton jitem4 = new JButton(new ImageIcon(img12));
		jitem4.setSize(120,120);
		jitem4.setLocation(380,160);
		jewerlyItems.add(jitem4);
		iteminfo = new JLabel("<html> 은 팔찌 <br> 1500 코인 <br> 매력도 13 상승");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 160);
		Font font12 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font12);
		jewerlyItems.add(iteminfo);
		jitem4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<1499) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
							
						}else if(PointMinus.resultcoin>=1500) {
							ap.test(12);
							pm.pointMinus(1500);
							cap.plusCharm(13);
							ChangePanel.ChangePanel(start, check,shopmain );
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});
		jitem1.setContentAreaFilled(false);
		jitem1.setFocusPainted(false);
		jitem2.setContentAreaFilled(false);
		jitem2.setFocusPainted(false);
		jitem3.setContentAreaFilled(false);
		jitem3.setFocusPainted(false);
		jitem4.setContentAreaFilled(false);
		jitem4.setFocusPainted(false);


		JPanel item = new JPanel();
		item.setLayout(null);
		
		Image img13 = new ImageIcon("images/change.png").getImage().getScaledInstance(120, 120, 0);
		Image img14 = new ImageIcon("images/exp.PNG").getImage().getScaledInstance(120, 120, 0);
		Image img15 = new ImageIcon("images/know.png").getImage().getScaledInstance(120, 120, 0);
		Image img16 = new ImageIcon("images/anfdmaby.png").getImage().getScaledInstance(120, 120, 0);

		JButton item1 = new JButton(new ImageIcon(img13));
		item1.setSize(120,120);
		item1.setLocation(20,20);
		item.add(item1);
		iteminfo = new JLabel("<html> 미니맵 다시 생성 <br> 1000 코인");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 20);
		Font font13 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font13);
		item.add(iteminfo);
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new ReRandom().reRandom();
						if (PointMinus.resultcoin<999) {

							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if(PointMinus.resultcoin>=1000) {
							pm.pointMinus(1000);
							ChangePanel.ChangePanel(start, check,shopmain );
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});


		JButton item2 = new JButton(new ImageIcon(img14));
		item2.setSize(120,120);
		item2.setLocation(20,160);
		item.add(item2);
		iteminfo = new JLabel("<html>경험치 50증가 <br> 4000코인 ");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 160);
		Font font14 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font14);
		item.add(iteminfo);
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<3999) {
							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if(PointMinus.resultcoin>3999) {
							new Exper().exp();	
							if(StartStoryPanel.startnum == 0) {
								ChangePanel.StartChangePanle(start, check, new StartStoryPanel(start));
								StartStoryPanel.startnum++;
							}else {
								ChangePanel.ChangePanel(start, check,shopmain );								
							}
							pm.pointMinus(1000);

						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});

		JButton item3 = new JButton(new ImageIcon(img15));
		item3.setSize(120,120);
		item3.setLocation(380,20);
		item.add(item3);
		iteminfo = new JLabel("<html> 애정도 확인 <br> 코인 <br>(여성마다 다름) ");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 20);
		Font font15 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font15);
		item.add(iteminfo);

		item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check ,new AffOk(start) );

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
					}
				});

				check.add(yes);
				check.add(no);

			}
		});

		JButton item4 = new JButton(new ImageIcon(img16));
		item4.setSize(120,120);
		item4.setLocation(380,160);
		item.add(item4); 
		iteminfo = new JLabel("<html>애정도 랜덤<br> 증가 / 감소 <br> 1500 코인");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 160);
		Font font16 =new Font("휴먼편지체", Font.BOLD, 15);
		iteminfo.setFont(font16);
		item.add(iteminfo);
		item4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel check = new JPanel();
				check.setSize(920,720);
				check.setLayout(null);
				ChangePanel.ChangePanel(start, shopmain, check);
				JButton yes = new JButton("yes");
				yes.setSize(300,150);
				yes.setLocation(110,310);
				Font font =new Font("휴먼편지체", Font.BOLD, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (PointMinus.resultcoin<1499) {

							ChangePanel.ChangePanel(start, check,new CoinShop(start));
						}else if(PointMinus.resultcoin>1499) {
							pm.pointMinus(1500);
							ChangePanel.ChangePanel(start, check,new AffRandom(start));
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1 =new Font("휴먼편지체", Font.BOLD, 40);
				no.setFont(font1);
				no.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );

					}
				});

				check.add(yes);
				check.add(no);

			}
		});
		Image exit2 = new ImageIcon("images/back.png").getImage().getScaledInstance(50, 50, 0);

		JButton exit = new JButton(new ImageIcon(exit2));

		exit.setLocation(760,100);
		exit.setSize(60,60);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ChangePanel(start, shopmain, new Main(start));

			}
		}); 

		Image storeTitel = new ImageIcon("images/storeTietle.png").getImage().getScaledInstance(500, 400, 0);
		JLabel storeTitelt = new JLabel(new ImageIcon(storeTitel));
		storeTitelt.setBounds(280, -70, 400, 400);

		JTabbedPane tp =new JTabbedPane();

		tp.setBounds(100, 234, 750, 350);
		tp.add("옷",clothItems);
		tp.add("신발",shoesItems);
		tp.add("악세사리",jewerlyItems);
		tp.add("아이템",item);

		
		shopmain.add(storeTitelt);

		this.add(tp);
		this.add(exit);


	}
}
