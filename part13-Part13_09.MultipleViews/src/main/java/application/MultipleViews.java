package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import java.util.Arrays;
import java.util.Scanner;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) {

        // create button to jump from one scene to another its functions will be defined later
        Button toSecond = new Button("To the second view!");
        Button toThird = new Button("To the third view!");
        Button toFirst = new Button("To the first view!");

        // border pane component for first ui
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Label("First view!"));
        borderPane.setCenter(toSecond);

        // vertical box component for second ui
        VBox vbox = new VBox();
        vbox.getChildren().add(toThird);
        vbox.getChildren().add(new Label("Second view!"));

        //grid pane component for third ui
        GridPane gPane = new GridPane();
        gPane.add(new Label("Third view!"), 0, 0);
        gPane.add(toFirst, 1, 1);

        // define first, second, third Scenes
        Scene first = new Scene(borderPane);
        Scene second = new Scene(vbox);
        Scene third = new Scene(gPane);

        // define actions for each button
        toSecond.setOnAction((event) -> {
            window.setScene(second);
        });

        toThird.setOnAction((event) -> {
            window.setScene(third);
        });

        toFirst.setOnAction((event) -> {
            window.setScene(first);
        });
        window.setScene(first);
        window.show();
    }

}
