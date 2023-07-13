package game.ui;

import game.components.Player;

public class PrintEnd {

	Player winner;
	
	public PrintEnd() {
		
	}
	
	public PrintEnd(Player winner) {
		this.winner = winner; 
		
		System.out.println("Game finished");
		System.out.println("Winner : " + winner.getName());
		System.out.println("Score : " + winner.getScore());
		System.out.println("Congratulation");
	}
}
