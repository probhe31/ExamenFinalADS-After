package becas.students.application;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import becas.common.application.Notification;
import becas.common.application.enumeration.RequestBodyType;
import becas.students.application.dao.StudentsDAO;
import becas.students.application.dto.StudentsDto;
import becas.students.domain.entity.Student;
import becas.students.domain.repository.StudentRepository;

@Service()
public class StudentsApplicationService {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	StudentsDAO studentDAO;
	
	
	
	
	@Transactional
	public List<Student> getallStudents() {
		return studentDAO.getallStudents();		
	}
	
	@Transactional
	public List<Student> getallStudentsPregrado() {
		return studentDAO.getallPregradoStudents();		
	}
	
	
	@Transactional
	public List<Student> getallStudentsPostgrado() {
		return studentDAO.getallPosgradoStudents();		
	}
	
	
	@Transactional
	public List<Student> getallStudentsDoctorado() {
		return studentDAO.getallDoctoradoStudents();		
	}
	
	
	private Notification validation(StudentsDto studentDto) {
		Notification notification = new Notification();
		if (studentDto == null || studentDto.getRequestBodyType() == RequestBodyType.INVALID) {
			notification.addError("Invalid JSON data in request body.");
		}
		return notification;
	}
		
	
	public float getMontoById(int idStudent) {
		return studentDAO.getMontoById(idStudent);
	}

	
	
}
