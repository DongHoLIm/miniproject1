package com.kh.miniProject.model.vo;

public class Girl {
	private String name;  //이름
	private int age;   	//나이
	private char gender;  //성별
	private String charactor;  //성격
	private String signature;  //특징
	private String image;  //이미지파일 경로
	private int lovePer;  //여자의 애정도
	
	
	
	public Girl() {}

	public Girl(String name, int age, char gender, String charactor, String signature,String image,int lovePer) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.charactor = charactor;
		this.signature = signature;
		this.image = image;
		this.lovePer = lovePer;
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
	
	public int getLovePer() {
		return lovePer;
	}

	public void setLovePer(int lovePer) {
		this.lovePer = lovePer;
	}
	

	

}
