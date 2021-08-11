import javafx.application.Application; 

import javafx.*;

public class hello extends Application {
    
    @Override
    public void start(Stage primaryStage) { //
        Label label = new Label("JavaFX");
        Scene scn = new Scene(label,300, 250);
        primaryStage.setTitle("JavaFx!");
        primaryStage.setScene(scn);
        primaryStage.show();
    }
    public static void main(String[] args) {
        
    }
}
