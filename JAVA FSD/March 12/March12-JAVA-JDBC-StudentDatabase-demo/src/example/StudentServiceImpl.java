package example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Student;


public class StudentServiceImpl implements StudentService{
	private List<Student> student;
	private Connection connection;
	
	{
		student=new ArrayList<Student>();
	}

	@Override
	public List<Student> getAllStudents()throws SQLException {
		// TODO Auto-generated method stub
		connection=ConnectionFactory.getMyConnection();
		ResultSet rs;
		Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery("select * from student");
		while(resultset.next())
		{
			student.add(new Student(resultset.getInt("StudentID"),resultset.getString("first_name"),resultset.getString("last_name")
					,resultset.getInt("class"), resultset.getFloat("GPA")));
		}
		return student;
	}

	@Override
	public Student createStudent(Student student)throws SQLException {
		// TODO Auto-generated method stub
		connection=ConnectionFactory.getMyConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student(StudentID,first_name,last_name,class,GPA) values"
				+ "(?,?,?,?,?)");
		preparedStatement.setInt(1, student.getStudentId());
		preparedStatement.setString(2, student.getFirstName());
		preparedStatement.setString(3, student.getLastName());
		preparedStatement.setInt(4, student.getCls());
		preparedStatement.setFloat(5, student.getGPA());
		preparedStatement.executeUpdate();
		return student;
	}

	
}