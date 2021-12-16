package application;


import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class studentController implements Initializable  {

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
    private TextField getrollno;
    
    /*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
    
    @FXML
    private TableView<tablestudent> studenttable;

    @FXML
    private TableColumn<tablestudent, String> tablestudadmission;
    
    @FXML
    private TableColumn<tablestudent, String> tablestudname;

    @FXML
    private TableColumn<tablestudent, String> tablestudroll;

    @FXML
    private TableColumn<tablestudent, String> tablestudcontact;
    
    @FXML
    private TableColumn<tablestudent, String> tablestudemail;

    @FXML
    private TableColumn<tablestudent, String> tablestuddob;
    
    @FXML
    private TableColumn<tablestudent, String> tablestudbranch;

    @FXML
    private TableColumn<tablestudent, String> tablestudsem;
    
    /*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    static final String JDBC_DRIVER="org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://localhost/cms";
	static final String USER = "postgres";
	 static final String PASS = "assquell";
    
    

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
	System.out.println(getrollno.getText());
	
	deletestudentsql.writeToDatabase(getrollno.getText());
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

/*========================================================================================================================*/
/*========================================================================================================================*/
/*========================================================================================================================*/

ObservableList<tablestudent> listview = FXCollections.observableArrayList();

@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);)
	{
		System.out.println("connection successful");
		String sql = "select * from students";
		Statement s = con.createStatement();
		ResultSet r = s.executeQuery(sql);
		
		
		while(r.next())
		{
			System.out.println(r.getString("admission_no"));
			listview.add(new tablestudent(r.getString("admission_no"),
					r.getString("name"),
					r.getString("roll_no"),
					r.getString("phone_no"),
					r.getString("email"),
					r.getString("dob"),
					r.getString("branch"),
					r.getString("semester")));
		}
		studenttable.setItems(listview);
		
		
	}catch(Exception e)
	{
	System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	System.exit(0);
	}
	
	tablestudadmission.setCellValueFactory(new PropertyValueFactory<>("admission_no"));
	tablestudname.setCellValueFactory(new PropertyValueFactory<>("name"));
	tablestudroll.setCellValueFactory(new PropertyValueFactory<>("roll_no"));
	tablestudcontact.setCellValueFactory(new PropertyValueFactory<>("phone_no"));
	tablestudemail.setCellValueFactory(new PropertyValueFactory<>("email"));
	tablestuddob.setCellValueFactory(new PropertyValueFactory<>("dob"));
	tablestudbranch.setCellValueFactory(new PropertyValueFactory<>("branch"));
	tablestudsem.setCellValueFactory(new PropertyValueFactory<>("semester"));
	
	
	
	
}


}