package com.kh.miniProject.model.vo;

public class GirllovePer {
	
	public void plusGirllove(int girlnum) {
		Girl g = RoundOpen.getGlist().get(girlnum);
		g.setGlovePer(g.getGlovePer()+10);
		
	}
	public void ninusGirllove(int girlnum) {
		Girl g = RoundOpen.getGlist().get(girlnum);
		g.setGlovePer(g.getGlovePer()-10);
	}
	public void random(int girlnum) {
		Girl g = RoundOpen.getGlist().get(girlnum);
		int ran = (int)Math.random()*2+1;
		
		switch(ran) {
		case 1 : g.setGlovePer(g.getGlovePer()-20); break;
		case 2 : g.setGlovePer(g.getGlovePer()+30); break;
		
		}
	}

}
