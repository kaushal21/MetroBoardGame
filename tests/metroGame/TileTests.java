package metroGame;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TileTests {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    private void test(String piecePlacement, Boolean expected) {
        boolean out = Metro.isPiecePlacementWellFormed(piecePlacement);
        assertEquals("expected " + expected + " for piece placement: " + piecePlacement +
                ", but got " + out, out, expected);
    }

    public static final String[] TEST_DECK = {"cbaa", "ccda", "aaaa", "dacc", "adbb", "cbaa", "acba", "ddbc", "cccc", "cddb", "bcbc", "cdac", "dada", "dddd", "aacb", "aacb", "cddb", "cbcb", "cbaa", "ccda", "dada", "baac", "badb", "baac", "accd", "aaaa", "acba", "adbb", "bbad", "dacc", "aacb", "bcdd", "dbcd", "ddbc", "aaaa", "badb", "cbaa", "baac", "cccc", "bcdd", "accd", "dbba", "acba", "cbcb", "baac", "cbcb", "adad", "cdac", "bbad", "dbcd", "bbbb", "dbba", "dddd", "adad", "bcbc", "bbbb", "aaaa", "aacb", "bcbc", "acba"};

    // This test is to check if the top tile is popped out or not
    @Test
    public void testPop() {
        for(int i = 0; i < Utilities.VALID_SMALL_BOARDSTRINGS.length; i++) {
            Tile tile = new Tile();
            for(int j = 0; j < Utilities.VALID_SMALL_BOARDSTRINGS[i].length() / 6; j++) {
                String placedTiles = Utilities.VALID_SMALL_BOARDSTRINGS[i].substring(j*6, (j*6)+6);
                placedTiles = placedTiles.substring(0, 4);
                Tile.updateDeck(placedTiles);
            }
            String topDeck = Tile.getDeck(tile.getTop()-1);
            String poppedTile = tile.pop();
            assertNotNull("Expected popped tile to be "+topDeck+" but got NULL",poppedTile);
            assertEquals("Expected Tile: " + topDeck + " But Got This: " + poppedTile, topDeck, poppedTile);
        }
        for(int i = 0; i < Utilities.VALID_MEDIUM_BOARDSTRINGS.length; i++) {
            Tile tile = new Tile();
            for(int j = 0; j < Utilities.VALID_MEDIUM_BOARDSTRINGS[i].length() / 6; j++) {
                String placedTiles = Utilities.VALID_MEDIUM_BOARDSTRINGS[i].substring(j*6, (j*6)+6);
                placedTiles = placedTiles.substring(0, 4);
                Tile.updateDeck(placedTiles);
            }
            String topDeck = Tile.getDeck(tile.getTop()-1);
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
        assertTrue("Expected true but got "+tile.checkDeckNonEmpty(), tile.checkDeckNonEmpty());

        // Check for empty deck
        for(int i = 0; i < Utilities.COMPLETE_BOARDSTRINGS.length; i++) {
            Tile lastTile = new Tile();
            for(int j = 0; j < Utilities.COMPLETE_BOARDSTRINGS[i].length() / 6; j++) {
                String placedTiles = Utilities.COMPLETE_BOARDSTRINGS[i].substring(j*6, (j*6)+6);
                placedTiles = placedTiles.substring(0, 4);
                Tile.updateDeck(placedTiles);
            }
            assertFalse("Expected false but got "+lastTile.checkDeckNonEmpty(), lastTile.checkDeckNonEmpty());
        }
    }

    // This Test is to check the deckNew is working properly or not
    @Test
    public void testDeckNew() {
        Tile tile = new Tile();

        // Check the Size of the deck
        assertTrue("Deck Length is "+tile.deckNew.size()+" instead of 60", tile.deckNew.size() == 60);

        // Check for the top of Deck
        assertTrue("Got Top Of Deck as "+tile.deckNew.get(tile.deckNew.size()-1), tile.deckNew.get(tile.deckNew.size()-1) == tile.deckNew.remove(tile.deckNew.size()-1));

    }

    /*
    // This test is to check that the construction deck is being made properly
    @Test
    public void testMakeConstructionDeck() {
        new Test1();
        assertNotEquals(Tile.deck, Tile.makeConstructionDeck(Tile.deck));
        boolean b = false;
        for (String s : Tile.makeConstructionDeck(Tile.deck)) {
            if (s.equals("cons")) {
                b = true;
                break;
            }
        }
        assertTrue(b);
    }
    */
}
