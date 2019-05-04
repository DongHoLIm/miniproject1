package com.kh.miniProject.model.vo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EnterKeyAction {
	private ArrayList al;
	private ArrayList storyarr;
	private int value = 0;
	
	public ArrayList enterAction(File loveStory) {
		al = new ArrayList();
		String[] str = new String[20];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(loveStory));
			for(int i = 0; i < str.length; i++) {
				str[i] = br.readLine();
			}
			for(int i = 0; i < str.length; i++) {
				if(str[i] != null) {
					al.add(str[i]);
				}else {
					break;
				}
			}
			return al;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String goEnterAction(ArrayList al) {
		
		for(int i = 0; i < al.size(); i++) {
			if(i == value) {
				if(value <= al.size()) {
					String a = al.get(i).toString();
					value++;
					return a;
				}else {
					break;
				}
			}
		}
		return null;
	}
	
	public ArrayList startEnterAction(File startStory) {
		storyarr = new ArrayList();
		String[] str = new String[20];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(startStory));
			for(int i = 0; i < str.length; i++) {
				str[i] = br.readLine();
			}
			for(int i = 0; i < str.length; i++) {
				if(str[i] != null) {
					storyarr.add(str[i]);
				}else {
					break;
				}
			}
			return storyarr;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String startStory(ArrayList storyarr) {
		
		for(int i = 0; i < storyarr.size(); i++) {
			if(i == value) {
				if(value <= storyarr.size()) {
					String a = storyarr.get(i).toString();
					value++;
					return a;
				}else {
					break;
				}
			}
		}
		return null;
	}

}
