import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultiScene extends Application {

Scene scene1, scene2, scene3;
    
@Override
public void start(Stage primaryStage) {
        
primaryStage.setTitle("JavaFX Multi Scenes");

//Scene 1
Label label1= new Label("This is the first scene");
Button button1= new Button("Go to Scene 2");
button1.setOnAction(e -> primaryStage.setScene(scene2));   
VBox layout1 = new VBox(20);     
layout1.getChildren().addAll(label1, button1);
scene1= new Scene(layout1, 300, 250);
               
//Scene 2
Label label2= new Label("Scene 2");
Button button2= new Button("Go to scene 3");
button2.setOnAction(e -> primaryStage.setScene(scene3));
VBox layout2= new VBox(20);
layout2.getChildren().addAll(label2, button2);
scene2= new Scene(layout2,300,250);
        
               
//Scene 3
Label label3= new Label("Scene 3");
Button button3= new Button("Go to scene 1");
button3.setOnAction(e -> primaryStage.setScene(scene1));
VBox layout3= new VBox(20);
layout3.getChildren().addAll(label3, button3);
scene2= new Scene(layout3,300,250);

        
primaryStage.setScene(scene1);
primaryStage.show();
}

public static void main(String[] args) {
launch(args);
}
    
}
