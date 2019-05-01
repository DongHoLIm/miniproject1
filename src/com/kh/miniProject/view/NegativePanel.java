package com.kh.miniProject.view;

import javax.swing.JFrame;
import javax.swing.JPanel;


import com.kh.miniProject.model.vo.Exper;
import com.kh.miniProject.model.vo.GirllovePer;
import com.kh.miniProject.model.vo.MylovePer;

public class NegativePanel extends JPanel{
	
	public NegativePanel(JFrame start) {
	      System.out.println("şÎÁ¤şÎÁ¤");
	      
	      Exper ex = new Exper();
	      ex.plusExper(2);
	      
	      MylovePer mlp = new MylovePer();
	      //mlp.plusMylove(girlnum, 2);
	      
	      GirllovePer glp = new GirllovePer();
	     //glp.ninusGirllove(girlnum);
	      
	   }


}
