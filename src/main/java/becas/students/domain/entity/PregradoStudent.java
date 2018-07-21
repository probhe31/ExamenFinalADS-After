package becas.students.domain.entity;

public class PregradoStudent extends Student{

	public PregradoStudent(String firstname, String lastname) {
		super(firstname, lastname);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public float CalcularMonto() {
		
		return 500;
	}

}
