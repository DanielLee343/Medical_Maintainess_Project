package diseases;

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

public class DiseasesInfoController {
	Stage primaryStage= new Stage();
	@FXML TextField textfield1;
	@FXML Text warning;
	@FXML
	private void fanhui(ActionEvent event){
		Stage c = BeanContext.getStage("b");
		c.show();
		BeanContext.getStage("i").close();
	}
	@FXML
	private void zengjia(ActionEvent event){
		//增加某一病种
		Stage c = BeanContext.getStage("k");
		c.show();
		BeanContext.getStage("i").close();
	}
	@FXML
	private void queren(ActionEvent event){
		//查询某一病种
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
			loader.setLocation((MainApp.class.getClassLoader().getResource("diseases/DiseasesIndi.fxml")));
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("医疗基本信息维护");
			primaryStage.show();
			DiseasesIndiController controller = loader.getController();
			controller.setStage(primaryStage);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
}
}
