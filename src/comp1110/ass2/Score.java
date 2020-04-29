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
     * It calculates the score at the end of the game.
     * @param placementSequence is the string for all the tiles that are placed on the board
     * @return score for the players in an array.
     */
    public static int[] ScoreBoard(String placementSequence, int players) {

        // Get the number of tiles in the placementSequence
        int numberOfTiles = placementSequence.length() / 6;
        String[] tiles = new String[numberOfTiles];

        // Divide the string into pieces i.e. tile value and its location row and col.
        for (int i = 0; i < numberOfTiles; i++) {
            // Put all of the tiles into an array
            tiles[i] = placementSequence.substring(i * 6, (i * 6) + 6);
        }



        return score;
    }

    // Returns the tile next to a particular station if there is one.
    // remembering that (y,x)
    public static String getTileAtStation(int station, String[] tiles) {
        int positionX = 100; // if these values don't get changed then there is no tile at the station
        int positionY = 100;
        if (station >= 1 && station <= 8) {
            positionX = 8 - station;
            positionY = 0;
        }
        else if (station >= 9 && station <= 16) {
            positionX = 0;
            positionY = station - 9;
        }
        else if (station >= 17 && station <= 24) {
            positionX = station - 17;
            positionY = 7;
        }
        else if (station >= 25 && station <= 32) {
            positionX = 7;
            positionY = 32 - station;
        }

        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i].charAt(4) == positionX && tiles[i].charAt(5) == positionY) return tiles[i];
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
    public static String getNextTile(String tile, int inputPosition) {
        if (getOutput(tile,inputPosition) == 1) {
            String nextTile = tile.substring(0,3) + (((int) tile.charAt(4)) - 1) + tile.substring(5);
            return nextTile;

        } else if (getOutput(tile,inputPosition) == 3) {
            String nextTile = tile.substring(0,4) + (((int) tile.charAt(5)) + 1);
            return nextTile;

        } else if (getOutput(tile,inputPosition) == 5) {
            // this corresponds to 5
            String nextTile = tile.substring(0,3) + (((int) tile.charAt(4)) + 1) + tile.substring(5);
            return nextTile;

        } else if (getOutput(tile,inputPosition) == 7) {
            // corresponds to 7
            String nextTile = tile.substring(0,4) + (((int) tile.charAt(5)) - 1);
            return nextTile;
        } else {
            return tile; // this should never be returned so long as the inputPosition is 0,2,4 or 6.
        }

    }

    public static int getNextInputPosition(String tile, int inputPosition) {
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
            return inputPosition + 5;

        } else if (tile.charAt(inputPosition/2) == 'b') {
            return inputPosition + 3;

        } else if (tile.charAt(inputPosition/2) == 'c') {
            return inputPosition - 1;

        } else if (tile.charAt(inputPosition/2) == 'd') {
            return inputPosition + 1;
        } else {
            return 0; // this should never be the output if the tile is valid.
        }
    }

    /**
     * @return true if the line terminates at a middle station (i.e. at a station and facing a track into the station),
     * otherwise it returns false.
     */
    public boolean atStation(String tile, int inputPosition) {
        int output = getOutput(tile, inputPosition);

        // check corners
        if ((tile.charAt(4) == 0 && tile.charAt(5) == 0) && (output == 1 || output == 7)) return true;
        else if ((tile.charAt(4) == 0 && tile.charAt(5) == 7) && (output == 1 || output == 3)) return true;
        else if ((tile.charAt(4) == 7 && tile.charAt(5) == 0) && (output == 7 || output == 5)) return true;
        else if ((tile.charAt(4) == 7 && tile.charAt(5) == 7) && (output == 3 || output == 5)) return true;

        // then check edges
        if ((tile.charAt(4) == 0) && (output == 1)) return true;
        else if ((tile.charAt(5) == 0) && (output == 7)) return true;
        else if ((tile.charAt(4) == 7) && (output == 5)) return true;
        else if ((tile.charAt(5) == 7) && (output == 3)) return true;
        return false;
    }

    /**
     * @return true if the line terminates at a middle station, otherwise it returns false.
     */
    public static boolean atMiddleStation(String tile, int inputPosition) {
        int output = getOutput(tile, inputPosition);
        boolean inMiddleColumns = tile.charAt(5) == 3 || tile.charAt(5) == 4;
        boolean inMiddleRows = tile.charAt(4) == 3 || tile.charAt(4) == 4;
        if ((tile.charAt(4) == 2 && inMiddleColumns) && output == 5) return true;
        else if ((tile.charAt(4) == 5 && inMiddleColumns) && output == 0) return true;
        else if ((tile.charAt(5) == 2 && inMiddleRows) && output == 3) return true;
        else if ((tile.charAt(5) == 5 && inMiddleRows) && output == 7) return true;
        else return false;
    }
}

