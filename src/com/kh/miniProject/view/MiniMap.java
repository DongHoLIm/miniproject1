package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.controller.FileController;
import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.vo.GirlImageOut;
import com.kh.miniProject.model.vo.RandomPlace;
import com.kh.miniProject.model.vo.StartStory;

public class MiniMap extends JPanel {
	private JFrame start;
	private JPanel MiniMap;
	private JPanel main;
	public Map hmap;
	GirlImages gi = new GirlImages();
	public static int te[] = new int[5];
	public static int temp[] = new int[5];
	public static int temp2[] = new int[5];
	public static int temp3[] = new int[5];
	public static int[] girlImages = new int[5];
	RandomPlace rp = new RandomPlace();
	FileController fc = new FileController();
	private JPanel place = new JPanel();
	public static int[] intiarr;
	StartStory ss = new StartStory();
	

	public MiniMap(JFrame start) {
		// RandomPlaceManager rpm = new RandomPlaceManager(null);
		this.start = start;
		hmap = new HashMap();
		//main = this;
		MiniMap = this;
		this.setBounds(0, 0, 960, 720);
		//this.setBackground(Color.gray);
		this.setSize(960, 720);

		JLabel icon1 = new JLabel(new ImageIcon("images/minimab.png"));
	    icon1.setBounds(0, 0, 960, 720);

		// 배경 Panel 생성후 컨텐츠페인으로 지정
		// MiniMap = new JPanel() {
		// public void paintComponent(Graphics g) {
		// g.drawImage(icon.getImage(), 0, 0,960,720, null);
		// setOpaque(false);
		// super.paintComponent(g);
		// }
		// };

		this.setLayout(null);

		hmap.putAll(CreatPlace());
		hmap.putAll(CreatPlace2());
		Image img6 = new ImageIcon("images/back.png").getImage().getScaledInstance(30, 30, 0);
		JButton place11 = new JButton(new ImageIcon(img6));
		place11.setLocation(850, 50);
		place11.setSize(30, 30);
		place11.setContentAreaFilled(false);
		place11.setFocusPainted(false);

		place11.addActionListener(new ChangeMain());

		this.add(place11);
		this.add(icon1);

	}

	public MiniMap() {
	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Main(start));
		}

	}

	class ChangeMovie implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Movie(start,StartStory.grilnumber));
			
		}

	}

	class ChangePark implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Park(start,StartStory.grilnumber));
		}

	}

	class ChangeCafe implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Cafe(start,StartStory.grilnumber));
		}

	}

	class ChangeBeach implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Beach(start,StartStory.grilnumber));
		}

	}

	class ChangeRestaurant implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Restraurant(start,StartStory.grilnumber));
		}

	}

	class ChangeHotPlace implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new HotPlace(start,StartStory.grilnumber));
		}

	}

	class ChangeSiningRoom implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new SingingRoom(start,StartStory.grilnumber));
		}

	}

	class ChangePub implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Pub(start,StartStory.grilnumber));
		}

	}

	class ChangeFlowerShop implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new FlowerShop(start,StartStory.grilnumber));
		}

	}

	class ChangeThemePark implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new ThemePark(start,StartStory.grilnumber));
		}

	}

	public Map Movie() {
		JLabel placeName1 = new JLabel("영화관");
		placeName1.setLocation(455, 260);
		placeName1.setSize(150, 50);
		JButton place1 = new JButton(new ImageIcon("images/Button(1).png"));

		place1.setLocation(450, 300);
		place1.setSize(50, 50);
		place1.setFocusPainted(true);
		place1.setContentAreaFilled(false);
		place1.setBorderPainted(false);
		place1.addActionListener(new ChangeMovie());

		this.add(place1);
		this.add(placeName1);

		return hmap;
	}

	public Map Cafe() {
		JLabel placeName2 = new JLabel("카페");
		placeName2.setLocation(130, 160);
		placeName2.setSize(150, 50);

		JButton place2 = new JButton(new ImageIcon("images/Button(1).png"));
		place2.setLocation(120, 200);
		place2.setSize(50, 50);
		place2.setFocusPainted(true);
		place2.setContentAreaFilled(false);
		place2.setBorderPainted(false);
		place2.addActionListener(new ChangeCafe());

		this.add(place2);
		this.add(placeName2);

		return hmap;
	}

	public Map Park() {
		JLabel placeName3 = new JLabel("공원");
		placeName3.setLocation(260, 110);
		placeName3.setSize(150, 50);
		JButton place3 = new JButton(new ImageIcon("images/Button(1).png"));
		place3.setLocation(250, 150);
		place3.setSize(50, 50);
		place3.setFocusPainted(true);
		place3.setContentAreaFilled(false);
		place3.setBorderPainted(false);
		place3.addActionListener(new ChangePark());
		this.add(place3);
		this.add(placeName3);

		return hmap;
	}

	public Map Beach() {
		JLabel placeName4 = new JLabel("바닷가");
		placeName4.setLocation(275, 460);
		placeName4.setSize(150, 50);
		JButton place4 = new JButton(new ImageIcon("images/Button(1).png"));
		place4.setLocation(270, 500);
		place4.setSize(50, 50);
		place4.setFocusPainted(true);
		place4.setContentAreaFilled(false);
		place4.setBorderPainted(false);
		place4.addActionListener(new ChangeBeach());
		this.add(place4);
		this.add(placeName4);

		return hmap;
	}

	public Map Restaurant() {
		JLabel placeName5 = new JLabel("식당");
		placeName5.setLocation(660, 160);
		placeName5.setSize(150, 50);
		JButton place5 = new JButton(new ImageIcon("images/Button(1).png"));
		place5.setLocation(650, 200);
		place5.setSize(50, 50);
		place5.setFocusPainted(true);
		place5.setContentAreaFilled(false);
		place5.setBorderPainted(false);
		place5.addActionListener(new ChangeRestaurant());
		this.add(place5);
		this.add(placeName5);

		return hmap;
	}

	public Map HotPlace() {
		JLabel placeName6 = new JLabel("번화가");
		placeName6.setLocation(455, 500);
		placeName6.setSize(150, 50);
		JButton place6 = new JButton(new ImageIcon("images/Button(1).png"));
		place6.setLocation(450, 540);
		place6.setSize(50, 50);
		place6.setFocusPainted(true);
		place6.setContentAreaFilled(false);
		place6.setBorderPainted(false);
		place6.addActionListener(new ChangeHotPlace());
		this.add(place6);
		this.add(placeName6);
		return hmap;
	}

	public Map SiningRoom() {
		JLabel placeName7 = new JLabel("노래방");
		placeName7.setLocation(55, 240);
		placeName7.setSize(150, 50);
		JButton place7 = new JButton(new ImageIcon("images/Button(1).png"));
		place7.setLocation(50, 280);
		place7.setSize(50, 50);
		place7.setFocusPainted(true);
		place7.setContentAreaFilled(false);
		place7.setBorderPainted(false);
		place7.addActionListener(new ChangeSiningRoom());
		this.add(place7);
		this.add(placeName7);
		return hmap;
	}

	public Map Pub() {
		JLabel placeName8 = new JLabel("술집");
		placeName8.setLocation(560, 10);
		placeName8.setSize(150, 50);
		JButton place8 = new JButton(new ImageIcon("images/Button(1).png"));
		place8.setLocation(550, 50);
		place8.setSize(50, 50);
		place8.setFocusPainted(true);
		place8.setContentAreaFilled(false);
		place8.setBorderPainted(false);
		place8.addActionListener(new ChangePub());
		this.add(place8);
		this.add(placeName8);

		return hmap;
	}

	public Map FlowerShop() {
		JLabel placeName9 = new JLabel("꽃집");
		placeName9.setLocation(610, 430);
		placeName9.setSize(150, 50);
		JButton place9 = new JButton(new ImageIcon("images/Button(1).png"));
		place9.setLocation(600, 470);
		place9.setSize(50, 50);
		place9.setFocusPainted(true);
		place9.setContentAreaFilled(false);
		place9.setBorderPainted(false);
		place9.addActionListener(new ChangeFlowerShop());
		this.add(place9);
		this.add(placeName9);

		return hmap;

	}

	public Map ThemePark() {

		JLabel placeName10 = new JLabel("놀이공원");
		placeName10.setLocation(190, 280);
		placeName10.setSize(150, 50);
		JButton place10 = new JButton(new ImageIcon("images/Button(1).png"));
		place10.setLocation(190, 320);
		place10.setSize(50, 50);
		place10.setFocusPainted(true);
		place10.setContentAreaFilled(false);
		place10.setBorderPainted(false);
		place10.addActionListener(new ChangeThemePark());
		this.add(place10);
		this.add(placeName10);

		return hmap;
	}

	public Map CreatPlace() {
		for (int c = 0; c < rp.getRandom2().length; c++) {
			te[c] = rp.getRandom2()[c];

		}

		for (int f = 0; f < temp.length; f++) {
			if (Main.day == 0 && Main.dayBreak == 1 && Main.totalDay != 11) {
				temp[f] += te[f];

				System.out.println("호출됨");
			}
			// else if (Main.day == 1 && Main.dayBreak == 4 && Main.totalDay != 11) {
			//
			// temp2[f] += te[f];
			//
			// } else if (Main.day == 2 && Main.dayBreak == 7 && Main.totalDay != 11) {
			//
			// temp3[f] += te[f];
			//
			// }

		}
		System.out.println("day" + Main.day);
		System.out.println("db" + Main.dayBreak);
		System.out.println("total" + Main.totalDay);
		if (Main.dayBreak == 1 && Main.totalDay != 11) {

			Main.dayBreak = 2;
			System.out.println("day2" + Main.day);
			System.out.println("db2" + Main.dayBreak);
		} else if (Main.dayBreak == 4 && Main.totalDay != 11) {

			Main.dayBreak = 5;
			System.out.println("day3" + Main.day);
			System.out.println("db3" + Main.dayBreak);
		} else if (Main.dayBreak == 7 && Main.totalDay != 11) {

			Main.dayBreak = 8;
			System.out.println("day4" + Main.day);
			System.out.println("db4" + Main.dayBreak);
		}

		return hmap;
	}

	public Map CreatPlace2() {
		place = new JPanel();
		place.setBounds(800, 350, 150, 400);
		place.setBorder(BorderFactory.createLineBorder(Color.black));
		place.setLayout(null);
		MiniMap.add(place);
		MiniMap.repaint();
		
		plusGirlImage();
	      
		int y = 0;
		for (int b = 0; b < temp.length; b++) {
			System.out.println("호출됨 2");
			if (Main.dayBreak == 2 && Main.totalDay != 11) {
				if (temp[b] == 1) {
					hmap.putAll(Movie());
					JLabel label = new JLabel("영화관");
					label.setBounds(10, y, 50, 50);
					place.add(label);
					place.repaint();
					y += 30;
				} else if (temp[b] == 2) {
					hmap.putAll(Cafe());
					JLabel label2 = new JLabel("카페");
					label2.setBounds(10, y, 50, 50);
					place.add(label2);
					place.repaint();
					y += 50;
				} else if (temp[b] == 3) {
					hmap.putAll(Park());
					JLabel label3 = new JLabel("공원");
					label3.setBounds(10, y, 50, 50);
					place.add(label3);
					place.repaint();
					y += 50;
				} else if (temp[b] == 4) {
					hmap.putAll(Beach());
					JLabel label4 = new JLabel("바다");
					label4.setBounds(10, y, 50, 50);
					place.add(label4);
					place.repaint();
					y += 50;
				} else if (temp[b] == 5) {
					hmap.putAll(Restaurant());
					JLabel label5 = new JLabel("식당");
					label5.setBounds(10, y, 50, 50);
					place.add(label5);
					place.repaint();
					y += 50;
				} else if (temp[b] == 6) {
					hmap.putAll(HotPlace());
					JLabel label6 = new JLabel("번화가");
					label6.setBounds(10, y, 50, 50);
					place.add(label6);
					place.repaint();
					y += 50;
				}

				else if (temp[b] == 7) {
					hmap.putAll(SiningRoom());
					JLabel label7 = new JLabel("노래방");
					label7.setBounds(10, y, 50, 50);
					place.add(label7);
					place.repaint();
					y += 50;
				} else if (temp[b] == 8) {
					hmap.putAll(Pub());
					JLabel label8 = new JLabel("술집");
					label8.setBounds(10, y, 50, 50);
					place.add(label8);
					place.repaint();
					y += 50;
				} else if (temp[b] == 9) {
					hmap.putAll(FlowerShop());
					JLabel label9 = new JLabel("꽃집");
					label9.setBounds(10, y, 50, 50);
					place.add(label9);
					place.repaint();
					y += 50;
				} else if (temp[b] == 10) {
					hmap.putAll(ThemePark());
					JLabel label10 = new JLabel("놀이공원");
					label10.setBounds(10, y, 50, 50);
					place.add(label10);
					place.repaint();
					y += 50;
				}

			} else if (Main.dayBreak == 5 && Main.totalDay != 11) {
				if (temp[b] == 1) {
					hmap.putAll(Movie());
					JLabel label = new JLabel("영화관");
					label.setBounds(10, y, 50, 50);
					place.add(label);
					place.repaint();
					y += 30;
				} else if (temp[b] == 2) {
					hmap.putAll(Cafe());
					JLabel label2 = new JLabel("카페");
					label2.setBounds(10, y, 50, 50);
					place.add(label2);
					place.repaint();
					y += 50;
				} else if (temp[b] == 3) {
					hmap.putAll(Park());
					JLabel label3 = new JLabel("공원");
					label3.setBounds(10, y, 50, 50);
					place.add(label3);
					place.repaint();
					y += 50;
				} else if (temp[b] == 4) {
					hmap.putAll(Beach());
					JLabel label4 = new JLabel("바다");
					label4.setBounds(10, y, 50, 50);
					place.add(label4);
					place.repaint();
					y += 50;
				} else if (temp[b] == 5) {
					hmap.putAll(Restaurant());
					JLabel label5 = new JLabel("식당");
					label5.setBounds(10, y, 50, 50);
					place.add(label5);
					place.repaint();
					y += 50;
				} else if (temp[b] == 6) {
					hmap.putAll(HotPlace());
					JLabel label6 = new JLabel("번화가");
					label6.setBounds(10, y, 50, 50);
					place.add(label6);
					place.repaint();
					y += 50;
				}

				else if (temp[b] == 7) {
					hmap.putAll(SiningRoom());
					JLabel label7 = new JLabel("노래방");
					label7.setBounds(10, y, 50, 50);
					place.add(label7);
					place.repaint();
					y += 50;
				} else if (temp[b] == 8) {
					hmap.putAll(Pub());
					JLabel label8 = new JLabel("술집");
					label8.setBounds(10, y, 50, 50);
					place.add(label8);
					place.repaint();
					y += 50;
				} else if (temp[b] == 9) {
					hmap.putAll(FlowerShop());
					JLabel label9 = new JLabel("꽃집");
					label9.setBounds(10, y, 50, 50);
					place.add(label9);
					place.repaint();
					y += 50;
				} else if (temp[b] == 10) {
					hmap.putAll(ThemePark());
					JLabel label10 = new JLabel("놀이공원");
					label10.setBounds(10, y, 50, 50);
					place.add(label10);
					place.repaint();
					y += 50;
				}
			} else if (Main.dayBreak == 8 && Main.totalDay != 11) {
				if (temp[b] == 1) {
					hmap.putAll(Movie());
					JLabel label = new JLabel("영화관");
					label.setBounds(10, y, 50, 50);
					place.add(label);
					place.repaint();
					y += 30;
				} else if (temp[b] == 2) {
					hmap.putAll(Cafe());
					JLabel label2 = new JLabel("카페");
					label2.setBounds(10, y, 50, 50);
					place.add(label2);
					place.repaint();
					y += 50;
				} else if (temp[b] == 3) {
					hmap.putAll(Park());
					JLabel label3 = new JLabel("공원");
					label3.setBounds(10, y, 50, 50);
					place.add(label3);
					place.repaint();
					y += 50;
				} else if (temp[b] == 4) {
					hmap.putAll(Beach());
					JLabel label4 = new JLabel("바다");
					label4.setBounds(10, y, 50, 50);
					place.add(label4);
					place.repaint();
					y += 50;
				} else if (temp[b] == 5) {
					hmap.putAll(Restaurant());
					JLabel label5 = new JLabel("식당");
					label5.setBounds(10, y, 50, 50);
					place.add(label5);
					place.repaint();
					y += 50;
				} else if (temp[b] == 6) {
					hmap.putAll(HotPlace());
					JLabel label6 = new JLabel("번화가");
					label6.setBounds(10, y, 50, 50);
					place.add(label6);
					place.repaint();
					y += 50;
				}

				else if (temp[b] == 7) {
					hmap.putAll(SiningRoom());
					JLabel label7 = new JLabel("노래방");
					label7.setBounds(10, y, 50, 50);
					place.add(label7);
					place.repaint();
					y += 50;
				} else if (temp[b] == 8) {
					hmap.putAll(Pub());
					JLabel label8 = new JLabel("술집");
					label8.setBounds(10, y, 50, 50);
					place.add(label8);
					place.repaint();
					y += 50;
				} else if (temp[b] == 9) {
					hmap.putAll(FlowerShop());
					JLabel label9 = new JLabel("꽃집");
					label9.setBounds(10, y, 50, 50);
					place.add(label9);
					place.repaint();
					y += 50;
				} else if (temp[b] == 10) {
					hmap.putAll(ThemePark());
					JLabel label10 = new JLabel("놀이공원");
					label10.setBounds(10, y, 50, 50);
					place.add(label10);
					place.repaint();
					y += 50;
				}
			}
		}
		intiarr = new int[temp.length];
		for(int i = 0; i < temp.length; i++) {
			intiarr[i] = temp[i];
			System.out.println("a" + temp[i]);
			System.out.println("b" +intiarr[i]);
		}
		ss.startStory();
		return hmap;
	}
	
	public void plusGirlImage() {
		
		int levResult = PlayerInfo.lev;
		System.out.println("레벨값 : " + levResult);
		String[] mmgi = fc.goGirlImages(levResult);
		System.out.println("배열길이 : " + mmgi.length);
		System.out.println("무슨값 ? : " + mmgi[0]);
		Image[] gImage = new Image[mmgi.length];
		System.out.println("이미지 배열길이 : " + gImage.length);
		JLabel[] gLabel = new JLabel[mmgi.length];
		System.out.println("라벨 배열길이 : " + gLabel.length);
		int sgoi = 10;
		for(int g = 0 ; g < gImage.length ; g++) {
			gImage[g] = new ImageIcon(mmgi[g]).getImage().getScaledInstance(50, 50, 0); 
			System.out.println("무슨값이 들어갔을까? " + gImage[g]);
			JLabel la = new JLabel();
			la.setIcon(new ImageIcon(gImage[g]));
			System.out.println("들어갔나? " + la);
			la.setBounds(70 , sgoi , 50 , 50);
			place.add(la);
			sgoi +=50;		
		}
		
	}
	
//	public void startStory() {
//		System.out.println("왜 널값? " + intiarr.length);
//		for(int i = 0; i < intiarr.length; i++) {
//			System.out.println("intiarr의 값은 과연? " + intiarr[i]);
//		}
//		for(int i = 0; i < GirlImageOut.iarr.length; i++) {
//			System.out.println("iarr의 값은 과연? " + GirlImageOut.iarr[i]);
//		}
//		
//		for(int i = 0; i < intiarr.length; i++) {
//			for(int j = 0; j < GirlImageOut.iarr.length; j++) {
//				
//				if(intiarr[i] == 1) {
//					if(i==j) {
//						place1.acceptGirl(GirlImageOut.iarr[j]);
//					}
//				}else if(intiarr[i] == 2) {
//					if(i==j) {
//						place2.acceptGirl(GirlImageOut.iarr[j]);
//					}
//					
//				}else if(intiarr[i] == 3) {
//					if(i==j) {
//						place3.acceptGirl(GirlImageOut.iarr[j]);
//					}
//					
//				}else if(intiarr[i] == 4) {
//					if(i==j) {
//						place4.acceptGirl(GirlImageOut.iarr[j]);
//					}
//					
//				}else if(intiarr[i] == 5) {
//					if(i==j) {
//						place5.acceptGirl(GirlImageOut.iarr[j]);
//					}
//					
//				}else if(intiarr[i] == 6) {
//					if(i==j) {
//						place6.acceptGirl(GirlImageOut.iarr[j]);
//					}
//					
//				}else if(intiarr[i] == 7) {
//					if(i==j) {
//						place7.acceptGirl(GirlImageOut.iarr[j]);
//					}
//					
//				}else if(intiarr[i] == 8) {
//					if(i==j) {
//						place8.acceptGirl(GirlImageOut.iarr[j]);
//					}
//					
//				}else if(intiarr[i] == 9) {
//					if(i==j) {
//						place9.acceptGirl(GirlImageOut.iarr[j]);
//					}
//					
//				}else if(intiarr[i] == 10) {
//					if(i==j) {
//						place10.acceptGirl(GirlImageOut.iarr[j]);
//					}
//					
//				}
//			}
//			
//		}
//	}

}
