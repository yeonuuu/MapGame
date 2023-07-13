package game.controller;

import game.ui.PrintMove;

public class Move {

	public static int moveNum;
	public static String direction;
	
	public Move() {
		this.moveNum = RollDice.moveNum;
		this.direction = null;
	}
	
	
	public static void move() {
		
		PrintMove pm = new PrintMove();
		
		if(moveNum == 0 ) {
			
		}
		
		else {
		
		MainControl.nPPLocation = MainControl.players.get(MainControl.nPPNumber).getLocation();

		
		
		
		while(direction.length() != moveNum) {
			
			System.out.println("Not correct length path");
			PrintMove pm2 = new PrintMove();
			
		}
		
		for(int i=0; i<moveNum;i++) {

	
			
			while((direction.charAt(i) != 'u' && direction.charAt(i) != 'd' && direction.charAt(i) != 'l' && direction.charAt(i) != 'r' )||((direction.charAt(i) == 'u' && MainControl.map[(MainControl.nPPLocation[0]-1)][(MainControl.nPPLocation[1])]==null) || (direction.charAt(i) == 'd' && MainControl.map[(MainControl.nPPLocation[0]+1)][(MainControl.nPPLocation[1])]==null) || (direction.charAt(i) == 'l' && MainControl.map[(MainControl.nPPLocation[0])][(MainControl.nPPLocation[1] - 1)]==null) || (direction.charAt(i) == 'r' && MainControl.map[(MainControl.nPPLocation[0])][(MainControl.nPPLocation[1])].getType() == 3 && MainControl.map[MainControl.nPPLocation[0]][MainControl.nPPLocation[1] + 2] == null) || (direction.charAt(i) == 'r'&& MainControl.map[(MainControl.nPPLocation[0])][(MainControl.nPPLocation[1])].getType() != 3 && MainControl.map[MainControl.nPPLocation[0]][(MainControl.nPPLocation[1] + 1)] == null))){
				System.out.println("Not valid path");
				PrintMove pm3 = new PrintMove();
			}
			
			if(direction.charAt(i) == 'u') {
						
					MainControl.nPPLocation[0] --;
					//END 에 도착했다면 멈춤.
					if(MainControl.map[MainControl.nPPLocation[0]][MainControl.nPPLocation[1]].getType() == 8){


						MainControl.endNum ++;
						MainControl.players.get(MainControl.nPPNumber).setEnd(true);
						System.out.println("you have reached to END!");
						
					
						
						break;
					}
				
			}
			else if(direction.charAt(i) == 'd') {
				
				
					MainControl.nPPLocation[0] ++ ;
					//END 에 도착했다면 멈춤.
					if(MainControl.map[MainControl.nPPLocation[0]][MainControl.nPPLocation[1]].getType() == 8){


						MainControl.endNum ++;
						MainControl.players.get(MainControl.nPPNumber).setEnd(true);
						System.out.println("you have reached to END!");
						
					
						
						break;
					}
				
			}
			
			else if(direction.charAt(i) == 'l') {
				
					MainControl.nPPLocation[1] --;
					//END 에 도착했다면 멈춤.
					if(MainControl.map[MainControl.nPPLocation[0]][MainControl.nPPLocation[1]].getType() == 8){


						MainControl.endNum ++;
						MainControl.players.get(MainControl.nPPNumber).setEnd(true);
						System.out.println("you have reached to END!");
						
					
						
						break;
					}
				
				
			}
			
			else if(direction.charAt(i) == 'r' ) {
				
				//다리 건너는 거라면 
				if(MainControl.map[(MainControl.nPPLocation[0])][(MainControl.nPPLocation[1])].getType() == 3) {
					
					
						MainControl.nPPLocation[1] = MainControl.nPPLocation[1] + 2; //현재 위치 이동 
					
						MainControl.nPPBCard ++ ; //현재 플레이어의 다리 카드 1 증가 
						MainControl.players.get(MainControl.nPPNumber).setBCard(MainControl.nPPBCard); //Bridge card 증가 
						
						//END 에 도착했다면 멈춤.
						if(MainControl.map[MainControl.nPPLocation[0]][MainControl.nPPLocation[1]].getType() == 8){


							MainControl.endNum ++;
							MainControl.players.get(MainControl.nPPNumber).setEnd(true);
							System.out.println("you have reached to END!");
							
						
							
							break;
						}
					
						//System.out.println("Your bridge card : " + MainControl.nPPBCard);
					
				}
				
				//다리 건너는 게 아니라면 
				else {
					
						MainControl.nPPLocation[1] ++ ;
						//END 에 도착했다면 멈춤.
						if(MainControl.map[MainControl.nPPLocation[0]][MainControl.nPPLocation[1]].getType() == 8){


							MainControl.endNum ++;
							MainControl.players.get(MainControl.nPPNumber).setEnd(true);
							System.out.println("you have reached to END!");
							
						
							
							break;
						}
					
				}
				
				
			}
		}
	
		
		
		//cell 체크하고 그에 맞게 플레이어 정보 업데이트 
		checkCell();
		
		
		
		MainControl.players.get(MainControl.nPPNumber).setLocation(MainControl.nPPLocation);
		
	}
		
	}
	
public static void checkCell() {
		
		
		//cell : P
		if(MainControl.map[MainControl.nPPLocation[0]][MainControl.nPPLocation[1]].getType() == 5) {
			MainControl.nPPScore ++ ;
		}
		
		
		//cell : H
		else if(MainControl.map[MainControl.nPPLocation[0]][MainControl.nPPLocation[1]].getType() == 6) {
			MainControl.nPPScore =  MainControl.nPPScore + 2;	
		}
		
		
		//cell : S
		else if(MainControl.map[MainControl.nPPLocation[0]][MainControl.nPPLocation[1]].getType() == 7) {	
			MainControl.nPPScore = MainControl.nPPScore + 3;
		}
		
		//End에 도착했다면 
		else if(MainControl.players.get(MainControl.nPPNumber).getEnd()) {
			if(MainControl.endNum == 1) {
				MainControl.nPPScore = MainControl.nPPScore + 7;
			}
			else if (MainControl.endNum == 2) {
				MainControl.nPPScore = MainControl.nPPScore + 3;
			}
			else if (MainControl.endNum == 3) {
				MainControl.nPPScore = MainControl.nPPScore + 1;
			}
			
		}
		
		// 현재 플레이어 점수 업데이트 
		MainControl.players.get(MainControl.nPPNumber).setScore(MainControl.nPPScore);
		
	}
	
	
	
}
