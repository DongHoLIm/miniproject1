package com.kh.miniProject.model.vo;

import javax.swing.JFrame;

import com.kh.miniProject.view.Beach;
import com.kh.miniProject.view.Cafe;
import com.kh.miniProject.view.FlowerShop;
import com.kh.miniProject.view.HotPlace;
import com.kh.miniProject.view.MiniMap;
import com.kh.miniProject.view.Movie;
import com.kh.miniProject.view.Park;
import com.kh.miniProject.view.Pub;
import com.kh.miniProject.view.Restraurant;
import com.kh.miniProject.view.SingingRoom;
import com.kh.miniProject.view.ThemePark;

public class StartStory {
	private JFrame start;
	Movie place1 = new Movie(start);
	Cafe place2 = new Cafe(start);
	Park place3 = new Park(start);
	Beach place4 = new Beach(start);
	Restraurant place5 = new Restraurant(start);
	HotPlace place6 = new HotPlace(start);
	SingingRoom place7 = new SingingRoom(start);
	Pub place8 = new Pub(start);
	FlowerShop place9 = new FlowerShop(start);
	ThemePark place10 = new ThemePark(start);
	
	public void startStory() {
		System.out.println("왜 널값? " + MiniMap.intiarr);
		for(int i = 0; i < MiniMap.intiarr.length; i++) {
			System.out.println("intiarr의 값은 과연? " + MiniMap.intiarr[i]);
		}
		for(int i = 0; i < GirlImageOut.iarr.length; i++) {
			System.out.println("iarr의 값은 과연? " + GirlImageOut.iarr[i]);
		}
		
		for(int i = 0; i < MiniMap.intiarr.length; i++) {
			for(int j = 0; j < GirlImageOut.iarr.length; j++) {
				
				if(MiniMap.intiarr[i] == 1) {
					if(i==j) {
						place1.acceptGirl(GirlImageOut.iarr[j]);
					}
				}else if(MiniMap.intiarr[i] == 2) {
					if(i==j) {
						place2.acceptGirl(GirlImageOut.iarr[j]);
					}
					
				}else if(MiniMap.intiarr[i] == 3) {
					if(i==j) {
						place3.acceptGirl(GirlImageOut.iarr[j]);
					}
					
				}else if(MiniMap.intiarr[i] == 4) {
					if(i==j) {
						place4.acceptGirl(GirlImageOut.iarr[j]);
					}
					
				}else if(MiniMap.intiarr[i] == 5) {
					if(i==j) {
						place5.acceptGirl(GirlImageOut.iarr[j]);
					}
					
				}else if(MiniMap.intiarr[i] == 6) {
					if(i==j) {
						place6.acceptGirl(GirlImageOut.iarr[j]);
					}
					
				}else if(MiniMap.intiarr[i] == 7) {
					if(i==j) {
						place7.acceptGirl(GirlImageOut.iarr[j]);
					}
					
				}else if(MiniMap.intiarr[i] == 8) {
					if(i==j) {
						place8.acceptGirl(GirlImageOut.iarr[j]);
					}
					
				}else if(MiniMap.intiarr[i] == 9) {
					if(i==j) {
						place9.acceptGirl(GirlImageOut.iarr[j]);
					}
					
				}else if(MiniMap.intiarr[i] == 10) {
					if(i==j) {
						place10.acceptGirl(GirlImageOut.iarr[j]);
					}
					
				}
			}
			
		}
		
	}

}
