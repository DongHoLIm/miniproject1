package com.kh.miniProject.model.dao;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GirlImages extends JPanel{
	public static String[] girlImage = new String[10];
	
	public String[] girlImages(int lev) {
		
		
		girlImage[0] = ("images/0nomal.png");
		girlImage[1] = ("images/1nomal.png");
		girlImage[2] = ("images/2nomal.png");
		girlImage[3] = ("images/3nomal.png");
		girlImage[4] = ("images/4nomal.png");
		girlImage[5] = ("images/5nomal.png");
		girlImage[6] = ("images/6nomal.png");
		girlImage[7] = ("images/7nomal.png");
		girlImage[8] = ("images/8nomal.png");
		girlImage[9] = ("images/9nomal.png");
		
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
