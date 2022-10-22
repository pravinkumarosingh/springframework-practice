package com.sugarglider.spring.gaming.games;

import com.sugarglider.spring.gaming.game.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
    @Override
    public void go() {
        System.out.println("Contra RUnning");
    }

    @Override
    public void jump() {
        System.out.println("Contra Jumping");
    }

    @Override
    public void fire() {
        System.out.println("Contra Firing");
    }

    @Override
    public void stop() {
        System.out.println("Contra Stopped");
    }
}
