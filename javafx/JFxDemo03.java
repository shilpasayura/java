import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.concurrent.*;

public class JFxDemo03 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Demo App 03");
        
        Label label = new Label("Hello JavaFX !");
        Scene scene = new Scene(label, 300, 200);
        primaryStage.setScene(scene);
        
        primaryStage.show();
		
		long timeToSleep = 3L;
		TimeUnit time = TimeUnit.SECONDS;
		time.sleep(timeToSleep);
		
		primaryStage.setWidth(100);
        primaryStage.setHeight(100);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
