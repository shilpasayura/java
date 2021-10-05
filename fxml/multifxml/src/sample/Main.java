package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Parent rootNode;

    public static void main(final String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("resources/fxml/Main.fxml"));
        rootNode = fxmlLoader.load();
    }

    @Override
    public void start(Stage stage) throws Exception {
       stage.setTitle("Multi Screen FXML");
        stage.setScene(new Scene(rootNode));
        stage.show();
    }

}