package game.controller;

import java.util.Random;

import game.components.*;
import game.controller.*;
import game.run.*;
import game.ui.*;

public class RollDice {
	
	public static int diceNum;
	public static int moveNum;
	
	
	public RollDice() {
		
		diceNum = 0;
		moveNum = 0;
		
		
		//주사위 굴리기 
		Random rd2 = new Random();
		diceNum = rd2.nextInt(5) + 1;
		
		//이동 가능한 횟수 계산 
		if (diceNum - MainControl.nPPBCard > 0) {
			moveNum = diceNum - MainControl.nPPBCard;
		}
		else {
			moveNum = 0;
		}
		
		MainControl.diceNum = diceNum;
		MainControl.moveNum = moveNum;
		
		PrintRollDice prd = new PrintRollDice();
		
		
		//이동하기 
		Move mv = new Move();
		mv.move();
		
	}
}
