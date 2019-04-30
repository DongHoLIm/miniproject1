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



public class Beach extends JPanel implements KeyListener{
	private JFrame start;
	private JPanel beach;
	private JTextArea tf;
	private FileController sc = new FileController();
	private File loveStory;
	private EnterKeyAction ek = new EnterKeyAction();
	private ArrayList listStory;

	public Beach(JFrame start) {
		this.start = start;
		beach = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//		JLabel BeachBack = new JLabel(
//				new ImageIcon(new ImageIcon("images/영화관.PNG").getImage().getScaledInstance(960, 720, 0)));
//		BeachBack.setBounds(0, 0, 960, 720);
		//this.setBackground(Color.yellow);
		
		System.out.println("패널 생성");
		
		tf = new JTextArea();
		tf.setBounds(150,450, 600,150);
		tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
		tf.addKeyListener(this);
		tf.setCaretColor(Color.cyan);
		tf.setFont(getFont().deriveFont(15.0f));
		
		this.add(tf);
		String place = "beach";
		loveStory = sc.textOutgoTput(place);
		listStory = ek.enterAction(loveStory);
		
		if(Main.day == 0) {JLabel icon1 = new JLabel(new ImageIcon("images/beach.png"));
	    icon1.setBounds(0, 0, 960, 720);
	    this.add(icon1);
		}else if(Main.day == 1) {
			JLabel icon1 = new JLabel(new ImageIcon("images/beach_twilight.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}else if(Main.day == 2) {
			JLabel icon1 = new JLabel(new ImageIcon("images/beach_night.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}
		
		BeachInit();
		
		


	}

	public void BeachInit() {
		System.out.println("Beach 내부 인터");
		beach.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());

		beach.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day2++;
			Main.day++;
			Main.dayBreak++;
			new Day().day();
			ChangePanel.ChangePanel(start, beach, new Main(start));
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
			}else{
				System.out.println("AA");
				ChangePanel.ChangePanel(start, beach, new SelectPanel(start,loveStory));
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void acceptGirl(int girlnumber) {
		System.out.println("4잘드렁가니? " + girlnumber);
	}
}


