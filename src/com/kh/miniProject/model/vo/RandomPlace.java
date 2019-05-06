package com.kh.miniProject.model.vo;

import com.kh.miniProject.view.MiniMap;
import com.kh.miniProject.view.PlayerInfo;

public class RandomPlace {
	
	private int randomNum;
	private int random2[] = new int [randomNum];
	private int gilrStop = 1;
	
	public int getRandomNum() {
		return randomNum;
	}
	
	public int[] getRandom2() {
		return random2;
	}
	
	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
		this.random2 = new int[this.randomNum];
	}
	
	public void setRandom2(int[] random2) {
		this.random2 = random2;
	}

	public int getGilrStop() {
		return gilrStop;
	}

	public void setGilrStop(int gilrStop) {
		this.gilrStop = gilrStop;
	}
	
	
	
	

}
