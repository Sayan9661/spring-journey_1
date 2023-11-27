package buisinessCalculation;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sayan.learningspring.game.GameRunner;
import com.sayan.learningspring.game.GamingConsole;
import com.sayan.learningspring.game.MarioGame;
import com.sayan.learningspring.game.PacManGame;
import com.sayan.learningspring.game.SuperContraGame;

@Configuration
@ComponentScan
public class SpringContextBuisnessLauncher {

	
	public static void main(String[] args) {
		
	try(var context= new AnnotationConfigApplicationContext(SpringContextBuisnessLauncher.class)){
		
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
	System.out.println(context.getBean(BuisinessService.class).findMax());
	
	
	}
	
	}

}
