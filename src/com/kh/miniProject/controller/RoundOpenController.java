package com.kh.miniProject.controller;

import com.kh.miniProject.model.vo.Girl;
import com.kh.miniProject.model.vo.RoundOpen;

public class RoundOpenController {
	public static RoundOpen ro = new RoundOpen();
	
	public void levelUp(int lev) {

		// if(Main.day==0) {
		switch (lev) {
		case 1 :roundUp1(); break;
		case 2 :roundUp2(); break;
		case 3 :roundUp3(); break;
		case 4 :roundUp4(); break;
		case 5 :roundUp5(); break;
		case 6 :roundUp6(); break;
		case 7 :roundUp7(); break;
		case 8 :roundUp8(); break;
		case 9 :roundUp9(); break;
		case 10 :roundUp10(); break;
		}

		
	}
	
	public void roundUp1() {
		Girl g1 = new Girl();
		g1.setName("박지선");
		g1.setAge(30);
		g1.setGender('여');
		g1.setCharactor("쾌활");
		g1.setSignature("미소가 이쁘다.");
		g1.setImage("images/0nomal.png");
		g1.setEndingNum(0);
		ro.getGlist().add(g1);


	}

	public void roundUp2() {
		Girl g2 = new Girl();
		g2.setName("박나래");
		g2.setAge(29);
		g2.setGender('여');
		g2.setCharactor("어머니");
		g2.setSignature("술을 좋아한다.");
		g2.setImage("images/1nomal.png");
		g2.setEndingNum(1);

		ro.getGlist().add(g2);


	}

	public void roundUp3() {
		Girl g3 = new Girl();
		g3.setName("장도연");
		g3.setAge(29);
		g3.setGender('여');
		g3.setCharactor("착하다");
		g3.setSignature("키가 크다.");
		g3.setImage("images/2nomal.png");
		g3.setEndingNum(2);
		ro.getGlist().add(g3);


	}

	public void roundUp4() {
		Girl g4 = new Girl();
		g4.setName("이국주");
		g4.setAge(30);
		g4.setGender('여');
		g4.setCharactor("여자4 성격");
		g4.setSignature("여자4 특징");
		g4.setImage("images/3nomal.png");
		g4.setEndingNum(3);
		ro.getGlist().add(g4);


	}

	public void roundUp5() {
		Girl g5 = new Girl();
		g5.setName("이수현");
		g5.setAge(30);
		g5.setGender('여');
		g5.setCharactor("여자5 성격");
		g5.setSignature("여자5 특징");
		g5.setImage("images/4nomal.png");
		g5.setEndingNum(4);
		ro.getGlist().add(g5);


	}

	public void roundUp6() {
		Girl g6 = new Girl();
		g6.setName("정유미");
		g6.setAge(30);
		g6.setGender('여');
		g6.setCharactor("여자6 성격");
		g6.setSignature("여자6 특징");
		g6.setImage("images/5nomal.png");
		g6.setEndingNum(5);
		ro.getGlist().add(g6);


	}

	public void roundUp7() {
		Girl g7 = new Girl();
		g7.setName("벤");
		g7.setAge(30);
		g7.setGender('여');
		g7.setCharactor("여자7 성격");
		g7.setSignature("여자7 특징");
		g7.setImage("images/6nomal.png");
		g7.setEndingNum(6);
		ro.getGlist().add(g7);


	}

	public void roundUp8() {
		Girl g8 = new Girl();
		g8.setName("모모");
		g8.setAge(30);
		g8.setGender('여');
		g8.setCharactor("여자8 성격");
		g8.setSignature("여자8 특징");
		g8.setImage("images/7nomal.png");
		g8.setEndingNum(7);
		ro.getGlist().add(g8);


	}

	public void roundUp9() {
		Girl g9 = new Girl();
		g9.setName("고준희");
		g9.setAge(30);
		g9.setGender('여');
		g9.setCharactor("여자9 성격");
		g9.setSignature("여자9 특징");
		g9.setImage("images/8nomal.png");
		g9.setEndingNum(8);
		ro.getGlist().add(g9);


	}

	public void roundUp10() {
		Girl g10 = new Girl();
		g10.setName("아이린");
		g10.setAge(30);
		g10.setGender('여');
		g10.setCharactor("여자10 성격");
		g10.setSignature("여자10 특징");
		g10.setImage("images/9nomal.png");
		g10.setEndingNum(9);
		ro.getGlist().add(g10);


	}
	
	

}
