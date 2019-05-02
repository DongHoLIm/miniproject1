package com.kh.miniProject.model.vo;

import javax.swing.JFrame;

import com.kh.miniProject.view.MiniMap;
import com.kh.miniProject.view.PlayerInfo;

public class Exper {
	private JFrame start;
	
	public void plusExper(int pn) {
		int exp;
		if(pn==1) {
			exp = (int)(Math.random()*20)+51;
			System.out.println("긍정긍정 경험치51~70 랜덤 상승 ");
		}else {
			exp = (int)(Math.random()*20)+41;
			System.out.println("부정부정 경험치41~60 랜덤 상승 ");
		}
		
//		PlayerInfo pif = new PlayerInfo(start);
//		pif.setExper(pif.getExper()+exp);
		
		int upexper = PlayerInfo.exper+exp;
		

		if(upexper>100) {
			
			System.out.println("�젟�뾽 �씫��吏��뒗 �닚�꽌媛� �뼱�뵒易�?");
			System.out.println("경험치 100 넘었다아");
			
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

