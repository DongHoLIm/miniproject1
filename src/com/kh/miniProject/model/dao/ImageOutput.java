package com.kh.miniProject.model.dao;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageOutput {
	
	public Image imageOutput(int i) {
		String[] item = new String[12];
		item[0] = new String("images/cloth1.png");
		item[1] = new String("images/cloth2.png");
		item[2] = new String("images/cloth3.png");
		item[3] = new String("images/cloth4.png");
		item[4] = new String("images/shoes1.png");
		item[5] = new String("images/shoes2.png");
		item[6] = new String("images/shoes3.png");
		item[7] = new String("images/shoes4.png");
		item[8] = new String("images/acc1.png");
		item[9] = new String("images/acc2.png");
		item[10] = new String("images/acc3.png");
		item[11] = new String("images/acc4.png");
		
		for(int j = 0; j < item.length; j++) {
			if(j+1 == i) {
				Image icon = new ImageIcon(item[j]).getImage().getScaledInstance(70, 70, 0);
				return icon;
			}
		}
		return null;
	}

}
