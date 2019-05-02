package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.miniProject.model.vo.PointMinus;

public class Card extends JPanel{
	
	private JFrame start;
	private JPanel card;
	private JPanel cardIn;
	public static int plusCoin;
	

	public Card(JFrame start) {
		this.start=start;
		this.card=this;

		this.setLocation(0, 0);
		this.setSize(960, 720);
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));

		JLabel icon1 = new JLabel(new ImageIcon("images/roomIn.png"));
	    icon1.setBounds(0, 0, 960, 720);
	    
		cardIn=new JPanel();
		cardIn.setLayout(null);
		cardIn.setLocation(390, 130);
		cardIn.setSize(400,500);
		cardIn.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));

		Image img = new ImageIcon("images/store.png").getImage().getScaledInstance(60, 60, 0);
		Image img2 = new ImageIcon("images/inventory.png").getImage().getScaledInstance(80, 80, 0);
		Image img3 = new ImageIcon("images/heart.png").getImage().getScaledInstance(60, 60, 0);
		Image img4 = new ImageIcon("images/coin.png").getImage().getScaledInstance(60, 60, 0);
		Image img5 = new ImageIcon("images/map.png").getImage().getScaledInstance(80, 80, 0);
		Image img6 = new ImageIcon("images/back.png").getImage().getScaledInstance(30, 30, 0);
		
		
		JButton info = new JButton((new ImageIcon(img2)));
		info.setLocation(50,50);
		info.setSize(70,70);
		JButton shop = new JButton(new ImageIcon(img));
		shop.setLocation(50,130);
		shop.setSize(70,70);
		JButton aff = new JButton(new ImageIcon(img3));
		aff.setLocation(50,210);
		aff.setSize(70,70);
		JButton coin = new JButton(new ImageIcon(img4));
		coin.setLocation(600,50);
		coin.setSize(70,70);
		JButton map = new JButton(new ImageIcon(img5));
		map.setLocation(850,50);
		map.setSize(70,70);
		
		info.setContentAreaFilled(false);
		info.setFocusPainted(false);
		shop.setContentAreaFilled(false);
		shop.setFocusPainted(false);
		aff.setContentAreaFilled(false);
		aff.setFocusPainted(false);
		coin.setContentAreaFilled(false);
		coin.setFocusPainted(false);
		map.setContentAreaFilled(false);
		map.setFocusPainted(false);


		JButton exit=new JButton(new ImageIcon(img6)); 
		exit.setLocation(350,10);
		exit.setSize(30,30);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		//카드 번호
		JLabel cardName=new JLabel("카드 번호 :");
		cardName.setLocation(50, 60);
		cardName.setSize(80,50);
		Font font =new Font("한컴 백제 M", Font.PLAIN, 15);
		cardName.setFont(font);

		JTextField t1=new JTextField();
		t1.setLocation(120,70);
		t1.setSize(50, 30);
		Font font1 =new Font("한컴 백제 M", Font.PLAIN, 15);
		t1.setFont(font1);
		t1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=4)ke.consume(); 
			}
		});


		JLabel l1=new JLabel("-");
		l1.setLocation(170, 80);
		l1.setSize(10,10);
		Font font2 =new Font("한컴 백제 M", Font.PLAIN, 15);
		l1.setFont(font2);

		JTextField t2=new JTextField();
		t2.setLocation(180,70);
		t2.setSize(50, 30);
		Font font3 =new Font("한컴 백제 M", Font.PLAIN, 15);
		t2.setFont(font3);
		t2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=4) ke.consume();
					
				
			}
		});

		JLabel l2=new JLabel("-");
		l2.setLocation(230, 80);
		l2.setSize(10,10);
		Font font4 =new Font("한컴 백제 M", Font.PLAIN, 15);
		l2.setFont(font4);

		JTextField t3=new JTextField();
		t3.setLocation(240,70);
		t3.setSize(50, 30);
		Font font5=new Font("한컴 백제 M", Font.PLAIN, 15);
		t3.setFont(font5);
		t3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=4) ke.consume();
					
				
			}
		});

		JLabel l3=new JLabel("-");
		l3.setLocation(290, 80);
		l3.setSize(10,10);
		Font font6 =new Font("한컴 백제 M", Font.PLAIN, 15);
		l3.setFont(font6);

		JTextField t4=new JTextField();
		t4.setLocation(300,70);
		t4.setSize(50, 30);
		Font font7 =new Font("한컴 백제 M", Font.PLAIN, 15);
		t4.setFont(font1);
		t4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=4) ke.consume();
					
				
			}
		});
		//월/년
		JLabel cardday=new JLabel("월 / 년(mm/yy) : ");
		cardday.setLocation(50, 100);
		cardday.setSize(120,50);
		Font font8 =new Font("한컴 백제 M", Font.PLAIN, 15);
		cardday.setFont(font8);

		JTextField d1=new JTextField();
		d1.setLocation(160,110);
		d1.setSize(50, 30);
		Font font9 =new Font("한컴 백제 M", Font.PLAIN, 15);
		d1.setFont(font9);
		d1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=2) ke.consume();
					
				
			}
		});

		JLabel l4=new JLabel("/");
		l4.setLocation(210, 120);
		l4.setSize(10,10);
		Font font10 =new Font("한컴 백제 M", Font.PLAIN, 15);
		l4.setFont(font10);

		JTextField d2=new JTextField();
		d2.setLocation(220,110);
		d2.setSize(50, 30);
		Font font11 =new Font("한컴 백제 M", Font.PLAIN, 15);
		d1.setFont(font11);
		d2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=2) ke.consume();
					
				
			}
		});

		//cvc
		JLabel cvc=new JLabel("CVC : ");
		cvc.setLocation(50, 160);
		cvc.setSize(50,15);
		Font font12 =new Font("한컴 백제 M", Font.PLAIN, 15);
		cvc.setFont(font12);

		JTextField c1=new JTextField();
		c1.setLocation(90,150);
		c1.setSize(100, 30);
		Font font13 =new Font("한컴 백제 M", Font.PLAIN, 15);
		c1.setFont(font13);
		c1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=3) ke.consume();
					
				
			}
		});
		
		JLabel cvc1=new JLabel("(CVC는 카드 뒷면에 3자리 숫자입니다.)");
		cvc1.setLocation(50, 190);
		cvc1.setSize(250,15);
		Font font14 =new Font("한컴 백제 M", Font.PLAIN, 15);
		cvc1.setFont(font14);
		//비밀번호
		JLabel pass=new JLabel("비밀 번호 앞 두자리");
		pass.setLocation(50, 210);
		pass.setSize(200,15);
		Font font15 =new Font("한컴 백제 M", Font.PLAIN, 15);
		pass.setFont(font15);
		
		JPasswordField pass1=new JPasswordField();
		pass1.setLocation(50,225);
		pass1.setSize(50, 30);
		Font font16 =new Font("한컴 백제 M", Font.PLAIN, 15);
		pass1.setFont(font16);
		pass1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=2) ke.consume();
					
				
			}
		});
		
		JLabel pass2=new JLabel("**");
		pass2.setLocation(110, 235);
		pass2.setSize(200,15);
		Font font17 =new Font("한컴 백제 M", Font.PLAIN, 15);
		pass2.setFont(font17);
		
		JButton btn1=new JButton("결제");
		btn1.setLocation(100, 290);
		btn1.setSize(70,30);
		Font font18 =new Font("한컴 백제 M", Font.PLAIN, 15);
		btn1.setFont(font18);
		
		btn1.addActionListener(new goPlusCoin());
			
		
		JButton btn2=new JButton("취소");
		btn2.setLocation(220, 290);
		btn2.setSize(70,30);
		Font font19 =new Font("한컴 백제 M", Font.PLAIN, 15);
		btn1.setFont(font19);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.ChangePanel(start, card, new PlusCoin(start));
				
			}
		});

		exit.addActionListener(new Change());

		cardIn.add(cardName);
		cardIn.add(exit);
		cardIn.add(t1);
		cardIn.add(l1);
		cardIn.add(t2);
		cardIn.add(l2);
		cardIn.add(t3);
		cardIn.add(l3);
		cardIn.add(t4);
		cardIn.add(cardday);
		cardIn.add(d1);
		cardIn.add(l4);
		cardIn.add(d2);
		cardIn.add(cvc);
		cardIn.add(c1);
		cardIn.add(cvc1);
		cardIn.add(pass);
		cardIn.add(pass1);
		cardIn.add(pass2);
		cardIn.add(btn1);
		cardIn.add(btn2);

		this.add(map);
		this.add(info);
		this.add(coin);
		this.add(shop);
		this.add(aff);
		this.add(cardIn);
		this.add(icon1);



	}
	
	class Change implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, card, new PlusCoin(start));			
		}


	}

	
	class goPlusCoin implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new PointMinus().pointPlus(plusCoin);
			ChangePanel.ChangePanel(start, card, new Main(start));
			
		}
		
		
		
	}
	
	

}
