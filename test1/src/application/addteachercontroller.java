package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class addteachercontroller {

    @FXML
    private Button teacheradd;

    @FXML
    private TextField teacontact;

    @FXML
    private TextField teadepartment;

    @FXML
    private TextField teadob;

    @FXML
    private TextField teaeducation;

    @FXML
    private TextField teaemail;

    @FXML
    private TextField teaid;

    @FXML
    private TextField teaname;

    @FXML
    void addata(ActionEvent event) {
    	System.out.println(teaname.getText());
    	System.out.println(teaeducation.getText());
    	System.out.println(teacontact.getText());
    	System.out.println(teaid.getText());
    	System.out.println(teadepartment.getText());
    	System.out.println(teaemail.getText());
    	System.out.println(teadob.getText());
    	
    	addteachersql.writeToDatabase(teaname.getText(),teaeducation.getText(),teacontact.getText(),
    			teaid.getText(),teadepartment.getText(),teaemail.getText(),teadob.getText());

    }

    }


