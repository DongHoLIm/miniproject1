package com.kh.miniProject.model.vo;

import javax.swing.JFrame;

import com.kh.miniProject.view.MiniMap;
import com.kh.miniProject.view.PlayerInfo;

public class Exper {
	private JFrame start;
	
	public void plusExper(int pn) {
		int exp;
		if(pn==1) {
			exp = (int)(Math.random()*20)+50;
			//exp = 60;
		}else {
			//exp = 60;
			exp = (int)(Math.random()*20)+50;			
		}
		
//		PlayerInfo pif = new PlayerInfo(start);
//		pif.setExper(pif.getExper()+exp);
		
		int upexper = PlayerInfo.exper+exp;
		

		if(upexper>200) {
			
			System.out.println("렙업 읽혀지는 순서가 어디쯤?");

			int le = PlayerInfo.lev+1;
			PlayerInfo.lev = le;
			MiniMap.girlStop = 1;
			RoundOpen ro = new RoundOpen();
			ro.levelUp(le);
			PlayerInfo.exper = 0;
		}else {
			PlayerInfo.exper = upexper;
		}
		
	}

}
