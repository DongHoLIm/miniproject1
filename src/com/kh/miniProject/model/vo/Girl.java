package com.kh.miniProject.model.vo;

import java.util.Collections;

public class Girl {
	private String name;  //이름
	private int age;   	//나이
	private char gender;  //성별
	private String charactor;  //성격
	private String signature;  //특징
	private String image;  //이미지파일 경로
	private int glovePer;  //여자의 애정도
	private int mylovePer; //나의 애정도
	private int endingNum; //엔딩 여자 객체번호
	
	public Girl() {}
	
	public Girl(int endingNum) {
		super();
		this.endingNum = endingNum;
	}

	public Girl(String name, int age, char gender, String charactor, String signature,String image,int glovePer, int mylovePer) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.charactor = charactor;
		this.signature = signature;
		this.image = image;
		this.glovePer = glovePer;
		this.mylovePer = mylovePer;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCharactor() {
		return charactor;
	}

	public void setCharactor(String charactor) {
		this.charactor = charactor;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public int getGlovePer() {
		return glovePer;
	}

	public void setGlovePer(int glovePer) {
		this.glovePer = glovePer;
	}

	public int getMylovePer() {
		return mylovePer;
	}

	public void setMylovePer(int mylovePer) {
		this.mylovePer = mylovePer;
	}
	
	public int getEndingNum() {
		return endingNum;
	}

	public void setEndingNum(int endingNum) {
		this.endingNum = endingNum;
	}
	


	@Override
	public String toString() {
		return "name : " + name + " age:" + age+ " gender:" + gender
				+ " charactor:" + charactor+ " signature:" + signature+ " image:" + image + "\n";
	}

	
	

}
