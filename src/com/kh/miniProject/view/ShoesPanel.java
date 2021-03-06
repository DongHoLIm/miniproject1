package com.kh.miniProject.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.controller.FileController;

public class ShoesPanel {
	public static JPanel shoes = new JPanel();
	private int y = 10;
	

	public ShoesPanel() {

		shoes.setBounds(10, 100, 380, 390);
		shoes.setBorder(BorderFactory.createLineBorder(Color.black));
		
	}
	
	public void test(int i) {
		new PlusImage().plusimage(i,10,y);
		y += 80;
	}
	
	class PlusImage{
		
		public PlusImage() {}
		
		public void plusimage(int j, int x, int y) {
			JLabel item = new JLabel();
			item.setIcon(new ImageIcon(new FileController().goImageOutput(j)));
			item.setBounds(x, y, 70, 70);
			shoes.add(item);
			shoes.repaint();
		}
	}

}
