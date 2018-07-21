package becas.students.domain.entity;

public class DoctoradoStudent extends Student{

	public DoctoradoStudent(String firstname, String lastname) {
		super(firstname, lastname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float CalcularMonto() {
		
		return 58500;
	}
	
}
