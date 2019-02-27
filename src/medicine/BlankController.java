package medicine;

import java.net.URL;
import java.util.ResourceBundle;

import io.DataLoad;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import medical.MainApp;

public class BlankController  implements Initializable {
	
	MainApp mainApp;
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
		
		
	}
	public void setMainApp() {
		System.out.println("34343434");
		String[] m = DataLoad.whatever();
		System.out.println(DataLoad.s[0]);
		code.setText(m[0]);
	}
}
