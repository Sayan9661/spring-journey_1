package com.sayan.learningspring;

import com.sayan.learningspring.game.GameRunner;
import com.sayan.learningspring.game.MarioGame;
import com.sayan.learningspring.game.PacManGame;
import com.sayan.learningspring.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//		var game= new MarioGame();
//		var game=new SuperContraGame();
		var game = new PacManGame();
		var gameRunner=new GameRunner(game);
		gameRunner.run();
	}

}
