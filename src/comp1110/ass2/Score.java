package comp1110.ass2;

import java.util.Arrays;
import comp1110.ass2.Move;
import java.util.Scanner;

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
    public static int[] ScoreBoard(String placementSequence) {

        // Get the number of tiles in the placementSequence
        int numberOfTiles = placementSequence.length() / 6;
        String[] tiles = new String[numberOfTiles];

        // Divide the string into pieces i.e. tile value and its location row and col.
        for (int i = 0; i < numberOfTiles; i++) {
            // Put all of the tiles into an array
            tiles[i] = placementSequence.substring(i * 6, (i * 6) + 6);
        }

        //
        // Check through the array to find a tile that is placed at a station
        for (int i = 0; i < numberOfTiles; i++) {
            int row = Integer.parseInt(String.valueOf(tiles[i].charAt(4)));
            int col = Integer.parseInt(String.valueOf(tiles[i].charAt(5)));
            // get the station we are currently at
            // add 1 to the score of the player at station
            // find the next tile to look at

            if ((row == 0) && (col == 0)) {


            } else if (col == 0) {

            } else if (row == 7) {

            } else if (col == 7) {

            }
        }


        return score;
    }



    /**
     * It checks if a line terminates at one of the middle stations
     * @return true if the termination station is a middle station, otherwise it returns false.
     */
    public static boolean atMiddleStations() {
        return false;
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
     * @return the next tile in a track
     */
    public String getNextTile(String tile, int inputPosition) {
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

    public int getOutput(String tile,int inputPosition) {
        if (tile.charAt(0) == 'a') {
            return inputPosition + 5;

        } else if (tile.charAt(0) == 'b') {
            return inputPosition + 3;

        } else if (tile.charAt(0) == 'c') {
            return inputPosition - 1;

        } else if (tile.charAt(0) == 'd') {
            return inputPosition + 1;
        } else {
            return 0; // this should never be the output if the tile is valid.
        }

    }

}

