package com.kh.miniProject.model.vo;

import java.util.Collections;
import java.util.Comparator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.dao.PTextOutput;
import com.kh.miniProject.view.Main;

public class EpilogueVo {
	private int prologueNum = 0;
	private int epilogueNum = 0;
	private int talkEnding = 0;
	
	public int getPrologueNum() {
		return prologueNum;
	}
	
	public int getEpilogueNum() {
		return epilogueNum;
	}
	
	public void setPrologueNum(int prologueNum) {
		this.prologueNum = prologueNum;
	}
	
	public void setEpilogueNum(int epilogueNum) {
		this.epilogueNum = epilogueNum;
	}

	public int getTalkEnding() {
		return talkEnding;
	}

	public void setTalkEnding(int talkEnding) {
		this.talkEnding = talkEnding;
	}
	
	
	
	
}
