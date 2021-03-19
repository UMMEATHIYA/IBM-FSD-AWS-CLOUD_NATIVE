package org.example.spring_jdbc.service;

import java.sql.SQLException;
import java.util.List;

import org.example.spring_jdbc.model.Student;



public interface StudentService {
	
	public Student createStudent(Student student) throws SQLException;
	

	public void removeStudentById(int id) throws SQLException;

	public List<Student> getAllStudents() throws SQLException;

}
