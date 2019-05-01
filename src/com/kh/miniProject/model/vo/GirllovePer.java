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

}
