package example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Employee;
import exception.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService{
	private List<Employee> employees;
	private Connection connection;
	
	{
		employees=new ArrayList<Employee>();
	}

	@Override
	public List<Employee> getAllEmployees()throws SQLException {
		// TODO Auto-generated method stub
		connection=ConnectionFactory.getMyConnection();
		ResultSet rs;
		Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery("select * from employees");
		while(resultset.next())
		{
			employees.add(new Employee(resultset.getInt("id"),resultset.getString("first_name"),resultset.getString("last_name")
					,resultset.getString("email"), resultset.getInt("salary"),resultset.getInt("bonus")));
		}
		return employees;
	}

	@Override
	public Employee createEmployee(Employee employee)throws SQLException {
		// TODO Auto-generated method stub
		connection=ConnectionFactory.getMyConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into employees(id,first_name,last_name,email,salary,bonus) values"
				+ "(?,?,?,?,?,?)");
		preparedStatement.setInt(1, employee.getId());
		preparedStatement.setString(2, employee.getFirstName());
		preparedStatement.setString(3, employee.getLastName());
		preparedStatement.setString(4, employee.getEmail());
		preparedStatement.setInt(5, employee.getSalary());
		preparedStatement.setInt(6, employee.getBonus());
		preparedStatement.executeUpdate();
		return employee;
	}
	public void removeEmployeeById(int id) throws SQLException, EmployeeNotFoundException {
		// TODO Auto-generated method stub
		connection=ConnectionFactory.getMyConnection();
		StringBuilder sql;
		PreparedStatement preparedStatement=connection.prepareStatement("delete from employees where id=?");
		preparedStatement.setInt(1, id);
		int result=preparedStatement.executeUpdate();
		if(result<=0)
		{
			throw new EmployeeNotFoundException("no such record found with id: "+id); 
		}
		//System.out.println("record removed sucessfully.");
	}
	
	public void searchEmployeeById(int id) throws SQLException, EmployeeNotFoundException {
		// TODO Auto-generated method stub
		connection=ConnectionFactory.getMyConnection();
		StringBuilder sql;
		PreparedStatement preparedStatement=connection.prepareStatement("select * from employees where id=?");
		ResultSet rs = preparedStatement.executeQuery();
		preparedStatement.setInt(1, id);
		int result=preparedStatement.executeUpdate();
		if(result<=0)
		{
			throw new EmployeeNotFoundException("no such record found with id: "+id); 
		}
		System.out.println("record found sucessfully.");
		try {
			while(rs.next()) {
				int id1 = rs.getInt("id");
				String FirstName = rs.getString("first_name");
				String LastName = rs.getString("last_name");
				String Email = rs.getString("email");
				int Salary = rs.getInt("salary");
				int Bonus = rs.getInt("bonus");
				System.out.println("Employee [ id="+id1+ ", first_name="+FirstName+ ", last_name=" +LastName+ ",email="+Email+ ",salary="+Salary+ ",bonus="+Bonus);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}

