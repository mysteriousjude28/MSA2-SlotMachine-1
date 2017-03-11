package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


// Too extend an application
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
      
      //Root Directory
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");//S
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

//entry point ot the application
    public static void main(String[] args)
    {
        launch(args);
    }
}
