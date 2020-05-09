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

    //Test to see if the correct stations have been assigned to each player depending on the amount of players in the
    // in the game.
    @Test
    public void testStationAlllocation(){
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
        assertTrue("Expected stations for player 2" + Arrays.toString(playerExpected) + " instead got" + Arrays.toString(playerOutcome)
                ,Arrays.equals(playerExpected,playerOutcome));


    }

    // This test is to check if the top tile is popped out or not
    @Test
    public void testPop() {
        for(int i = 0; i < Utilities.VALID_SMALL_BOARDSTRINGS.length; i++) {
            Tile tile = new Tile();
            for(int j = 0; j < Utilities.VALID_SMALL_BOARDSTRINGS[i].length() / 6; j++) {
                String placedTiles = Utilities.VALID_SMALL_BOARDSTRINGS[i].substring(j*6, (j*6)+6);
                placedTiles = placedTiles.substring(0, 4);
                tile.updateDeck(placedTiles);
            }
            String topDeck = tile.getDeck(tile.getTop()-1);
            String poppedTile = tile.pop();
            assertNotNull("Expected popped tile to be "+topDeck+" but got NULL",poppedTile);
            assertEquals("Expected Tile: " + topDeck + " But Got This: " + poppedTile, topDeck, poppedTile);
        }
        for(int i = 0; i < Utilities.VALID_MEDIUM_BOARDSTRINGS.length; i++) {
            Tile tile = new Tile();
            for(int j = 0; j < Utilities.VALID_MEDIUM_BOARDSTRINGS[i].length() / 6; j++) {
                String placedTiles = Utilities.VALID_MEDIUM_BOARDSTRINGS[i].substring(j*6, (j*6)+6);
                placedTiles = placedTiles.substring(0, 4);
                tile.updateDeck(placedTiles);
            }
            String topDeck = tile.getDeck(tile.getTop()-1);
            String poppedTile = tile.pop();
            assertNotNull("Expected popped tile to be "+topDeck+" but got NULL",poppedTile);
            assertEquals("Expected Tile: " + topDeck + " But Got This: " + poppedTile, topDeck, poppedTile);
        }
    }

    // This test is to check if the deck is Empty or not
    @Test
    public void testCheckDeckEmpty() {
        Tile tile = new Tile();
        // Check for the initialized Deck
        assertTrue("Expected true but got "+tile.checkDeckEmpty(), tile.checkDeckEmpty());

        // Check for empty deck
        for(int i = 0; i < Utilities.COMPLETE_BOARDSTRINGS.length; i++) {
            Tile lastTile = new Tile();
            for(int j = 0; j < Utilities.COMPLETE_BOARDSTRINGS[i].length() / 6; j++) {
                String placedTiles = Utilities.COMPLETE_BOARDSTRINGS[i].substring(j*6, (j*6)+6);
                placedTiles = placedTiles.substring(0, 4);
                lastTile.updateDeck(placedTiles);
            }
            assertFalse("Expected false but got "+lastTile.checkDeckEmpty(), lastTile.checkDeckEmpty());
        }
    }
    @Test
    public void testGenerateMoveHelpers() {
        int Y = 0;
        int X = 0;
        String piece = "cbaa";
        assertTrue("Expected true but got " + Move.atStation2(piece, Y, X), Move.atStation2(piece, Y, X));
        assertFalse("Expected False but got " + Move.atMiddle(Y, X), Move.atMiddle(Y, X));
    }
}
