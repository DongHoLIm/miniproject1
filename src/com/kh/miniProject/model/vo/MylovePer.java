package com.kh.miniProject.model.vo;

public class MylovePer {
	
	public void plusMylove(int girlnum, int pn) {
		Girl g = RoundOpen.getGlist().get(girlnum);
		
		if(pn==1) {
			g.setMylovePer(g.getMylovePer()+10);
			System.out.println("긍정긍정 내 애정도 10 상승");
		}else {
			g.setMylovePer(g.getMylovePer()+5);
			System.out.println("부정부정 내 애정도 5 상승");
		}
	}
	
	
	

}
