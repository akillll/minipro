package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class addstudentcontroller {

    @FXML
    private Button addstudent;

    @FXML
    private TextField studadmissionno;

    @FXML
    private TextField studbranch;

    @FXML
    private TextField studcontact;

    @FXML
    private TextField studdob;

    @FXML
    private TextField studemail;

    @FXML
    private TextField studname;

    @FXML
    private TextField studrollno;

    @FXML
    private TextField studsemester;

    @FXML
    void addata(ActionEvent event) {
    	System.out.println(studname.getText());
    	System.out.println(studbranch.getText());
    	System.out.println(studcontact.getText());
    	System.out.println(studemail.getText());
    	System.out.println(studrollno.getText());
    	System.out.println(studsemester.getText());
    	System.out.println(studadmissionno.getText());
    	System.out.println(studdob.getText());
    	addstudentsql.writeToDatabase(studname.getText(),studbranch.getText(),studcontact.getText(),
    			studemail.getText(),studrollno.getText(),studsemester.getText(),studadmissionno.getText(),
    			studdob.getText());

    }

}

