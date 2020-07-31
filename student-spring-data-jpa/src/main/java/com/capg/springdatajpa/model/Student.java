package com.capg.springdatajpa.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String studentName;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	@Column(name="dob")
	private LocalDate date;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Student(int studentId, String studentName, LocalDate date) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.date = date;
	}
		public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", date=" + date + "]";
	}
	
	
	

}
