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
		g1.setName("������");
		g1.setAge(30);
		g1.setGender('��');
		g1.setCharactor("��Ȱ");
		g1.setSignature("�̼Ұ� �̻ڴ�.");
		g1.setImage("images/0nomal.png");
		g1.setEndingNum(0);
		ro.getGlist().add(g1);


	}

	public void roundUp2() {
		Girl g2 = new Girl();
		g2.setName("�ڳ���");
		g2.setAge(29);
		g2.setGender('��');
		g2.setCharactor("��Ӵ�");
		g2.setSignature("���� �����Ѵ�.");
		g2.setImage("images/1nomal.png");
		g2.setEndingNum(1);

		ro.getGlist().add(g2);


	}

	public void roundUp3() {
		Girl g3 = new Girl();
		g3.setName("�嵵��");
		g3.setAge(29);
		g3.setGender('��');
		g3.setCharactor("���ϴ�");
		g3.setSignature("Ű�� ũ��.");
		g3.setImage("images/2nomal.png");
		g3.setEndingNum(2);
		ro.getGlist().add(g3);


	}

	public void roundUp4() {
		Girl g4 = new Girl();
		g4.setName("�̱���");
		g4.setAge(30);
		g4.setGender('��');
		g4.setCharactor("����4 ����");
		g4.setSignature("����4 Ư¡");
		g4.setImage("images/3nomal.png");
		g4.setEndingNum(3);
		ro.getGlist().add(g4);


	}

	public void roundUp5() {
		Girl g5 = new Girl();
		g5.setName("�̼���");
		g5.setAge(30);
		g5.setGender('��');
		g5.setCharactor("����5 ����");
		g5.setSignature("����5 Ư¡");
		g5.setImage("images/4nomal.png");
		g5.setEndingNum(4);
		ro.getGlist().add(g5);


	}

	public void roundUp6() {
		Girl g6 = new Girl();
		g6.setName("������");
		g6.setAge(30);
		g6.setGender('��');
		g6.setCharactor("����6 ����");
		g6.setSignature("����6 Ư¡");
		g6.setImage("images/5nomal.png");
		g6.setEndingNum(5);
		ro.getGlist().add(g6);


	}

	public void roundUp7() {
		Girl g7 = new Girl();
		g7.setName("��");
		g7.setAge(30);
		g7.setGender('��');
		g7.setCharactor("����7 ����");
		g7.setSignature("����7 Ư¡");
		g7.setImage("images/6nomal.png");
		g7.setEndingNum(6);
		ro.getGlist().add(g7);


	}

	public void roundUp8() {
		Girl g8 = new Girl();
		g8.setName("���");
		g8.setAge(30);
		g8.setGender('��');
		g8.setCharactor("����8 ����");
		g8.setSignature("����8 Ư¡");
		g8.setImage("images/7nomal.png");
		g8.setEndingNum(7);
		ro.getGlist().add(g8);


	}

	public void roundUp9() {
		Girl g9 = new Girl();
		g9.setName("������");
		g9.setAge(30);
		g9.setGender('��');
		g9.setCharactor("����9 ����");
		g9.setSignature("����9 Ư¡");
		g9.setImage("images/8nomal.png");
		g9.setEndingNum(8);
		ro.getGlist().add(g9);


	}

	public void roundUp10() {
		Girl g10 = new Girl();
		g10.setName("���̸�");
		g10.setAge(30);
		g10.setGender('��');
		g10.setCharactor("����10 ����");
		g10.setSignature("����10 Ư¡");
		g10.setImage("images/9nomal.png");
		g10.setEndingNum(9);
		ro.getGlist().add(g10);


	}
	
	

}
