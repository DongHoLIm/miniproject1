package com.kh.miniProject.view;

import javax.swing.JFrame;
import javax.swing.JPanel;


import com.kh.miniProject.model.vo.Exper;
import com.kh.miniProject.model.vo.GirllovePer;
import com.kh.miniProject.model.vo.GrilNumber;
import com.kh.miniProject.model.vo.MylovePer;

public class NegativePanel extends JPanel{
	JFrame start = new JFrame();
	public NegativePanel(JFrame start) {
		this.start = start;
		JPanel negativePanel = new JPanel();
		System.out.println("∫Œ¡§");

		int girlnum = GrilNumber.grilnumber;

		Exper ex = new Exper();
		ex.plusExper(2);

		MylovePer mlp = new MylovePer();
		mlp.plusMylove(girlnum, 2);

		GirllovePer glp = new GirllovePer();
		glp.ninusGirllove(girlnum);

		ChangePanel.ChangePanel(start, negativePanel, new Main(start));
	}




}
