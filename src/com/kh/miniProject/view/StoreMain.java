package com.kh.miniProject.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

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
		iteminfo = new JLabel("<html>Àß»ý±ä½ÂÈÆÀÌ ¸ÚÁ³¾î<br>±×·¸°Ô ¸ÚÁø³à¼®ÀÌ...<br></html>");
		iteminfo.setSize(120,120);
		iteminfo.setLocation(160, 20);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						cp.test(1);
						pm.pointMinus(100);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						cp.test(2);
						pm.pointMinus(200);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						cp.test(3);
						pm.pointMinus(300);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						cp.test(4);
						pm.pointMinus(400);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						sp.test(5);
						pm.pointMinus(500);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						sp.test(6);
						pm.pointMinus(600);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						sp.test(7);
						pm.pointMinus(700);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						sp.test(8);
						pm.pointMinus(800);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						ap.test(9);
						pm.pointMinus(900);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						ap.test(10);
						pm.pointMinus(1000);
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						ap.test(11);
						pm.pointMinus(1100);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						ap.test(12);
						pm.pointMinus(1200);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						pm.pointMinus(1300);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						pm.pointMinus(1400);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						pm.pointMinus(1500);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
				yes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.ChangePanel(start, check,shopmain );
						pm.pointMinus(1600);
						
					}
				});
				JButton no  = new JButton("no");
				no.setSize(300,150);
				no.setLocation(510,310);
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
			
		JTabbedPane tp =new JTabbedPane();
		
		tp.setBounds(100, 234, 750, 350);
		tp.add("¿Ê",clothItems);
		tp.add("½Å¹ß",shoesItems);
		tp.add("¾Ç¼¼»ç¸®",jewerlyItems);
		tp.add("¾ÆÀÌÅÛ",item);
		
		
		this.add(tp);
		this.add(exit);
		
		
	}
}
