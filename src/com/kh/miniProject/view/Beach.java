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

import com.kh.miniProject.controller.EnterKeyactionController;
import com.kh.miniProject.controller.FileController;
import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.vo.Day;
import com.kh.miniProject.model.vo.EnterKeyAction;



public class Beach extends JPanel implements KeyListener{
	private JFrame start;
	private JPanel beach;
	private JTextArea tf;
	private JLabel icon1;
	private File loveStory;
	private ArrayList listStory;
	FileController sc = new FileController();
	EnterKeyactionController ec = new EnterKeyactionController();

	public Beach(JFrame start) {
		this.start = start;
		beach = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		
		tf = new JTextArea();
		tf.setBounds(150,450, 600,150);
		tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
		tf.addKeyListener(this);
		tf.setCaretColor(Color.cyan);
		tf.setFont(getFont().deriveFont(15.0f));
		Font font =new Font("휴먼편지체", Font.BOLD, 15);
		tf.setFont(font);
		
		
		this.add(tf);
		String place = "beach";
		
		loveStory = sc.textOutgoTput(place);
		listStory = ec.enterAction(loveStory);
		
		if(Main.dc.getDate().getDay() == 0) {
			icon1 = new JLabel(new ImageIcon("images/beach.png"));
	    icon1.setBounds(0, 0, 960, 720);
	    this.add(icon1);
		}else if(Main.dc.getDate().getDay() == 1) {
			icon1 = new JLabel(new ImageIcon("images/beach_twilight.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}else if(Main.dc.getDate().getDay() == 2) {
			icon1 = new JLabel(new ImageIcon("images/beach_night.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}
		JLabel girl = new JLabel(new ImageIcon(GirlImages.girlImage[Main.gc.girlnum.getGirlnumber()]));
		girl.setBounds(110, 5, 700, 550);
		icon1.add(girl);
		
		BeachInit();
		
		


	}

	public void BeachInit() {
		
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
			Main.dc.getDate().setDay2(Main.dc.getDate().getDay2()+1);
			Main.dc.getDate().setDay(Main.dc.getDate().getDay()+1);
			Main.dc.getDate().setDayBreak(Main.dc.getDate().getDayBreak()+1);
			Main.dc.day();
			ChangePanel.ChangePanel(start, beach, new Main(start));
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			String str = ec.goEnterAction(listStory);
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
		
	}
}

