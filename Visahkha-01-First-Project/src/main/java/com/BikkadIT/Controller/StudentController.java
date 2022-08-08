package com.BikkadIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Service.ServiceIMPL;
import com.BikkadIT.model.Student;

@RestController
public class StudentController {
	@Autowired
	private ServiceIMPL serviceIMPL;
	
	@PostMapping(value="/saveStudent" ,consumes = { "application/json","application/xml" },produces = { "application/json","application/xml"})
	public int saveStudent(@RequestBody Student student) {
		
		int saveStudent = serviceIMPL.SaveStudent(student);
		
		
		return saveStudent;
		
	}

	
	@GetMapping(value="/GetAllStudent" ,produces = { "application/json","application/xml"})
	public List<Student> getAllStudent(@RequestBody Student student) {
		
		List<Student>list=serviceIMPL.getAllStudent();
		
		return list;
		
	}
	@GetMapping(value="/getByStudentAge/{studentAge}",produces = { "application/json","application/xml"})
	public Student getByStudentAge(@PathVariable String studentAge) {
		Student student = serviceIMPL.getByStudentAge(studentAge);
		
		return student;
			
			
}
}