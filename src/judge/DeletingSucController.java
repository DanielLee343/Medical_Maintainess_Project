package judge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import medical.BeanContext;

public class DeletingSucController {
	@FXML
	private void queding(ActionEvent event){
/*		Stage c = BeanContext.getStage("b");
		c.show();*/
		BeanContext.getStage("o").close();
		BeanContext.getStage("d").close();
		BeanContext.getStage("g").close();
		BeanContext.getStage("j").close();
	}
}
