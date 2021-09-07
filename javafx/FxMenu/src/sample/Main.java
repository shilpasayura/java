package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage s) {
        s.setTitle("Menu Demo");

        // create a menu
        Menu fileMenu = new Menu("File");
        // create menuitems
        MenuItem m1 = new MenuItem("Clear Messages");
        MenuItem m2 = new MenuItem("Clear Forms");
        MenuItem m3 = new MenuItem("Save Credentials");
        MenuItem m4 = new MenuItem("Exit Portal");

        // add menu items to menu
        fileMenu.getItems().add(m1);
        fileMenu.getItems().add(m2);
        fileMenu.getItems().add(m3);
        fileMenu.getItems().add(m4);

        MenuBar menuBar = new MenuBar();

        // add menu to menubar
        menuBar.getMenus().add(fileMenu);

        // create a VBox
        VBox vb = new VBox(menuBar);
        // create a scene
        Scene sc = new Scene(vb, 500, 300);
        // set the scene
        s.setScene(sc);
        s.show();
    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}
