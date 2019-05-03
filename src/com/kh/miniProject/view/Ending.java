package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
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
//					new ImageIcon(new ImageIcon("images/�쁺�솕愿�.PNG").getImage().getScaledInstance(960, 720, 0)));
//			EndingBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.BLACK);
		System.out.println("마지막 그녀");

		EndingInit();

	}

	public void EndingInit() {
		System.out.println("Ending");
		ending.setVisible(true);
		JLabel endingName = new JLabel("마지막 그녀");
		endingName.setLocation(400, 260);
		endingName.setSize(200, 50);
		Font font1 =new Font("한컴 백제 M", Font.PLAIN, 30);
		endingName.setFont(font1);
		JButton ending = new JButton(new ImageIcon("images/Button(1).png"));

		ending.setLocation(450, 300);
		ending.setSize(50, 50);
		ending.setFocusPainted(true);
		ending.setContentAreaFilled(false);
		ending.setBorderPainted(false);
		ending.addActionListener(new ChangeCredit());

		JLabel icon1 = new JLabel(new ImageIcon("images/endingMiniMap.png"));
		icon1.setBounds(0, 0, 960, 720);
		
		
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
			
			ChangePanel.ChangePanel(start, ending, new SelectPanel2(start));
		}

	}
}