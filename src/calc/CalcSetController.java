package calc;

import io.DataSave;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import medical.BeanContext;

public class CalcSetController {
	Stage stage;
	@FXML TextField name;
	@FXML TextField max;
	@FXML TextField min;
	String type1;
	String hoslevel1;
	
	@FXML
	public void setStage(Stage stage) {
		this.stage=stage;
	}
	ObservableList<String> typeList = FXCollections.observableArrayList("��ͨ����","����ҩ�깺ҩ","��������","��ͨסԺ");
	ObservableList<String> hoslevelList = FXCollections.observableArrayList("һ��ҽԺ","����ҽԺ","����ҽԺ","����ҽԺ");
	
	@FXML
	private ChoiceBox<String> type;
	@FXML
	private ChoiceBox<String> hoslevel;
	
	

	@FXML
	private void initialize(){
		System.out.println("1"+type.getValue());
		type.setValue("��ͨ����");
		System.out.println("2"+type.getValue());
		hoslevel.setValue("һ��ҽԺ");
		type.setItems(typeList);
		hoslevel.setItems(hoslevelList);

	}
	
	@FXML
	public void fanhui(ActionEvent event){
		stage.close();
	}
	@FXML
	public void baocun(ActionEvent event){
		
		 type1 = type.getValue();
		 hoslevel1 = hoslevel.getValue();

		Stage c = BeanContext.getStage("q");
		c.show();
		//��������

		DataSave.saveProduct(name.getText(),name.getText()+"|"+fengding()+"|"+qifu()+"|"+percentage());
	}
	public int percentage(){
		if(qifu()>100&&qifu()<10000){
			return 20;
		}
		else if(qifu()>10001&&qifu()<20000){
			return 10;
		}
		else if(qifu()>20000){
			return 5;
		}
		else{return 0;}
		
	}
	public int fengding(){
		if(name.getText() =="����ǰ�Ϲ���" ){
			return 3000;
		}
		else if(name.getText() =="�Ϻ��"){
			return 2000;
		}
		else if(name.getText() == "����"){
			return 1500;
		}
		else if(name.getText() == "����"){
			return 1200;
		}
		else if(name.getText() =="��ְ"){
			return 800;
		}
		else{return 0;}
	}
	public int qifu(){
		switch(name.getText()){
		case"����ǰ�Ϲ���":
			switch(type1){
			case"��ͨ����":
				switch(hoslevel1){
				case"һ��ҽԺ":
					return 600;
				case"����ҽԺ":
					return 500;
				case"����ҽԺ":
					return 450;
				case"����ҽԺ":
					return 400;
			}break;
			case"����ҩ�깺ҩ":
				switch(hoslevel1){
				case"һ��ҽԺ":
					return 500;
				case"����ҽԺ":
					return 450;
				case"����ҽԺ":
					return 400;
				case"����ҽԺ":
					return 350;
			}				
				break;
			case"��������":
				switch(hoslevel1){
				case"һ��ҽԺ":
					return 700;
				case"����ҽԺ":
					return 600;
				case"����ҽԺ":
					return 500;
				case"����ҽԺ":
					return 400;
			}				
				break;
			case"��ͨסԺ":	
				switch(hoslevel1){
				case"һ��ҽԺ":
					return 1500;
				case"����ҽԺ":
					return 1200;
				case"����ҽԺ":
					return 1000;
				case"����ҽԺ":
					return 800;
			}		
				break;
		}break;
		case"�Ϻ��":switch(type1){
		case"��ͨ����":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 550;
			case"����ҽԺ":
				return 400;
			case"����ҽԺ":
				return 350;
			case"����ҽԺ":
				return 300;
		}break;
		case"����ҩ�깺ҩ":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 400;
			case"����ҽԺ":
				return 350;
			case"����ҽԺ":
				return 200;
			case"����ҽԺ":
				return 150;
		}				
			break;
		case"��������":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 600;
			case"����ҽԺ":
				return 500;
			case"����ҽԺ":
				return 450;
			case"����ҽԺ":
				return 400;
		}				
			break;
		case"��ͨסԺ":	
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 1200;
			case"����ҽԺ":
				return 1000;
			case"����ҽԺ":
				return 800;
			case"����ҽԺ":
				return 700;
		}		
			break;
	}break;
		case"����":switch(type1){
		case"��ͨ����":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 600;
			case"����ҽԺ":
				return 550;
			case"����ҽԺ":
				return 450;
			case"����ҽԺ":
				return 400;
		}break;
		case"����ҩ�깺ҩ":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 350;
			case"����ҽԺ":
				return 300;
			case"����ҽԺ":
				return 250;
			case"����ҽԺ":
				return 200;
		}				
			break;
		case"��������":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 550;
			case"����ҽԺ":
				return 500;
			case"����ҽԺ":
				return 450;
			case"����ҽԺ":
				return 350;
		}				
			break;
		case"��ͨסԺ":	
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 1000;
			case"����ҽԺ":
				return 900;
			case"����ҽԺ":
				return 800;
			case"����ҽԺ":
				return 700;
		}		
			break;
	}break;
		case"��ְ":
		switch(type1){
		case"��ͨ����":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 600;
			case"����ҽԺ":
				return 550;
			case"����ҽԺ":
				return 450;
			case"����ҽԺ":
				return 400;
		}break;
		case"����ҩ�깺ҩ":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 350;
			case"����ҽԺ":
				return 300;
			case"����ҽԺ":
				return 250;
			case"����ҽԺ":
				return 200;
		}				
			break;
		case"��������":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 550;
			case"����ҽԺ":
				return 500;
			case"����ҽԺ":
				return 450;
			case"����ҽԺ":
				return 350;
		}				
			break;
		case"��ͨסԺ":	
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 1000;
			case"����ҽԺ":
				return 900;
			case"����ҽԺ":
				return 800;
			case"����ҽԺ":
				return 700;
		}		
			break;
	}break;
		case"����":switch(type1){
		case"��ͨ����":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 600;
			case"����ҽԺ":
				return 550;
			case"����ҽԺ":
				return 450;
			case"����ҽԺ":
				return 400;
		}break;
		case"����ҩ�깺ҩ":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 350;
			case"����ҽԺ":
				return 300;
			case"����ҽԺ":
				return 250;
			case"����ҽԺ":
				return 200;
		}				
			break;
		case"��������":
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 550;
			case"����ҽԺ":
				return 500;
			case"����ҽԺ":
				return 450;
			case"����ҽԺ":
				return 350;
		}				
			break;
		case"��ͨסԺ":	
			switch(hoslevel1){
			case"һ��ҽԺ":
				return 1000;
			case"����ҽԺ":
				return 900;
			case"����ҽԺ":
				return 800;
			case"����ҽԺ":
				return 700;
		}		
			break;
	}break;
		}
		return 0;
	
	}
}


