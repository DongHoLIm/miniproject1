package com.kh.miniProject.controller;

import com.kh.miniProject.model.vo.Day;
import com.kh.miniProject.view.Main;
import com.kh.miniProject.view.MiniMap;

public class DayController {
	public static Day date = new Day();
	
	public void day() {
		  if(date.getDay2() == 1) {
			date.setStr("����");
		}else if(date.getDay2() == 2) {
			date.setStr("����");
		}else if(date.getDay2() ==3) {
			//totalDay2 +=1;
			date.setTotalDay(date.getTotalDay()+1);
			date.setDay2(0);
			Main.rc.getRp().setGilrStop(1);
			if(date.getDay2() == 0) {
				date.setStr("��ħ");
			}
		}
	}

	public static Day getDate() {
		return date;
	}

	public static void setDate(Day date) {
		DayController.date = date;
	}
	
	

}
