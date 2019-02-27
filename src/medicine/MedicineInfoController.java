package medicine;

import io.DataLoad;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import medical.BeanContext;
import medical.MainApp;

public class MedicineInfoController {
	@FXML Label warning;
	Stage primaryStage= new Stage();
	@FXML TextField textfield1;
	@FXML
	public void fanhui(ActionEvent event){
		Stage c = BeanContext.getStage("b");
		c.show();
		BeanContext.getStage("c").close();
	}
	@FXML
	public void zengjia(ActionEvent event){
		//增加某一药品
		Stage c = BeanContext.getStage("e");
		c.show();
		BeanContext.getStage("c").close();
	}
	@FXML
	public void queren(ActionEvent event){
		//查询某一药品
		if(textfield1.getText().equals("")){
			warning.setOpacity(1);
		}
		else{
			DataLoad.readFileByLines(textfield1.getText());
			showWindow();
		}
/*		Stage c = BeanContext.getStage("d");
		c.show();
		BeanContext.getStage("c").close();*/
	}
	public void showWindow() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation((MainApp.class.getClassLoader().getResource("medicine/MedicineIndi.fxml")));
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("医疗基本信息维护");
			primaryStage.show();
			MedicineIndiController controller = loader.getController();
			controller.setStage(primaryStage);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}