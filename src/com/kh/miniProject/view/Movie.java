package com.kh.miniProject.view;

import java.awt.Color;
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
import com.kh.miniProject.model.vo.Day;
import com.kh.miniProject.model.vo.EnterKeyAction;

public class Movie extends JPanel implements KeyListener {
	private JFrame start;
	private JPanel movie;
	private JTextArea tf;
	private FileController sc = new FileController();
	private File loveStory;
	private EnterKeyAction ek = new EnterKeyAction();
	private ArrayList listStory;

	public Movie(JFrame start) {
		this.start = start;
		movie = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		// JLabel MovieBack = new JLabel(
		// new ImageIcon(new
		// ImageIcon("images/��ȭ��.PNG").getImage().getScaledInstance(960, 720, 0)));
		// MovieBack.setBounds(0, 0, 960, 720);

		// this.setBackground(Color.cyan);
		System.out.println("�г� ����");

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
			JLabel icon1 = new JLabel(new ImageIcon("images/movie.png"));
			icon1.setBounds(0, 0, 960, 720);
			this.add(icon1);
		} else if (Main.day == 1) {
			JLabel icon1 = new JLabel(new ImageIcon("images/movie2.png"));
			icon1.setBounds(0, 0, 960, 720);
			this.add(icon1);
		} else if (Main.day == 2) {
			JLabel icon1 = new JLabel(new ImageIcon("images/movie3.png"));
			icon1.setBounds(0, 0, 960, 720);
			this.add(icon1);
		}
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
		System.out.println("movie ���� ����");
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
		System.out.println("1�ߵ巷����? " + girlnumber);

	}
}
