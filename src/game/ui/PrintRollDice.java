package game.ui;

import game.*;
import game.controller.MainControl;
import game.controller.RollDice;

public class PrintRollDice {

	public PrintRollDice() {
		System.out.println("Rolling the dice . . . ");
		
		System.out.println("Dice Result : " + MainControl.diceNum);
		
		System.out.println("You can move " + MainControl.moveNum + " times");
	}
}
