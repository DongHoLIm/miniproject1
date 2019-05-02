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

public class SingingRoom extends JPanel implements KeyListener{
	private JFrame start;
	private JPanel singingRoom;
	private JTextArea tf;
	private FileController sc = new FileController();
	private File loveStory;
	private EnterKeyAction ek = new EnterKeyAction();
	private ArrayList listStory;
	private JLabel icon1;

	public SingingRoom(JFrame start) {
		this.start = start;
		singingRoom = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//			JLabel singingRoomBack = new JLabel(
//					new ImageIcon(new ImageIcon("images/�쁺�솕愿�.PNG").getImage().getScaledInstance(960, 720, 0)));
//			singingRoomBack.setBounds(0, 0, 960, 720);
		//this.setBackground(Color.magenta);
		System.out.println("�뙣�꼸 �깮�꽦");
		
		tf = new JTextArea();
		tf.setLayout(null);
		tf.setBounds(150,450, 600,150);
		tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
		tf.addKeyListener(this);
		tf.setCaretColor(Color.cyan);
		tf.setFont(getFont().deriveFont(15.0f));
		Font font =new Font("휴먼편지체", Font.BOLD, 15);
		tf.setFont(font);
		

		this.add(tf);
		String place = "singingroom";
		loveStory = sc.textOutgoTput(place);
		listStory = ek.enterAction(loveStory);
		if(Main.day == 0) {
			icon1 = new JLabel(new ImageIcon("images/sing1.png"));
	    icon1.setBounds(0, 0, 960, 720);
	    this.add(icon1);
		}else if(Main.day == 1) {
			icon1 = new JLabel(new ImageIcon("images/sing2.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}else if(Main.day == 2) {
			icon1 = new JLabel(new ImageIcon("images/sing3.png"));
		    icon1.setBounds(0, 0, 960, 720);
		    this.add(icon1);
		}
		JLabel girl = new JLabel(new ImageIcon(GirlImages.girlImage[GrilNumber.grilnumber]));
		girl.setBounds(110, 5, 700, 550);
		icon1.add(girl);
		SingingRoomInit();

	}

	public void SingingRoomInit() {
		System.out.println("singingRoom �궡遺� �씤�꽣");
		singingRoom.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());

		singingRoom.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day2++;
			Main.day++;
			Main.dayBreak++;
			new Day().day();
			ChangePanel.ChangePanel(start, singingRoom, new Main(start));
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
				ChangePanel.ChangePanel(start, singingRoom, new SelectPanel(start,loveStory));
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
		System.out.println("7�옒�뱶�쟻媛��땲? " + girlnumber);
	}
}
