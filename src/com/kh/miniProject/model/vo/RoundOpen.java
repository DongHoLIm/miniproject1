package com.kh.miniProject.model.vo;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.miniProject.view.Main;

public class RoundOpen {
	public static ArrayList<Girl> glist = new ArrayList<Girl>();


	public void levelUp(int lev) {
		//if(Main.day==0) {
		switch(lev) {
		case 1 : roundUp1();break;
		case 2 : roundUp2();break;
		case 3 : roundUp3();break;
		case 4 : roundUp4();break;
		case 5 : roundUp5();break;
		case 6 : roundUp6();break;
		case 7 : roundUp7();break;
		case 8 : roundUp8();break;
		case 9 : roundUp9();break;
		case 10 : roundUp10();break;
	
		}

		System.out.println(glist);
		System.out.println("����Ʈ����Ȯ��");
		//}
	}


	public static ArrayList<Girl> getGlist() {
		return glist;
	}
	public static void setGlist(ArrayList<Girl> glist) {
		RoundOpen.glist = glist;
	}



	public void roundUp1() {
		Girl g1 = new Girl();
		g1.setName("������");
		g1.setAge(30);
		g1.setGender('��');
		g1.setCharactor("��Ȱ");
		g1.setSignature("�̼Ұ� �̻ڴ�.");
		g1.setImage("images/0nomal.png");

		glist.add(g1);
		System.out.println("g1����");

		System.out.println(glist);

	}

	public void roundUp2() {
		Girl g2 = new Girl();
		g2.setName("�ڳ���");
		g2.setAge(29);
		g2.setGender('��');
		g2.setCharactor("��Ӵ�");
		g2.setSignature("���� �����Ѵ�.");
		g2.setImage("images/1nomal.png");

		glist.add(g2);
		System.out.println("g2����");

		System.out.println(glist);

	}

	public void roundUp3() {
		Girl g3 = new Girl();
		g3.setName("�嵵��");
		g3.setAge(29);
		g3.setGender('��');
		g3.setCharactor("���ϴ�");
		g3.setSignature("Ű�� ũ��.");
		g3.setImage("images/2nomal.png");

		glist.add(g3);
		System.out.println("g3����");

		System.out.println(glist);

	}


	public void roundUp4() {
		Girl g4 = new Girl();
		g4.setName("����4");
		g4.setAge(30);
		g4.setGender('��');
		g4.setCharactor("����4 ����");
		g4.setSignature("����4 Ư¡");
		g4.setImage("images/3nomal.png");

		glist.add(g4);
		System.out.println("g4����");

		System.out.println(glist);

	}


	public void roundUp5() {
		Girl g5 = new Girl();
		g5.setName("����5");
		g5.setAge(30);
		g5.setGender('��');
		g5.setCharactor("����5 ����");
		g5.setSignature("����5 Ư¡");
		g5.setImage("images/4nomal.png");

		glist.add(g5);
		System.out.println("g5����");

		System.out.println(glist);

	}


	public void roundUp6() {
		Girl g6 = new Girl();
		g6.setName("����6");
		g6.setAge(30);
		g6.setGender('��');
		g6.setCharactor("����6 ����");
		g6.setSignature("����6 Ư¡");
		g6.setImage("images/5nomal.png");

		glist.add(g6);
		System.out.println("g6����");

		System.out.println(glist);

	}


	public void roundUp7() {
		Girl g7 = new Girl();
		g7.setName("����7");
		g7.setAge(30);
		g7.setGender('��');
		g7.setCharactor("����7 ����");
		g7.setSignature("����7 Ư¡");
		g7.setImage("images/6nomal.png");

		glist.add(g7);
		System.out.println("g7����");

		System.out.println(glist);

	}


	public void roundUp8() {
		Girl g8 = new Girl();
		g8.setName("����8");
		g8.setAge(30);
		g8.setGender('��');
		g8.setCharactor("����8 ����");
		g8.setSignature("����8 Ư¡");
		g8.setImage("images/7nomal.png");

		glist.add(g8);
		System.out.println("g8����");

		System.out.println(glist);

	}


	public void roundUp9() {
		Girl g9 = new Girl();
		g9.setName("����9");
		g9.setAge(30);
		g9.setGender('��');
		g9.setCharactor("����9 ����");
		g9.setSignature("����9 Ư¡");
		g9.setImage("images/8nomal.png");

		glist.add(g9);
		System.out.println("g9����");

		System.out.println(glist);

	}


	public void roundUp10() {
		Girl g10 = new Girl();
		g10.setName("����10");
		g10.setAge(30);
		g10.setGender('��');
		g10.setCharactor("����10 ����");
		g10.setSignature("����10 Ư¡");
		g10.setImage("images/9nomal.png");

		glist.add(g10);
		System.out.println("g10����");

		System.out.println(glist);

	}

}
