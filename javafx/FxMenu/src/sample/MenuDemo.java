package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class MenuDemo extends Application {
    public void start(Stage theStage) {
        theStage.setTitle("Menu Demo");

        // create a menu
        Menu fileMenu = new Menu("File");
        // create menuitems
        MenuItem fm1 = new MenuItem("Clear Messages");
        MenuItem fm2 = new MenuItem("Clear Forms");
        MenuItem fm3 = new MenuItem("Save Credentials");
        MenuItem fm4 = new MenuItem("Exit Portal");

        // add menu items to menu
        fileMenu.getItems().add(fm1);
        fileMenu.getItems().add(fm2);
        fileMenu.getItems().add(fm3);
        fileMenu.getItems().add(fm4);

        Menu editMenu = new Menu("Edit");
        Menu em1 = new Menu("Cut");
        Menu em2 = new Menu("Copy");
        Menu em3 = new Menu("Paste");

        editMenu.getItems().addAll(em1,em2,em3);
        MenuBar menuBar = new MenuBar();

        // add menu to menubar
        menuBar.getMenus().addAll(fileMenu,editMenu);

        // create a VBox
        VBox vBox = new VBox(menuBar);
        // create a scene
        Scene scene = new Scene(vBox, 500, 300);
        // set the scene
        theStage.setScene(scene);
        theStage.show();


    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}