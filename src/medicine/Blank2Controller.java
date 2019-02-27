package medicine;

import java.net.URL;
import java.util.ResourceBundle;

import io.DataLoad;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Blank2Controller implements Initializable{
	@FXML Label code;
	@FXML Label name;
	@FXML Label type;
	@FXML Label level;
	@FXML Label max;
	@FXML Label judge;
	@FXML Label frequency;
	@FXML Label unit;
	@FXML Label size;
	@FXML Label days;
	
	
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO 自动生成的方法存根

		code.setText(DataLoad.s[0]);
		
	}
}
