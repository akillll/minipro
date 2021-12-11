package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class studentController  {

	@FXML
	private AnchorPane anchor;
	Stage stage;

	@FXML
    private Button addstudent;
    
    @FXML
    private Button logout;

    @FXML
    private Button studenthome;

    @FXML
    private Button studentteacher;
    
    @FXML
    private Button deletestudent;
    
    

    @FXML
    void gotoaddstudent(ActionEvent event3) {
try {
    		
    		Parent root1 = FXMLLoader.load(getClass().getClassLoader().getResource("Add Student.fxml"));
    		Stage stage = new Stage();
    		stage.setScene(new Scene(root1));  
    		stage.show();
    	}catch(Exception e)
    	{
    		System.out.println("cant load this page");
    	}

    }



@FXML
void deletestud(ActionEvent event) {

}

@FXML
void gotohome(ActionEvent event) {
	try {
		
		Parent root1 = FXMLLoader.load(getClass().getClassLoader().getResource("firstpage.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));  
		stage.show();
	}catch(Exception e)
	{
		System.out.println("cant load this page");
	}

}

@FXML
void gototeacher(ActionEvent event) {
	try {
		
		Parent root1 = FXMLLoader.load(getClass().getClassLoader().getResource("Teachers.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));  
		stage.show();
	}catch(Exception e)
	{
		System.out.println("cant load this page");
	}

}

@FXML
void logout(ActionEvent event) {
	stage = (Stage) anchor.getScene().getWindow();
	System.out.println("logged out from student");
	stage.close();

}


}