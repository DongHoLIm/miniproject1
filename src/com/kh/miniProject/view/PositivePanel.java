package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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

import com.kh.miniProject.controller.PointController;
import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.vo.Exper;

public class PositivePanel extends JPanel{

	private Image img;
	private JTextArea tf;
	private Clip clip;
	JFrame start = new JFrame();
	JPanel positivePanel;


	public PositivePanel(JFrame start) {

		positivePanel = new JPanel();
		this.start = start;
		positivePanel = this;
		this.setBounds(0, 0, 960, 720);
		this.setBackground(Color.black);
		this.setLayout(null);

		Toolkit t = Toolkit.getDefaultToolkit();
		this.img = t.getImage("images/PositivePanel.gif").getScaledInstance(960, 720, 0);;

		JLabel jl = new JLabel(new ImageIcon(img));
		jl.setBounds(0, 0, 960, 720);
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(new File("sound/positivePanel.wav"));
			clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
		Exper ex = new Exper();
		Main.ic.experUp(1);

		int girlnum = Main.gc.girlnum.getGirlnumber();
		Image img6 = new ImageIcon("images/back.png").getImage().getScaledInstance(30, 30, 0);
		JButton exit = new JButton(new ImageIcon(img6));
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);

		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clip.stop();
				if(StartStoryPanel.startnum == 0) {
					ChangePanel.StartChangePanle(start, positivePanel, new StartStoryPanel(start));
					StartStoryPanel.startnum++;
				}else {
					ChangePanel.StartChangePanle(start, positivePanel, new Main(start));					
				}

			}

		});
		String positiveMent = null;
		int mentRan = (int)(Math.random()*5)+1;
		switch(mentRan) {
		case 1 : positiveMent = "\n\n 경현씨 센스 좋은대요?"; break;
		case 2 : positiveMent = "\n\n 고마워요 감동이에요"; break;
		case 3 : positiveMent = "\n\n 저의 경현씨의 대한 호감도가 올라간것같은대요?"; break;
		case 4 : positiveMent = "\n\n 고마워요 ㅎㅎ~"; break;
		case 5 : positiveMent = "\n\n 경현씨는 여성의 마음을 잘 아시는것같아요."; break;

		}
		tf = new JTextArea(positiveMent);
		tf.setBounds(150,450, 600,150);
		tf.setBorder(BorderFactory.createLineBorder(Color.black,1));
		//tf.addKeyListener(this);
		tf.setCaretColor(Color.cyan);
		tf.setFont(getFont().deriveFont(15.0f));
		Font font =new Font("휴먼편지체", Font.BOLD, 20);
		tf.setFont(font);
		
		

		Main.lc.plusMylove(girlnum, 1);
		
		Main.lc.plusGirllove(girlnum);

		int cha = (int)(Math.random()*5)+1;
		Main.ic.charmUp(cha);
		
		Main.pc.pointUp(300);

		JLabel girl = new JLabel(new ImageIcon(GirlImages.girlImage2[Main.gc.girlnum.getGirlnumber()]));
		girl.setBounds(110, 5, 700, 550);
		positivePanel.add(tf);
		positivePanel.add(girl);
		positivePanel.add(exit);
		positivePanel.add(jl);





	}
}
