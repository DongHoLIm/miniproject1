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

public class Pub extends JPanel implements KeyListener{
	private JFrame start;
	private JPanel rub;
	private JTextArea tf;
	private FileController sc = new FileController();
	private File loveStory;
	private EnterKeyAction ek = new EnterKeyAction();
	private ArrayList listStory;

	public Pub(JFrame start) {
		this.start = start;
		rub = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//				JLabel PubBack = new JLabel(
//						new ImageIcon(new ImageIcon("images/영화관.PNG").getImage().getScaledInstance(960, 720, 0)));
//				PubBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.ORANGE);
		System.out.println("패널 생성");
		
		tf = new JTextArea();
		tf.setLayout(null);
		tf.setBounds(150,450, 600,150);
		tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
		tf.addKeyListener(this);
		tf.setCaretColor(Color.cyan);
		tf.setFont(getFont().deriveFont(15.0f));
		
		this.add(tf);
		String place = "pub";
		loveStory = sc.textOutgoTput(place);
		listStory = ek.enterAction(loveStory);
		if(Main.day == 0) {JLabel icon1 = new JLabel(new ImageIcon("images/pub1.png"));
	    icon1.setBounds(0, 0, 960, 720);
	    this.add(icon1);
		}else if(Main.day == 1) {
			JLabel icon1 = new JLabel(new ImageIcon("images/pub2.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}else if(Main.day == 2) {
			JLabel icon1 = new JLabel(new ImageIcon("images/pub3.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}
		PubInit();

	}

	public void PubInit() {
		System.out.println("Pub 내부 인터");
		rub.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());

		rub.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day2++;
			Main.day++;
			Main.dayBreak++;
			new Day().day();
			ChangePanel.ChangePanel(start, rub, new Main(start));
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			String str = ek.goEnterAction(listStory);
			System.out.println(str);
			if(str.length() != 0) {
				tf.append(str);
				//value++;
			}else {
				System.out.println("AA");
				ChangePanel.ChangePanel(start, rub, new SelectPanel(start,loveStory));
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
		System.out.println("8잘드렁가니? " + girlnumber);
	}
}

