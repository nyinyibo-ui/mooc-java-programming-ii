package textstatistics;
//import necessary libraries

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        HBox horizontalBox = new HBox();
        horizontalBox.setSpacing(10);
        Label letterLabel = new Label();
        Label wordLabel = new Label();
        Label longestWord = new Label();
        horizontalBox.getChildren().add(letterLabel);
        horizontalBox.getChildren().add(wordLabel);
        horizontalBox.getChildren().add(longestWord);

        TextArea textField = new TextArea("");

        textField.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            letterLabel.setText("Letters: " + characters);
            wordLabel.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);

            // set values of text elements
        });

        layout.setCenter(textField);
        layout.setBottom(horizontalBox);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

}
