package becas.students.application.dto;

import becas.common.application.dto.RequestBaseDto;

public class StudentsDto extends RequestBaseDto {

	private String firstName;
	private String lastName;
	
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

 	
}
