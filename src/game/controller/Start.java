package game.controller;


import game.components.*;
import game.ui.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Start {

	
	
	
	
	
	//플레이어, 셀, 플레이어 수 
	
	private int numPlayers = 0;
	private static Cell[][] cells = new Cell[30][30];
	//public static ArrayList<Player> players = new ArrayList<Player>();
	
	
	
	
public Start() {
	
	Players pls = new Players();
	
	// Start 화면 출력 
	PrintStart ps = new PrintStart();
	
	ps.printStart();// 플레이어 수, 이름들 정보 받아옴 
	
	numPlayers = ps.numPlayers;
	for (int i = 0; i < ps.numPlayers; i ++ ) {
		pls.players.add(new Player(ps.playersName[i]));
	}
		
	
	
	//맵 준비 
	
	Map map = new Map();
	
	MainControl mc = new MainControl(map.cells, pls);

	
	ps.printOrder();
	
	mc.mainControl();

}
}
	

