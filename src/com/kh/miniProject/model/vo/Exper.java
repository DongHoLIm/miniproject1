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
		}else {
			exp = (int)(Math.random()*20)+50;			
		}
		
//		PlayerInfo pif = new PlayerInfo(start);
//		pif.setExper(pif.getExper()+exp);
		
		int upexper = PlayerInfo.exper+exp;
		

		if(upexper>200) {
			
			System.out.println("�젟�뾽 �씫��吏��뒗 �닚�꽌媛� �뼱�뵒易�?");

			int le = PlayerInfo.lev+1;
			PlayerInfo.lev = le;
			System.out.println("레벨업~~~~~!!");
			MiniMap.girlStop = 1;
			RoundOpen ro = new RoundOpen();
			ro.levelUp(le);
			PlayerInfo.exper = 0;
		}else {
			PlayerInfo.exper = upexper;
		}
		
	}

}

