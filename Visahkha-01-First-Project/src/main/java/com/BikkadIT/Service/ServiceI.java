package com.BikkadIT.Service;

import java.util.List;

import com.BikkadIT.model.Student;

public interface ServiceI {
	
	

	public int SaveStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getByStudentAge(String studentAge);

	
	
}
