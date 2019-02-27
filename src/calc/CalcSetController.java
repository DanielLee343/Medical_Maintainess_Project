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
	ObservableList<String> typeList = FXCollections.observableArrayList("普通门诊","定点药店购药","急诊抢救","普通住院");
	ObservableList<String> hoslevelList = FXCollections.observableArrayList("一级医院","二级医院","三级医院","社区医院");
	
	@FXML
	private ChoiceBox<String> type;
	@FXML
	private ChoiceBox<String> hoslevel;
	
	

	@FXML
	private void initialize(){
		System.out.println("1"+type.getValue());
		type.setValue("普通门诊");
		System.out.println("2"+type.getValue());
		hoslevel.setValue("一级医院");
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
		//参数计算

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
		if(name.getText() =="建国前老工人" ){
			return 3000;
		}
		else if(name.getText() =="老红军"){
			return 2000;
		}
		else if(name.getText() == "离休"){
			return 1500;
		}
		else if(name.getText() == "退休"){
			return 1200;
		}
		else if(name.getText() =="在职"){
			return 800;
		}
		else{return 0;}
	}
	public int qifu(){
		switch(name.getText()){
		case"建国前老工人":
			switch(type1){
			case"普通门诊":
				switch(hoslevel1){
				case"一级医院":
					return 600;
				case"二级医院":
					return 500;
				case"三级医院":
					return 450;
				case"社区医院":
					return 400;
			}break;
			case"定点药店购药":
				switch(hoslevel1){
				case"一级医院":
					return 500;
				case"二级医院":
					return 450;
				case"三级医院":
					return 400;
				case"社区医院":
					return 350;
			}				
				break;
			case"急诊抢救":
				switch(hoslevel1){
				case"一级医院":
					return 700;
				case"二级医院":
					return 600;
				case"三级医院":
					return 500;
				case"社区医院":
					return 400;
			}				
				break;
			case"普通住院":	
				switch(hoslevel1){
				case"一级医院":
					return 1500;
				case"二级医院":
					return 1200;
				case"三级医院":
					return 1000;
				case"社区医院":
					return 800;
			}		
				break;
		}break;
		case"老红军":switch(type1){
		case"普通门诊":
			switch(hoslevel1){
			case"一级医院":
				return 550;
			case"二级医院":
				return 400;
			case"三级医院":
				return 350;
			case"社区医院":
				return 300;
		}break;
		case"定点药店购药":
			switch(hoslevel1){
			case"一级医院":
				return 400;
			case"二级医院":
				return 350;
			case"三级医院":
				return 200;
			case"社区医院":
				return 150;
		}				
			break;
		case"急诊抢救":
			switch(hoslevel1){
			case"一级医院":
				return 600;
			case"二级医院":
				return 500;
			case"三级医院":
				return 450;
			case"社区医院":
				return 400;
		}				
			break;
		case"普通住院":	
			switch(hoslevel1){
			case"一级医院":
				return 1200;
			case"二级医院":
				return 1000;
			case"三级医院":
				return 800;
			case"社区医院":
				return 700;
		}		
			break;
	}break;
		case"离休":switch(type1){
		case"普通门诊":
			switch(hoslevel1){
			case"一级医院":
				return 600;
			case"二级医院":
				return 550;
			case"三级医院":
				return 450;
			case"社区医院":
				return 400;
		}break;
		case"定点药店购药":
			switch(hoslevel1){
			case"一级医院":
				return 350;
			case"二级医院":
				return 300;
			case"三级医院":
				return 250;
			case"社区医院":
				return 200;
		}				
			break;
		case"急诊抢救":
			switch(hoslevel1){
			case"一级医院":
				return 550;
			case"二级医院":
				return 500;
			case"三级医院":
				return 450;
			case"社区医院":
				return 350;
		}				
			break;
		case"普通住院":	
			switch(hoslevel1){
			case"一级医院":
				return 1000;
			case"二级医院":
				return 900;
			case"三级医院":
				return 800;
			case"社区医院":
				return 700;
		}		
			break;
	}break;
		case"在职":
		switch(type1){
		case"普通门诊":
			switch(hoslevel1){
			case"一级医院":
				return 600;
			case"二级医院":
				return 550;
			case"三级医院":
				return 450;
			case"社区医院":
				return 400;
		}break;
		case"定点药店购药":
			switch(hoslevel1){
			case"一级医院":
				return 350;
			case"二级医院":
				return 300;
			case"三级医院":
				return 250;
			case"社区医院":
				return 200;
		}				
			break;
		case"急诊抢救":
			switch(hoslevel1){
			case"一级医院":
				return 550;
			case"二级医院":
				return 500;
			case"三级医院":
				return 450;
			case"社区医院":
				return 350;
		}				
			break;
		case"普通住院":	
			switch(hoslevel1){
			case"一级医院":
				return 1000;
			case"二级医院":
				return 900;
			case"三级医院":
				return 800;
			case"社区医院":
				return 700;
		}		
			break;
	}break;
		case"退休":switch(type1){
		case"普通门诊":
			switch(hoslevel1){
			case"一级医院":
				return 600;
			case"二级医院":
				return 550;
			case"三级医院":
				return 450;
			case"社区医院":
				return 400;
		}break;
		case"定点药店购药":
			switch(hoslevel1){
			case"一级医院":
				return 350;
			case"二级医院":
				return 300;
			case"三级医院":
				return 250;
			case"社区医院":
				return 200;
		}				
			break;
		case"急诊抢救":
			switch(hoslevel1){
			case"一级医院":
				return 550;
			case"二级医院":
				return 500;
			case"三级医院":
				return 450;
			case"社区医院":
				return 350;
		}				
			break;
		case"普通住院":	
			switch(hoslevel1){
			case"一级医院":
				return 1000;
			case"二级医院":
				return 900;
			case"三级医院":
				return 800;
			case"社区医院":
				return 700;
		}		
			break;
	}break;
		}
		return 0;
	
	}
}


