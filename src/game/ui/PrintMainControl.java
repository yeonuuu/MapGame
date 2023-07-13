package game.ui;

import java.util.Scanner;

import game.components.*;
import game.controller.*;
import game.run.*;
import game.ui.*;

public class PrintMainControl {
	public int playOrNot;
	public Scanner scanner;
	
	
	public PrintMainControl() {
		playOrNot = 0;
		scanner = new Scanner(System.in);
		

		//현재 플레이어 정보 출력 
		System.out.println("Now playing : " + MainControl.players.get(MainControl.nPPNumber).getName() );
		System.out.println("Number of Bridge card : " + MainControl.nPPBCard);
		System.out.println("Current score : " + MainControl.nPPScore);
		
		
		//플레이 할 지 말지 물어봄 
		System.out.println("Roll the dice? (Yes : 1, No : 2)");
		Scanner scanner = new Scanner(System.in);
		playOrNot = scanner.nextInt();
		MainControl.playOrNot = playOrNot;
	}

}
