package ClassPractice.Week13.week13_1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXLoginApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Label for email input
        Label emaillabel = new Label("Email: ");

        // text field for email input
        TextField emailTextField = new TextField();
        emailTextField.setPromptText("Enter your email:" );

        // Label for password input
        Label passwordLabel = new Label("Password: ");

        // Password field for password input (hides input text)
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password: ");

        // Submit button with an event handler for login action
        Button loginButton = new Button("Login");
        // Event handler for login action
        loginButton.setOnAction(event -> {
            System.out.println("Email: " + emailTextField.getText());
            System.out.println("Password: " + passwordField.getText());
        });

        // Vertical box layout with spacing and alignment
        VBox layout = new VBox(10);
        // Center aligns the elements in the VBox
        layout.setAlignment(Pos.CENTER);
        // add all the elements to the layout
        layout.getChildren().addAll(emaillabel, emailTextField, passwordLabel, passwordField, loginButton);

        //setting up the scene with the VBox layout, and configuring the stage
        Scene scene = new Scene(layout, 300, 200);
        stage.setTitle("Login page");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
