package io.tarcaye.remote.mob.shodo.trivia.runner.trivia.runner;

import io.tarcaye.remote.mob.shodo.trivia.runner.trivia.ugly.Game;

import java.util.List;
import java.util.Random;

public class GameRunner {

    private static boolean notAWinner;

    public static void main(String[] args) {
        Game aGame = Game.createGame(List.of("Chet", "Pat", "Sue"));
        Random rand = new Random();

        do {

            aGame.roll(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                notAWinner = aGame.wrongAnswer();
            } else {
                notAWinner = aGame.wasCorrectlyAnswered();
            }


        } while (notAWinner);

    }
}
