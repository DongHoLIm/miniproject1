package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.dao.PTextOutput;
import com.kh.miniProject.model.vo.Day;
import com.kh.miniProject.view.MiniMap.ChangeMovie;


public class Ending extends JPanel {
	private JFrame start;

	private JPanel ending;
	

	public Ending(JFrame start) {
		this.start = start;
		ending = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//			JLabel EndingBack = new JLabel(
//					new ImageIcon(new ImageIcon("images/영화관.PNG").getImage().getScaledInstance(960, 720, 0)));
//			EndingBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.BLACK);
		System.out.println("엔딩 화면");

		EndingInit();

	}

	public void EndingInit() {
		System.out.println("Ending 내부 인터");
		ending.setVisible(true);
		JLabel endingName = new JLabel("마지막 그녀");
		endingName.setLocation(440, 260);
		endingName.setSize(150, 50);
		JButton ending = new JButton(new ImageIcon("images/Button(1).png"));

		ending.setLocation(450, 300);
		ending.setSize(50, 50);
		ending.setFocusPainted(true);
		ending.setContentAreaFilled(false);
		ending.setBorderPainted(false);
		ending.addActionListener(new ChangeCredit());

		JLabel icon1 = new JLabel(new ImageIcon("images/minimab.png"));
		icon1.setBounds(0, 0, 960, 720);
		PTextOutput.prologueNum = 10;
		
		this.add(ending);
		this.add(endingName);
		this.add(icon1);
		

	}

	class ChangeCredit implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.day = 0;
			Main.dayBreak =0;
			Main.totalDay =1;  
			Main.day2 = 0;

			PTextOutput.prologueNum = 10 ;

			ChangePanel.ChangePanel(start, ending, new Prologue(start));
		}

	}
}