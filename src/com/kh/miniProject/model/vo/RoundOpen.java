package com.kh.miniProject.model.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.kh.miniProject.view.Main;

public class RoundOpen {
	public static ArrayList<Girl> glist = new ArrayList<Girl>();

	public void levelUp(int lev) {

		// if(Main.day==0) {
		switch (lev) {
		case 1:
			roundUp1();
			break;
		case 2:
			roundUp2();
			break;
		case 3:
			roundUp3();
			break;
		case 4:
			roundUp4();
			break;
		case 5:
			roundUp5();
			break;
		case 6:
			roundUp6();
			break;
		case 7:
			roundUp7();
			break;
		case 8:
			roundUp8();
			break;
		case 9:
			roundUp9();
			break;
		case 10:
			roundUp10();
			break;
		}

		System.out.println(glist);
		System.out.println("리스트저장확인");
		// }
//		Collections.sort(glist, new Comparator<Girl>() {
//			@Override
//			public int compare(Girl o1 , Girl o2) {
//				if(o1.getMylovePer() > o2.getMylovePer()) {
//					return 1;
//				}else if (o1.getMylovePer() < o2.getMylovePer()) {
//					return -1;
//				}else {
//					return 0;
//				}
//			}
//		});
		
	}

	public static ArrayList<Girl> getGlist() {
		return glist;
	}

	public static void setGlist(ArrayList<Girl> glist) {
		RoundOpen.glist = glist;
	}

	public void roundUp1() {
		Girl g1 = new Girl();
		g1.setName("박지선");
		g1.setAge(30);
		g1.setGender('여');
		g1.setCharactor("쾌활");
		g1.setSignature("미소가 이쁘다.");
		g1.setImage("images/0nomal.png");

		glist.add(g1);
		System.out.println("g1생성");

		System.out.println(glist);

	}

	public void roundUp2() {
		Girl g2 = new Girl();
		g2.setName("박나래");
		g2.setAge(29);
		g2.setGender('여');
		g2.setCharactor("어머니");
		g2.setSignature("술을 좋아한다.");

		g2.setImage("images/1nomal.png");


		glist.add(g2);
		System.out.println("g2생성");

		System.out.println(glist);

	}

	public void roundUp3() {
		Girl g3 = new Girl();
		g3.setName("장도연");
		g3.setAge(29);
		g3.setGender('여');
		g3.setCharactor("착하다");
		g3.setSignature("키가 크다.");
		g3.setImage("images/2nomal.png");

		glist.add(g3);
		System.out.println("g3생성");

		System.out.println(glist);

	}

	public void roundUp4() {
		Girl g4 = new Girl();
		g4.setName("이국주");
		g4.setAge(30);
		g4.setGender('여');
		g4.setCharactor("여자4 성격");
		g4.setSignature("여자4 특징");
		g4.setImage("images/3nomal.png");

		glist.add(g4);
		System.out.println("g4생성");

		System.out.println(glist);

	}

	public void roundUp5() {
		Girl g5 = new Girl();
		g5.setName("이수현");
		g5.setAge(30);
		g5.setGender('여');
		g5.setCharactor("여자5 성격");
		g5.setSignature("여자5 특징");
		g5.setImage("images/4nomal.png");

		glist.add(g5);
		System.out.println("g5생성");

		System.out.println(glist);

	}

	public void roundUp6() {
		Girl g6 = new Girl();
		g6.setName("정유미");
		g6.setAge(30);
		g6.setGender('여');
		g6.setCharactor("여자6 성격");
		g6.setSignature("여자6 특징");
		g6.setImage("images/5nomal.png");

		glist.add(g6);
		System.out.println("g6생성");

		System.out.println(glist);

	}

	public void roundUp7() {
		Girl g7 = new Girl();
		g7.setName("벤");
		g7.setAge(30);
		g7.setGender('여');
		g7.setCharactor("여자7 성격");
		g7.setSignature("여자7 특징");
		g7.setImage("images/6nomal.png");

		glist.add(g7);
		System.out.println("g7생성");

		System.out.println(glist);

	}

	public void roundUp8() {
		Girl g8 = new Girl();
		g8.setName("모모");
		g8.setAge(30);
		g8.setGender('여');
		g8.setCharactor("여자8 성격");
		g8.setSignature("여자8 특징");
		g8.setImage("images/7nomal.png");

		glist.add(g8);
		System.out.println("g8생성");

		System.out.println(glist);

	}

	public void roundUp9() {
		Girl g9 = new Girl();
		g9.setName("고준희");
		g9.setAge(30);
		g9.setGender('여');
		g9.setCharactor("여자9 성격");
		g9.setSignature("여자9 특징");
		g9.setImage("images/8nomal.png");

		glist.add(g9);
		System.out.println("g9생성");

		System.out.println(glist);

	}

	public void roundUp10() {
		Girl g10 = new Girl();
		g10.setName("아이린");
		g10.setAge(30);
		g10.setGender('여');
		g10.setCharactor("여자10 성격");
		g10.setSignature("여자10 특징");
		g10.setImage("images/9nomal.png");

		glist.add(g10);
		System.out.println("g10생성");

		System.out.println(glist);

	}

	

}
