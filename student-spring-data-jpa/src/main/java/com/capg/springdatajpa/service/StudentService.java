package com.capg.springdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springdatajpa.model.Student;
import com.capg.springdatajpa.repo.StudentDataJpaRepo;


@Service
public class StudentService{
	
	@Autowired
	StudentDataJpaRepo dataJpaRepo;
	
	@Transactional
	public Student addStudent(Student Student) {
		//return repo.addStudent(Student);
		if(dataJpaRepo.existsById(Student.getStudentId())){
			throw new RuntimeException("Student Already Exists");
		}
		return dataJpaRepo.save(Student);
	}
	
	@Transactional
	public Student getStudent(int StudentId) {
		//return repo.getStudentById(StudentId);

		return dataJpaRepo.getOne(StudentId);
	}
	
	@Transactional
	public List<Student> getAllStudents(){
		// return repo.getAllStudents();
		
		return dataJpaRepo.findAll();
	
	}
	
	@Transactional
	public void deleteStudent(int StudentId) {
		//repo.deleteStudentById(StudentId);
		
		dataJpaRepo.deleteById(StudentId);
	}
	
	public Student updateStudent(Student Student) {
		Student tr=dataJpaRepo.getOne(Student.getStudentId());
		tr.setStudentName(Student.getStudentName());
		tr.setDate(Student.getDate());
		tr.setStudentName(Student.getStudentName());
		return dataJpaRepo.save(tr);
		
	}
	
	
	
} 
