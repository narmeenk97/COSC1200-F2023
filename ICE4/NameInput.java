/*
Name: Narmeen Khalid
COSC1200 OBJECT-ORIENTED PROGRAMMING
ICE4: NameInput
December 7th, 2023
Description: Create a simple UI using Java-FX that asks the user to enter
             their name and then echoes the inputted name in the console.
 */

package ICE4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NameInput extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        // Label for name input
        Label namelabel = new Label ("Name: ");

        // Text field for name
        TextField nameTextField = new TextField();
        nameTextField.setPromptText("Name: ");

        // Submit button
        Button submitButton = new Button("Submit");

        // Event Handler for Submit action
        submitButton.setOnAction(event -> {
            System.out.println("Hello " + nameTextField.getText()+ "!");
        });

        // Vertical box layout with spacing and alignment
        VBox layout = new VBox(10);
        // Center aligns the elements in the VBox
        layout.setAlignment(Pos.CENTER);
        // add all the elements to the layout
        layout.getChildren().addAll(namelabel, nameTextField, submitButton);

        //setting up the scene with the VBox layout, and configuring the stage
        Scene scene = new Scene(layout, 300, 200);
        stage.setTitle("Give Me Your Name!");
        stage.setScene(scene);
        stage.show();

    }
public static void main(String[] args) {
        launch(args);
    }

}
