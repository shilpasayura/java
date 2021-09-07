package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Main extends Application  {
    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField text1 = new TextField();
        TextField text2 = new TextField();

        Button button1 = new Button("Submit");
        Button button2 = new Button("Forgot Password");

        Label label1 = new Label(" Login Network System ");
        Label label2 = new Label("Username:");
        Label label3 = new Label("Password:");


        GridPane layout = new GridPane();

        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(5);
        layout.setHgap(5);

        layout.add(text1, 1,1);
        layout.add(text2, 1,2);
        layout.add(button1, 1,3);
        layout.add(button2, 0,3);
        layout.add(label1, 1,0);
        layout.add(label2, 0,1);
        layout.add(label3, 0,2);


        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setTitle("javaFX Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}