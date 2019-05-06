package com.kh.miniProject.controller;

import com.kh.miniProject.model.vo.GirlNumber;

public class GirlNumberController {
	public static GirlNumber girlnum = new GirlNumber();
	
	public void grilNumberResult(int i) {
		
		girlnum.setGirlnumber(i);
		
	}

}
