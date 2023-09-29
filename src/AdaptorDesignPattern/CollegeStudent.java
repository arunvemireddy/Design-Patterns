package AdaptorDesignPattern;

public class CollegeStudent implements Student{
	
	public String name;
	public String surname;
	public String email;
	
	

	public CollegeStudent(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return surname;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public String toString() {
		return "CollegeStudent [name=" + name + ", surname=" + surname + ", email=" + email + "]";
	}
	
	

}
