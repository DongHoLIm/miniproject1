package com.kh.miniProject.model.vo;

public class PointMinus {
	public static int resultcoin =5000;

	public void pointMinus(int minus) {
		resultcoin = resultcoin-minus;		
		
	}
	public void pointPlus(int plus) {
		System.out.println(plus);
		resultcoin = resultcoin+plus;
		System.out.println(resultcoin);
		
	}
}
