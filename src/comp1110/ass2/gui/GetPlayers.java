package comp1110.ass2.gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class GetPlayers {

    /**
     * It Creates a new Dialog box that takes an integer value and check if it is valid and is in the range
     * @return The integer value accepted from the user.
     */
    public static int getPlayers() {
        // This stores the number of players entered by the user.
        AtomicInteger n = new AtomicInteger();
        // Create a new Stage to Accept the Number of Players
        Stage newWindow = new Stage();

        // This makes the new Window a compulsory window
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("Get Number Of Players");                    // Set the Title of the window
        newWindow.setMinWidth(400);                                     // Set the Minimum width of the Window
        newWindow.setOnCloseRequest(e -> {
            e.consume();
            String mess = "Are you Sure you wanna QUIT!!!";
            if ( ConfirmationBox.confirmationBox(mess) ) {
                n.set(-1);
                newWindow.close();
            }
        });

        Label name = new Label("Enter The number of Players (2-6):");       // Label Used to display the message
        TextField numberOfPlayers = new TextField();                            // TextField is used to store the input value
        numberOfPlayers.setMaxWidth(100);
        numberOfPlayers.setPromptText("Number of Player");
        Button submit = new Button("Submit");                               // Create a Submit button
        submit.setOnAction(e -> {
            // On click functionality of submit button
            // Check if the value entered is correct
            if ( checkEnteredNumberOfPlayers(numberOfPlayers) ) {
                n.set(Integer.parseInt(numberOfPlayers.getText()));
                newWindow.close();
            }
        });

        // Create a VBox to display this layout on the screen
        VBox layout = new VBox(10);
        layout.getChildren().addAll(name, numberOfPlayers, submit);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(5, 10, 5, 10));

        Scene newScene = new Scene(layout, 400, 250);
        newWindow.setScene(newScene);
        newWindow.showAndWait();

        // return the entered value
        return n.get();
    }

    /**
     * It called by the submit button while accepting the number of users. It checks 2 conditions
     * 1.> The entered number of players is in integer.
     * 2.> The entered number is in the range from 2 to 6.
     * @param number It is the TextField which have the value enterd from the user
     * @return true if the entered value is valid as number of players, otherwise it returns false
     */
    static boolean checkEnteredNumberOfPlayers(TextField number) {
        try {
            // Convert the entered TextField value to Integer
            int n = Integer.parseInt(number.getText());
            // Check the range of the entered value
            if ( n < 2 || n > 6 )
                // If the value is out of range then throw an exception.
                throw new NumberFormatException("The Entered Number is not in the range i.e. from 2 to 6.");
            else
                // If the value is within the range then return true.
                return true;
        } catch (NumberFormatException e1) {
            // Print out the error message and return false
            System.out.println("Enter the number of players correctly");
            return false;
        }
    }

}
