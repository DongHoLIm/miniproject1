package com.kh.miniProject.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.kh.miniProject.model.vo.EnterKeyAction;

public class EnterKeyactionController {
	EnterKeyAction ek = new EnterKeyAction();
	
	public ArrayList enterAction(File loveStory) {
		
		String[] str = new String[20];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(loveStory));
			for(int i = 0; i < str.length; i++) {
				str[i] = br.readLine();
			}
			for(int i = 0; i < str.length; i++) {
				if(str[i] != null) {
					ek.getAl().add(str[i]);
				}else {
					break;
				}
			}
			return ek.getAl();
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
			if(i == ek.getValue()) {
				if(ek.getValue() <= al.size()) {
					String a = al.get(i).toString();
					ek.setValue(ek.getValue()+1);
					return a;
				}else {
					break;
				}
			}
		}
		return null;
	}
	
	public ArrayList startEnterAction(File startStory) {
		
		String[] str = new String[20];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(startStory));
			for(int i = 0; i < str.length; i++) {
				str[i] = br.readLine();
			}
			for(int i = 0; i < str.length; i++) {
				if(str[i] != null) {
					ek.getStoryarr().add(str[i]);
				}else {
					break;
				}
			}
			return ek.getStoryarr();
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
			if(i == ek.getValue()) {
				if(ek.getValue() <= storyarr.size()) {
					String a = storyarr.get(i).toString();
					ek.setValue(ek.getValue()+1);
					return a;
				}else {
					break;
				}
			}
		}
		return null;
	}

	public EnterKeyAction getEk() {
		return ek;
	}

	public void setEk(EnterKeyAction ek) {
		this.ek = ek;
	}
	
	

}
