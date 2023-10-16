package borderpane;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
public class BorderPaneApplication extends Application{


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage window) {
        Label top=new Label("NORTH");
        Label right=new Label("EAST");
        Label bottom =new Label("SOUTH");
        
        BorderPane borderLayout=new BorderPane();
        borderLayout.setTop(top);
        borderLayout.setRight(right);
        borderLayout.setBottom(bottom);
        
        Scene view=new Scene(borderLayout);
        
        window.setScene(view);
        window.show();     
               
    }

}
