package com.firstprojectsb.learnspringframework;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        // var game = new SuperContraGame();
        // var game = new MarioGame();
        var game = new PacManGame();  //1: Object Creation

        var gameRunner = new GameRunner(game);  //2: Object creation + wiring of depencies

        gameRunner.run();

    }
}
