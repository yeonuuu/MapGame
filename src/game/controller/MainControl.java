package game.controller;

import game.components.*;
import game.ui.PrintMainControl;
import game.ui.PrintMap;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Integer;

public class MainControl {
	
	public static Cell[][] map; // 지도 
	public static int nPPNumber; // 현재 플레이중인 플레이어의 번호 
	public static int [] nPPLocation; // 현재 플레이중인 플레이어의 위치 
	public static int playersNum; // 총 플레이어 수 
	public static int[][] locations; // 모든 플레이어의 위치 저장하는 2차원 배열 
	public static int diceNum; // 주사위 굴려 나온 번호 
	public static int nPPBCard;// 현재 플레이중인 플레이어의 다리 카드 개수 
	public static int nPPScore; // 현재 플레이중인 플레이어의 현재 점수 
	public static int playOrNot; // 1: Play, 2: not
	public static int moveNum; // 현재 턴에 움직일 수 있는 횟수 (주사위 - 다리카드)
	public static int endNum; // END 통과한 플레이어 수 
	public static PrintMap pm;
	public static ArrayList<Player> players ;
	
	

	
	
	public MainControl() {
		
	}
	
	
	public MainControl(Cell[][] map, Players pls) {
		this.map = map;
		players = pls.players;
		playersNum = players.size();
		locations = new int[playersNum][2];
		nPPNumber = 0;
		endNum = 0;
		pm = new PrintMap(map);
		
	}
	
	
	
	
	
	public static void mainControl() {
		
		
		for(int i=0;i<playersNum;i++) {
			locations[i][0] = players.get(i).getLocation()[0];
			locations[i][1] = players.get(i).getLocation()[1];
			
		}
		
		
		//맵 출력 
		
		PrintMap.printMap();
		
		//현재 플레이어 정보 불러오기 
		nPPBCard = players.get(nPPNumber).getBCard();
		nPPScore = players.get(nPPNumber).getScore();
		
		
	
		
		
		
		
		
		PrintMainControl pmg = new PrintMainControl();
		
		//플레이 한다고 하면 
		if(playOrNot == 1) {
			RollDice rd = new RollDice(); // 주사위 굴리기 
			
		}
		
		//플레이 안 한다고 하면 
		else {
			if(players.get(nPPNumber).getBCard() > 0) {
				players.get(nPPNumber).setBCard(players.get(nPPNumber).getBCard()-1);
			}
		}
		
		
		
		//END 플레이어 수 체크 
		// 1명만 남은 경우 
		if(players.size() - endNum < 2) {
			
		//게임 종료 
		End end = new End();
			
		}
		
		
		//한 명 이상 남은 경우 
		else {
		
		//다음 턴으로 넘김 
		
		while(players.get((nPPNumber + 1)% players.size()).getEnd()) {	
		nPPNumber = (nPPNumber +1) % players.size();
		}
		
		nPPNumber = (nPPNumber +1) % players.size();

		//다음 라운드 시작 
		mainControl();
		
		
		}
	}
	
	
		

	
	
	
	
}
	

