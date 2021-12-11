package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;




public class addteachersql {
	static final String JDBC_DRIVER="org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://localhost/cms";
	static final String USER = "postgres";
	 static final String PASS = "assquell";
	
	public static void writeToDatabase(String teaname, String teaeducation, String teacontact, String teaid, String teadepartment, String teaemail, String teadob ) {
		String name = teaname;
		String education = teaeducation;
		String contact = teacontact;
		String id = teaid;
		String department = teadepartment;
		String email = teaemail;
		String dob = teadob;
		
		String query = "INSERT into teachers(name,education,phone,employee_id,department,email,dob) VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
				PreparedStatement pst = con.prepareStatement(query))
		{
		System.out.println("Connecting to database...");
		
		
		pst.setString(1, name);
		pst.setString(2, education);
		pst.setString(3, contact);
		pst.setString(4, id);
		pst.setString(5, department);
		pst.setString(6,email);
		pst.setString(7, dob);
		pst.executeUpdate();
		System.out.println("successfully created");
		
		
		
	}catch(Exception e)
		{
		System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		System.exit(0);
		}}}
	

