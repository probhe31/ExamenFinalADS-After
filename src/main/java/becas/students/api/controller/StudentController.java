package becas.students.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import becas.common.api.controller.ResponseHandler;
import becas.students.application.StudentsApplicationService;
import becas.students.domain.entity.Student;

@RestController
@RequestMapping("api/Students/")
public class StudentController {
	
	@Autowired
	StudentsApplicationService studentsApplicationService;

	@Autowired
	ResponseHandler responseHandler;	
		     					
	@CrossOrigin(origins = "*")   		   
    @RequestMapping(method = RequestMethod.GET, value = "/student")
	public List<Student> getallstudent() throws Exception{
	   return studentsApplicationService.getallStudents();
	}
	
	@CrossOrigin(origins = "*")   		   
    @RequestMapping(method = RequestMethod.GET, value = "/student/posgrado")
	public List<Student> getallposgradostudent() throws Exception{
	   return studentsApplicationService.getallStudentsPostgrado();
	}
	
	@CrossOrigin(origins = "*")   		   
    @RequestMapping(method = RequestMethod.GET, value = "/student/pregrado")
	public List<Student> getallpregradostudent() throws Exception{
	   return studentsApplicationService.getallStudentsPregrado();
	}
	
	@CrossOrigin(origins = "*")   		   
    @RequestMapping(method = RequestMethod.GET, value = "/student/doctorado")
	public List<Student> getalldoctoradostudent() throws Exception{
	   return studentsApplicationService.getallStudentsDoctorado();
	}
	
	@CrossOrigin(origins = "*")   		   
    @RequestMapping(method = RequestMethod.GET, value = "/student/doctorado")
	public float getmontbyid(int idStudent) throws Exception{
	   return studentsApplicationService.getMontoById(idStudent);
	}

}
