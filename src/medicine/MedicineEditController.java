package medicine;

import io.DataSave;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import medical.BeanContext;

public class MedicineEditController {
	Stage stage;
	@FXML TextField code;
	@FXML TextField name;
	@FXML TextField max;
	@FXML TextField frequency;
	@FXML TextField unit;
	@FXML TextField size;
	@FXML TextField days;
	ObservableList<String> typeList = FXCollections.observableArrayList("西药","中成药");
	ObservableList<String> levelList = FXCollections.observableArrayList("甲类","乙类");
	ObservableList<String> judgeList = FXCollections.observableArrayList("是","否");
	
	@FXML
	private ChoiceBox<String> type;//药品类别
	@FXML
	private ChoiceBox<String> level;//收费项目等级
	@FXML
	private ChoiceBox<String> judge;//是否需要审批
	@FXML
	public void initialize(){
		type.setValue("西药");
		level.setValue("甲类");
		judge.setValue("是");
		type.setItems(typeList);
		level.setItems(levelList);
		judge.setItems(judgeList);
	}
	public void setStage(Stage stage) {
		this.stage=stage;
	}

	@FXML
	public void fanhui(ActionEvent event){
		Stage c = BeanContext.getStage("c");
		c.show();
		BeanContext.getStage("e").close();
	}
	@FXML
	public void baocun(ActionEvent event){
		
		DataSave.saveProduct(name.getText(),code.getText()+"|"+name.getText()+"|"+type.getValue()+"|"+level.getValue()+"|"+max.getText()+"|"+judge.getValue()+"|"+frequency.getText()+"|"+unit.getText()+"|"+size.getText()+"|"+days.getText());
		Stage c = BeanContext.getStage("q");
		c.show();
	}
}
