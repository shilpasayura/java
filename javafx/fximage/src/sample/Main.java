package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;

public class Main extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {


        FileInputStream stream = new FileInputStream("D:\\java\\jdk16\\javafx\\fximage\\src\\sample\\ssf.jpg");
        Image image = new Image(stream);
        ImageView imageview = new ImageView(image);

        Pane layout = new Pane(imageview);
        Scene scene = new Scene(layout, 300, 300);

        primaryStage.setTitle("Image Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
    launch(args);
    }
}
