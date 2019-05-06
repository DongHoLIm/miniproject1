package com.kh.miniProject.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.dao.PTextOutput;

public class Credit2 extends JPanel{
	
	private JFrame start;
	private JPanel credit2;
	
	public Credit2(JFrame start) {
		this.start = start;
		credit2 = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		
		JButton exit = new JButton("x");
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.addActionListener(new ChangeCredit2());
		
		JLabel icon2 = new JLabel(new ImageIcon("images/Credit2.png"));
		icon2.setBounds(0, 0, 960, 720);
	
		JLabel icon = new JLabel(new ImageIcon("images/Team.png"));
		icon.setBounds(0, 0, 960, 720);
		
		this.add(icon);
		this.add(exit);
		this.add(icon2);
		
	}
	class ChangeCredit2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Main.dc.getDate().setDay(0);
			Main.dc.getDate().setDay2(0);
			Main.dc.getDate().setDayBreak(0);
			Main.dc.getDate().setTotalDay(1);
			Main.ec.ev.setPrologueNum(0);
			ChangePanel.ChangePanel(start, credit2,  Start.startmain);
		}

	}

}
