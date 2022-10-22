package com.sugarglider.spring.gaming.games;

import com.sugarglider.spring.gaming.game.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {


    @Override
    public void go() {
        System.out.println("Mario Running");
    }

    @Override
    public void jump() {
        System.out.println("Mario Jumping");
    }

    @Override
    public void fire() {
        System.out.println("Mario Firing");
    }

    @Override
    public void stop() {
        System.out.println("Mario Stopped");
    }
}
