package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectPanel extends JPanel{
   private JPanel select = new JPanel();
   private JFrame start;
   private File loveStory;
   private int answerInt1;
   private int answerInt2;
   public SelectPanel(JFrame start,File loveStory) {
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
      
      for(int i = 0; i < str.length; i++) {
         try {
            str[i] = br.readLine();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      for(int i = 0; i < str.length; i++) {
         if(str[i].length() == 0) {
            answer1 = str[i+1];
            answer2 = str[i+2];
            answerInt1 = Integer.parseInt(str[i+3]);
            answerInt2 = Integer.parseInt(str[i+4]);
            break;
         }
      }

      JButton spb1 = new JButton(answer1);
      spb1.setSize(500,50);
      spb1.setLocation(200,250);
      spb1.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            if(answerInt1 == 1) {
               ChangePanel.ChangePanel(start, select, new PositivePanel(start));               
            }else if(answerInt1 == 2) {
               ChangePanel.ChangePanel(start, select, new NegativePanel(start));   
            }
            
         }
      });

      JButton spb2 = new JButton(answer2);
      spb2.setSize(500,50);
      spb2.setLocation(200, 350);
      spb2.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            if(answerInt2 == 1) {
               ChangePanel.ChangePanel(start, select, new PositivePanel(start));               
            }else if(answerInt2 == 2) {
               ChangePanel.ChangePanel(start, select, new NegativePanel(start));   
            }   
         }
      });

      this.add(spb1);
      this.add(spb2);
   }

}