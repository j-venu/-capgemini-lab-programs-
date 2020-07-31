package com.capg.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springdatajpa.model.Student;
import com.capg.springdatajpa.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@GetMapping("/students/id/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getStudent(id);
	}
	
	@GetMapping("/students")
	public List<Student> getAllstudents(){
		return service.getAllStudents();
	}
	
	@DeleteMapping("/students/id/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
}
