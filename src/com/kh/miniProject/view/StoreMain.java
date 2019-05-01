package com.kh.miniProject.view;


import java.awt.Font;
import java.awt.Color;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.RGBColor;

import com.kh.miniProject.model.vo.PointMinus;

import com.kh.miniProject.model.vo.PointMinus;


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
		iteminfo = new JLabel("<html>잘생긴승훈이 멋졌어<br>그렇게 멋진녀석이...<br></html>");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 20);
		Font font=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						cp.test(1);

						if (PointMinus.resultcoin>99) {

							pm.pointMinus(100);
						}else {
							System.out.println("돈이 부족합니다.");
						}



					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item2info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 160);
		Font font2=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						cp.test(2);
						if (PointMinus.resultcoin>199) {

							pm.pointMinus(200);
						}else {
							System.out.println("돈이 부족합니다.");
						}


					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item3info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 20);
		Font font3=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						cp.test(3);
						if (PointMinus.resultcoin>299) {

							pm.pointMinus(300);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item4info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 160);
		Font font4=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						cp.test(4);
						if (PointMinus.resultcoin>399) {

							pm.pointMinus(400);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item5info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 20);
		Font font5=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						sp.test(5);
						if (PointMinus.resultcoin>499) {

							pm.pointMinus(500);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item6info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 160);
		Font font6=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						sp.test(6);
						if (PointMinus.resultcoin>599) {

							pm.pointMinus(600);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item7info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 20);
		Font font7=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						sp.test(7);
						if (PointMinus.resultcoin>699) {

							pm.pointMinus(700);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item8info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 160);
		Font font8=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						sp.test(8);
						if (PointMinus.resultcoin>799) {

							pm.pointMinus(800);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item9info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 20);
		Font font9=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						ap.test(9);
						if (PointMinus.resultcoin>899) {

							pm.pointMinus(900);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item10info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 160);
		Font font10=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						ap.test(10);
						if (PointMinus.resultcoin>999) {

							pm.pointMinus(1000);
						}else {
							System.out.println("돈이 부족합니다.");
						}
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item11info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 20);
		Font font11=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						ap.test(11);
						if (PointMinus.resultcoin>1099) {

							pm.pointMinus(1100);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
		iteminfo = new JLabel("item12info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 160);
		Font font12=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						ap.test(12);
						if (PointMinus.resultcoin>1199) {

							pm.pointMinus(1200);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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

		JButton item1 = new JButton("item13");
		item1.setSize(120,120);
		item1.setLocation(20,20);
		item.add(item1);
		iteminfo = new JLabel("item13info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 20);
		Font font13=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						if (PointMinus.resultcoin>1299) {

							pm.pointMinus(1300);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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


		JButton item2 = new JButton("item14");
		item2.setSize(120,120);
		item2.setLocation(20,160);
		item.add(item2);
		iteminfo = new JLabel("item14info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 160);
		Font font14=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						if (PointMinus.resultcoin>1399) {

							pm.pointMinus(1400);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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

		JButton item3 = new JButton("item15");
		item3.setSize(120,120);
		item3.setLocation(380,20);
		item.add(item3);
		iteminfo = new JLabel("item15info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 20);
		Font font15=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						if (PointMinus.resultcoin>1499) {

							pm.pointMinus(1500);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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

		JButton item4 = new JButton("item16");
		item4.setSize(120,120);
		item4.setLocation(380,160);
		item.add(item4);
		iteminfo = new JLabel("item16info");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(520, 160);
		Font font16=new Font("한컴 백제 M", Font.PLAIN, 15);
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
				Font font=new Font("한컴 백제 M", Font.PLAIN, 40);
				yes.setFont(font);
				yes.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						if (PointMinus.resultcoin>1599) {

							pm.pointMinus(1600);
						}else {
							System.out.println("돈이 부족합니다.");
						}

					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
				Font font1=new Font("한컴 백제 M", Font.PLAIN, 40);
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
