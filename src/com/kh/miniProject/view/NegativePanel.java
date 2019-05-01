package com.kh.miniProject.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.Day;

public class NegativePanel extends JPanel{
	
	private JPanel NegativePanel;

	public NegativePanel(JFrame start) {
		NegativePanel = this;
		System.out.println("부정부정");
		Main.day2++;
		Main.day++;
		Main.dayBreak++;
		new Day().day();
		ChangePanel.ChangePanel(start, NegativePanel, new Main(start));

	}

}
