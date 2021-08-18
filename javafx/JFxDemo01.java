/*
start()
All subclasses of the JavaFXApplication class 
must implement the abstract start() method of the Application class
start() method is called when the JavaFX application is started. 
*/

import javafx.application.Application;
import javafx.stage.Stage;

public class JFxDemo01 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");

        primaryStage.show();
    }

}