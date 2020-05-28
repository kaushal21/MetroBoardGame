package comp1110.ass2.gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Authorship: Kaushal Sharma, Tom Stephens, Kyle Robertson

public class GetPlayers {

    // These store the total number of players entered by the user, and the number of computer opponents
    static AtomicInteger h = new AtomicInteger();
    static AtomicInteger a = new AtomicInteger();
    static AtomicBoolean c = new AtomicBoolean();
    /**
     * It Creates a new Dialog box that takes an integer value and check if it is valid and is in the range
     * @return The integer value accepted from the user.
     */
    public static int getPlayers() {

        // Create a new Stage to Accept the Number of Players
        Stage newWindow = new Stage();

        // This makes the new Window a compulsory window
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("Get Number Of Players");                    // Set the Title of the window
        newWindow.setMinWidth(400);                                     // Set the Minimum width of the Window
        newWindow.setOnCloseRequest(e -> {
            e.consume();
            String mess = "Are you sure you want to quit?!!";
            if ( ConfirmationBox.confirmationBox(mess) ) {
                h.set(-1);
                newWindow.close();
            }
        });

        Label noOfPlayers = new Label("Enter The number of Players (2-6):");       // Label Used to display the message
        TextField numberOfPlayers = new TextField();                            // TextField is used to store the input value
        numberOfPlayers.setMaxWidth(100);
        numberOfPlayers.setPromptText("No. of Players");
        Label noOfAIs = new Label("Enter The number of Computer opponents (must be less than the number of players):");
        TextField numberOfAIs = new TextField();
        numberOfAIs.setMaxWidth(100);
        numberOfAIs.setPromptText("No. of Computer opponents");
        Label confConstructionTile = new Label("Enable Construction Tile? (Checked for Yes, unchecked for no)");
        CheckBox checkBox = new CheckBox();
        //cbYes.setText("Yes");



        Button submit = new Button("PLAY");                               // Create a Play button
        submit.setOnAction(e -> {
            // On click functionality of submit button
            // Check if the value entered is correct
            if (checkEnteredNumberOfPlayers(numberOfPlayers) && checkEnteredNumberOfAIs(numberOfPlayers,numberOfAIs) ) {
                h.set(Integer.parseInt(numberOfPlayers.getText()));
                a.set(Integer.parseInt(numberOfAIs.getText()));
                c.set(checkIfConTileEnabled(checkBox));
                newWindow.close();
            }
        });

        // Create a VBox to display this layout on the screen
        VBox layout = new VBox(10);
        layout.getChildren().addAll(noOfPlayers, numberOfPlayers, noOfAIs, numberOfAIs,confConstructionTile,checkBox, submit);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(5, 10, 5, 10));

        Scene newScene = new Scene(layout, 400, 250);
        newWindow.setScene(newScene);
        newWindow.showAndWait();

        // return the entered value
        return h.get();
    }
    public static boolean playingConstructionRules() {
        return c.get();
    }

    /**
     * It called by the submit button while accepting the number of users. It checks 2 conditions
     * 1.> The entered number of players is in integer.
     * 2.> The entered number is in the range from 2 to 6.
     * @param number It is the TextField which have the value entered from the user
     * @return true if the entered value is valid as number of players, otherwise it returns false
     */
    static boolean checkEnteredNumberOfPlayers(TextField number) {
        try {
            // Convert the entered TextField value to Integer
            int n = Integer.parseInt(number.getText());
            // Check the range of the entered value
            if ( n < 2 || n > 6 )
                // If the value is out of range then throw an exception.
                throw new NumberFormatException("You have to have 2-6 players to play!");
            else
                // If the value is within the range then return true.
                return true;
        } catch (NumberFormatException e1) {
            // Print out the error message and return false
            System.out.println("Enter the number of players correctly");
            return false;
        }
    }
    /**
     * It called by the submit button while accepting the number of users. It checks 2 conditions
     * 1.> The entered number of players is in integer.
     * 2.> The entered number is not more than the total number of players - 1 (since we want at least 1 human player)
     * @param totalNumber It is the TextField which have the total no. of players value entered from the user
     * @param number It is the TextField which have the no. of computer opponents value entered from the user
     * @return true if the entered value is valid as number of computer opponents, otherwise it returns false
     */
    static boolean checkEnteredNumberOfAIs(TextField totalNumber, TextField number) {
        try {
            // Convert the entered TextField value to Integer
            int totalNum = Integer.parseInt(totalNumber.getText());
            int numAI = Integer.parseInt(number.getText());
            // Check the range of the entered value
            if ( numAI < 0 || (numAI >= totalNum) )
                // If the value is out of range then throw an exception.
                throw new NumberFormatException("You can't have more opponents than players!");
            else
                // If the value is within the range then return true.
                return true;
        } catch (NumberFormatException e1) {
            // Print out the error message and return false
            System.out.println("Enter the number of AIs correctly");
            return false;
        }
    }

    static boolean checkIfConTileEnabled(CheckBox checked){
        //Checking if the check box is selected
        if(checked.isSelected()){
            //Prints out to show that the check box has been checked.
            System.out.println("Checked");
            return true;
        } else{
            return false;
        }
    }


}
