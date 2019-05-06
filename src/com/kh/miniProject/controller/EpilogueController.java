package com.kh.miniProject.controller;

import java.util.Collections;
import java.util.Comparator;

import com.kh.miniProject.model.dao.PTextOutput;
import com.kh.miniProject.model.vo.EpilogueVo;
import com.kh.miniProject.model.vo.Girl;
import com.kh.miniProject.view.Epilogue;
import com.kh.miniProject.view.Main;

public class EpilogueController {
	public static EpilogueVo ev = new EpilogueVo();
	
	public void epilogueSort() {
		Collections.sort(Main.oc.ro.getGlist(), new Comparator<Girl>() {
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
		Collections.reverse(Main.oc.ro.getGlist());
		if (ev.getEpilogueNum() != 2) {
			if (Main.oc.ro.getGlist().get(0).getGlovePer() > 69) {
				ev.setEpilogueNum(1);
			} else if (Main.oc.ro.getGlist().get(0).getGlovePer() < 70) {
				ev.setEpilogueNum(0);
				ev.setTalkEnding(ev.getTalkEnding()+1);
			}
		}
	}

}
