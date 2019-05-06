package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kh.miniProject.controller.EnterKeyactionController;
import com.kh.miniProject.controller.FileController;
import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.dao.PTextOutput;
import com.kh.miniProject.model.vo.EnterKeyAction;
import com.kh.miniProject.model.vo.Girl;
import com.kh.miniProject.model.vo.RoundOpen;
import com.kh.miniProject.view.MiniMap.ChangeMain;

public class Epilogue extends JPanel implements KeyListener {
	private JFrame start;
	private JPanel Epilogue;
	private JTextArea tf;
	private File loveStory;
	private ArrayList listStory;
	private Clip clip2;
	FileController sc = new FileController();
	EnterKeyactionController ec = new EnterKeyactionController();
	JLabel icon1 = new JLabel();
	JLabel girl = new JLabel();
	
	public Epilogue(JFrame start) {
		this.start = start;
		Epilogue = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);

		System.out.println("�뿉�븘濡쒓렇 �깮�꽦");
		try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/credit.wav"));
            clip2 = AudioSystem.getClip();
            clip2.open(stream);
            clip2.start();
            
            
            
        } catch(Exception e) {
            
            e.printStackTrace();
        }
		tf = new JTextArea();
		tf.setLayout(null);
		tf.setBounds(150, 450, 600, 150);
		tf.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		tf.addKeyListener(this);
		tf.setCaretColor(Color.cyan);
		tf.setFont(getFont().deriveFont(15.0f));
		Font font = new Font("�븳而� 諛깆젣 M", Font.PLAIN, 20);
		tf.setFont(font);
		this.add(tf);

		
		
		Main.ec.epilogueSort();
		
		String place = "Eplilogue";
		loveStory = sc.EtextOutgoTput(place);
		listStory = ec.enterAction(loveStory);

		if (Main.ec.ev.getEpilogueNum() != 2) {

			icon1 = new JLabel(new ImageIcon("images/res3.png"));
			icon1.setBounds(0, 0, 960, 720);
		} else {
			icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
			icon1.setBounds(0, 0, 960, 720);
		}

		if (Main.ec.ev.getEpilogueNum() != 2) {


			girl = new JLabel(new ImageIcon(GirlImages.girlImage[Main.oc.ro.getGlist().get(0).getEndingNum()]));
			girl.setBounds(110, 5, 700, 550);
			icon1.add(girl);
			Main.ec.ev.setTalkEnding(Main.ec.ev.getTalkEnding()+1);
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

			String str = ec.goEnterAction(listStory);
			System.out.println(str);
			if (str != null) {
				tf.append(str);
				// value++;
			} else if (str == null && Main.ec.ev.getTalkEnding() == 3){
				clip2.stop();
				ChangePanel.ChangePanel(start, Epilogue, new Credit(start));
			}else if (str == null && Main.ec.ev.getTalkEnding() == 4){
				clip2.stop();
				ChangePanel.ChangePanel(start, Epilogue, new Credit2(start));
			}
			else {
				if(Main.ec.ev.getTalkEnding() == 1) {
					
					icon1.remove(girl);
					JLabel girl2 = new JLabel(new ImageIcon(GirlImages.girlImage2[Main.oc.ro.getGlist().get(0).getEndingNum()]));
					girl2.setBounds(110, 5, 700, 550);
					icon1.add(girl2);
					this.repaint();
					Main.ec.ev.setTalkEnding(Main.ec.ev.getTalkEnding()+2);
				}else if(Main.ec.ev.getTalkEnding() == 2) {
					icon1.remove(girl);
					JLabel girl2 = new JLabel(new ImageIcon(GirlImages.girlImage3[Main.oc.ro.getGlist().get(0).getEndingNum()]));
					girl2.setBounds(110, 5, 700, 550);
					icon1.add(girl2);
					this.repaint();
					Main.ec.ev.setTalkEnding(Main.ec.ev.getTalkEnding()+1);
				} else if(Main.ec.ev.getTalkEnding() == 0) {
					
					Main.ec.ev.setTalkEnding(Main.ec.ev.getTalkEnding()+4);
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
			clip2.stop();
			ChangePanel.ChangePanel(start, Epilogue, new Credit2(start));
		}

	}
}
