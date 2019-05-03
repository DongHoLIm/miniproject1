package com.kh.miniProject.view;

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
//					new ImageIcon(new ImageIcon("images/��ȭ��.PNG").getImage().getScaledInstance(960, 720, 0)));
//			EndingBack.setBounds(0, 0, 960, 720);
		
		System.out.println("���� ���� ?"+PTextOutput.epilogueNum);
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
				   
		
		 
		System.out.println("ũ���� �̵�");

		CreditInit();

	}

	public void CreditInit() {
		System.out.println("Ending ���� ����");
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
			Main.day = 0;
			Main.day2 = 0;
			Main.dayBreak = 0;
			Main.totalDay = 1;
			PTextOutput.prologueNum = 0;
			ChangePanel.ChangePanel(start, credit, Start.startmain);
		}

	}
}