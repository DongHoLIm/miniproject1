package com.kh.miniProject.model.dao;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GirlImages extends JPanel{
	public static String[] girlImage = new String[10];
	
	public String[] girlImages(int lev) {
		
		
		girlImage[0] = ("images/girl1.png");
		girlImage[1] = ("images/girl2.png");
		girlImage[2] = ("images/girl3.png");
		girlImage[3] = ("images/girl4.png");
		girlImage[4] = ("images/girl5.png");
		girlImage[5] = ("images/girl6.png");
		girlImage[6] = ("images/girl7.png");
		girlImage[7] = ("images/girl8.png");
		girlImage[8] = ("images/girl9.png");
		girlImage[9] = ("images/girl10.png");
		
		String[] result = new String[lev];
		
		if(lev == 1) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
			}
			return result;
		}else if(lev == 2) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
			}
			return result;
		}else if(lev == 3) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
			}
			return result;
		}else if(lev == 4) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
			}
			return result;
		}else if(lev == 5) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
			}
			return result;
		}else if(lev == 6) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
			}
			return result;
		}else if(lev == 7) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
			}
			return result;
		}else if(lev == 8) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
			}
			return result;
		}else if(lev == 9) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
			}
			return result;
		}else if(lev == 10) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
			}
			return result;
		}
	
		
		return girlImage;
		
	}
}
