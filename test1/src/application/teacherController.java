package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

public class teacherController {
	
	@FXML
	private AnchorPane anchor;
	Stage stage;

    @FXML
    private Button addteacher;
    
    @FXML
    private Button logout;

    @FXML
    private Button teacherhome;

    @FXML
    private Button teacherstudent;
    
    @FXML
    private Button deleteteacher;

    @FXML
    void gotoaddteacher(ActionEvent event) {
try {
    		
    		Parent root1 = FXMLLoader.load(getClass().getClassLoader().getResource("Add Teacher.fxml"));
    		Stage stage = new Stage();
    		stage.setScene(new Scene(root1));  
    		stage.show();
    	}catch(Exception e)
    	{
    		System.out.println("cant load this page");
    	}

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
    void gotostudent(ActionEvent event) {
    	try {
    		
    		Parent root1 = FXMLLoader.load(getClass().getClassLoader().getResource("Students.fxml"));
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
    
    @FXML
    void deleteteach(ActionEvent event) {
    	
    }

    }

