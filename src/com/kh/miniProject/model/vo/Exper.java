package com.kh.miniProject.model.vo;

import javax.swing.JFrame;

import com.kh.miniProject.view.PlayerInfo;

public class Exper {
	private JFrame start;
	
	public void plusExper(int pn) {
		int exp;
		if(pn==1) {
			exp = (int)(Math.random()*20)+31;
		}else {
			exp = (int)(Math.random()*20)+21;			
		}
		
//		PlayerInfo pif = new PlayerInfo(start);
//		pif.setExper(pif.getExper()+exp);
		
		int upexper = PlayerInfo.exper+exp;
		
		if(upexper>200) {
			int le = PlayerInfo.lev+1;
			PlayerInfo.lev = le;
			RoundOpen ro = new RoundOpen();
			ro.levelUp(le);
			PlayerInfo.exper = 0;
		}else {
			PlayerInfo.exper = upexper;
		}
		
	}

}
