package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.controller.FileController;
import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.vo.RandomPlace;


public class MiniMap extends JPanel {
	private JFrame start;
	private JPanel MiniMap;
	private JPanel main;
	private Map hmap;
	private int girlresultnumber;
	JPanel place = new JPanel();
	FileController fc = new FileController();
	GirlImages gi = new GirlImages();
	public static int BGM;
	public static int temp[];
	public static String[] mmgi;
	public static Clip clip;
	
	public MiniMap(JFrame start) {

		this.start = start;
		hmap = new HashMap();

		MiniMap = this;
		this.setBounds(0, 0, 960, 720);

		this.setSize(960, 720);

		JLabel icon1 = new JLabel(new ImageIcon("images/minimab.png"));
	    icon1.setBounds(0, 0, 960, 720);


		this.setLayout(null);
		
		try {
			if(BGM == 0) {
			BGM++;
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/MainBGM.wav"));
            clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
			}
            
        } catch(Exception e) {
            
            e.printStackTrace();
        }
		clip.start();

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
			clip.stop();
			ChangePanel.ChangePanel(start, MiniMap, new Main(start));
		}

	}

	class ChangeMovie implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i = 0; i < temp.length; i++) {
				if(temp[i] == 1) {
					girlresultnumber = Main.mc.iarr[i];;
				}
			}
			Main.gc.grilNumberResult(girlresultnumber);
			ChangePanel.ChangePanel(start, MiniMap, new Movie(start));
			
		}

	}

	class ChangePark implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i = 0; i < temp.length; i++) {
				if(temp[i] == 3) {
					girlresultnumber = Main.mc.iarr[i];;
				}
			}
			Main.gc.grilNumberResult(girlresultnumber);
			ChangePanel.ChangePanel(start, MiniMap, new Park(start));
		}

	}

	class ChangeCafe implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i = 0; i < temp.length; i++) {
				if(temp[i] == 2) {
					girlresultnumber = Main.mc.iarr[i];;
				}
			}
			Main.gc.grilNumberResult(girlresultnumber);
			ChangePanel.ChangePanel(start, MiniMap, new Cafe(start));
		}

	}

	class ChangeBeach implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i = 0; i < temp.length; i++) {
				if(temp[i] == 4) {
					girlresultnumber = Main.mc.iarr[i];;
				}
			}
			Main.gc.grilNumberResult(girlresultnumber);
			ChangePanel.ChangePanel(start, MiniMap, new Beach(start));
		}

	}

	class ChangeRestaurant implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i = 0; i < temp.length; i++) {
				if(temp[i] == 5) {
					girlresultnumber = Main.mc.iarr[i];;
				}
			}
			Main.gc.grilNumberResult(girlresultnumber);
			ChangePanel.ChangePanel(start, MiniMap, new Restraurant(start));
		}

	}

	class ChangeHotPlace implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i = 0; i < temp.length; i++) {
				if(temp[i] == 6) {
					girlresultnumber = Main.mc.iarr[i];;
				}
			}
			Main.gc.grilNumberResult(girlresultnumber);
			ChangePanel.ChangePanel(start, MiniMap, new HotPlace(start));
		}

	}

	class ChangeSiningRoom implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i = 0; i < temp.length; i++) {
				if(temp[i] == 7) {
					girlresultnumber = Main.mc.iarr[i];;
				}
			}
			Main.gc.grilNumberResult(girlresultnumber);
			ChangePanel.ChangePanel(start, MiniMap, new SingingRoom(start));
		}

	}

	class ChangePub implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i = 0; i < temp.length; i++) {
				if(temp[i] == 8) {
					girlresultnumber = Main.mc.iarr[i];;
				}
			}
			Main.gc.grilNumberResult(girlresultnumber);
			ChangePanel.ChangePanel(start, MiniMap, new Pub(start));
		}

	}

	class ChangeFlowerShop implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i = 0; i < temp.length; i++) {
				if(temp[i] == 9) {
					girlresultnumber = Main.mc.iarr[i];;
				}
			}
			Main.gc.grilNumberResult(girlresultnumber);
			ChangePanel.ChangePanel(start, MiniMap, new FlowerShop(start));
		}

	}

	class ChangeThemePark implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i = 0; i < temp.length; i++) {
				if(temp[i] == 10) {
					girlresultnumber = Main.mc.iarr[i];;
				}
			}
			Main.gc.grilNumberResult(girlresultnumber);
			ChangePanel.ChangePanel(start, MiniMap, new ThemePark(start));
		}

	}

	public Map Movie() {
		JLabel placeName1 = new JLabel("영화관");
		placeName1.setLocation(455, 260);
		placeName1.setSize(150, 50);
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		placeName1.setFont(font1);
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
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		placeName2.setFont(font1);

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
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		placeName3.setFont(font1);
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
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		placeName4.setFont(font1);
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
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		placeName5.setFont(font1);
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
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		placeName6.setFont(font1);
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
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		placeName7.setFont(font1);
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
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		placeName8.setFont(font1);
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
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		placeName9.setFont(font1);
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
		Font font1 =new Font("휴먼편지체", Font.BOLD, 15);
		placeName10.setFont(font1);
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
		
		if(Main.rc.getRp().getGilrStop() == 1) {
			Main.rc.randomPlace();
			temp = new int[Main.rc.getRp().getRandom2().length];
			for (int c = 0; c < temp.length; c++) {
				temp[c] = Main.rc.getRp().getRandom2()[c];
				System.out.println("아오ㄹㅇ짜증나 " + temp[c]);
				
			}	
		}
		if (Main.dc.getDate().getDayBreak() == 1 && Main.dc.getDate().getTotalDay() != 11) {
			Main.dc.getDate().setDayBreak(2);

		} else if (Main.dc.getDate().getDayBreak() == 4 && Main.dc.getDate().getTotalDay() != 11) {
			Main.dc.getDate().setDayBreak(5);

		} else if (Main.dc.getDate().getDayBreak() == 7 && Main.dc.getDate().getTotalDay() != 11) {
			Main.dc.getDate().setDayBreak(8);

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
		for(int b = 0; b < temp.length; b++) {
			if (temp[b] == 1) {
				hmap.putAll(Movie());
				JLabel label = new JLabel("영화관");
				label.setBounds(10, y, 50, 50);
				Font font =new Font("휴먼편지체", Font.BOLD, 15);
				label.setFont(font);
				place.add(label);
				place.repaint();
				y += 60;
			} else if (temp[b] == 2) {
				hmap.putAll(Cafe());
				JLabel label2 = new JLabel("카페");
				label2.setBounds(10, y, 50, 50);
				Font font =new Font("휴먼편지체", Font.BOLD, 15);
				label2.setFont(font);
				place.add(label2);
				place.repaint();
				y += 60;
			} else if (temp[b] == 3) {
				hmap.putAll(Park());
				JLabel label3 = new JLabel("공원");
				label3.setBounds(10, y, 50, 50);
				Font font =new Font("휴먼편지체", Font.BOLD, 15);
				label3.setFont(font);
				place.add(label3);
				place.repaint();
				y += 60;
			} else if (temp[b] == 4) {
				hmap.putAll(Beach());
				JLabel label4 = new JLabel("바다");
				label4.setBounds(10, y, 50, 50);
				Font font =new Font("휴먼편지체", Font.BOLD, 15);
				label4.setFont(font);
				place.add(label4);
				place.repaint();
				y += 60;
			} else if (temp[b] == 5) {
				hmap.putAll(Restaurant());
				JLabel label5 = new JLabel("식당");
				label5.setBounds(10, y, 50, 50);
				Font font =new Font("휴먼편지체", Font.BOLD, 15);
				label5.setFont(font);
				place.add(label5);
				place.repaint();
				y += 60;
			} else if (temp[b] == 6) {
				hmap.putAll(HotPlace());
				JLabel label6 = new JLabel("번화가");
				label6.setBounds(10, y, 50, 50);
				Font font =new Font("휴먼편지체", Font.BOLD, 15);
				label6.setFont(font);
				place.add(label6);
				place.repaint();
				y += 60;
			}

			else if (temp[b] == 7) {
				hmap.putAll(SiningRoom());
				JLabel label7 = new JLabel("노래방");
				label7.setBounds(10, y, 50, 50);
				Font font =new Font("휴먼편지체", Font.BOLD, 15);
				label7.setFont(font);
				place.add(label7);
				place.repaint();
				y += 60;
			} else if (temp[b] == 8) {
				hmap.putAll(Pub());
				JLabel label8 = new JLabel("술집");
				label8.setBounds(10, y, 50, 50);
				Font font =new Font("휴먼편지체", Font.BOLD, 15);
				label8.setFont(font);
				place.add(label8);
				place.repaint();
				y += 60;
			} else if (temp[b] == 9) {
				hmap.putAll(FlowerShop());
				JLabel label9 = new JLabel("꽃집");
				label9.setBounds(10, y, 50, 50);
				Font font =new Font("휴먼편지체", Font.BOLD, 15);
				label9.setFont(font);
				place.add(label9);
				place.repaint();
				y += 60;
			} else if (temp[b] == 10) {
				hmap.putAll(ThemePark());
				JLabel label10 = new JLabel("놀이공원");
				label10.setBounds(10, y, 70, 50);
				Font font =new Font("휴먼편지체", Font.BOLD, 15);
				label10.setFont(font);
				place.add(label10);
				place.repaint();
				y += 60;
			}
		}
		
		return hmap;
	}
	
	public void plusGirlImage() {
		

		if(Main.rc.getRp().getGilrStop() == 1) {
			mmgi = fc.goGirlImages(Main.ic.getExper().getLev());
			Image[] gImage = new Image[mmgi.length];
			JLabel[] gLabel = new JLabel[mmgi.length];
			int sgoi = 10;
			for(int g = 0 ; g < gImage.length ; g++) {
				gImage[g] = new ImageIcon(mmgi[g]).getImage().getScaledInstance(50, 50, 0); 
				JLabel la = new JLabel();
				la.setIcon(new ImageIcon(gImage[g]));
				la.setBounds(70 , sgoi , 50 , 50);
				place.add(la);
				sgoi +=60;
				Main.rc.getRp().setGilrStop(Main.rc.getRp().getGilrStop()+1);
			}
		}else if(Main.rc.getRp().getGilrStop() > 1) {
			Image[] gImage = new Image[mmgi.length];
			JLabel[] gLabel = new JLabel[mmgi.length];
			int sgoi = 10;
			for(int g = 0 ; g < gImage.length ; g++) {
				gImage[g] = new ImageIcon(mmgi[g]).getImage().getScaledInstance(50, 50, 0); 
				JLabel la = new JLabel();
				la.setIcon(new ImageIcon(gImage[g]));
				la.setBounds(70 , sgoi , 50 , 50);
				place.add(la);
				sgoi +=60;		
			}
		}

	}

}


