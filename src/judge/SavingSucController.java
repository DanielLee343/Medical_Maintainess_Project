package judge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import medical.BeanContext;

public class SavingSucController {
	@FXML
	private void queding(ActionEvent event){
		Stage c = BeanContext.getStage("b");
		c.show();
		BeanContext.getStage("q").close();
		BeanContext.getStage("e").close();
		BeanContext.getStage("h").close();
		BeanContext.getStage("k").close();
		BeanContext.getStage("l").close();
	}
}
