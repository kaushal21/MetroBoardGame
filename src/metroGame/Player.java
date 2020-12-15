package metroGame;

/**
 * This class represents the Players in the Metro game.
 */

public class Player {
    public static int players;                      // Number of players from 2 to 6
    static int[][] stations;                        // Stations allocated to the players
    static int currentPlayer;                       // Player range 0 to (players-1) i.e. 5
    String[] tileInHand;                            // For all the players it Stores the tile in hand of the players
    int[] playerTiles;

    /**
     * The number of playing the game is taken as an input from the user.
     * Players are initialized with the current player being Player being 1.
     */
    public Player(int n) {
        players = n;
        currentPlayer = 0;
        tileInHand = new String[players];
        for(int i = 0; i < players; i++) {
            tileInHand[i] = null;
        }
        stations = allocateStations(players);
    }

    /**
     * It allocates the stations to the players depending upon the number of players
     * 2 players:
     * player 1 owns 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31
     * player 2 owns 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32
     *
     * 3 players:
     * player 1 owns 1, 4, 6, 11, 15, 20, 23, 25, 28, 31
     * player 2 owns 2, 7, 9, 12, 14, 19, 22, 27, 29, 32
     * player 3 owns 3, 5, 8, 10, 13, 18, 21, 24, 26, 30
     *
     * 4 players:
     * player 1 owns 4, 7, 11, 16, 20, 23, 27, 32
     * player 2 owns 3, 8, 12, 15, 19, 24, 28, 31
     * player 3 owns 1, 6, 10, 13, 18, 21, 25, 30
     * player 4 owns 2, 5,  9, 14, 17, 22, 26, 29
     *
     * 5 players:
     * player 1 owns 1, 5, 10, 14, 22, 28
     * player 2 owns 6, 12, 18, 23, 27, 32
     * player 3 owns 3, 7, 15, 19, 25, 29
     * player 4 owns 2, 9, 13, 21, 26, 30
     * player 5 owns 4, 8, 11, 20, 24, 31
     *
     * 6 players:
     * player 1 owns 1, 5, 10, 19, 27
     * player 2 owns 2, 11, 18, 25, 29
     * player 3 owns 4, 8, 14, 21, 26
     * player 4 owns 6, 15, 20, 24, 31
     * player 5 owns 3, 9, 13, 23, 30
     * player 6 owns 7, 12, 22, 28, 32
     */
    public static int[][] allocateStations(int players) {
        switch ( players ) {
            case 2:
                int[][] s2 = new int[2][];
                s2[0] = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31};
                s2[1] = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32};
                return s2;
            case 3:
                int[][] s3 = new int[3][];
                s3[0] = new int[]{1, 4, 6, 11, 15, 20, 23, 25, 28, 31};
                s3[1] = new int[]{2, 7, 9, 12, 14, 19, 22, 27, 29, 32};
                s3[2] = new int[]{3, 5, 8, 10, 13, 18, 21, 24, 26, 30};
                return s3;
            case 4:
                int[][] s4 = new int[4][];
                s4[0] = new int[]{4, 7, 11, 16, 20, 23, 27, 32};
                s4[1] = new int[]{3, 8, 12, 15, 19, 24, 28, 31};
                s4[2] = new int[]{1, 6, 10, 13, 18, 21, 25, 30};
                s4[3] = new int[]{2, 5,  9, 14, 17, 22, 26, 29};
                return s4;
            case 5:
                int[][] s5 = new int[5][];
                s5[0] = new int[]{1, 5, 10, 14, 22, 28};
                s5[1] = new int[]{6, 12, 18, 23, 27, 32};
                s5[2] = new int[]{3, 7, 15, 19, 25, 29};
                s5[3] = new int[]{2, 9, 13, 21, 26, 30};
                s5[4] = new int[]{4, 8, 11, 20, 24, 31};
                return s5;
            case 6:
                int[][] s6 = new int[6][];
                s6[0] = new int[]{1, 5, 10, 19, 27};
                s6[1] = new int[]{2, 11, 18, 25, 29};
                s6[2] = new int[]{4, 8, 14, 21, 26};
                s6[3] = new int[]{6, 15, 20, 24, 31};
                s6[4] = new int[]{3, 9, 13, 23, 30};
                s6[5] = new int[]{7, 12, 22, 28, 32};
                return s6;
        }
        return null;
    }

    /**
     * @return It returns the number of players in the Metro game
     */
    public int getPlayers () {
        return players;
    }

    /**
     * @return It return the currentPlayer.
     */
    public static int getCurrentPlayer() {
        return currentPlayer;
    }

    /**
     * @param currentPlayer the currentPlayer for which we need to check the hand
     * @return String value i.e. the tile in Hand of the current player.
     */
    public String getTileInHand (int currentPlayer) {
        return tileInHand[currentPlayer];
    }

    /**
     * @param player the player whose stations we want
     * @return the stations that are allocated to them in a integer array
     */
    public static int[] getStations(int player, int players) {
        return allocateStations(players)[player];
    }

    /**
     * @param currentPlayer The current Player for which we are storing the tile
     * @param tile the Tile which is picked from the deck, and player is keeping it in his/her hand
     */
    public void setTileInHand (int currentPlayer, String tile) {
        tileInHand[currentPlayer] = tile;
    }

    /**
     * switch the "currentPlayer" in a round robin fashion
     * Increment the currentPlayer and if it exceeds the players then bring it back to 1.
     */
    public int switchTurn() {
        // this might end up going in the viewer class depending on how the UI works
        currentPlayer++;
        if(currentPlayer == players) {
            currentPlayer = 0;
        }
        return currentPlayer;
    }
}



