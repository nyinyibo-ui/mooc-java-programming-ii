package textstatistics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea text=new TextArea("");
        layout.setCenter(text);

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().add(new Label("Letters: 0"));
        hbox.getChildren().add(new Label("Words: 0"));
        hbox.getChildren().add(new Label("The longest word is: "));
        layout.setBottom(hbox);
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

}
