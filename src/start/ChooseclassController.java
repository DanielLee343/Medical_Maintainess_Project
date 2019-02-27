package start;

import calc.CalcInfoController;
import diagnosis.DiagnosisIndiController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import medical.BeanContext;
import medical.MainApp;

	public class ChooseclassController {
		Stage primaryStage= new Stage();
		
		
		@FXML
		private void onButtonClick1(ActionEvent event){
			Stage c = BeanContext.getStage("c");
			c.show();
			BeanContext.getStage("b").close();
		}
		@FXML
		private void onButtonClick2(ActionEvent event){
			Stage c = BeanContext.getStage("f");
			c.show();
			BeanContext.getStage("b").close();
		}
		@FXML
		private void onButtonClick3(ActionEvent event){
			Stage c = BeanContext.getStage("i");
			c.show();
			BeanContext.getStage("b").close();
		}
		@FXML
		private void onButtonClick4(ActionEvent event){
			showWindow();
		}
		public void showWindow() {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation((MainApp.class.getClassLoader().getResource("calc/CalcInfo.fxml")));//装载布局文件
				Parent root = (Parent) loader.load();
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);//装载场景
				primaryStage.setTitle("医疗基本信息维护");
	            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				//Css控制样式
				primaryStage.show();
				//primaryStage.getIcons().add(
						//new Image ("file:resources/images/thomas.png"));
				CalcInfoController controller = loader.getController();//绑定控制器
				//controller.setMainApp();
				controller.setStage(primaryStage);
			
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
}
