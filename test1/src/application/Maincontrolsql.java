package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;





public class Maincontrolsql  {
	static final String JDBC_DRIVER="org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://localhost/cms";
	static final String USER = "postgres";
	 static final String PASS = "assquell";
	 
	
	
	
	public static void writeToDatabase(String textinput, String passinput) {
		String name = textinput;
		String pass = passinput;
		Alert a = new Alert(AlertType.NONE);
		
		String query = "INSERT into login(username,password) VALUES(?, ?)";
		
		try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
				PreparedStatement pst = con.prepareStatement(query))
		{
		System.out.println("Connecting to database...");
		
		
		pst.setString(1, name);
		pst.setString(2, pass);
		pst.executeUpdate();
		System.out.println("successfully created");
		
		 Statement statement=con.createStatement();
         String sql="SELECT * FROM login WHERE username = '"+name.toString()+"' AND password = '"+passinput.toString()+"';";
         ResultSet resultSet=statement.executeQuery(sql);

         
			if (resultSet.next()){
				a.setAlertType(AlertType.CONFIRMATION);
             a.setContentText("login success");
             a.show();
       
             
         }else {

         	a.setAlertType(AlertType.ERROR);
         	a.setContentText("incorrect email and password");
             a.show();
		
		/*int count=0;
		while(result.next())
		{
			count = count + 1;
		}
		if(count == 1)
		{
			System.out.println("login successfull");
			
		}
		else
		{
			System.out.println("username n password incorrect");
		}*/
		

		
	}}catch(Exception e)
		{
		System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		System.exit(0);
		}
		/*finally
		{
			try {
				
				connection.close();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}*/
		
	
	
	
}
	}