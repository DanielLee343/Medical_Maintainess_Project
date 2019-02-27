package medical;

import javafx.application.Application;  
import javafx.fxml.FXMLLoader;  
import javafx.scene.Parent;  
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;  
  
public class MainApp extends Application{  
	private Stage primaryStage;
	private BorderPane rootLayout;
    @Override  
    public void start(Stage stage) throws Exception {  
 /*       Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));  
         
        Scene scene = new Scene(root);  
        stage.setTitle("Log in");  
        stage.setScene(scene);  
        stage.show();  */
    	BeanContext.getStage("a").show();
    }  
  
    public static void main(String[] args) {  
        launch(args);  
    }  
      
}