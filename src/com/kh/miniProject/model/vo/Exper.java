package com.kh.miniProject.model.vo;

import javax.swing.JFrame;

import com.kh.miniProject.view.MiniMap;
import com.kh.miniProject.view.PlayerInfo;
import com.kh.miniProject.view.StartStoryPanel;

public class Exper {
	private int exper = 0;
	private int lev = 1;
	private int levBreak = 0;
	
	public int getExper() {
		return exper;
	}
	
	public int getLev() {
		return lev;
	}
	
	public int getLevBreak() {
		return levBreak;
	}
	
	
	public void setExper(int exper) {
		this.exper = exper;
	}
	
	public void setLev(int lev) {
		this.lev = lev;
	}
	
	public void setLevBreak(int levBreak) {
		this.levBreak = levBreak;
	}
	

}

