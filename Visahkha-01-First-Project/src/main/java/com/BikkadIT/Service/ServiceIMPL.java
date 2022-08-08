package com.BikkadIT.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Repository.StudentRepository;
import com.BikkadIT.model.Student;

@Service
public class ServiceIMPL  implements ServiceI{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public int SaveStudent(Student student) {
			Student save = studentRepository.save(student);
			return save.getStudentId();
		
		
	}
	@Override
	public List<Student> getAllStudent() {
		 
		 List<Student> list = studentRepository.findAll();
		 return list;
	}
	
	
    @Override
	public Student getByStudentAge(String studentAge) {
		Student student = studentRepository.getByStudentAge(studentAge);
		
		return student;
	}

	
	
}
