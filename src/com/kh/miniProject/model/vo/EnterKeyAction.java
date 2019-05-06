package com.kh.miniProject.model.vo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EnterKeyAction {
	private ArrayList al = new ArrayList();
	private ArrayList storyarr = new ArrayList();
	private int value = 0;
	
	public ArrayList getAl() {
		return al;
	}
	
	public ArrayList getStoryarr() {
		return storyarr;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setAl(ArrayList al) {
		this.al = al;
	}
	
	public void setStoryarr(ArrayList storyarr) {
		this.storyarr = storyarr;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
