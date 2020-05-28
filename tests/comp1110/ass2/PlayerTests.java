package comp1110.ass2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PlayerTests {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    private void test(String piecePlacement, Boolean expected) {
        boolean out = Metro.isPiecePlacementWellFormed(piecePlacement);
        assertEquals("expected " + expected + " for piece placement: " + piecePlacement +
                ", but got " + out, out, (boolean) expected);
    }

    //Test to see if the correct stations have been assigned to each player depending on the amount of players in the
    // in the game.
    @Test
    public void testStationAllocation(){
        int NumOfPlayers = 3;
        int[][] stationExpected = {{1, 4, 6, 11, 15, 20, 23, 25, 28, 31},{2, 7, 9, 12, 14, 19, 22, 27, 29, 32},{3, 5, 8, 10, 13, 18, 21, 24, 26, 30}};
        int[][] stationOutcome = Player.allocateStations(NumOfPlayers);
        assertNotNull("Expected station allocation :" + Arrays.deepToString(stationExpected) + " instead got null" ,stationOutcome);
        assertTrue("Expected station allocation: " + Arrays.deepToString(stationExpected) + " but got " + Arrays.deepToString(stationOutcome)
                , Arrays.deepEquals(stationExpected, stationOutcome));

    }
    @Test
    //Test to see if the stations are assigned to the correct player.
    public void testStationReturn(){
        int playerNumber = 2;
        int playerPosition = playerNumber - 1;
        int numberOfPlayers = 4;
        int [] playerExpected = {3, 8, 12, 15, 19, 24, 28, 31};
        int [] playerOutcome = Player.getStations(playerPosition,numberOfPlayers);
        assertNotNull("Expected stations for player 2: "  + Arrays.toString(playerExpected) + "instead got null", playerOutcome);
        assertArrayEquals("Expected stations for player 2" + Arrays.toString(playerExpected) + " instead got" + Arrays.toString(playerOutcome), playerExpected, playerOutcome);
    }


    @Test
    public void testRandomBotMove(){
        // output should be a tile and a position so a string of length 6
        assertTrue("expected the output to be a string of length 6", OpponentAI.randomBotMove("aaaa00bbbb20",Tile.getDeck(Tile.getTop())).length() == 6);
        // Tests that full board strings wont return a possible move.
        for (String completeString : Utilities.COMPLETE_BOARDSTRINGS) {
            assertTrue("Expected result to be 'no moves left'", OpponentAI.randomBotMove(completeString,Tile.getDeck(Tile.getTop())).equals("No possible moves"));
        }
        // Tests that the method outputs a well formed piece placement
        test(OpponentAI.randomBotMove("aaaa00bbbb20",Tile.getDeck(Tile.getTop())), true);

    }


}
