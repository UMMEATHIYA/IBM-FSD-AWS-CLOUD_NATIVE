package org.example.spring_jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.example.spring_jdbc.model.Student;
public class StudentServiceImpl implements StudentService {
	
	private DataSource dataSource;
	private List<Student> students;

	public StudentServiceImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

private Connection connection;
	
	{
		students=new ArrayList<Student>();
	}

	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public Student createStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=dataSource.getConnection();
		PreparedStatement pStatement=connection.prepareStatement("insert into studentdup(id,first_name,last_name,email)"
				+ "values(?,?,?,?)");
		pStatement.setInt(1, student.getId());
		pStatement.setString(2, student.getFirstName());
		pStatement.setString(3, student.getLastName());
		pStatement.setString(4, student.getEmail());
		pStatement.executeUpdate();
		return student;
	}


	@Override
	public List<Student> getAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=dataSource.getConnection();
		ResultSet rs;
		Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery("select * from studentdup");
		while(resultset.next())
		{
			students.add(new Student(resultset.getInt("id"),resultset.getString("first_name"),resultset.getString("last_name")
					,resultset.getString("email")));
		}
		return students;
		
	}
	public void removeStudentById(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=dataSource.getConnection();
		StringBuilder sql;
		PreparedStatement preparedStatement=connection.prepareStatement("delete from studentdup where id=?");
		preparedStatement.setInt(1, id);
		int result=preparedStatement.executeUpdate();
		if(result<=0)
		{
			System.err.println("no such record found with id: "+id); 
		}
		//System.out.println("record removed sucessfully.");
	}
	}
	

