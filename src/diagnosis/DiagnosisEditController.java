package diagnosis;

import io.DataSave;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import medical.BeanContext;

public class DiagnosisEditController {
	Stage stage;
	@FXML TextField code;
	@FXML TextField name;
	@FXML TextField unit;
	@FXML TextField factory;
	@FXML TextField notes;
	@FXML TextField area;
	
	ObservableList<String> typeList = FXCollections.observableArrayList("床位费","检查费","治疗费","诊察费","其他费用");
	ObservableList<String> levelList = FXCollections.observableArrayList("甲类","乙类","丙类");
	ObservableList<String> hoslevelList = FXCollections.observableArrayList("一级医院","二级医院","三级医院","社区医院");
	ObservableList<String> judgeList = FXCollections.observableArrayList("是","否");
	
	@FXML
	private ChoiceBox<String> type;//药品类别
	@FXML
	private ChoiceBox<String> hoslevel;//药品类别
	@FXML
	private ChoiceBox<String> level;//收费项目等级
	@FXML
	private ChoiceBox<String> judge;//是否需要审批
	@FXML
	private void initialize(){
		type.setValue("床位费");
		level.setValue("甲类");
		hoslevel.setValue("一级医院");
		judge.setValue("是");
		type.setItems(typeList);
		level.setItems(levelList);
		hoslevel.setItems(hoslevelList);
		judge.setItems(judgeList);
	}
	public void setStage(Stage stage) {
		this.stage=stage;
	}
	
	public void fanhui(ActionEvent event){
		Stage c = BeanContext.getStage("f");
		c.show();
		BeanContext.getStage("h").close();
	}
	@FXML
	public void baocun(ActionEvent event){
		DataSave.saveProduct(name.getText(),code.getText()+"|"+name.getText()+"|"+type.getValue()+"|"+level.getValue()+"|"+hoslevel.getValue()+"|"+judge.getValue()+"|"+unit.getText()+"|"+factory.getText()+"|"+notes.getText()+"|"+area.getText());
		Stage c = BeanContext.getStage("q");
		c.show();
		//写保存代码
	}
}
