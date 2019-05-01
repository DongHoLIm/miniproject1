package com.kh.miniProject.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kh.miniProject.model.vo.Exper;
import com.kh.miniProject.model.vo.GirllovePer;
import com.kh.miniProject.model.vo.GrilNumber;
import com.kh.miniProject.model.vo.MylovePer;

public class PositivePanel extends JPanel{
	
	public PositivePanel(JFrame start) {
	      System.out.println("±àÁ¤±àÁ¤");
	      
	      int girlnum = GrilNumber.grilnumber;
	      Exper ex = new Exper();
	      ex.plusExper(1);
	      
	      MylovePer mlp = new MylovePer();
	     // mlp.plusMylove(girlnum, 1);
	      
	      GirllovePer glp = new GirllovePer();
	      //glp.plusGirllove(girlnum);
	      
	      
	      
	   }
}
