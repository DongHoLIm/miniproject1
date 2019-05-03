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

public class Credit  extends JPanel {
	private JFrame start;

	private JPanel credit;
	private JLabel icon1;

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
			icon1 = new JLabel(new ImageIcon("images/gomin.png"));
		    icon1.setSize(960 , 720);
			icon1.setBounds(0, 0, 960, 720);
			this.add(icon1);
		}
		if(PTextOutput.epilogueNum==0) {
			icon1 = new JLabel(new ImageIcon("images/VS.png"));
		    icon1.setSize(960 , 720);
			icon1.setBounds(0, 0, 960, 720);
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
			Main.day = 0;
			Main.day2 = 0;
			Main.dayBreak = 0;
			Main.totalDay = 1;
			PTextOutput.prologueNum = 0;
			ChangePanel.ChangePanel(start, credit, Start.startmain);
		}

	}
}