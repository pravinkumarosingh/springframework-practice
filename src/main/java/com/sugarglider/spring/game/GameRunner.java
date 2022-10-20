package com.sugarglider.spring.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run(){
        game.go();
        game.fire();
        game.jump();
        game.stop();
    }
}
