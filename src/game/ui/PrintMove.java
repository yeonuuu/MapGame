package game.ui;

import java.util.Scanner;

import game.components.*;
import game.controller.Move;


public class PrintMove {
	
	public static String direction;

	public PrintMove(){
		
		
		direction = null;
		
		System.out.println("Enter your direction");
		Scanner scanner = new Scanner(System.in);
		direction = scanner.next();
		
		Move.direction = direction;
		
	}
	
}
