package comp1110.ass2.gui;

import comp1110.ass2.Metro;
import comp1110.ass2.Player;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Collections;

//Authorship: Kyle Robertson

public class FinalScreen{
    public static void finalScreen(String placement, int numOfPlayers) {
        Stage newWindow = new Stage();

        //Makes its compulsory window
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("Finish Game");                      //Setting title for the window
        newWindow.setMinWidth(250);                             //Setting the min width of the window
        newWindow.setMinHeight(500);
        //Finding the max number in the array.
        int[] scores2 = Metro.getScore(placement,numOfPlayers);
        int largest = scores2[0], index = 0;
            for (int i = 1; i < scores2.length; i++){ //Looks through the array.
                if(scores2[i] >= largest){ //Check against every number to find the largest.
                    largest = scores2[i];
                    index = i; //Sets the location of the largest number
                }

            }
        //Setting design elements of the labels.
        Label winner1 = new Label("The Winner is: ");
        winner1.setFont(Font.font("Arial", 15));
        winner1.setTextFill(Color.BLACK);
        Label winner2 = new Label();
        winner2.setFont(Font.font("Arial", 20));
        winner1.setTextFill(Color.BLACK);
        Label score = new Label();
        Button finishGame = new Button("Finish Game");       //Create a Finish/Close button
        finishGame.setOnAction(e ->newWindow.close());
        //Displaying who is the winner by finding the max score in the array.
        switch (index){
            case 0:
                winner2.setText("Player 1");
                break;
            case 1:
                winner2.setText("Player 2");
                break;
            case 2:
                winner2.setText("Player 3");
                break;
            case 3:
                winner2.setText("Player 4");
                break;
            case 4:
                winner2.setText("Player 5");
                break;
            case 5:
                winner2.setText("Player 6");
                break;
        }
        //Creates a VBox to display the layout of the screen
        VBox layout = new VBox(10);
        layout.getChildren().addAll(winner1, winner2,score,finishGame);           //Adds the elements to the screen
        layout.setAlignment(Pos.CENTER);                        //Sets the alignment for layout
        layout.setPadding(new Insets(5,10,5,10));
        //Displaying the correct number of players and their score.
        int i = 0;
        while (i < numOfPlayers){
            int[] scores = Metro.getScore(placement,numOfPlayers);
            //Calling the label playerScore1 to the amount of players.
            Label playerScore1 = new Label();
            //Setting the player number and score line after line.
            playerScore1.setText("Player " + (i+1) + "'s Score: " + scores[i] + "\n");
            playerScore1.setMinWidth(250);                                          // Set Minimum Width
            playerScore1.setAlignment(Pos.CENTER_LEFT);                             // Set Alignment to Center
            playerScore1.setFont(Font.font("Arial", 15));                     // Set Font of the Text
            playerScore1.setTextFill(Color.BLACK);                                  // Set Color of the Text
            playerScore1.setPadding(new Insets(0, 0, 10, 0));         // Set Padding for the Label
            playerScore1.setLayoutY(100+ (i*25)); // Changing the position so they do not overlap.
            layout.getChildren().add(playerScore1); //Adding the label to the screen.
            i++;
        }

        Scene newScene = new Scene(layout,250,100);
        newWindow.setScene(newScene);
        newWindow.showAndWait();

    }
}
