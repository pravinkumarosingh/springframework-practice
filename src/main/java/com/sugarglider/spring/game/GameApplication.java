package com.sugarglider.spring.game;

import com.sugarglider.spring.games.MarioGame;
import com.sugarglider.spring.games.PacmanGame;
import com.sugarglider.spring.games.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GameApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame superContraGame = new SuperContraGame();
//		PacmanGame pacmanGame = new PacmanGame();
//		GameRunner gameRunner = new GameRunner(game);
//		GameRunner gameRunner1 = new GameRunner(superContraGame);
//		GameRunner gameRunner2 = new GameRunner(pacmanGame);
		GamingConsole gamingConsole = new MarioGame();
		GameRunner gameRunner = new GameRunner(gamingConsole);

		gameRunner.run();
//		gameRunner1.run();
//		gameRunner2.run();
	}

}
