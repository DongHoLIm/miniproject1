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
			System.out.println("���ŷ� 20 �ȵ� ���� ������ 7���");
			System.out.println("�������� ���ھ����� ���" + g.getGlovePer());
		}else if(Main.ic.getCharm().getCharmm()<50) {
			g.setGlovePer(g.getGlovePer()+10);
			System.out.println("���ŷ� 21~50  ���� ������ 10���");
		}else if(Main.ic.getCharm().getCharmm()<80) {
			g.setGlovePer(g.getGlovePer()+13);
			System.out.println("���ŷ� 51~80 �ȵ� ���� ������ 13���");
		}else {
			g.setGlovePer(g.getGlovePer()+15);
			System.out.println("���ŷ� 81 ���� ���� ������ 15���");
		}
			
	}
	
	public void ninusGirllove(int girlnum) {
		Girl g = Main.oc.ro.getGlist().get(girlnum);
		g.setGlovePer(g.getGlovePer()-10);
		System.out.println("�������� ���ھ����� 10 �϶�");
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
			strlove = g.getName() + " �� ȣ������ -15 �϶� �Ͽ����ϴ� �ƽ��׿�..";
		}else if ( ran ==2) {
			strlove = g.getName() + " �� ȣ������ +30 ��� �Ͽ����ϴ�  ��Ű!! ";
			
		}
	}
	
	public void plusMylove(int girlnum, int pn) {
		Girl g = Main.oc.ro.getGlist().get(girlnum);
		
		if(pn==1) {
			g.setMylovePer(g.getMylovePer()+10);
			System.out.println("�������� �� ������ 10 ���");
		}else {
			g.setMylovePer(g.getMylovePer()+5);
			System.out.println("�������� �� ������ 5 ���");
		}
	}

	public String getStrlove() {
		return strlove;
	}

	public void setStrlove(String strlove) {
		this.strlove = strlove;
	}

}