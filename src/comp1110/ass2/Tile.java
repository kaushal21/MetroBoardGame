package comp1110.ass2;
import java.util.*;

// Authorship: Kaushal Sharma, Tom Stephens


/**
 * This class represents a Tile in the Metro game.
 * The variables that are declared here are
 * 1.> "deck" - An array of string that stores all the tiles
 * 2.> "top" - location of the top most tile which is ready to be popped.
 */
public class Tile {
    public static String[] deck = new String[60];
    public static int top;

    /**
     * The implementation of the Deck is done as a Stack.
     * The constructor initializes the string with all the tiles and update the top location
     */
    public Tile() {
        top = 0;
        // These are the 5 tiles that are having 4 copies in the deck
        String[] copies4 = {"aacb", "cbaa", "acba", "baac", "aaaa"};
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                deck[top++] = copies4[j];
            }
        }
        // These are the 2 tiles that are having 3 copies in the deck
        String[] copies3 = {"cbcb", "bcbc"};
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                deck[top++] = copies3[j];
            }
        }
        // These are the 17 tiles that are having 2 copies in the deck
        String[] copies2 = {"cccc", "bbbb", "dacc", "cdac", "ccda", "accd", "dbba", "adbb", "badb", "bbad", "ddbc",
                "cddb", "bcdd", "dbcd", "adad", "dada", "dddd"};
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 17; j++) {
                deck[top++] = copies2[j];
            }
        }
        randomiseDeck();
    }

    /**
     * @return The top location of deck
     */
    public int getTop () {
        return Tile.top;
    }

    /**
     * @return The tile at passed position in deck
     */
    public static String getDeck (int pos) {
        return deck[pos];
    }


    public static String[] returnArrayDeck() {
        String[] deckArray = new String[top];
        for (int i = 0; i < top; i++) {
            deckArray[i] = getDeck(i);
        }
        return deckArray;
    }

    /**
     * Take the deck and shuffle it to create a randomized list of all the tiles
     */
    public static void randomiseDeck() {
        // Convert the Array of String into a List of String
        List<String> strList = Arrays.asList(deck);

        // Shuffle the List, that stores all the possible tiles
        Collections.shuffle(strList);

        // Copy back the shuffled List into the "initialDeck"
        deck = strList.toArray(new String[0]);
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
        return deck[--top];
    }

    /**
     * This function updated the passed deck by swapping the last location to that of string,
     * and then update the top value.
     * @param alreadyPlacedTile this is the string which is already present either in the placementSequence or totalHands.
     */
    public static void updateDeck ( String alreadyPlacedTile ) {
        // Check the complete deck from starting to the last location i.e. top
        for(int i = 0; i < Tile.top; i++) {

            // if this tile is matched with the passed tile then swap these two
            if ( Tile.deck[i].equals(alreadyPlacedTile) ) {

                // Updating the top location and storing the value in a variable.
                int lastLocation = --Tile.top;
                String temp = Tile.deck[lastLocation];
                Tile.deck[lastLocation] = Tile.deck[i];
                Tile.deck[i] = temp;
                return;
            }
        }
    }

    /**
     * @param deck the original deck
     * @return a new deck with the construction tile in it
     */
    public static String[] makeConstructionDeck(String[] deck) {
        // generates a random position in the deck for the construction tile to replace
        int rand = (int) (Math.random() * 60);

        // update the deck to contain the construction tile named "cons"
        deck[rand] = "cons";
        return deck;
    }

}

