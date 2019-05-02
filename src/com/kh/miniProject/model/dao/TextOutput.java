package com.kh.miniProject.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextOutput {
	private ArrayList al;
	
	public File textOutput(String place) {
		
		int moviestory = (int)(Math.random()*10)+1;
		File movielove = new File("Story/"+place+moviestory);
		return movielove;

	}

}
