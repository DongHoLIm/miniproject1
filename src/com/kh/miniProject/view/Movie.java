package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kh.miniProject.controller.FileController;
import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.vo.Day;
import com.kh.miniProject.model.vo.EnterKeyAction;
import com.kh.miniProject.model.vo.GirlImageOut;

public class Movie extends JPanel implements KeyListener {
	private JFrame start;
	private JPanel movie;
	private JTextArea tf;
	private FileController sc = new FileController();
	private File loveStory;
	private EnterKeyAction ek = new EnterKeyAction();
	private ArrayList listStory;
	private JLabel icon1;
	/*int girlnumber;*/
	

	public Movie(JFrame start,int girlnumber) {
		this.start = start;
		movie = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		// JLabel MovieBack = new JLabel(
		// new ImageIcon(new
		// ImageIcon("images/영화관.PNG").getImage().getScaledInstance(960, 720, 0)));
		// MovieBack.setBounds(0, 0, 960, 720);

		// this.setBackground(Color.cyan);
		System.out.println("패널 생성");
		System.out.println("girl number "+girlnumber);
		
		tf = new JTextArea();
		tf.setLayout(null);
		tf.setBounds(150,450, 600,150);
		tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
		tf.addKeyListener(this);
		tf.setCaretColor(Color.cyan);
		tf.setFont(getFont().deriveFont(15.0f));

		this.add(tf);
		String place = "movie";
		loveStory = sc.textOutgoTput(place);
		listStory = ek.enterAction(loveStory);
		if (Main.day == 0) {
			icon1 = new JLabel(new ImageIcon("images/movie.png"));
			icon1.setBounds(0, 0, 960, 720);
			this.add(icon1);
		} else if (Main.day == 1) {
			icon1 = new JLabel(new ImageIcon("images/movie2.png"));
			icon1.setBounds(0, 0, 960, 720);
			this.add(icon1);
		} else if (Main.day == 2) {
			icon1 = new JLabel(new ImageIcon("images/movie3.png"));
			icon1.setBounds(0, 0, 960, 720);
			this.add(icon1);
		}
		JLabel girl = new JLabel(new ImageIcon(GirlImages.girlImage[girlnumber]));
		girl.setBounds(50, 50, 150, 150);
		icon1.add(girl);
		
		
		
		movieInit();
		

		// mf.addKeyListener(new KeyAdapter() {
		//
		// @Override
		// public void keyTyped(KeyEvent e) {
		// int num = 0;
		//
		// if (e.getKeyCode() == KeyEvent.VK_SPACE) {
		// num = 1;
		// }
		//
		// }
		//
		// });

	}

	public void movieInit() {
		System.out.println("movie 내부 인터");
		movie.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(890, 20);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());
		// exit.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseClicked(MouseEvent e) {
		// ChangePanel cp = new ChangePanel(mf , movie);
		// MiniMap mm = new MiniMap(mf);
		//
		//
		// cp.replacePanel(mm);
		// }
		// });
//		System.out.println("ㅁㅁㅁ"+girlnumber);
//		Image gi = new ImageIcon(GirlImages.girlImage[girlnumber]).getImage();
//		JLabel girl = new JLabel(new ImageIcon(gi));
		
		
		
		
		//movie.add(girl);
		movie.add(exit);
		

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day2++;
			Main.day++;
			Main.dayBreak++;
			new Day().day();
			ChangePanel.ChangePanel(start, movie, new Main(start));
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			String str = ek.goEnterAction(listStory);
			System.out.println(str);
			if (str.length() != 0) {
				tf.append(str);
				// value++;
			} else {
				System.out.println("AA");
				ChangePanel.ChangePanel(start, movie, new SelectPanel(start, loveStory));
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void acceptGirl(int girlnumber) {
		System.out.println("1잘드렁가니? " + girlnumber);
		//this.girlnumber = girlnumber;
		
		/*
		Image gi = new ImageIcon(GirlImages.girlImage[girlnumber]).getImage().getScaledInstance(120, 120, 0);
		JLabel girl = new JLabel(new ImageIcon(gi));
		girl.setLayout(null);
		girl.setBounds(120, 120, 50, 50);
		*/
		
		
		

	}
}
