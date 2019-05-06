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

import com.kh.miniProject.controller.EnterKeyactionController;
import com.kh.miniProject.controller.FileController;
import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.vo.EnterKeyAction;

public class StartStoryPanel extends JPanel implements KeyListener{
	private JFrame start;
	private JPanel StartStoryPanel;
	private JLabel startLabel;
	private JLabel girlStart;
	private File startStory;
	private ArrayList startArr;
	public static int startnum = 1;
	JTextArea startArea = new JTextArea();
	EnterKeyactionController ec = new EnterKeyactionController();
	FileController sc = new FileController();
	
	public StartStoryPanel(JFrame start) {
		this.start = start;
		this.StartStoryPanel = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
		
		startArea.setBounds(150,450, 600,150);
		startArea.addKeyListener(this);
		startArea.setBorder(BorderFactory.createLineBorder(Color.black,1));
		startArea.setCaretColor(Color.cyan);
		startArea.setFont(getFont().deriveFont(15.0f));
		Font font =new Font("»ﬁ∏’∆Ì¡ˆ√º", Font.BOLD, 15);
		startArea.setFont(font);
		
		if(Main.ic.getExper().getLev() == 2) {
			startLabel = new JLabel(new ImageIcon("images/pub3.png"));
			startLabel.setBounds(0, 0, 960, 720);
			startLabel.setLayout(null);
			startStory = new File("Startstory/1");
			startArr = ec.startEnterAction(startStory);
			girlStart = new JLabel(new ImageIcon("images/1nomal.png"));
			girlStart.setBounds(110, 5, 700, 550);
			startLabel.add(girlStart);
			startLabel.repaint();
		}else if(Main.ic.getExper().getLev() == 3) {
			startLabel = new JLabel(new ImageIcon("images/theme1.png"));
			startLabel.setBounds(0, 0, 960, 720);
			startLabel.setLayout(null);
			startStory = new File("Startstory/2");
			startArr = ec.startEnterAction(startStory);
			girlStart = new JLabel(new ImageIcon("images/2nomal.png"));
			girlStart.setBounds(110, 5, 700, 550);
			startLabel.add(girlStart);
			startLabel.repaint();
		}else if(Main.ic.getExper().getLev() == 4) {
			startLabel = new JLabel(new ImageIcon("images/cafe3.png"));
			startLabel.setBounds(0, 0, 960, 720);
			startLabel.setLayout(null);
			startStory = new File("Startstory/3");
			startArr = ec.startEnterAction(startStory);
			girlStart = new JLabel(new ImageIcon("images/3nomal.png"));
			girlStart.setBounds(110, 5, 700, 550);
			startLabel.add(girlStart);
			startLabel.repaint();
		}else if(Main.ic.getExper().getLev() == 5) {
			startLabel = new JLabel(new ImageIcon("images/movie.png"));
			startLabel.setBounds(0, 0, 960, 720);
			startLabel.setLayout(null);
			startStory = new File("Startstory/4");
			startArr = ec.startEnterAction(startStory);
			girlStart = new JLabel(new ImageIcon("images/4nomal.png"));
			girlStart.setBounds(110, 5, 700, 550);
			startLabel.add(girlStart);
			startLabel.repaint();
		}else if(Main.ic.getExper().getLev() == 6) {
			startLabel = new JLabel(new ImageIcon("images/beach_night.png"));
			startLabel.setBounds(0, 0, 960, 720);
			startLabel.setLayout(null);
			startStory = new File("Startstory/5");
			startArr = ec.startEnterAction(startStory);
			girlStart = new JLabel(new ImageIcon("images/5nomal.png"));
			girlStart.setBounds(110, 5, 700, 550);
			startLabel.add(girlStart);
			startLabel.repaint();
		}else if(Main.ic.getExper().getLev() == 7) {
			startLabel = new JLabel(new ImageIcon("images/sing2.png"));
			startLabel.setBounds(0, 0, 960, 720);
			startLabel.setLayout(null);
			startStory = new File("Startstory/6");
			startArr = ec.startEnterAction(startStory);
			girlStart = new JLabel(new ImageIcon("images/6nomal.png"));
			girlStart.setBounds(110, 5, 700, 550);
			startLabel.add(girlStart);
			startLabel.repaint();
		}else if(Main.ic.getExper().getLev() == 8) {
			startLabel = new JLabel(new ImageIcon("images/res.jpg"));
			startLabel.setBounds(0, 0, 960, 720);
			startLabel.setLayout(null);
			startStory = new File("Startstory/7");
			startArr = ec.startEnterAction(startStory);
			girlStart = new JLabel(new ImageIcon("images/7nomal.png"));
			girlStart.setBounds(110, 5, 700, 550);
			startLabel.add(girlStart);
			startLabel.repaint();
		}else if(Main.ic.getExper().getLev() == 9) {
			startLabel = new JLabel(new ImageIcon("park_night.png"));
			startLabel.setBounds(0, 0, 960, 720);
			startLabel.setLayout(null);
			startStory = new File("Startstory/8");
			startArr = ec.startEnterAction(startStory);
			girlStart = new JLabel(new ImageIcon("images/8nomal.png"));
			girlStart.setBounds(110, 5, 700, 550);
			startLabel.add(girlStart);
			startLabel.repaint();
		}else {
			startLabel = new JLabel(new ImageIcon("images/flower2.png"));
			startLabel.setBounds(0, 0, 960, 720);
			startLabel.setLayout(null);
			startStory = new File("Startstory/9");
			startArr = ec.startEnterAction(startStory);
			girlStart = new JLabel(new ImageIcon("images/9nomal.png"));
			girlStart.setBounds(110, 5, 700, 550);
			startLabel.add(girlStart);
			startLabel.repaint();
		}
		

		this.add(startArea);
		this.add(startLabel);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			String str = ec.startStory(startArr);
			System.out.println(str);
			if(str.length() != 0) {
				startArea.append(str);
				//value++;
			}else{
				System.out.println("AA");
				ChangePanel.ChangePanel(start, StartStoryPanel, new Main(start));
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
