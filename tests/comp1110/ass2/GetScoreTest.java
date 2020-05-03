package comp1110.ass2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GetScoreTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    @Test
    public void testSimpleTwoPlayer() {
        for (int i = 0; i < Utilities.PARTIAL_ADVANCED_SCORE_BOARDS.length; i++) {
            String boardString = Utilities.PARTIAL_ADVANCED_SCORE_BOARDS[i];
            int[] expected = Utilities.PARTIAL_ADVANCED_SCORES[i];
            test(expected, Metro.getScore(boardString, 2));
        }
    }

    @Test
    public void testSimpleMultiplayer() {
        int[] players = {3, 4, 5, 6};
        for (int i = 0; i < Utilities.PARTIAL_MULTIPLAYER_BOARDS.length; i++) {
            String boardString = Utilities.PARTIAL_MULTIPLAYER_BOARDS[i];
            int[] expected = Utilities.PARTIAL_MULTIPLAYER_SCORES[i];
            test(expected, Metro.getScore(boardString, players[i]));
        }
    }

    @Test
    public void testCompleteBoardsMixedPlayers() {
        for (int i = 0; i < Utilities.FULL_ADVANCED_BOARDS.length; i++) {
            String boardString = Utilities.FULL_ADVANCED_BOARDS[i];
            int[] expected = Utilities.FULL_ADVANCED_SCORES[i];
            test(expected, Metro.getScore(boardString, i + 2));
        }
    }

    // Tests the situation where a track goes directly between 2 adjacent corner stations or 2 adjacent edge stations
    // It also includes a track that goes to the middle station to check if that works (although that may be part of another test)
    @Test
    public void testCornerandEdgeSituation() {
        String boardString = "cbcb00bcbc07bcbc70dbcd77ccda73cbaa74cbaa64cbaa54";
        int[] expected = {1, 1, 7, 2, 1, 1};
        test(expected, Metro.getScore(boardString, 6));
    }

    private void test(int[] expected, int[] out) {
        assertNotNull("Expected score to be " + Arrays.toString(expected) + ", but got null", out);
        assertTrue("Expected score to be " + Arrays.toString(expected) + ", but got " + Arrays.toString(out), Arrays.equals(expected, out));
    }

}
