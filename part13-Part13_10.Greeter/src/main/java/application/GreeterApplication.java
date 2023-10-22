package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) {
        // 1.1 Creating components to be used
        Label instructionText = new Label("Enter your name and start");
        TextField textField = new TextField();
        Button startButton = new Button("Start");
        Label error = new Label("");

        // 1.2 creating layout and adding components to it
        GridPane layout = new GridPane();

        layout.add(instructionText, 0, 0);
        layout.add(textField, 0, 1);
        layout.add(startButton, 0, 2);
        layout.add(error, 0, 3);

        // 1.3 styling the layout
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        // 1.4 creating the view itself and setting it to use the layout
        Scene insertView = new Scene(layout);

        // 2. Creating a view for showing the welcome message
        Label welcomeText = new Label("");

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(welcomeLayout);

        // 1.5 set the action of the start button
        startButton.setOnAction((event) -> {
            if (textField.getText().isEmpty()) {
                error.setText("Text field is empty, try again");
                return;
            }
            String name = textField.getText();
            welcomeText.setText("Welcome " + name+"!");
            window.setScene(welcomeView);
        });
        window.setScene(insertView);
        window.show();

    }
}
