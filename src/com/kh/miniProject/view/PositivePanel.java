package com.kh.miniProject.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.Exper;
import com.kh.miniProject.model.vo.GirllovePer;
import com.kh.miniProject.model.vo.GrilNumber;
import com.kh.miniProject.model.vo.MylovePer;

public class PositivePanel extends JPanel{

	JFrame start = new JFrame();
	public PositivePanel(JFrame start) {
			this.start = start;
			JPanel positivePanel = new JPanel();
			System.out.println("±‡¡§");

			int girlnum = GrilNumber.grilnumber;
			Exper ex = new Exper();
			ex.plusExper(1);

			MylovePer mlp = new MylovePer();
			mlp.plusMylove(girlnum, 1);

			GirllovePer glp = new GirllovePer();
			glp.plusGirllove(girlnum);

			ChangePanel.ChangePanel(start, positivePanel, new Main(start));





		}
	}
