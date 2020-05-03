package comp1110.ass2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static org.junit.Assert.*;

public class OurTests {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    // Tests the situation where a track goes directly between 2 adjacent corner stations or 2 adjacent edge stations
    // It also includes a track that goes to the middle station to check if that works (although that may be part of another test)
    @Test
    public void testPlayerScoreHelper() {
        String[] tileArray = {"cbcb00","bcbc07","bcbc70","dbcd77","ccda73","cbaa74","cbaa64","cbaa54"};
        int expected = 7;
        int outcome = Score.scorePlayer(2,tileArray, 6);
        assertTrue("expected outcome is achieved", expected == outcome);
    }

    // Tests the getNextTile function in Score.java
    @Test
    public void testGetNextTile() {
        String[] tileArray = {"cbcb00","bcbc07","bcbc70","dbcd77","ccda73","cbaa74","cbaa64","cbaa54"};
        String expected = "cbaa64";
        String outcome = Score.getNextTile("cbaa74", 4, tileArray);
        assertTrue("expected outcome is achieved", expected == outcome);
    }

    private void test(int[] expected, int[] out) {
        assertNotNull("Expected score to be " + Arrays.toString(expected) + ", but got null", out);
        assertTrue("Expected score to be " + Arrays.toString(expected) + ", but got " + Arrays.toString(out), Arrays.equals(expected, out));
    }

}
