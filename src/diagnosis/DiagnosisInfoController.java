package diagnosis;

import io.DataLoad;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import medical.BeanContext;
import medical.MainApp;

public class DiagnosisInfoController {
	@FXML TextField textfield1;
	@FXML Text warning;
	Stage primaryStage= new Stage();
	@FXML
	public void fanhui(ActionEvent event){
		Stage c = BeanContext.getStage("b");
		c.show();
		BeanContext.getStage("f").close();
	}
	@FXML
	public void zengjia(ActionEvent event){
		//增加某一诊疗
		Stage c = BeanContext.getStage("h");
		c.show();
		BeanContext.getStage("f").close();
	}
	@FXML
	public void queren(ActionEvent event){
		//查询某一诊疗
		if(textfield1.getText().equals("")){
			warning.setOpacity(1);
		}
		else{
			DataLoad.readFileByLines(textfield1.getText());
			showWindow();
		}
	}
	public void showWindow() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation((MainApp.class.getClassLoader().getResource("diagnosis/Diagnosisindi.fxml")));
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("医疗基本信息维护");
			primaryStage.show();
			DiagnosisIndiController controller = loader.getController();
			controller.setStage(primaryStage);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
