package io.tarcaye.remote.mob.shodo.trivia.runner.trivia.ugly;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Random;

public class GameGoldenMasterTest {

    private static boolean notAWinner;

    @Test
    public void golden_master_for_three_players() {
        
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        
        Random rand = new Random(1L);
        
        for (int i = 0; i < 1000; i++) {


            Players players = Players.createPlayers(List.of(
                    "Chet",
                    "Pat",
                    "Sue"));
            Game aGame = Game.createGame(players);
        
            do {
                
                aGame.roll(rand.nextInt(5) + 1);
                
                if (rand.nextInt(9) == 7) {
                    notAWinner = aGame.wrongAnswer();
                } else {
                    notAWinner = aGame.wasCorrectlyAnswered();
                }
                
            } while (notAWinner);
        }
        Approvals.verify(byteArrayOutputStream.toString());
    }


}
