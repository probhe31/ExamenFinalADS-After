package becas.students.domain.entity;

public class Student implements IBecable{

	private String firstName;
	private String lastName;
	
	public Student(String firstname, String lastname)  {
	
		this.firstName = firstname;
		this.lastName = lastname;
	}
	
	public String getLastName() {
 		return lastName;
 	}

 	public void setLastName(String lastName) {
 		this.lastName = lastName;
 	}
	 	
 	public String getFirstName() {
 		return firstName;
 	}

 	public void setFirstName(String firstName) {
 		this.firstName = firstName;
 	}

	@Override
	public float CalcularMonto() {
		
		return 0;
	}
	 	 	
	
}
