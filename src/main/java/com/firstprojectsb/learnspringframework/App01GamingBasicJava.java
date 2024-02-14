package com.firstprojectsb.learnspringframework;

import com.firstprojectsb.learnspringframework.game.GameRunner;
import com.firstprojectsb.learnspringframework.game.PacManGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        // var game = new SuperContraGame();
        // var game = new MarioGame();
        var game = new PacManGame();  //1: Object Creation

        var gameRunner = new GameRunner(game);
            //2: Object creation + wiring of depencies
            // Game is a Dependency of GameRunner

        gameRunner.run();

    }
}
