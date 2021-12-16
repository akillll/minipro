package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class deleteteachersql {
	static final String JDBC_DRIVER="org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://localhost/cms";
	static final String USER = "postgres";
	 static final String PASS = "assquell";
	 
	 
	 @FXML
	    private TextField getemployeeid;
		
	 
	 /*public static void writeToDatabase(String getrollno) {
		 Alert a = new Alert(AlertType.NONE);
		 String sql = "delete from students where roll_no = ?";
		 String rollstr = getrollno;
		 try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
					PreparedStatement pst = con.prepareStatement(sql)){
			 	pst = con.prepareStatement(sql);
	            pst.setString(1, rollstr);
	            pst.execute();
	            a.setAlertType(AlertType.CONFIRMATION);
	             a.setContentText("deleted successfully");
	             a.show();
	            
			 
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }*/
	 public static void writeToDatabase(String getemployeeid) {
			String id = getemployeeid;
			
			
			
			String query = "DELETE from teachers where employee_id = ?";
			
			try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
					PreparedStatement pst = con.prepareStatement(query))
			{
			System.out.println("deleting");
			
			
			pst.setString(1, id);
			
			pst.executeUpdate();
			System.out.println("deleted teacher");
			
			 }catch(Exception e)
			{
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
			System.exit(0);
			}
			
			
		
		
		
	}

}
