package com.kh.miniProject.model.vo;

import com.kh.miniProject.view.PlayerInfo;

public class CharmPer {
	public void plusCharm(int cha) {
		PlayerInfo.charmm += cha;
		System.out.println("�ŷµ� " + cha+" ��ŭ ���~~~");
	}

}
