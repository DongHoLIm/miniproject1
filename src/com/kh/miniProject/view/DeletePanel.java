package com.kh.miniProject.view;

import javax.swing.JPanel;

public class DeletePanel {
	
	public static void DeletePanel(JPanel a, JPanel b) {

		a.remove(b);
		a.repaint();
	}

}
