package io.tarcaye.remote.mob.shodo.trivia.runner.trivia.runner;

import io.tarcaye.remote.mob.shodo.trivia.runner.trivia.ugly.Game;
import io.tarcaye.remote.mob.shodo.trivia.runner.trivia.ugly.Players;

import java.util.List;
import java.util.Random;

public class GameRunner {

    private static boolean notAWinner;

    public static void main(String[] args) {
        Players players = Players.createPlayers(List.of(
                "Chet",
                "Pat",
                "Sue"));
        Game aGame = Game.createGame(players);
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
