package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
