package diseases;

import io.DataSave;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import medical.BeanContext;

public class DiseasesEditController {
	
	@FXML TextField code;
	@FXML TextField name;
	Stage stage;
	
	ObservableList<String> typeList = FXCollections.observableArrayList("��ϵͳ","����ϵͳ","����ϵͳ","��ֳϵͳ","ѭ��ϵͳ","�ڷ���ϵͳ","�˶�ϵͳ","����ϵͳ");
	ObservableList<String> signList = FXCollections.observableArrayList("��","��");
	
	@FXML
	private ChoiceBox<String> type;//ҩƷ���
	@FXML
	private ChoiceBox<String> sign;
	@FXML
	private void initialize(){
		type.setValue("��ϵͳ");
		sign.setValue("��");
		type.setItems(typeList);
		sign.setItems(signList);
	}
	public void setStage(Stage stage) {
		this.stage=stage;
	}
	
	@FXML
	private void fanhui(ActionEvent event){
		Stage c = BeanContext.getStage("i");
		c.show();
		BeanContext.getStage("k").close();
	}
	@FXML
	private void baocun(ActionEvent event){
		Stage c = BeanContext.getStage("q");
		c.show();
			DataSave.saveProduct(name.getText(),code.getText()+"|"+name.getText()+"|"+type.getValue()+"|"+sign.getValue());
	}

}
