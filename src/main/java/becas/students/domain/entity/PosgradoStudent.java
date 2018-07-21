package becas.students.domain.entity;

public class PosgradoStudent extends Student {

	public PosgradoStudent(String firstname, String lastname) {
		super(firstname, lastname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float CalcularMonto() {
		
		return 1500;
	}
	
}
