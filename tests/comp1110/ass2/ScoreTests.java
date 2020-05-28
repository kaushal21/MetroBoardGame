package comp1110.ass2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ScoreTests {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    // Tests the situation where a track goes directly between 2 adjacent corner stations or 2 adjacent edge stations
    // It also includes a track that goes to the middle station to check if that works (although that may be part of another test)
    @Test
    public void testPlayerScoreHelper() {
        String[] tileArray = {"cbcb00","bcbc07","bcbc70","dbcd77","ccda73","cbaa74","cbaa64","cbaa54"};
        int expected = 7;
        int outcome = Score.scorePlayer(2,tileArray, 6);
        assertEquals("expected player score is " + expected + " but got " + outcome , expected, outcome);
    }

    // Tests getTileAtStation
    @Test
    public void testGetTileAtStation() {
        String[] tileArray = {"cbcb00","bcbc07","bcbc70","dbcd77","ccda73","cbaa74","cbaa64","cbaa54"};
        String[] expected = {"cbcb00","bcbc07","bcbc07","bcbc70","ccda73","cbaa74"};
        String[] outcomes = {Score.getTileAtStation(8,tileArray), Score.getTileAtStation(1,tileArray)
                            ,Score.getTileAtStation(32,tileArray), Score.getTileAtStation(16,tileArray)
                            ,Score.getTileAtStation(20,tileArray), Score.getTileAtStation(21,tileArray)};
        assertSame("getTileAtStation failed to find the right tile", Arrays.equals(expected, outcomes), true);
    }

    // Tests the getNextTile function
    @Test
    public void testGetNextTile() {
        String[] tileArray = {"cbcb00","bcbc07","bcbc70","dbcd77","ccda73","cbaa74","cbaa64","cbaa54"};
        String expected = "cbaa64";
        String outcome = Score.getNextTile("cbaa74", 4, tileArray);
        assertSame("getNextTile works in the basic test case", expected, outcome);
    }

    // Tests the getOutput function
    @Test
    public void testGetOutput() {
        String tile = "accd";
        int[] possibleInputPositions = {0,2,4,6};
        int[] expectedOutputs = {5,1,3,7};
        for (int i = 0; i < possibleInputPositions.length; i++) {
            assertEquals("a tile's output must be odd", 1, Score.getOutput(tile, possibleInputPositions[i]) % 2);
            assertSame("expected result of getOutput is " + expectedOutputs[i] + " but got " + Score.getOutput(tile
                                    , possibleInputPositions[i]), expectedOutputs[i] ,Score.getOutput(tile, possibleInputPositions[i]));
        }


    }



    // Tests the getNextTile function in the case of a construction tile being the next tile
    @Test
    public void testGetNextTileWithConsTile() {
        String[] tileArray = {"cdac04","cccc14","cddb15"};
        String expected = "";
        String outcome = Score.getNextTile("cddb15", 4, tileArray);
        assertSame("when cons is the next tile getNextTile returns an empty string", expected, outcome);
    }

    // Tests the scorePlayer function in the case of a construction tile being the next tile
    @Test
    public void testPlayerScoreWithConsTile() {
        String[] tileArray = {"cdac04","cccc14","cddb15","cons05"};
        int expected = 0;
        int outcome = Score.scorePlayer(0, tileArray, 4);
        assertSame("expected score of 0 but got " + outcome, expected, outcome);
    }

}
