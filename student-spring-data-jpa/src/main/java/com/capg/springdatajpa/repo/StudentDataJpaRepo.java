package com.capg.springdatajpa.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springdatajpa.model.Student;

public interface StudentDataJpaRepo extends JpaRepository<Student, Integer>{

}
