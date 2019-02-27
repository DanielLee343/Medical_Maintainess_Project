package calc;

import diagnosis.DiagnosisIndiController;
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

public class CalcInfoController {
	Stage primaryStage= new Stage();
	Stage stage;
	@FXML TextField textfield;
	@FXML Text warning;
	
	public void setStage(Stage stage) {
		this.stage=stage;
	}
	@FXML
	public void fanhui(ActionEvent event){
		stage.close();
	}
	@FXML
	private void zengjia(ActionEvent event){
		//增加某一类别参数
		showWindow();
	}
	@FXML
	public void queren(ActionEvent event){
		//查询某一类别参数
		if(textfield.getText().equals("")){
			warning.setOpacity(1);
		}
		else{
			DataLoad.readFileByLines(textfield.getText());
			showWindow();
		}
	}
	public void showWindow() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation((MainApp.class.getClassLoader().getResource("calc/CalcSet.fxml")));
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("医疗基本信息维护");
			primaryStage.show();
			CalcSetController controller = loader.getController();
			controller.setStage(primaryStage);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void showWindow2() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation((MainApp.class.getClassLoader().getResource("calc/CalcResult.fxml")));
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("医疗基本信息维护");
			primaryStage.show();
			CalcResultController controller = loader.getController();
			controller.setStage(primaryStage);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
