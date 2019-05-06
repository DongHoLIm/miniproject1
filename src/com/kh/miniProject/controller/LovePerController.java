package com.kh.miniProject.controller;

import com.kh.miniProject.model.vo.Girl;
import com.kh.miniProject.model.vo.RoundOpen;
import com.kh.miniProject.view.Main;

public class LovePerController {
	private String strlove = "";
	
	public void plusGirllove(int girlnum) {
		Girl g = Main.oc.ro.getGlist().get(girlnum);
		if(Main.ic.getCharm().getCharmm()<20) {
			g.setGlovePer(g.getGlovePer()+7);	
			System.out.println("내매력 20 안됨 여자 애정도 7상승");
			System.out.println("긍정긍정 여자애정도 상승" + g.getGlovePer());
		}else if(Main.ic.getCharm().getCharmm()<50) {
			g.setGlovePer(g.getGlovePer()+10);
			System.out.println("내매력 21~50  여자 애정도 10상승");
		}else if(Main.ic.getCharm().getCharmm()<80) {
			g.setGlovePer(g.getGlovePer()+13);
			System.out.println("내매력 51~80 안됨 여자 애정도 13상승");
		}else {
			g.setGlovePer(g.getGlovePer()+15);
			System.out.println("내매력 81 넘음 여자 애정도 15상승");
		}
			
	}
	
	public void ninusGirllove(int girlnum) {
		Girl g = Main.oc.ro.getGlist().get(girlnum);
		g.setGlovePer(g.getGlovePer()-10);
		System.out.println("부정부정 여자애정도 10 하락");
	}
	
	public void random(int girlnum) {
		Girl g = Main.oc.ro.getGlist().get(girlnum);
		int ran = (int)(Math.random()*2)+1;
		System.out.println(ran);
		
		switch(ran) {
		case 1 : g.setGlovePer(g.getGlovePer()-15); break;
		case 2 : g.setGlovePer(g.getGlovePer()+30); break;
		
		}
		if(ran == 1) {
			strlove = g.getName() + " 의 호감도가 -15 하락 하였습니다 아쉽네요..";
		}else if ( ran ==2) {
			strlove = g.getName() + " 의 호감도가 +30 상승 하였습니다  럭키!! ";
			
		}
	}
	
	public void plusMylove(int girlnum, int pn) {
		Girl g = Main.oc.ro.getGlist().get(girlnum);
		
		if(pn==1) {
			g.setMylovePer(g.getMylovePer()+10);
			System.out.println("긍정긍정 내 애정도 10 상승");
		}else {
			g.setMylovePer(g.getMylovePer()+5);
			System.out.println("부정부정 내 애정도 5 상승");
		}
	}

	public String getStrlove() {
		return strlove;
	}

	public void setStrlove(String strlove) {
		this.strlove = strlove;
	}

}
