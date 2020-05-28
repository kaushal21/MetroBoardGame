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

public class FinalScreen {
    public static void finalScreen(String placement, int numOfPlayers) {
        Stage newWindow = new Stage();

        //Makes its compulsory window
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("Final Score");                      //Setting title for the window
        newWindow.setMinWidth(250);                             //Setting the min width of the window

        Label winner1 = new Label("The Winner is: ");
        Label winner2 = new Label();
        Label score = new Label();
        Button finishGame = new Button("Finish Game");       //Create a Finish/Close button
        finishGame.setOnAction(e ->newWindow.close());

        //Creates a VBox to display the layout of the screen
        VBox layout = new VBox(10);
        layout.getChildren().addAll(winner1, winner2,score,finishGame);           //Adds the elements to the screen
        layout.setAlignment(Pos.CENTER);                        //Sets the alignment for layout
        layout.setPadding(new Insets(5,10,5,10));

        int i = 1;
        while (i <= numOfPlayers){
            Label playerScore1 = new Label();
            playerScore1.setText("Player " + i + "'s Score: " +  "\n");// Number of player not current player;
            System.out.println("Player " + i);
            playerScore1.setMinWidth(250);                                          // Set Minimum Width
            playerScore1.setAlignment(Pos.CENTER_LEFT);                             // Set Alignment to Center
            playerScore1.setFont(Font.font("Arial", 15));                     // Set Font of the Text
            playerScore1.setTextFill(Color.BLACK);                                  // Set Color of the Text
            playerScore1.setPadding(new Insets(0, 0, 10, 0));         // Set Padding for the Label
            //playerScore1.setLayoutX((SQUARE_SIZE * 10) + (12));
            playerScore1.setLayoutY(100+ (i*25));
            layout.getChildren().add(playerScore1);
            i++;
        }

        Scene newScene = new Scene(layout,250,100);
        newWindow.setScene(newScene);
        newWindow.showAndWait();

    }
}
