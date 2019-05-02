package com.kh.miniProject.model.vo;

import com.kh.miniProject.view.PlayerInfo;

public class GirllovePer {
	
	public void plusGirllove(int girlnum) {
		Girl g = RoundOpen.getGlist().get(girlnum);
		if(PlayerInfo.charmm<20) {
			g.setGlovePer(g.getGlovePer()+7);	
			System.out.println("내매력 20 안됨 여자 애정도 7상승");
			System.out.println("긍정긍정 여자애정도 상승" + g.getGlovePer());
		}else if(PlayerInfo.charmm<50) {
			g.setGlovePer(g.getGlovePer()+10);
			System.out.println("내매력 21~50  여자 애정도 10상승");
		}else if(PlayerInfo.charmm<80) {
			g.setGlovePer(g.getGlovePer()+13);
			System.out.println("내매력 51~80 안됨 여자 애정도 13상승");
		}else {
			g.setGlovePer(g.getGlovePer()+15);
			System.out.println("내매력 81 넘음 여자 애정도 15상승");
		}
		
		
		
	}
	public void ninusGirllove(int girlnum) {
		Girl g = RoundOpen.getGlist().get(girlnum);
		g.setGlovePer(g.getGlovePer()-10);
		System.out.println("부정부정 여자애정도 10 하락");
	}

}
