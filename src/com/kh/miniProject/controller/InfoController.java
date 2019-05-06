package com.kh.miniProject.controller;

import com.kh.miniProject.model.vo.Charm;
import com.kh.miniProject.model.vo.Exper;
import com.kh.miniProject.model.vo.RoundOpen;
import com.kh.miniProject.view.Main;
import com.kh.miniProject.view.MiniMap;
import com.kh.miniProject.view.PlayerInfo;
import com.kh.miniProject.view.StartStoryPanel;

public class InfoController {
	public static Charm charm = new Charm();
	public static Exper exper = new Exper();
	public static RoundOpen ro = new RoundOpen();
	
	public void charmUp(int cha) {
		
		charm.setCharmm(charm.getCharmm() + cha);
		
	}
	
	public void charmdown(int cha) {
		
		charm.setCharmm(charm.getCharmm() - cha);
	}
	
	public void experUp(int pn) {
		int exp;
		if(pn==1) {
			exp = (int)(Math.random()*20)+31;
		}else if(pn==2){
			exp = (int)(Math.random()*20)+21;			
		}else {
			exp = 0;
		}
		
		int upexper = exper.getExper() + exp;
		

		if(upexper >= 100) {
			if(exper.getLev() == 10) {
			}else {
				exper.setLev(exper.getLev()+1);
				Main.rc.getRp().setGilrStop(1);
				Main.oc.levelUp(exper.getLev());
				exper.setExper(0);
				StartStoryPanel.startnum = 0;
			}
		}else {
			exper.setExper(upexper);
		}
		
	}
	
	public void exp() {
		exper.setExper(exper.getExper()+50);
		experUp(0);
		
	}

	public static Charm getCharm() {
		return charm;
	}

	public static void setCharm(Charm charm) {
		InfoController.charm = charm;
	}

	public static Exper getExper() {
		return exper;
	}

	public static void setExper(Exper exper) {
		InfoController.exper = exper;
	}
	
	
	
	


}
