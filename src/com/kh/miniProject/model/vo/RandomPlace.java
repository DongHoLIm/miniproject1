package com.kh.miniProject.model.vo;

import com.kh.miniProject.view.MiniMap;
import com.kh.miniProject.view.PlayerInfo;

public class RandomPlace {
	
	public static int randomNum = 1;
	public static int random2[] = new int [randomNum];
	
	public RandomPlace() {
		
		
		if(PlayerInfo.getLev() == 1 && PlayerInfo.getLevBreak() == 0 ) {
			randomNum = 1;
			random2 = new int [randomNum];
			System.out.println("lev1"); 
			

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			 PlayerInfo.setLevBreak(PlayerInfo.getLevBreak() + 1);
			
		}else if(PlayerInfo.getLev() == 1 &&PlayerInfo.getLevBreak() == 1 ) {
			randomNum = 1;
			random2 = new int [randomNum];
			System.out.println("lev1 - 2"); 
			for(int r = 0; r < random2.length; r++) {
				MiniMap.te[r] = 0;
			}

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			 PlayerInfo.setLevBreak(PlayerInfo.getLevBreak() + 1);
			
		}else if(PlayerInfo.getLev() == 2 && PlayerInfo.getLevBreak() == 1) {
			
			randomNum = 2;
			random2 = new int [randomNum];
			System.out.println("randomPlace num°ª " + random2.length);
			System.out.println("lev2"); 
			for(int r = 0; r < random2.length; r++) {
				MiniMap.te[r] = 0;
			}

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			PlayerInfo.setLevBreak(PlayerInfo.getLevBreak() + 1);
			
		}else if(PlayerInfo.getLev() == 2 &&PlayerInfo.getLevBreak() == 2 ) {
			randomNum = 2;
			random2 = new int [randomNum];
			System.out.println("lev1 - 2"); 
			for(int r = 0; r < random2.length; r++) {
				MiniMap.te[r] = 0;
			}

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			
		}else if(PlayerInfo.getLev() == 3 && PlayerInfo.getLevBreak() == 2) {
			randomNum = 3;
			random2 = new int [randomNum];
			System.out.println("randomPlace num°ª " + random2.length);
			System.out.println("lev3"); 
			for(int r = 0; r < random2.length; r++) {
				MiniMap.te[r] = 0;
			}

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			PlayerInfo.setLevBreak(PlayerInfo.getLevBreak() + 1);
		}else if(PlayerInfo.getLev() == 3 &&PlayerInfo.getLevBreak() == 3 ) {
			randomNum = 3;
			random2 = new int [randomNum];
			System.out.println("lev2 - 2"); 
			for(int r = 0; r < random2.length; r++) {
				MiniMap.te[r] = 0;
			}

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			
		}else if(PlayerInfo.getLev() == 4 && PlayerInfo.getLevBreak() == 3) {
			randomNum = 4;
			random2 = new int [randomNum];
			System.out.println("lev4"); 
			

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			PlayerInfo.setLevBreak(PlayerInfo.getLevBreak() + 1);
		}else if(PlayerInfo.getLev() == 4 &&PlayerInfo.getLevBreak() == 4 ) {
			randomNum = 4;
			random2 = new int [randomNum];
			System.out.println("lev3 - 2"); 
			for(int r = 0; r < random2.length; r++) {
				MiniMap.te[r] = 0;
			}

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			
		}
		else if(PlayerInfo.getLev() > 4 && PlayerInfo.getLevBreak() == 4) {
			randomNum = 5;
			random2 = new int [randomNum];
			System.out.println("lev2"); 
			for(int r = 0; r < random2.length; r++) {
				MiniMap.te[r] = 0;
			}

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			PlayerInfo.setLevBreak(PlayerInfo.getLevBreak() + 1);
		}else if(PlayerInfo.getLevBreak() == 5 ) {
			randomNum = 5;
			random2 = new int [randomNum];
			System.out.println("lev3 - 2"); 
			for(int r = 0; r < random2.length; r++) {
				MiniMap.te[r] = 0;
			}

			for (int i = 0; i < random2.length; i++) {
				random2[i] = (int) (Math.random() * 10) + 1;
				for (int j = 0; j < i; j++) {
					if (random2[i] == random2[j]) {
						i--;
						break;
					}

				}
			}for(int b = 0 ; b < random2.length ; b++) {
				System.out.println(random2[b]);
			}
			
		}
	}
	public int[] getRandom2() {
		return random2;
	}
	public void setRandom2(int[] random2) {
		this.random2 = random2;
	}

}
