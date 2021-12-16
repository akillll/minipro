package application;


public class tablestudent {
	

	
	private String admission_no;
	private String branch;
	private String phone_no;
	private String dob;
	private String email;
	private String name;
	private String roll_no;
	private String semester;
	
	

	



	public String getSemester() {
		return semester;
	}



	public void setSemester(String semester) {
		this.semester = semester;
	}



	public String getRoll_no() {
		return roll_no;
	}



	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getPhone_no() {
		return phone_no;
	}



	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}



	public String getAdmission_no() {
		return admission_no;
	}



	public void setAdmission_no(String admission_no) {
		this.admission_no = admission_no;
	}
	
	public tablestudent(String admission_no, String branch, String phone_no, String dob, String email, String name,
			String roll_no, String semester) {
		super();
		this.setAdmission_no(admission_no);
		this.setBranch(branch);
		this.setPhone_no(phone_no);
		this.setDob(dob);
		this.setEmail(email);
		this.setName(name);
		this.setRoll_no(roll_no);
		this.setSemester(semester);
	}



	/*public tablestudent(String tablestudadmission,String tablestudname, String tablestudroll, 
			 String tablestudcontact,String tablestudemail, String tablestuddob,String tablestudbranch,
			 String tablestudsem) {
		super();
		this.tablestudadmission = tablestudadmission;
		this.tablestudbranch = tablestudbranch;
		this.tablestudcontact = tablestudcontact;
		this.tablestuddob = tablestuddob;
		this.tablestudemail = tablestudemail;
		this.tablestudname = tablestudname;
		this.tablestudroll = tablestudroll;
		this.tablestudsem = tablestudsem;
	}*/

}
