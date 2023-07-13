package game.ui;

import java.util.Scanner;

import game.components.*;
import game.controller.*;
import game.run.*;


public class PrintStart {
	
	public static int numPlayers; // 플레이어 수 
	public static String[] playersName; // 플레이어들 이름 저장하는 배열 


	public PrintStart() {
		this.numPlayers = 0;
		this.playersName = null;

	}
	
	public void printStart() {
		
		
		
		
		System.out.println("Welcome to the game!");
		
		System.out.println("Enter the number of players (2~4)");
		Scanner scan = new Scanner(System.in);
		numPlayers = scan.nextInt();
		playersName = new String[numPlayers];
		
		for(int i=0; i<numPlayers; i++) { 
		System.out.println("enter the " + (i+1) + " player's name");
			
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		playersName[i] = name;
		
	
	}
		
		
		
	
	
	
}
	
	public void printOrder() {
		
		System.out.println("Order is");
		for(int i=0; i< MainControl.players.size(); i ++ ) {
			System.out.println((i+1)+" : " + MainControl.players.get(i).getName());
		}
		
	}
	
}
