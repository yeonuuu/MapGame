package game.controller;

import game.components.*;
import game.controller.*;
import game.run.*;
import game.ui.*;

public class End {

	Player winner;
	
	public End(){

		Player winner = null;
		
		
		// 승자 선정 
		winner = MainControl.players.get(0);
		for (int i=0; i<MainControl.players.size(); i ++) {
			if(winner.getScore() < MainControl.players.get(i).getScore()) {
				winner = MainControl.players.get(i);
			}
		}
		
		PrintEnd pe = new PrintEnd(winner);

	}
	}
	
