package AdaptorDesignPattern;

public class SchoolStudentAdaptor implements Student {
	
	private SchoolStudent schoolStudent;
	
	public SchoolStudentAdaptor(SchoolStudent schoolStudent) {
		this.schoolStudent = schoolStudent;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.schoolStudent.getFirstname();
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return this.schoolStudent.getLastname();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.schoolStudent.getLastname();
	}

	@Override
	public String toString() {
		return "SchoolStudentAdaptor [schoolStudent=" + schoolStudent + "]";
	}
	
	

}
