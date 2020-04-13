package comp1110.ass2;

/**
 * This class represents the Players in the Metro game.
 */
public class Player {
    int players;                    // Number of players from 2 to 6
    int[][] stations;               // Stations allocated to the players
    int currentPlayer;              // Player range 0 to (players-1) i.e. 5
    String[] tileInHand;            // For all the players it Stores the tile in hand of the players

    /**
     * The number of playing the game is taken as an input from the user.
     * Players are initialized with the current player being 1.
     */
    public Player(int n) {
        players = n;
        currentPlayer = 0;
        tileInHand = new String[players];
        for(int i = 0; i < players; i++) {
            tileInHand[i] = null;
        }
        allocateStations(players);
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
    public void allocateStations(int players) {
        switch ( players ) {
            case 2:
                stations = new int[2][];
                stations[0] = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31};
                stations[1] = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32};
                break;
            case 3:
                stations = new int[3][];
                stations[0] = new int[]{1, 4, 6, 11, 15, 20, 23, 25, 28, 31};
                stations[1] = new int[]{2, 7, 9, 12, 14, 19, 22, 27, 29, 32};
                stations[2] = new int[]{3, 5, 8, 10, 13, 18, 21, 24, 26, 30};
                break;
            case 4:
                stations = new int[4][];
                stations[0] = new int[]{4, 7, 11, 16, 20, 23, 27, 32};
                stations[1] = new int[]{3, 8, 12, 15, 19, 24, 28, 31};
                stations[0] = new int[]{1, 6, 10, 13, 18, 21, 25, 30};
                stations[1] = new int[]{2, 5,  9, 14, 17, 22, 26, 29};
                break;
            case 5:
                stations = new int[5][];
                stations[0] = new int[]{1, 5, 10, 14, 22, 28};
                stations[1] = new int[]{6, 12, 18, 23, 27, 32};
                stations[2] = new int[]{3, 7, 15, 19, 25, 29};
                stations[3] = new int[]{2, 9, 13, 21, 26, 30};
                stations[4] = new int[]{4, 8, 11, 20, 24, 31};
                break;
            case 6:
                stations = new int[6][];
                stations[0] = new int[]{1, 5, 10, 19, 27};
                stations[1] = new int[]{2, 11, 18, 25, 29};
                stations[2] = new int[]{4, 8, 14, 21, 26};
                stations[3] = new int[]{6, 15, 20, 24, 31};
                stations[4] = new int[]{3, 9, 13, 23, 30};
                stations[5] = new int[]{7, 12, 22, 28, 32};
                break;
        }
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

    /**
     * @return It returns the number of players in the Metro game
     */
    public int getPlayers () {
        return players;
    }

    /**
     * @return It return the currentPlayer.
     */
    public int getCurrentPlayer() {
        return currentPlayer;
    }

    /**
     * @param currPlayer Sets the currentPlayer to the passed integer
     */
    public void setCurrentPlayer(int currPlayer) {
        currentPlayer = currPlayer;
    }

    /**
     * @param currentPlayer the currentPlayer for which we need to check the hand
     * @return String value i.e. the tile in Hand of the current player.
     */
    public String getTileInHand (int currentPlayer) {
        return tileInHand[currentPlayer];
    }

    /**
     * @param currentPlayer The current Player for which we are storing the tile
     * @param tile the Tile which is picked from the deck, and player is keeping it in his/her hand
     */
    public void setTileInHand (int currentPlayer, String tile) {
        tileInHand[currentPlayer] = tile;
    }

    /**
     * @param currentPlayer the currentPlayer for which we want the stations allocated to him/her
     * @return the stations that are allocated to him/her in a integer array
     */
    public int[] getStations (int currentPlayer) {
        return stations[currentPlayer];
    }

}

