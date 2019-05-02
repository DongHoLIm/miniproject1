package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
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
import com.kh.miniProject.model.vo.GrilNumber;


public class Cafe extends JPanel implements KeyListener{
	private JFrame start;
	private JPanel cafe;
	private JTextArea tf;
	private JLabel icon1;
	private File loveStory;
	private ArrayList listStory;
	private FileController sc = new FileController();
	private EnterKeyAction ek = new EnterKeyAction();

	public Cafe(JFrame start) {
		this.start = start;
		cafe = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//		JLabel cafeBack = new JLabel(
//				new ImageIcon(new ImageIcon("images/ï¿½ï¿½È­ï¿½ï¿½.PNG").getImage().getScaledInstance(960, 720, 0)));
//		cafeBack.setBounds(0, 0, 960, 720);
		//this.setBackground(Color.ORANGE);
		
		System.out.println("ï¿½Ð³ï¿½ ï¿½ï¿½");
		
		tf = new JTextArea();
		tf.setLayout(null);
		tf.setBounds(150,450, 600,150);
		tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
		tf.addKeyListener(this);
		tf.setCaretColor(Color.cyan);
		tf.setFont(getFont().deriveFont(15.0f));
		Font font =new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.BOLD, 15);
		tf.setFont(font);
		
		this.add(tf);
		String place = "cafe";
		loveStory = sc.textOutgoTput(place);
		listStory = ek.enterAction(loveStory);
		
		if(Main.day == 0) {
			icon1 = new JLabel(new ImageIcon("images/cafe2.png"));
	    icon1.setBounds(0, 0, 960, 720);
	    this.add(icon1);
		}else if(Main.day == 1) {
			icon1 = new JLabel(new ImageIcon("images/cafe3.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}else if(Main.day == 2) {
			icon1 = new JLabel(new ImageIcon("images/cafe4.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}
		System.out.println("ï¿½Ì¹ï¿½ï¿½ï¿½? " + GrilNumber.grilnumber);
		JLabel girl = new JLabel(new ImageIcon(GirlImages.girlImage[GrilNumber.grilnumber]));
		girl.setBounds(110, 5, 700, 550);
		icon1.add(girl);
		
		cafeInit();
		
		


	}

	public void cafeInit() {
		System.out.println("cafe ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½");
		cafe.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());

		cafe.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day2++;
			Main.day++;
			Main.dayBreak++;
			new Day().day();
			ChangePanel.ChangePanel(start, cafe, new Main(start));
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
				ChangePanel.ChangePanel(start, cafe, new SelectPanel(start,loveStory));
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
		System.out.println("2ï¿½ßµå··ï¿½ï¿½ï¿½ï¿½? " + girlnumber);
	}
}