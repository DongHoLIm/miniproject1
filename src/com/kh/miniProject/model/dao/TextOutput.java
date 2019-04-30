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
		//String path=f.getAbsolutePath()
		
//		try {
//	         StringBuilder sb  =new StringBuilder();
//	         String line;
//	         
//	         File f=new File(".");
//	         String path=f.getAbsolutePath();
//	         
//	         System.out.println(path);
//	         BufferedReader br=new BufferedReader(new FileReader(path+"/Story/movie"+moviestory));
//	         
//	         try {
//	            while ((line=br.readLine())!= null) {
//	               sb.append(line);
//	               
//	               
//	            }
//	            System.out.println(sb.toString());
//	         } catch (IOException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	         }
//	      } catch (FileNotFoundException e) {
//	         // TODO Auto-generated catch block
//	         e.printStackTrace();
//	      }
	}

}
