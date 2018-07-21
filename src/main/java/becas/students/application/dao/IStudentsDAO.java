package becas.students.application.dao;

import java.util.List;

import becas.students.domain.entity.Student;



public interface IStudentsDAO {

	public List<Student> getallStudents();
	public List<Student> getallPosgradoStudents();
	public List<Student> getallPregradoStudents();
	public List<Student> getallDoctoradoStudents();
	public float getMontoById(int idStudent);
	public Student fintStudentById(int idStudent);
	
	
}


