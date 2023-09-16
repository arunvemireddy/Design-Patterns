package AdaptorDesignPattern;

public class SchoolStudent {
	
	private String firstname;
	private String lastname;
	private String emailaddress;
	
	public SchoolStudent(String firstname, String lastname, String emailaddress) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailaddress = emailaddress;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	@Override
	public String toString() {
		return "SchoolStudent [firstname=" + firstname + ", lastname=" + lastname + ", emailaddress=" + emailaddress
				+ "]";
	}
	
	
}
