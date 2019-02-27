package medical;



import java.io.IOException;
import java.util.HashMap;

import calc.CalcResultController;
import diagnosis.DiagnosisInfoController;
import diseases.DiseasesInfoController;
/*import basicMedicalIformation.HomePageInterface;
import basicMedicalIformation.VirusInterface;*/
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import judge.DeletingSucController;
import medicine.MedicineIndiController;
import medicine.MedicineInfoController;
import start.LoginController;
/*import publicBusiness.HomePageInterface2;*/

public class BeanContext {
	private static HashMap<String,Stage> stages = new HashMap<>();
	private static HashMap<String,Object> controllers = new HashMap<>();
	static{
		try{
		createStage("Login.fxml","a",LoginController.class);
		createStage("ChooseClas.fxml","b",LoginController.class);
		
		
		createStage("Medicineinfo.fxml","c",MedicineInfoController.class);
		createStage("MedicineIndi.fxml","d",MedicineInfoController.class);
		createStage("Medicineedit.fxml","e",MedicineInfoController.class);
		createStage("Blank.fxml","d",MedicineInfoController.class);
/*		createStage("Blank2.fxml","d",MedicineInfoController.class);*/

		
		createStage("Diagnosisinfo.fxml","f",DiagnosisInfoController.class);
		createStage("Diagnosisindi.fxml","g",DiagnosisInfoController.class);
		createStage("DiagnosisEdit.fxml","h",DiagnosisInfoController.class);
		
		createStage("Diseasesinfo.fxml","i",DiseasesInfoController.class);
		createStage("DiseasesIndi.fxml","j",DiseasesInfoController.class);
		createStage("DiseasesEdit.fxml","k",DiseasesInfoController.class);
		
		createStage("Calcset.fxml","l",CalcResultController.class);
		createStage("CalcResult.fxml","m",CalcResultController.class);
		createStage("CalcInfo.fxml","r",CalcResultController.class);
/*		createStage("Asdf.fxml","x",CalcResultController.class);*/
		

		createStage("DeletingSuc.fxml","o",DeletingSucController.class);

		createStage("SavingSuc.fxml","q",DeletingSucController.class);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	private static void createStage(String stageName,String key,Class<?> className){
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(className.getResource(stageName));
		//loader.setLocation(className.getResource(stageName));
		System.out.println();
	    try {
			BorderPane loginrView = (BorderPane) loader.load();
			Scene scene = new Scene(loginrView); 
			Object con = loader.getController();
			controllers.put(key,con );			
			stage.setScene(scene);
			stage.setTitle("医疗信息管理系统");
			stages.put(key, stage);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	    

	}
	public static Stage getStage(String key){
		System.out.println(stages.get(key));
		return stages.get(key);
	}
	public static Object getController(String key){
		return controllers.get(key);
	}
}