package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kh.miniProject.controller.FileController;
import com.kh.miniProject.model.vo.EnterKeyAction;

public class Prologue extends JPanel implements KeyListener {
	private JFrame start;
	private JPanel prologue;
	private JTextArea tf;
	private FileController sc = new FileController();
	private File loveStory;
	private EnterKeyAction ek = new EnterKeyAction();
	private ArrayList listStory;

	public Prologue(JFrame start) {
		this.start = start;
		prologue = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);

		System.out.println("패널 생성");

		tf = new JTextArea();
		tf.setLayout(null);
		tf.setBounds(150, 450, 600, 150);
		tf.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		tf.addKeyListener(this);
		tf.setCaretColor(Color.cyan);
		tf.setFont(getFont().deriveFont(15.0f));
		Font font =new Font("휴먼편지체", Font.BOLD, 20);
		tf.setFont(font);
		this.add(tf);
		
		String place = "prologue";
		loveStory = sc.PtextOutgoTput(place);
		listStory = ek.enterAction(loveStory);
		JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
		icon1.setBounds(0, 0, 960, 720);
		this.add(icon1);

	}

	

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			String str = ek.goEnterAction(listStory);
			System.out.println(str);
			if (str != null) {
				tf.append(str);
				// value++;
			} else {
				System.out.println("AA");
				ChangePanel.ChangePanel(start, prologue, new Main(start));
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
