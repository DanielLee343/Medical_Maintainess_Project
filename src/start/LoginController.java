package start;

import io.DataSave;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import medical.BeanContext;

public class LoginController {
	@FXML
	private Label label3;
	@FXML
	private TextField account;
	@FXML
	private PasswordField password;
	
	@FXML
	private void onButtonClick(ActionEvent event){
		if( (account.getText().equals("admin")) &&(password.getText().equals("123456"))  ){
		Stage c = BeanContext.getStage("b");
		c.show();
		BeanContext.getStage("a").close();
		}
		else{
			label3.setVisible(true);
			label3.setText("’À∫≈ªÚ√‹¬Î¥ÌŒÛ");
		}
//		DataSave.saveProduct(account.getText());
/*		Stage c = BeanContext.getStage("b");
		c.show();
		BeanContext.getStage("a").close();*/
	}
	
}
