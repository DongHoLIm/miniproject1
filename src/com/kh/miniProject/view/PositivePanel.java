package com.kh.miniProject.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.miniProject.model.dao.GirlImages;
import com.kh.miniProject.model.vo.Exper;
import com.kh.miniProject.model.vo.GirllovePer;
import com.kh.miniProject.model.vo.GrilNumber;
import com.kh.miniProject.model.vo.MylovePer;

public class PositivePanel extends JPanel{

	JFrame start = new JFrame();
	JPanel positivePanel;
	public PositivePanel(JFrame start) {
			
			 positivePanel = new JPanel();
			 this.start = start;
			 positivePanel = this;
			 this.setBounds(0, 0, 960, 720);
			this.setLayout(null);
		      
			System.out.println("±‡¡§");

			int girlnum = GrilNumber.grilnumber;
			JButton but = new JButton("x");
			but.setLocation(850, 50);
			but.setSize(30, 30);
			
			but.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ChangePanel.StartChangePanle(start, positivePanel, new Main(start));
					
				}
				
			});
			Exper ex = new Exper();
			ex.plusExper(1);

			MylovePer mlp = new MylovePer();
			mlp.plusMylove(girlnum, 1);

			GirllovePer glp = new GirllovePer();
			glp.plusGirllove(girlnum);

			JLabel girl = new JLabel(new ImageIcon(GirlImages.girlImage2[GrilNumber.grilnumber]));
			girl.setBounds(110, 5, 700, 550);
			positivePanel.add(girl);
			positivePanel.add(but);





		}
	}
