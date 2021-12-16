package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class mainController {

    @FXML
    private ImageView loginimage;
    @FXML
    private Label loginlabel;
    @FXML
    private ImageView loginlogo;

    @FXML
    private PasswordField passinput;

    @FXML
    private Button submitbutton;

    @FXML
    private TextField textinput;
    
    @FXML
    private Button Loginbutton;

    @FXML
    void gotoselecctionpage(ActionEvent event) {
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
   
    public void getData(ActionEvent event) {
    	System.out.println(textinput.getText());
    	System.out.println(passinput.getText());
    	Maincontrolsql.writeToDatabase(textinput.getText(),passinput.getText());
    }
    

}



