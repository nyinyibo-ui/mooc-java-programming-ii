package notifier;

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

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage window) {
        TextField topText = new TextField();
        Label label = new Label();
        Button button = new Button("Copy");

        VBox componentGroup = new VBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(topText, button, label);

        Scene viewport = new Scene(componentGroup);

        button.setOnAction((event) -> {
            label.setText(topText.getText());
        });
        window.setScene(viewport);
        window.show();
    }

}
