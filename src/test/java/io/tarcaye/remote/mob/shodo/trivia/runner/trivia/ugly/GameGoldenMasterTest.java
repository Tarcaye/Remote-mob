package io.tarcaye.remote.mob.shodo.trivia.runner.trivia.ugly;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class GameGoldenMasterTest {

    private static boolean notAWinner;

    @Test
    public void golden_master_for_three_players() {
        
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        
        Random rand = new Random(1L);
        
        for (int i = 0; i < 1000; i++) {
        
            Game aGame = Game.createGame(List.of("Chet", "Pat", "Sue"));
        
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
