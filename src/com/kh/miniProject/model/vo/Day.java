package com.kh.miniProject.model.vo;

import com.kh.miniProject.view.Main;
import com.kh.miniProject.view.MiniMap;

public class Day {

	public void day() {
		  if(Main.day2 == 1) {
			Main.str = "����";
		}else if(Main.day2 == 2) {
			Main.str = "����";
		}else if(Main.day2 ==3) {
			//totalDay2 +=1;
			Main.totalDay +=1;
			Main.day2 = 0;
			MiniMap.girlStop = 1;
			if(Main.day2 == 0) {
				Main.str = "��ħ";
			}
		}
	}

}
