package com.kh.miniProject.model.vo;

import com.kh.miniProject.view.PlayerInfo;

public class CharmPer {
	public void plusCharm(int cha) {
		PlayerInfo.charmm += cha;
		System.out.println("매력도 " + cha+" 만큼 상승~~~");
	}

}
