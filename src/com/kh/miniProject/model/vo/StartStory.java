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
	public static int grilnumber;
	
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
						grilnumber = GirlImageOut.iarr[j];
						new Movie(start,grilnumber);
						System.out.println("ghkrdlsghkrdsl : " + grilnumber);
						break;
						/*place1.acceptGirl(GirlImageOut.iarr[j]);*/
					}
				}
				if(MiniMap.intiarr[i] == 2) {
					if(i==j) {
						grilnumber = GirlImageOut.iarr[j];
						new Cafe(start,grilnumber);
						System.out.println("ghkrdlsghkrdsl : " + grilnumber);
						break;
						/*place2.acceptGirl(GirlImageOut.iarr[j]);*/
					}
					
				}
				if(MiniMap.intiarr[i] == 3) {
					if(i==j) {
						grilnumber = GirlImageOut.iarr[j];
						new Park(start,grilnumber);
						System.out.println("ghkrdlsghkrdsl : " + grilnumber);
						break;
					}
					
				}
				if(MiniMap.intiarr[i] == 4) {
					if(i==j) {
						new Beach(start,GirlImageOut.iarr[j]);
						grilnumber = GirlImageOut.iarr[j];
						break;
						/*place4.acceptGirl(GirlImageOut.iarr[j]);*/
					}
					
				}
				if(MiniMap.intiarr[i] == 5) {
					if(i==j) {
						new Restraurant(start,GirlImageOut.iarr[j]);
						grilnumber = GirlImageOut.iarr[j];
						break;
						/*place5.acceptGirl(GirlImageOut.iarr[j]);*/
					}
					
				}
				if(MiniMap.intiarr[i] == 6) {
					if(i==j) {
						new HotPlace(start,GirlImageOut.iarr[j]);
						grilnumber = GirlImageOut.iarr[j];
						break;
					}
					
				}
				if(MiniMap.intiarr[i] == 7) {
					if(i==j) {
						new SingingRoom(start,GirlImageOut.iarr[j]);
						grilnumber = GirlImageOut.iarr[j];
						break;
					}
					
				}
				if(MiniMap.intiarr[i] == 8) {
					if(i==j) {
						new Pub(start,GirlImageOut.iarr[j]);
						grilnumber = GirlImageOut.iarr[j];
						break;
						/*place8.acceptGirl(GirlImageOut.iarr[j]);*/
					}
					
				}
				if(MiniMap.intiarr[i] == 9) {
					if(i==j) {
						new FlowerShop(start,GirlImageOut.iarr[j]);
						grilnumber = GirlImageOut.iarr[j];
						break;
						/*place9.acceptGirl(GirlImageOut.iarr[j]);*/
					}
					
				}
				if(MiniMap.intiarr[i] == 10) {
					if(i==j) {
						new ThemePark(start,GirlImageOut.iarr[j]);
						grilnumber = GirlImageOut.iarr[j];
						break;
						/*lace10.acceptGirl(GirlImageOut.iarr[j]);*/
					}
					
				}
			}
			
		}
		
	}

}
