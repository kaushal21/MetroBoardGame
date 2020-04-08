package comp1110.ass2;
import java.util.*;

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
     * @return true if the deck is empty, otherwise return false.
     */
    public static boolean checkDeckEmpty() {
        return top > 0;
    }

    /**
     * Take one tile out of deck.
     * if "top" is 0 then it returns error.
     * @return the top most tile in the deck. Reduce the top by 1.
     */
    public static String pop() {
        return deck[--top];
    }

    /*
    public static void main(String[] args) {
        // Used to create the Constructor. That initialize the deck with all the tiles.
        Tile n = new Tile();

        // Randomize the deck of tiles
        n.randomiseDeck();

        // pop the last tile from the deck
        String last = n.pop();
        System.out.println(n.top);
        System.out.println(last);
        last = n.pop();
        System.out.println(n.top);
        System.out.println(last);
    }
    */
}




