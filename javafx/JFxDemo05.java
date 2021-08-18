import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Modality;

public class JFxDemo05 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("JavaFX Primary Stage");

        Stage stage = new Stage();
        stage.setTitle("JavaFX Secondry Stage");
					
		stage.initModality(Modality.APPLICATION_MODAL);
        //stage.initModality(Modality.WINDOW_MODAL);
        //stage.initModality(Modality.NONE);

        primaryStage.show();

        stage.showAndWait();

    }
}




