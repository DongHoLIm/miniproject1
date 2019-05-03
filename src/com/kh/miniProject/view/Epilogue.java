package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kh.miniProject.controller.FileController;
import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.dao.PTextOutput;
import com.kh.miniProject.model.vo.EnterKeyAction;
import com.kh.miniProject.model.vo.Girl;
import com.kh.miniProject.model.vo.GrilNumber;
import com.kh.miniProject.model.vo.RoundOpen;

public class Epilogue extends JPanel implements KeyListener {
	private JFrame start;
	private JPanel Epilogue;
	private JTextArea tf;
	private FileController sc = new FileController();
	private File loveStory;
	private EnterKeyAction ek = new EnterKeyAction();
	private ArrayList listStory;
	RoundOpen ro = new RoundOpen();
	Girl gl = new Girl();
	int talkEnding = 0;
	JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
	public Epilogue(JFrame start) {
		this.start = start;
		Epilogue = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);

		System.out.println("에필로그 생성");

		tf = new JTextArea();
		tf.setLayout(null);
		tf.setBounds(150, 450, 600, 150);
		tf.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		tf.addKeyListener(this);
		tf.setCaretColor(Color.cyan);
		tf.setFont(getFont().deriveFont(15.0f));
		Font font = new Font("한컴 백제 M", Font.PLAIN, 20);
		tf.setFont(font);
		this.add(tf);

		Collections.sort(RoundOpen.glist, new Comparator<Girl>() {
			@Override
			public int compare(Girl o1, Girl o2) {
				if (o1.getMylovePer() > o2.getMylovePer()) {
					return 1;
				} else if (o1.getMylovePer() < o2.getMylovePer()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		Collections.reverse(RoundOpen.glist);
		if (PTextOutput.epilogueNum != 2) {
			if (RoundOpen.glist.get(0).getGlovePer() > 69) {
				System.out.println("성공");
				PTextOutput.epilogueNum = 1;
			} else if (RoundOpen.glist.get(0).getGlovePer() < 70) {
				System.out.println("실패");
				PTextOutput.epilogueNum = 0;
			}
		}
		String place = "Eplilogue";
		loveStory = sc.EtextOutgoTput(place);
		listStory = ek.enterAction(loveStory);

		
		icon1.setBounds(0, 0, 960, 720);

		if (PTextOutput.epilogueNum == 1 || PTextOutput.epilogueNum == 0) {

			System.out.println("정렬 잘 됐니?" + RoundOpen.glist);

			JLabel girl = new JLabel(new ImageIcon(GirlImages.girlImage[RoundOpen.glist.get(0).getEndingNum()]));
			girl.setBounds(110, 5, 700, 550);
			icon1.add(girl);
			System.out.println("럽퍼" + RoundOpen.glist.get(0).getGlovePer());
			talkEnding += 1;
		}

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
			}else {
				ChangePanel.ChangePanel(start, Epilogue, new Credit(start));
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
