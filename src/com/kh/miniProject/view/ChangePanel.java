package com.kh.miniProject.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangePanel {

	public static void ChangePanel(JFrame a, JPanel b, JPanel c) {

		a.remove(b);
		a.add(c);
		a.repaint();

	}
	
	public static void StartChangePanle(JFrame a, JPanel b, JPanel c) {
		a.remove(b);
		a.add(c);
		a.repaint();
	}
	
	public static void imageChange(JPanel a, JPanel b, JPanel c, JPanel d, JPanel e) {
		a.remove(c);
		a.remove(d);
		a.remove(e);
		a.add(b);
		a.repaint();
	}

	public static void ChangeStart(JFrame a, JPanel b, JFrame c) {

		a.remove(b);
		a.add(c);
		a.repaint();

	}
}
