package comp1110.ass2;

import java.util.Arrays;
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
    public Score () {
        score = new int[Player.players];
        Arrays.fill(score, 0);
    }

    /**
     * It calculates the score at the end of the game.
     * @return score for the players in an array.
     */
    public static int[] ScoreBoard() {
        return score;
    }

    /**
     * It checks for the middle station present at the end of the line termination.
     * @return true if the termination station is a middle station, otherwise it returns false.
     */
    public static boolean checkMiddleStations() {
        return false;
    }

}

