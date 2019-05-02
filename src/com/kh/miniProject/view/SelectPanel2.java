package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.dao.PTextOutput;
import com.kh.miniProject.model.vo.Day;

public class SelectPanel2 extends JPanel {
	private JPanel select = new JPanel();
	private JFrame start;


	public SelectPanel2(JFrame start) {
		this.start = start;
		this.select = this;
		this.setBounds(0, 0, 960, 720);
		this.setBackground(Color.black);
		this.setLayout(null);

		/*JLabel icon1 = new JLabel(new ImageIcon("images/gomin.png"));
		icon1.setBounds(0, 0, 960, 720);*/


		JButton spb1 = new JButton("그녀에게 고백한다");
		spb1.setSize(500, 50);
		spb1.setLocation(200, 250);
		spb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					ChangePanel.ChangePanel(start, select, new Epilogue(start));
				

			}
		});

		JButton spb2 = new JButton("그녀에 대한 마음을 접는다");
		spb2.setSize(500, 50);
		spb2.setLocation(200, 350);
		spb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					PTextOutput.epilogueNum = 2;
					ChangePanel.ChangePanel(start, select, new Epilogue(start));
				
			}
		});
		
		
		this.add(spb1);
		this.add(spb2);
		//this.add(icon1);
	}
}