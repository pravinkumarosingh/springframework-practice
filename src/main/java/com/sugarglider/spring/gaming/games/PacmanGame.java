package com.sugarglider.spring.gaming.games;

import com.sugarglider.spring.gaming.game.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    @Override
    public void go() {
        System.out.println("Pacman Running");
    }

    @Override
    public void jump() {
        System.out.println("Pacman Jumping");
    }

    @Override
    public void fire() {
        System.out.println("Pacman don't fire");
    }

    @Override
    public void stop() {
        System.out.println("Pacman Stopped");
    }

    public void eat(){
        System.out.println("Pacman Eating");
    }
}
