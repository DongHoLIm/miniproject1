package com.kh.miniProject.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.Day;

public class PositivePanel extends JPanel{
	
	private JPanel PositivePanel;

	public PositivePanel(JFrame start) {
		PositivePanel = this;
		System.out.println("±‡¡§±‡¡§");
		Main.day2++;
		Main.day++;
		Main.dayBreak++;
		new Day().day();
		ChangePanel.ChangePanel(start, PositivePanel, new Main(start));
	}

}
