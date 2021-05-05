package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Student;
import com.spring.demo.repository.StudentRepo;
import com.spring.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
	@Autowired
	private StudentService service;
	
	@GetMapping("get")
	public List<Student> getStudent() {
		return repo.findAll();
	}

	@PostMapping("saveStudent")
	public Student save(@RequestBody Student student) {
		return service.save(student);
	}
}
