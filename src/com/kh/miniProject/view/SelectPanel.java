package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
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

import com.kh.miniProject.model.vo.Day;

public class SelectPanel extends JPanel {
	private JPanel select = new JPanel();
	private JFrame start;
	private File loveStory;
	private int answerInt1;
	private int answerInt2;

	public SelectPanel(JFrame start, File loveStory) {
		this.start = start;
		this.loveStory = loveStory;
		this.select = this;
		this.setBounds(0, 0, 960, 720);
		this.setBackground(Color.black);
		this.setLayout(null);

		String[] str = new String[20];

		String answer1 = "";
		String answer2 = "";

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(loveStory));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < str.length; i++) {
			try {
				str[i] = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() == 0) {
				answer1 = str[i + 1];
				answer2 = str[i + 2];
				answerInt1 = Integer.parseInt(str[i + 3]);
				answerInt2 = Integer.parseInt(str[i + 4]);
				break;
			}
		}

		JButton spb1 = new JButton(answer1);
		spb1.setSize(500, 50);
		spb1.setLocation(200, 250);
		Font font =new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.BOLD, 15);
		spb1.setFont(font);
		spb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (answerInt1 == 1) {
					MiniMap.clip.stop();
					ChangePanel.ChangePanel(start, select, new PositivePanel(start));
				} else if (answerInt1 == 2) {
					MiniMap.clip.stop();
					ChangePanel.ChangePanel(start, select, new NegativePanel(start));
				}

			}
		});

		JButton spb2 = new JButton(answer2);
		spb2.setSize(500, 50);
		spb2.setLocation(200, 400);
		Font font1 =new Font("ÈÞ¸ÕÆíÁöÃ¼", Font.BOLD, 15);
		spb2.setFont(font1);
		spb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (answerInt2 == 1) {
					MiniMap.clip.stop();
					ChangePanel.ChangePanel(start, select, new PositivePanel(start));
				} else if (answerInt2 == 2) {
					MiniMap.clip.stop();
					ChangePanel.ChangePanel(start, select, new NegativePanel(start));
				}
			}
		});
		JLabel jl = new JLabel(new ImageIcon("images/VS.png"));
		jl.setBounds(200, 100, 500, 500);
		Main.dc.getDate().setDay2(Main.dc.getDate().getDay2()+1);
		Main.dc.getDate().setDay(Main.dc.getDate().getDay()+1);
		Main.dc.getDate().setDayBreak(Main.dc.getDate().getDayBreak()+1);
		Main.dc.day();
		
		this.add(jl);
		this.add(spb1);
		this.add(spb2);
		//this.add(icon1);
	}
}