package comp1110.ass2.gui;

import comp1110.ass2.Metro;
import comp1110.ass2.Player;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FinalScreen {
    public static void finalScreen(String placement) {
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

        Scene newScene = new Scene(layout,250,100);
        newWindow.setScene(newScene);
        newWindow.showAndWait();

    }
}
