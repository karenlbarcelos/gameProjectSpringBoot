package com.firstprojectsb.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (GamingConfiguration.class)){

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }


//        // var game = new SuperContraGame();
//        // var game = new MarioGame();
//        var game = new PacManGame();  //1: Object Creation
//
//        var gameRunner = new GameRunner(game);
//        //2: Object creation + wiring of depencies
//        // Game is a Dependency of GameRunner
//
//        gameRunner.run();

    }
}
