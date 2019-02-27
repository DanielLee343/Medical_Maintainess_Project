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
	
	ObservableList<String> typeList = FXCollections.observableArrayList("��λ��","����","���Ʒ�","����","��������");
	ObservableList<String> levelList = FXCollections.observableArrayList("����","����","����");
	ObservableList<String> hoslevelList = FXCollections.observableArrayList("һ��ҽԺ","����ҽԺ","����ҽԺ","����ҽԺ");
	ObservableList<String> judgeList = FXCollections.observableArrayList("��","��");
	
	@FXML
	private ChoiceBox<String> type;//ҩƷ���
	@FXML
	private ChoiceBox<String> hoslevel;//ҩƷ���
	@FXML
	private ChoiceBox<String> level;//�շ���Ŀ�ȼ�
	@FXML
	private ChoiceBox<String> judge;//�Ƿ���Ҫ����
	@FXML
	private void initialize(){
		type.setValue("��λ��");
		level.setValue("����");
		hoslevel.setValue("һ��ҽԺ");
		judge.setValue("��");
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
		//д�������
	}
}
