package metroGame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represents a Tile in the Metro game.
 * The variables that are declared here are
 * 1.> "deck" - An array of string that stores all the tiles
 * 2.> "top" - location of the top most tile which is ready to be popped.
 */
public class Tile {
    public static int top;
    public static ArrayList<String> deck = new ArrayList<>();

    /**
     * The implementation of the Deck is done as a Stack.
     * The constructor initializes the string with all the tiles and update the top location
     */
    public Tile() {
        top = 0;
        // These are the 5 tiles that are having 4 copies in the deck
        String[] copies4 = {"aacb", "cbaa", "acba", "baac", "aaaa"};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                deck.add(copies4[j]);
            }
        }
        // These are the 2 tiles that are having 3 copies in the deck
        String[] copies3 = {"cbcb", "bcbc"};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                deck.add(copies3[j]);
            }
        }
        // These are the 17 tiles that are having 2 copies in the deck
        String[] copies2 = {"cccc", "bbbb", "dacc", "cdac", "ccda", "accd", "dbba", "adbb", "badb", "bbad", "ddbc",
                "cddb", "bcdd", "dbcd", "adad", "dada", "dddd"};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 17; j++) {
                deck.add(copies2[j]);
            }
        }
        Collections.shuffle(deck);
    }

    /**
     * @return The top location of deck
     */
    public static int getTop() {
        return Tile.top;
    }

    /**
     * @return The tile at passed position in deck
     */
    public static String getDeck(int pos) {
        return deck.get(pos);
    }

    /**
     * Check for the termination condition of the deck i.e.
     * if there is nothing in deck i.e. top = 0.
     * @return true if the deck is not empty, otherwise return false.
     */
    public boolean checkDeckNonEmpty() {
        return top > 0;
    }

    /**
     * Take one tile out of deck.
     * if "top" is 0 then it returns error.
     * @return the top most tile in the deck. Reduce the top by 1.
     */
    public String pop() {
        return deck.remove(deck.size()-1);
    }

    /**
     * This function updated the passed deck by swapping the last location to that of string,
     * and then update the top value.
     *
     * @param alreadyPlacedTile this is the string which is already present either in the placementSequence or totalHands.
     */
    public static void updateDeck(String alreadyPlacedTile) {
        // Check the complete deck from starting to the last location i.e. top
        for (int i = 0; i < Tile.top; i++) {

            // if this tile is matched with the passed tile then swap these two
            if (Tile.deck.get(i).equals(alreadyPlacedTile)) {

                // Updating the top location and storing the value in a variable.
                int lastLocation = top-1;
                String temp = Tile.deck.get(lastLocation);
                Tile.deck.set(lastLocation, Tile.deck.get(i));
                Tile.deck.set(i, temp);
                return;
            }
        }
    }
}

