package com.kh.miniProject.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.controller.FileController;

public class ClothPanel {
	public static JPanel cloth = new JPanel();
	public PlusImage plusImage;
	private int x = 10;
	private static int y = 10;
	

	public ClothPanel() {

		cloth.setBounds(10, 100, 380, 390);
		cloth.setBorder(BorderFactory.createLineBorder(Color.black));
		
	}
	
	public void test(int i) {
		new PlusImage().plusimage(i,x,y);
		y += 80;
	}
	
	class PlusImage{
		
		public PlusImage() {}
		
		public void plusimage(int j, int x, int y) {
			JLabel item = new JLabel();
			item.setIcon(new ImageIcon(new FileController().goImageOutput(j)));
			System.out.println(y);
			item.setBounds(x, y, 70, 70);
			cloth.add(item);
			cloth.repaint();
		}
	}


}
