package com.kh.miniProject.model.vo;

import com.kh.miniProject.view.PlayerInfo;

public class GirllovePer {
	
	public void plusGirllove(int girlnum) {
		Girl g = RoundOpen.getGlist().get(girlnum);
		if(PlayerInfo.charmm<20) {
			g.setGlovePer(g.getGlovePer()+7);	
			System.out.println("���ŷ� 20 �ȵ� ���� ������ 7���");
			System.out.println("�������� ���ھ����� ���" + g.getGlovePer());
		}else if(PlayerInfo.charmm<50) {
			g.setGlovePer(g.getGlovePer()+10);
			System.out.println("���ŷ� 21~50  ���� ������ 10���");
		}else if(PlayerInfo.charmm<80) {
			g.setGlovePer(g.getGlovePer()+13);
			System.out.println("���ŷ� 51~80 �ȵ� ���� ������ 13���");
		}else {
			g.setGlovePer(g.getGlovePer()+15);
			System.out.println("���ŷ� 81 ���� ���� ������ 15���");
		}
		
		
		
	}
	public void ninusGirllove(int girlnum) {
		Girl g = RoundOpen.getGlist().get(girlnum);
		g.setGlovePer(g.getGlovePer()-10);
		System.out.println("�������� ���ھ����� 10 �϶�");
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
