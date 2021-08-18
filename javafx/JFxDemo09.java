
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class JFXDemo09 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
   
        Button button = new Button("Click me!");

        Font font = Font.font("Arial", FontWeight.BOLD, 36);

        button.setFont(font);

        button.setOnAction((event) -> {
            System.out.println("Button clicked!");
        });


        VBox vbox = new VBox(button);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
