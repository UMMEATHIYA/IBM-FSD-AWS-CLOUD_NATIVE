package example;
import model.Employee;
import java.sql.SQLException;
import java.util.List;

import exception.EmployeeNotFoundException;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees() throws SQLException;

	public Employee createEmployee(Employee employee) throws SQLException;
	public void removeEmployeeById(int id) throws SQLException, EmployeeNotFoundException;

	public void searchEmployeeById(int id) throws SQLException, EmployeeNotFoundException;

}