package com.sayan.learningspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sayan.learningspring.game.GameRunner;
import com.sayan.learningspring.game.GamingConsole;
import com.sayan.learningspring.game.MarioGame;
import com.sayan.learningspring.game.PacManGame;
import com.sayan.learningspring.game.SuperContraGame;

public class App3GamingSpringBeans {

	
	public static void main(String[] args) {
		
	try(var context= new AnnotationConfigApplicationContext(GamingConfig.class)){
		context.getBean(GamingConsole.class).up();
		
		context.getBean(GameRunner.class).run();
	}
	
	}

}
