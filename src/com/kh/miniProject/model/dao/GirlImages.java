package com.kh.miniProject.model.dao;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GirlImages extends JPanel{
	public static String[] girlImage = new String[10];
	public static String[] girlImage2 = new String[10];
	public static String[] girlImage3 = new String[10];
	
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
		girlImage2[0] = ("images/0happy.png");
		girlImage2[1] = ("images/1happy.png");
		girlImage2[2] = ("images/2happy.png");
		girlImage2[3] = ("images/3happy.png");
		girlImage2[4] = ("images/4happy.png");
		girlImage2[5] = ("images/5happy.png");
		girlImage2[6] = ("images/6happy.png");
		girlImage2[7] = ("images/7happy.png");
		girlImage2[8] = ("images/8happy.png");
		girlImage2[9] = ("images/9happy.png");
		girlImage3[0] = ("images/0sad1.png");
		girlImage3[1] = ("images/1sad1.png");
		girlImage3[2] = ("images/2sad1.png");
		girlImage3[3] = ("images/3sad1.png");
		girlImage3[4] = ("images/4sad1.png");
		girlImage3[5] = ("images/5sad1.png");
		girlImage3[6] = ("images/6sad1.png");
		girlImage3[7] = ("images/7sad1.png");
		girlImage3[8] = ("images/8sad1.png");
		girlImage3[9] = ("images/9sad1.png");
		
		String[] result = new String[lev];
		String[] result2 = new String[lev];
		String[] result3 = new String[lev];
		
		if(lev == 1) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
				result2[i] = girlImage2[i];
				result3[i] = girlImage3[i];
			}
			return result;
		}else if(lev == 2) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
				result2[i] = girlImage2[i];
				result3[i] = girlImage3[i];
			}
			return result;
		}else if(lev == 3) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
				result2[i] = girlImage2[i];
				result3[i] = girlImage3[i];
				
			}
			return result;
		}else if(lev == 4) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
				result2[i] = girlImage2[i];
				result3[i] = girlImage3[i];
			}
			return result;
		}else if(lev == 5) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
				result2[i] = girlImage2[i];
				result3[i] = girlImage3[i];
			}
			return result;
		}else if(lev == 6) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
				result2[i] = girlImage2[i];
				result3[i] = girlImage3[i];
			}
			return result;
		}else if(lev == 7) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
				result2[i] = girlImage2[i];
				result3[i] = girlImage3[i];
			}
			return result;
		}else if(lev == 8) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
				result2[i] = girlImage2[i];
				result3[i] = girlImage3[i];
			}
			return result;
		}else if(lev == 9) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
				result2[i] = girlImage2[i];
				result3[i] = girlImage3[i];
			}
			return result;
		}else if(lev == 10) {
			for(int i = 0; i < result.length; i++) {
				result[i] = girlImage[i];
				result2[i] = girlImage2[i];
				result3[i] = girlImage3[i];
			}
			return result;
		}
	
		
		return girlImage;
		
		
	}

}
