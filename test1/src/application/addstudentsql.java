package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;




public class addstudentsql {
	static final String JDBC_DRIVER="org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://localhost/cms";
	static final String USER = "postgres";
	 static final String PASS = "assquell";
	
	public static void writeToDatabase(String studname, String studbranch, String studcontact, String studemail, String studrollno, String studsemester, String studadmissionno, String studdob ) {
		String name = studname;
		String branch = studbranch;
		String contact = studcontact;
		String email = studemail;
		String rollno = studrollno;
		String sem = studsemester;
		String admisno = studadmissionno;
		String dob = studdob;
		
		String query = "INSERT into students(name,branch,phone_no,email,roll_no,semester,admission_no,dob) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		
		try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
				PreparedStatement pst = con.prepareStatement(query))
		{
		System.out.println("Connecting to database...");
		
		
		pst.setString(1, name);
		pst.setString(2, branch);
		pst.setString(3, contact);
		pst.setString(4, email);
		pst.setString(5, rollno);
		pst.setString(6, sem);
		pst.setString(7, admisno);
		pst.setString(8, dob);
		pst.executeUpdate();
		System.out.println("successfully created");
		
		
		
	}catch(Exception e)
		{
		System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		System.exit(0);
		}}}
	

