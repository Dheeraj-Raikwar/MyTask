package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.Student;
import com.spring.demo.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	public Student save(Student student) {
		Student stu=new Student();
		stu.setId(student.getId());
		stu.setName(student.getName());
		stu.setPhoneno(student.getPhoneno());
		stu.setAge(student.getAge());
		return repo.save(stu);
	}

}
