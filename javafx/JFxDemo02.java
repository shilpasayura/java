//main method in JavaFx application

import javafx.application.Application;
import javafx.stage.Stage;

public class JFxDemo02 extends Application {

    @Override
        public void start(Stage primaryStage) throws Exception {
        System.out.println("in start");
        primaryStage.setTitle("JavaFX App");

        primaryStage.show();
    }
    
    public static void main(String[] args) {
         System.out.println("in main");
         Application.launch(args);
    }
    
}
