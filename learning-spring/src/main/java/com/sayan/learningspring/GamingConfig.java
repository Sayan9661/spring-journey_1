package com.sayan.learningspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sayan.learningspring.game.GameRunner;
import com.sayan.learningspring.game.GamingConsole;
import com.sayan.learningspring.game.PacManGame;

@Configuration
public class GamingConfig {
	
	@Bean
	public GamingConsole game() {
		var game=new PacManGame();
		return game;
		
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}
	

}
