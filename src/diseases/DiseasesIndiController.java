package diseases;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import io.DataLoad;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import medical.BeanContext;
import medical.MainApp;
import medicine.MedicineEditController;

public class DiseasesIndiController implements Initializable{
	Stage stage;
	@FXML Label code;
	@FXML Label name;
	@FXML Label type;
	@FXML Label sign;
	Stage primaryStage= new Stage();
	
	public void setStage(Stage stage) {
		this.stage=stage;
	}
	@FXML
	private void fanhui(ActionEvent event){
		stage.close();
	}
	@FXML
	public void shanchu(ActionEvent event){
		File file = new File(name.getText()+".txt");  
	    // 路径为文件且不为空则进行删除  
	    if (file.isFile() && file.exists()) {  
	        file.delete();
		Stage c = BeanContext.getStage("o");
		c.show();}
		//写删除的代码
	}
	@FXML
	private void edit(ActionEvent event){
		showWindow();
	}
	
	public void showWindow() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation((MainApp.class.getClassLoader().getResource("diseases/DiseasesEdit.fxml")));
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("医疗基本信息维护");
			primaryStage.show();
			DiseasesEditController controller = loader.getController();
			controller.setStage(primaryStage);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO 自动生成的方法存根

		System.out.println("kongzhizhenjiance"+DataLoad.s[0]);
		code.setText(DataLoad.s[0]);
		name.setText(DataLoad.s[1]);
		type.setText(DataLoad.s[2]);
		sign.setText(DataLoad.s[3]);

	}
}
