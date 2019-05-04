package com.kh.miniProject.model.vo;

import com.kh.miniProject.view.MiniMap;
import com.kh.miniProject.view.PlayerInfo;

public class RandomPlace {
	
	public static int randomNum = 1;
	public static int random2[] = new int [randomNum];
	
	public RandomPlace() {
		
		if(PlayerInfo.lev == 1) {
			randomNum = 1;
			random2 = new int[randomNum];
			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}
		}else if(PlayerInfo.lev == 2) {
			randomNum = 2;
			random2 = new int[randomNum];
			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}
		}else if(PlayerInfo.lev == 3) {
			randomNum = 3;
			random2 = new int[randomNum];
			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}
		}else if(PlayerInfo.lev == 4) {
			randomNum = 4;
			random2 = new int[randomNum];
			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}
		}else if(PlayerInfo.lev >= 5) {
			randomNum = 5;
			random2 = new int[randomNum];
			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}
		}
		
	}
	public int[] getRandom2() {
		return random2;
	}
	public void setRandom2(int[] random2) {
		this.random2 = random2;
	}

}
