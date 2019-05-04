package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.dao.PTextOutput;

public class Credit  extends JPanel {
	private JFrame start;

	private JPanel credit;
	private JLabel icon1;
	private Clip clip;

	public Credit(JFrame start) {
		this.start = start;
		credit = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//			JLabel EndingBack = new JLabel(
//					new ImageIcon(new ImageIcon("images/영화관.PNG").getImage().getScaledInstance(960, 720, 0)));
//			EndingBack.setBounds(0, 0, 960, 720);
		
		System.out.println("숫자 뭐임 ?"+PTextOutput.epilogueNum);
		if(PTextOutput.epilogueNum==1) {
			try {
	             
	             AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/success.wav"));
	             clip = AudioSystem.getClip();
	             clip.open(stream);
	             clip.start();
	             
	             
	             
	         } catch(Exception e) {
	             
	             e.printStackTrace();

	         }
			icon1 = new JLabel(new ImageIcon("images/success.png"));
		    icon1.setSize(960 , 720);
			icon1.setBounds(0, 0, 960, 720);
			JLabel icon2 = new JLabel(new ImageIcon("images/success2.png"));
			icon2.setBounds(50, -300, 960, 720);
			JLabel icon3 = new JLabel(new ImageIcon("images/success3.gif"));
			icon3.setBounds(0, 0, 960, 720);
			this.setBackground(Color.BLACK);
			this.add(icon3);
			this.add(icon2);
			this.add(icon1);
		}
		if(PTextOutput.epilogueNum==0) {
			try {
	             
	             AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/failure.wav"));
	             clip = AudioSystem.getClip();
	             clip.open(stream);
	             clip.start();
	             
	             
	             
	         } catch(Exception e) {
	             
	             e.printStackTrace();

	         }
			icon1 = new JLabel(new ImageIcon("images/failure.png"));
		  //  icon1.setSize(960 , 720);
			icon1.setBounds(50, -80,960, 720);
			this.add(icon1);
		}
				   
		
		 
		System.out.println("크레딧 이동");

		CreditInit();

	}

	public void CreditInit() {
		System.out.println("Ending 내부 인터");
		credit.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeCredit());
		credit.add(exit);

	}
	class ChangeCredit implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			clip.stop();
			ChangePanel.ChangePanel(start, credit, new Credit2(start));
		}

	}
}