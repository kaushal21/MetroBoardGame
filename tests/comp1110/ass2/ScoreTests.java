package comp1110.ass2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class ScoreTests {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    private void test(String piecePlacement, Boolean expected) {
        boolean out = Metro.isPiecePlacementWellFormed(piecePlacement);
        assertEquals("expected " + expected + " for piece placement: " + piecePlacement +
                ", but got " + out, out, (boolean) expected);
    }

    // Tests the situation where a track goes directly between 2 adjacent corner stations or 2 adjacent edge stations
    // It also includes a track that goes to the middle station to check if that works (although that may be part of another test)
    @Test
    public void testPlayerScoreHelper() {
        String[] tileArray = {"cbcb00","bcbc07","bcbc70","dbcd77","ccda73","cbaa74","cbaa64","cbaa54"};
        int expected = 7;
        int outcome = Score.scorePlayer(2,tileArray, 6);
        assertEquals("expected outcome is achieved", expected, outcome);
    }

    // Tests the getNextTile function in Score.java
    @Test
    public void testGetNextTile() {
        String[] tileArray = {"cbcb00","bcbc07","bcbc70","dbcd77","ccda73","cbaa74","cbaa64","cbaa54"};
        String expected = "cbaa64";
        String outcome = Score.getNextTile("cbaa74", 4, tileArray);
        assertSame("expected outcome is achieved", expected, outcome);
    }
}
