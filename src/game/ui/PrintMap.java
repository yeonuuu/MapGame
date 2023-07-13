package game.ui;

import game.components.*;
import game.controller.*;
import game.run.*;
import game.ui.*;

public class PrintMap {
	
	public static Cell[][] map;
	
	
	public PrintMap(){
		
	}
	
	public PrintMap(Cell[][] map) {
		this.map = map;
	}
	
public static void printMap() {
	
		
		int n; // 특정 셀에 위치한 플레이어 수 
		
		for (int i = 0; i < map.length;i++) {
			for (int j = 0; j<map[0].length;j++) {
				if(map[i][j] != null) {
					n = 0;
					
					System.out.print(map[i][j].getName());
					
					for(int k=0;k<MainControl.playersNum;k++) {
						
						if(i == MainControl.locations[k][0] && j == MainControl.locations[k][1]) {
							System.out.print(k+1 + "");
							n ++;
						}
						}
						
						if(n == 0 ) {
							System.out.print("     ");				
						}
						if (n==1) {
							System.out.print("    ");
							
						}
						if(n==2) {
							System.out.print("   ");
						}
						
						if(n==3) {
							System.out.print("  ");
						}
						if(n==4) {
							System.out.print(" ");
						}
						
					}
					
				
				
				else {
					System.out.print("      ");
				}
					
			}
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
		
	}
	


}
