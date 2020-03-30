package comp1110.ass2;
import java.util.*;

/**
 * This class represents the Players in the Metro game.
 */
public class Player {
    int players;                    // Number of players from 2 to 6
    int currentPlayer;              // Player range 0 to (players-1) i.e. 5
    String[] tileInHand;            // Tile in players hand from range 0 to (players-1) i.e. 5
    int[] totalTilesInHand;         // Total number of tiles in hand of a players from range 0 to (players-1) i.e. 5

    /**
     * The number of playing the game is taken as an input from the user.
     * Players are initialized with the current player being 1.
     */
    public Player() {
        Scanner z = new Scanner ( System.in );
        System.out.print("Enter Number of Players: ");
        players = z.nextInt();
        currentPlayer = 0;
        tileInHand = new String[players];
        totalTilesInHand = new int[players];
        for(int i = 0; i < players; i++) {
            totalTilesInHand[i] = 0;
        }
    }

    /**
     * switch the "currentPlayer" in a round robin fashion
     * Increment the currentPlayer and if it exceeds the players then bring it back to 1.
     */
    public static int switchTurn(int players, int currentPlayer) {
        // this might end up going in the viewer class depending on how the UI works
        currentPlayer++;
        if(currentPlayer >= players)
            currentPlayer = 0;
        return currentPlayer;
    }

    /**
     * Check if the player can pick the tile. That is follow the condition.
     * 1.> If both the hands are free i.e. totalTilesInHand is 0.
     * 2.> If the player have a tile in one hand. And the other is empty.  i.e. totalTilesInHand is 1.
     * If the player already have a tile in hand and pick another one from deck then place the picked tile.
     * @return true if can pickup a new tile from deck, otherwise return false.
     */
    public static boolean canPickUpTile(int[] totalTilesInHand, int currentPlayer) {
        switch ( totalTilesInHand[currentPlayer] ) {
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }
}
