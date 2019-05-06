package com.kh.miniProject.controller;

import javax.swing.JFrame;

import com.kh.miniProject.model.vo.RandomPlace;
import com.kh.miniProject.view.Main;
import com.kh.miniProject.view.MiniMap;
import com.kh.miniProject.view.PlayerInfo;

public class RandomPlaceController extends MiniMap{
	
	public static RandomPlace rp = new RandomPlace();
	
	public void randomPlace() {
		
		if(Main.ic.getExper().getLev() == 1) {
			rp.setRandomNum(1);
			rp.setRandom2(rp.getRandom2());
			for (int i = 0; i < rp.getRandom2().length; i++) {
				rp.getRandom2()[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (rp.getRandom2()[i] == rp.getRandom2()[j]) {
						i--;
						break;
					}

				}
			}
		}else if(Main.ic.getExper().getLev() == 2) {
			rp.setRandomNum(2);
			rp.setRandom2(rp.getRandom2());
			for (int i = 0; i < rp.getRandom2().length; i++) {
				rp.getRandom2()[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (rp.getRandom2()[i] == rp.getRandom2()[j]) {
						i--;
						break;
					}

				}
			}
		}else if(Main.ic.getExper().getLev() == 3) {
			rp.setRandomNum(3);
			rp.setRandom2(rp.getRandom2());
			for (int i = 0; i < rp.getRandom2().length; i++) {
				rp.getRandom2()[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (rp.getRandom2()[i] == rp.getRandom2()[j]) {
						i--;
						break;
					}

				}
			}
		}else if(Main.ic.getExper().getLev() == 4) {
			rp.setRandomNum(4);
			rp.setRandom2(rp.getRandom2());
			for (int i = 0; i < rp.getRandom2().length; i++) {
				rp.getRandom2()[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (rp.getRandom2()[i] == rp.getRandom2()[j]) {
						i--;
						break;
					}

				}
			}
		}else if(Main.ic.getExper().getLev() >= 5) {
			rp.setRandomNum(5);
			rp.setRandom2(rp.getRandom2());
			for (int i = 0; i < rp.getRandom2().length; i++) {
				rp.getRandom2()[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (rp.getRandom2()[i] == rp.getRandom2()[j]) {
						i--;
						break;
					}

				}
			}
		}
		
	}

	public static RandomPlace getRp() {
		return rp;
	}

	public static void setRp(RandomPlace rp) {
		RandomPlaceController.rp = rp;
	}
	
	
}
