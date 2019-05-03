package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kh.miniProject.controller.FileController;
import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.dao.PTextOutput;
import com.kh.miniProject.model.vo.EnterKeyAction;
import com.kh.miniProject.model.vo.EpilogueSort;
import com.kh.miniProject.model.vo.Girl;
import com.kh.miniProject.model.vo.RoundOpen;
import com.kh.miniProject.view.MiniMap.ChangeMain;

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
	public static int talkEnding = 0;
	JLabel icon1 = new JLabel();
	JLabel girl = new JLabel();
	
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

		
		
		EpilogueSort es = new EpilogueSort(PTextOutput.epilogueNum);
		

		String place = "Eplilogue";
		loveStory = sc.EtextOutgoTput(place);
		listStory = ek.enterAction(loveStory);

		if (PTextOutput.epilogueNum != 2) {

			icon1 = new JLabel(new ImageIcon("images/res3.png"));
			icon1.setBounds(0, 0, 960, 720);
		} else {
			icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
			icon1.setBounds(0, 0, 960, 720);
		}

		if (PTextOutput.epilogueNum != 2) {

			System.out.println("정렬 잘 됐니?" + RoundOpen.glist);

			girl = new JLabel(new ImageIcon(GirlImages.girlImage[RoundOpen.glist.get(0).getEndingNum()]));
			girl.setBounds(110, 5, 700, 550);
			icon1.add(girl);
			System.out.println("럽퍼" + RoundOpen.glist.get(0).getGlovePer());
			talkEnding += 1;
		}
		JButton stop = new JButton(new ImageIcon("images/img6"));
		stop.setLocation(850, 50);
		stop.setSize(50, 50);
		stop.setContentAreaFilled(false);
		stop.setFocusPainted(false);

		stop.addActionListener(new ChangeCredit2());
		
		this.add(stop);

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
			} else if (str == null && talkEnding == 3){
				ChangePanel.ChangePanel(start, Epilogue, new Credit(start));
			}
			else {
				if(talkEnding == 1) {
					
					icon1.remove(girl);
					JLabel girl2 = new JLabel(new ImageIcon(GirlImages.girlImage2[RoundOpen.glist.get(0).getEndingNum()]));
					girl2.setBounds(110, 5, 700, 550);
					icon1.add(girl2);
					this.repaint();
					talkEnding += 2;
					//ChangePanel.ChangePanel(start, Epilogue, new Credit(start));
				}else if(talkEnding == 2) {
					icon1.remove(girl);
					JLabel girl2 = new JLabel(new ImageIcon(GirlImages.girlImage3[RoundOpen.glist.get(0).getEndingNum()]));
					girl2.setBounds(110, 5, 700, 550);
					icon1.add(girl2);
					this.repaint();
					talkEnding += 1;
					//ChangePanel.ChangePanel(start, Epilogue, new Credit(start));
				} 
				

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

	class ChangeCredit2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, Epilogue, new Credit(start));
		}

	}
}
