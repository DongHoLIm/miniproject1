package com.kh.miniProject.model.vo;

import java.util.Random;

import com.kh.miniProject.view.MiniMap;

public class GirlImageOut {

   public static int[] iarr;
   
   public String[] girlImageOut(int lev, String[] image) {
      
      String[] imageResult = new String[5];
      String[] imageResult2 = new String[2];
      String[] imageResult3 = new String[3];
      String[] imageResult4 = new String[4];
      
      if(lev == 1) {
    	 iarr = new int[1];
    	 iarr[0] = 0;
         return image;
      }else if(lev == 2) {
         iarr = new int[imageResult2.length];
         Random r = new Random();
         
         for(int i = 0; i < imageResult2.length; i++) {
            iarr[i] = r.nextInt(2);
            for(int j=0; j<i;j++) {
               if(iarr[i]==iarr[j]) {
                  i--;
               }
            }
         }
         for(int i = 0; i < imageResult2.length; i++) {
            System.out.println(iarr[i]);
            imageResult2[i] = image[iarr[i]];
         }
         return imageResult2;
      }else if(lev == 3) {
         iarr = new int[imageResult3.length];
         Random r = new Random();
         
         for(int i = 0; i < imageResult3.length; i++) {
            iarr[i] = r.nextInt(3);
            for(int j=0; j<i;j++) {
               if(iarr[i]==iarr[j]) {
                  i--;
               }
            }
         }
         for(int i = 0; i < imageResult3.length; i++) {
            System.out.println(iarr[i]);
            imageResult3[i] = image[iarr[i]];
         }
         return imageResult3;
      }else if(lev == 4) {
         iarr = new int[imageResult4.length];
         Random r = new Random();
         
         for(int i = 0; i < imageResult4.length; i++) {
            iarr[i] = r.nextInt(4);
            for(int j=0; j<i;j++) {
               if(iarr[i]==iarr[j]) {
                  i--;
               }
            }
         }
         for(int i = 0; i < imageResult4.length; i++) {
            System.out.println(iarr[i]);
            imageResult4[i] = image[iarr[i]];
         }
         return imageResult4;
      }else if(lev == 5) {
         iarr = new int[imageResult.length];
         Random r = new Random();
         
         for(int i = 0; i < imageResult.length; i++) {
            iarr[i] = r.nextInt(5);
            for(int j=0; j<i;j++) {
               if(iarr[i]==iarr[j]) {
                  i--;
               }
            }
         }
         for(int i = 0; i < imageResult.length; i++) {
            System.out.println(iarr[i]);
            imageResult[i] = image[iarr[i]];
         }
         return imageResult;
      }else if(lev == 6) {
         iarr = new int[imageResult.length];
         Random r = new Random();
         
         for(int i = 0; i < imageResult.length; i++) {
            iarr[i] = r.nextInt(6);
            for(int j=0; j<i;j++) {
               if(iarr[i]==iarr[j]) {
                  i--;
               }
            }
         }
         for(int i = 0; i < imageResult.length; i++) {
            System.out.println(iarr[i]);
            imageResult[i] = image[iarr[i]];
         }
         return imageResult;
      }else if(lev == 7) {
         iarr = new int[imageResult.length];
         Random r = new Random();
         
         for(int i = 0; i < imageResult.length; i++) {
            iarr[i] = r.nextInt(7);
            for(int j=0; j<i;j++) {
               if(iarr[i]==iarr[j]) {
                  i--;
               }
            }
         }
         for(int i = 0; i < imageResult.length; i++) {
            System.out.println(iarr[i]);
            imageResult[i] = image[iarr[i]];
         }
         return imageResult;
      }else if(lev == 8) {
         iarr = new int[imageResult.length];
         Random r = new Random();
         
         for(int i = 0; i < imageResult.length; i++) {
            iarr[i] = r.nextInt(8);
            for(int j=0; j<i;j++) {
               if(iarr[i]==iarr[j]) {
                  i--;
               }
            }
         }
         for(int i = 0; i < imageResult.length; i++) {
            System.out.println(iarr[i]);
            imageResult[i] = image[iarr[i]];
         }
         return imageResult;
      }else if(lev == 9) {
         iarr = new int[imageResult.length];
         Random r = new Random();
         
         for(int i = 0; i < imageResult.length; i++) {
            iarr[i] = r.nextInt(9);
            for(int j=0; j<i;j++) {
               if(iarr[i]==iarr[j]) {
                  i--;
               }
            }
         }
         for(int i = 0; i < imageResult.length; i++) {
            System.out.println(iarr[i]);
            imageResult[i] = image[iarr[i]];
         }
         return imageResult;
      }else if(lev == 10) {
         iarr = new int[imageResult.length];
         Random r = new Random();
         
         for(int i = 0; i < imageResult.length; i++) {
            iarr[i] = r.nextInt(10);
            for(int j=0; j<i;j++) {
               if(iarr[i]==iarr[j]) {
                  i--;
               }
            }
         }
         for(int i = 0; i < imageResult.length; i++) {
            System.out.println(iarr[i]);
            imageResult[i] = image[iarr[i]];
         }
         return imageResult;
      }
      return null;
   }

}