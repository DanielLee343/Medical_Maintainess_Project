package calc;

import java.net.URL;
import java.util.ResourceBundle;

import io.DataLoad;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import medical.BeanContext;

public class CalcResultController implements Initializable{
	Stage stage;
	@FXML Label name;
	@FXML Label fengding;
	@FXML Label qifu;
	@FXML Label percentage;
	
	public void setStage(Stage stage) {
		this.stage=stage;
	}
	
	@FXML
	public void queren(ActionEvent event){
		stage.close();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO 自动生成的方法存根

		System.out.println("kongzhizhenjiance"+DataLoad.s[0]);
		name.setText(DataLoad.s[0]);
		fengding.setText(DataLoad.s[1]);
		qifu.setText(DataLoad.s[2]);
		percentage.setText(DataLoad.s[3]);
	}
}
