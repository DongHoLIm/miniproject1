package com.kh.miniProject.view;

import java.awt.Color;
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
		cardIn.setLocation(400, 80);
		cardIn.setSize(400,500);
		cardIn.setBorder(BorderFactory.createLineBorder(Color.PINK, 1));

		JButton info = new JButton("Info");
		info.setLocation(50,50);
		info.setSize(30,30);
		JButton shop = new JButton("shop");
		shop.setLocation(50,90);
		shop.setSize(30,30);
		JButton aff = new JButton("aff");
		aff.setLocation(50,130);
		aff.setSize(30,30);
		JButton coin = new JButton("coin");
		coin.setLocation(600,50);
		coin.setSize(30,30);
		JButton map = new JButton("map");
		map.setLocation(850,50);
		map.setSize(30,30);


		JButton exit=new JButton("x"); 
		exit.setLocation(350,10);
		exit.setSize(30,30);
		//카드 번호
		JLabel cardName=new JLabel("카드 번호 :");
		cardName.setLocation(50, 60);
		cardName.setSize(80,50);

		JTextField t1=new JTextField();
		t1.setLocation(120,70);
		t1.setSize(50, 30);
		t1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=4)ke.consume(); 
			}
		});


		JLabel l1=new JLabel("-");
		l1.setLocation(170, 80);
		l1.setSize(10,10);

		JTextField t2=new JTextField();
		t2.setLocation(180,70);
		t2.setSize(50, 30);
		t2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=4) ke.consume();
					
				
			}
		});

		JLabel l2=new JLabel("-");
		l2.setLocation(230, 80);
		l2.setSize(10,10);

		JTextField t3=new JTextField();
		t3.setLocation(240,70);
		t3.setSize(50, 30);
		t3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=4) ke.consume();
					
				
			}
		});

		JLabel l3=new JLabel("-");
		l3.setLocation(290, 80);
		l3.setSize(10,10);

		JTextField t4=new JTextField();
		t4.setLocation(300,70);
		t4.setSize(50, 30);
		t4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=4) ke.consume();
					
				
			}
		});
		//월/년
		JLabel cardday=new JLabel("월 / 년(mm/yy) : ");
		cardday.setLocation(50, 100);
		cardday.setSize(100,50);

		JTextField d1=new JTextField();
		d1.setLocation(140,110);
		d1.setSize(50, 30);
		d1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=2) ke.consume();
					
				
			}
		});

		JLabel l4=new JLabel("/");
		l4.setLocation(200, 120);
		l4.setSize(10,10);

		JTextField d2=new JTextField();
		d2.setLocation(210,110);
		d2.setSize(50, 30);
		d2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=2) ke.consume();
					
				
			}
		});

		//cvc
		JLabel cvc=new JLabel("CVC : ");
		cvc.setLocation(50, 160);
		cvc.setSize(50,10);

		JTextField c1=new JTextField();
		c1.setLocation(90,150);
		c1.setSize(100, 30);
		c1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=3) ke.consume();
					
				
			}
		});
		
		JLabel cvc1=new JLabel("(CVC는 카드 뒷면에 3자리 숫자입니다.)");
		cvc1.setLocation(50, 190);
		cvc1.setSize(250,15);
		//비밀번호
		JLabel pass=new JLabel("비밀 번호 앞 두자리");
		pass.setLocation(50, 210);
		pass.setSize(200,15);
		
		JPasswordField pass1=new JPasswordField();
		pass1.setLocation(50,225);
		pass1.setSize(50, 30);
		pass1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke) {
				JTextField src=(JTextField)ke.getSource();
				if (src.getText().length()>=2) ke.consume();
					
				
			}
		});
		
		JLabel pass2=new JLabel("**");
		pass2.setLocation(110, 235);
		pass2.setSize(200,15);
		
		JButton btn1=new JButton("결제");
		btn1.setLocation(100, 290);
		btn1.setSize(70,30);
		btn1.addActionListener(new goPlusCoin());
			
		
		JButton btn2=new JButton("취소");
		btn2.setLocation(220, 290);
		btn2.setSize(70,30);
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
