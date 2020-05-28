package comp1110.ass2;

import com.sun.webkit.network.Util;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static org.junit.Assert.*;

//Authorship: Kyle Robertson, Tom Stephens

public class PlayerTests {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    private void test(String piecePlacement, Boolean expected) {
        boolean out = Metro.isPiecePlacementWellFormed(piecePlacement);
        assertEquals("expected " + expected + " for piece placement: " + piecePlacement +
                ", but got " + out, out, expected);
    }

    //Test to see if the correct stations have been assigned to each player depending on the amount of players in the
    // in the game.
    @Test
    public void testStationAllocation(){
        for (int i = 2; i <= 6; i++){ //Loops through all possible station allocation.
            int[][] stationExpected = Utilities.FULL_STATION_LOCATION[i-2]; //FULL_STATION_LOCATION is a collection of all stations locations.
            int[][] stationOutcome = Player.allocateStations(i);
            assertNotNull("Expected station allocation :" + Arrays.deepToString(stationExpected) + " instead got null" ,stationOutcome);
            assertTrue("Expected station allocation: " + Arrays.deepToString(stationExpected) + " but got " + Arrays.deepToString(stationOutcome)
                    , Arrays.deepEquals(stationExpected, stationOutcome));
        }
    }
    @Test
    //Test to see if the stations are assigned to the correct player.
    public void testStationReturn(){
        for(int i = 0; i <= 4; i++){
            int numberOfPlayer = i + 2;
            int[] playerExpected = Utilities.FULL_STATION_LOCATION[i][i];
            int[] playerOutcome = Player.getStations(i,numberOfPlayer);
            assertNotNull("Expected stations for player 2: "  + Arrays.toString(playerExpected) + "instead got null", playerOutcome);
            assertArrayEquals("Expected stations for player 2" + Arrays.toString(playerExpected) + " instead got" + Arrays.toString(playerOutcome), playerExpected, playerOutcome);
        }
    }

    @Test
    public void testRandomBotMove(){
        //output should be a tile and a position so a string of length 6
        Tile tile = new Tile();
        String a = tile.deckNew.get(tile.deckNew.size() - 1);
        assertEquals("expected the output to be a string of length 6", 6, OpponentAI.randomBotMove("aaaa00bbbb20", a).length());
        // Tests that full board strings wont return a possible move.
        for (String completeString : Utilities.COMPLETE_BOARDSTRINGS) {
            assertEquals("Expected result to be 'no moves left'", "No possible moves", OpponentAI.randomBotMove(completeString, a));
        }

    }


}
