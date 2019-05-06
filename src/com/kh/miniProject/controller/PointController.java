package com.kh.miniProject.controller;

import com.kh.miniProject.model.vo.Point;

public class PointController {
	public static Point p = new Point();
	
	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public void pointUp(int plus) {
		
		p.setResultcoin(p.getResultcoin() + plus);
		
	}
	
	public void pointDown(int minus) {
		
		p.setResultcoin(p.getResultcoin() - minus);

	}

}
