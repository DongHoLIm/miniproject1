package com.kh.miniProject.model.vo;

import java.util.Collections;
import java.util.Comparator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.dao.PTextOutput;
import com.kh.miniProject.view.Epilogue;

public class EpilogueSort {
	
	JLabel icon1 = new JLabel();
	public EpilogueSort(int epilogueNum) {
		Collections.sort(RoundOpen.glist, new Comparator<Girl>() {
			@Override
			public int compare(Girl o1, Girl o2) {
				if (o1.getMylovePer() > o2.getMylovePer()) {
					return 1;
				} else if (o1.getMylovePer() < o2.getMylovePer()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		Collections.reverse(RoundOpen.glist);
		if (PTextOutput.epilogueNum != 2) {
			if (RoundOpen.glist.get(0).getGlovePer() > 69) {
				System.out.println("성공");
				PTextOutput.epilogueNum = 1;
			} else if (RoundOpen.glist.get(0).getGlovePer() < 70) {
				System.out.println("실패");
				PTextOutput.epilogueNum = 0;
				Epilogue.talkEnding += 1;
			}
		}
	}



}
