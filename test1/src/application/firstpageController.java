package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class firstpageController {

    @FXML
    private Button studentbutton;

    @FXML
    private ImageView studentlogo;

    @FXML
    private Button teacherbutton;

    @FXML
    private ImageView teacherlogo;

    @FXML
    void gotostudent(ActionEvent event1) {
    	try {
    		Parent root2 = FXMLLoader.load(getClass().getClassLoader().getResource("Students.fxml"));
    		Stage stage = new Stage();
    		stage.setScene(new Scene(root2));
    		stage.show();
    	}catch(Exception e)
    	{
    		System.out.println("cant load page");
    	}

    }

    @FXML
    void gototeacher(ActionEvent event2) {
    	try {
    		Parent root3 = FXMLLoader.load(getClass().getClassLoader().getResource("Teachers.fxml"));
    		Stage stage = new Stage();
    		stage.setScene(new Scene(root3));
    		stage.show();
    	}catch(Exception e)
    	{
    		System.out.println("cant load page");
    	}

    }

}

