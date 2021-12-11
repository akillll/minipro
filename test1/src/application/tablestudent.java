package application;

public class tablestudent {
	
	private String tablestudadmission;
	private String tablestudbranch;
	private String tablestudcontact;
	private String tablestuddob;
	private String tablestudemail;
	private String tablestudname;
	private String tablestudroll;
	private String tablestudsem;
	
	public String getTablestudadmission() {
		return tablestudadmission;
	}

	public void setTablestudadmission(String tablestudadmission) {
		this.tablestudadmission = tablestudadmission;
	}

	public String getTablestudbranch() {
		return tablestudbranch;
	}

	public void setTablestudbranch(String tablestudbranch) {
		this.tablestudbranch = tablestudbranch;
	}

	public String getTablestudcontact() {
		return tablestudcontact;
	}

	public void setTablestudcontact(String tablestudcontact) {
		this.tablestudcontact = tablestudcontact;
	}

	public String getTablestuddob() {
		return tablestuddob;
	}

	public void setTablestuddob(String tablestuddob) {
		this.tablestuddob = tablestuddob;
	}

	public String getTablestudemail() {
		return tablestudemail;
	}

	public void setTablestudemail(String tablestudemail) {
		this.tablestudemail = tablestudemail;
	}

	public String getTablestudname() {
		return tablestudname;
	}

	public void setTablestudname(String tablestudname) {
		this.tablestudname = tablestudname;
	}

	public String getTablestudroll() {
		return tablestudroll;
	}

	public void setTablestudroll(String tablestudroll) {
		this.tablestudroll = tablestudroll;
	}

	public String getTablestudsem() {
		return tablestudsem;
	}

	public void setTablestudsem(String tablestudsem) {
		this.tablestudsem = tablestudsem;
	}

	public tablestudent(String tablestudadmission, String tablestudbranch, String tablestudcontact, String tablestuddob,
			String tablestudemail, String tablestudname, String tablestudroll, String tablestudsem) {
		super();
		this.tablestudadmission = tablestudadmission;
		this.tablestudbranch = tablestudbranch;
		this.tablestudcontact = tablestudcontact;
		this.tablestuddob = tablestuddob;
		this.tablestudemail = tablestudemail;
		this.tablestudname = tablestudname;
		this.tablestudroll = tablestudroll;
		this.tablestudsem = tablestudsem;
	}

}
