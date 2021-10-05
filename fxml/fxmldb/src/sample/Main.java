package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.sql.SQLException;

public class Main extends Application {
    public static Stage stage = null;
    public static Scene scene=null;
    public static Pane root = null;
    //public static Parent root = null;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root,800,600);

        primaryStage.setScene(scene);
        primaryStage.show();
        testDatabase();
    }

    static void testDatabase() throws SQLException {
        if (DatabaseController.getConnection() != null) {
            System.out.println("DataBase OK");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
