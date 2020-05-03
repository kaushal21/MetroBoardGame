package comp1110.ass2;

import java.util.Arrays;

/**
 * This class calculates the score at the end of the game
 * The variables that are declared here are
 * 1.> "score" - An array of that stores the scores for all the players
 */
public class Score {
    public static int[] score;                    // Store the scores for each player

    /**
     * This constructor initializes the scores for each player in the game
     */
    public Score (int players) {
        score = new int[players];
        Arrays.fill(score, 0);
    }

    /**
     * It calculates the current score of a game based on the placement sequence and no. of players
     * @param placementSequence is the string for all the tiles that are placed on the board
     * @return score for the players in an array.
     */
    public static int[] scoreBoard(String placementSequence, int players) {
        int[] score = new int[players];
        Arrays.fill(score, 0);

        // Get the number of tiles in the placementSequence
        int numberOfTiles = placementSequence.length() / 6;
        // Divide the string into pieces i.e. tile value and its location row and col.
        String[] tiles = new String[numberOfTiles];
        for (int i = 0; i < numberOfTiles; i++) {
            // Put all of the tiles into an array
            tiles[i] = placementSequence.substring(i * 6, (i * 6) + 6);
        }
        // iterate through the players and score each one
        for (int i = 0; i < players; i++) {
            score[i] = scorePlayer(i, tiles, players);
        }
        return score;
    }

    /**
     * @param player the current player being examined
     * @param tiles the current state of the board in tile-array format (rather than board string)
     * @param players the number of players (required to assign the right stations to each player)
     * @return an int value corresponding to the player's score
     */
    public static int scorePlayer(int player, String[] tiles, int players) {
        // get the player's stations in an array
        int[] playerStations = Player.getStations(player, players);
        int playerScore = 0;
        // iterate over the stations and follow the track that comes out of each one (if there is one)
        for (int i = 0; i < playerStations.length; i++) {
            // check if a tile exists at a station
            if (!(getTileAtStation(playerStations[i], tiles)).equals("")) {
                int trackScore = 0;
                int input = getFirstInputPosition(playerStations[i]);
                String currentTile = getTileAtStation(playerStations[i], tiles);

                // stepping through the track, ending if there is no next tile or the track is at a station
                while (!currentTile.equals("")) {
                    trackScore ++;
                    if (atStation(currentTile, input)) {
                        playerScore += trackScore;
                    }
                    else if (atMiddleStation(currentTile, input)) {
                        playerScore += trackScore * 2;
                    }
                    input = getNextInputPosition(currentTile, input);
                    currentTile = getNextTile(currentTile, input, tiles);
                }
            }
        }
        return playerScore;
    }


    // Returns the tile next to a particular station if there is one.
    // remembering that (y,x)
    public static String getTileAtStation(int station, String[] tiles) {
        int positionY = 100; // if these values don't get changed then there is no tile at the station
        int positionX = 100;
        if (station >= 1 && station <= 8) {
            positionY = 0;
            positionX = 8 - station;
        }
        else if (station >= 9 && station <= 16) {
            positionY = station - 9;
            positionX = 0;
        }
        else if (station >= 17 && station <= 24) {
            positionY = 7;
            positionX = station - 17;
        }
        else if (station >= 25 && station <= 32) {
            positionY = 32 - station;
            positionX = 7;
        }
        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i].charAt(4) - 48 == positionY && tiles[i].charAt(5) - 48 == positionX) return tiles[i];
        }
        return "";
    }


    /**
     * It gives position of the next tile in the track to check
     * @param inputPosition is which position 0,2,4 or 6 on the tile the track is coming into
     *                      ---0---1---
     *                      7---------2
     *                      -----------     // This represents where tracks come in and out of a tile
     *                      6---------3
     *                      ---5---4---
     * @param tile the tile that is already part of our track (includes its position)
     * @return the same tile, but with the new position based on what type of track (a,b,c or d) and where it enters the tile.
     */
    public static String getNextTile(String tile, int inputPosition, String[] tiles) {
        int positionY = tile.charAt(4);
        int positionX = tile.charAt(5);

        // check adjacent up
        if (inputPosition == 4) positionY -= 1;
            //check adjacent right
        else if (inputPosition == 6) positionX += 1;
            //check adjacent down
        else if (inputPosition == 0) positionY += 1;
            //check adjacent left
        else if (inputPosition == 2) positionX -= 1;

        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i].charAt(4) == positionY && tiles[i].charAt(5) == positionX) return tiles[i];
        }
        return ""; // this is returned when the track does not continue any further.
    }

    public static int getFirstInputPosition(int station) {
        //based on what station the track is starting from
        if (station >= 1 && station <= 8) return 0;
        else if (station >= 9 && station <= 16) return 6;
        else if (station >= 17 && station <= 24) return 4;
        else if (station >= 25 && station <= 32) return 2;
        return 10; // this should never be returned so long as the input is a valid station.
    }

    public static int getNextInputPosition(String tile, int inputPosition) {
        // based on previous tile's output
        if (getOutput(tile,inputPosition) == 1) return 4;
        else if (getOutput(tile,inputPosition) == 3) return 6;
        else if (getOutput(tile,inputPosition) == 5) return 0;
        else if (getOutput(tile,inputPosition) == 7) return 2;
        else return inputPosition; // this should never be returned so long as the inputPosition is 0,2,4 or 6.
    }

    // Returns where the track will 'output' to based on the letter and the input position
    // i.e. 'a' (going straight) corresponds to outputting the track at 5 positions greater than its input.
    // also, inputPositions 0,2,4 & 6 map to letters 0,1,2 and 3 in the tile string (hence inputPosition/2)
    public static int getOutput(String tile,int inputPosition) {
        if (tile.charAt(inputPosition/2) == 'a') {
            return (inputPosition + 5) % 8;

        } else if (tile.charAt(inputPosition/2) == 'b') {
            return (inputPosition + 3) % 8;

        } else if (tile.charAt(inputPosition/2) == 'c') {
            return (inputPosition + 7) % 8;

        } else if (tile.charAt(inputPosition/2) == 'd') {
            return (inputPosition + 1) % 8;
        } else {
            return 0; // this should never be the output if the tile is valid.
        }
    }

    /**
     * @return true if the line terminates at a middle station (i.e. at a station and facing a track into the station),
     * otherwise it returns false.
     */
    public static boolean atStation(String tile, int inputPosition) {
        int output = getOutput(tile, inputPosition);

        // check corners
        if ((tile.charAt(4) - 48 == 0 && tile.charAt(5) - 48 == 0) && (output == 1 || output == 7)) return true;
        else if ((tile.charAt(4) - 48 == 0 && tile.charAt(5) - 48 == 7) && (output == 1 || output == 3)) return true;
        else if ((tile.charAt(4) - 48 == 7 && tile.charAt(5) - 48 == 0) && (output == 7 || output == 5)) return true;
        else if ((tile.charAt(4) - 48 == 7 && tile.charAt(5) - 48 == 7) && (output == 3 || output == 5)) return true;

        // then check edges
        if ((tile.charAt(4) - 48 == 0) && (output == 1)) return true;
        else if ((tile.charAt(5) - 48 == 0) && (output == 7)) return true;
        else if ((tile.charAt(4) - 48 == 7) && (output == 5)) return true;
        else return (tile.charAt(5) - 48 == 7) && (output == 3);
    }

    /**
     * @return true if the line terminates at a middle station, otherwise it returns false.
     */
    public static boolean atMiddleStation(String tile, int inputPosition) {
        int output = getOutput(tile, inputPosition);
        boolean inMiddleColumns = tile.charAt(5)  - 48 == 3 || tile.charAt(5) - 48 == 4;
        boolean inMiddleRows = tile.charAt(4) - 48 == 3 || tile.charAt(4) - 48 == 4;
        if ((tile.charAt(4) - 48 == 2 && inMiddleColumns) && output == 5) return true;
        else if ((tile.charAt(4) - 48 == 5 && inMiddleColumns) && output == 1) return true;
        else if ((tile.charAt(5) - 48 == 2 && inMiddleRows) && output == 3) return true;
        else return (tile.charAt(5) - 48 == 5 && inMiddleRows) && output == 7;
    }
}
