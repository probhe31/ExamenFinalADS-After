package becas.students.application.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import becas.students.domain.entity.DoctoradoStudent;
import becas.students.domain.entity.PosgradoStudent;
import becas.students.domain.entity.PregradoStudent;
import becas.students.domain.entity.Student;

@Service
public class StudentsDAO implements IStudentsDAO {

	@Override
	public float getMontoById(int idStudent) {
		return fintStudentById(idStudent).CalcularMonto();
	}
	
	@Override 
	public Student fintStudentById(int idStudent) {
		return getallStudents().get(idStudent);
	}
	
	@Override
	public List<Student> getallStudents() {
			
		return students;
	}

	@Override
	public List<Student> getallPosgradoStudents() {
		List<Student> postgradostudents = new ArrayList<Student>();
		postgradostudents .add( students.get(6));
		postgradostudents .add( students.get(7));
		postgradostudents .add( students.get(8));		
		return postgradostudents ;
	}

	@Override
	public List<Student> getallPregradoStudents() {
		List<Student> pregadoStudents = new ArrayList<Student>();
		pregadoStudents.add( students.get(0));
		pregadoStudents.add( students.get(1));
		pregadoStudents.add( students.get(2));	
		return pregadoStudents;	
	}

	@Override
	public List<Student> getallDoctoradoStudents() {
		List<Student> doctoradostudents = new ArrayList<Student>();
		doctoradostudents.add( students.get(3));
		doctoradostudents.add( students.get(4));
		doctoradostudents.add( students.get(5));
		return doctoradostudents;
	}

	
	
	List<Student> students = new ArrayList<Student>() {{
	add(new PregradoStudent("Pedro", "Medreiros"));
	add(new PregradoStudent("Jose", "Tovar Marquino"));
	add(new PregradoStudent("Jose", "Ilizarbe Tolentino"));		
	add(new DoctoradoStudent("Alejandro", "Medreiros"));
	add(new DoctoradoStudent("Ticte", "Tovar Marquino"));
	add(new DoctoradoStudent("Grano", "Ilizarbe Tolentino"));		
	add(new PosgradoStudent("Jonas", "Medreiros"));
	add(new PosgradoStudent("Barrabas", "Tovar Marquino"));
	add(new PosgradoStudent("Keiko", "Ilizarbe Tolentino"));	
	}};
}

