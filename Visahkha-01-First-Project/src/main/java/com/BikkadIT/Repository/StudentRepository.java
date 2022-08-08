package com.BikkadIT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	public Student getByStudentAge(String studentAge);
	

}
