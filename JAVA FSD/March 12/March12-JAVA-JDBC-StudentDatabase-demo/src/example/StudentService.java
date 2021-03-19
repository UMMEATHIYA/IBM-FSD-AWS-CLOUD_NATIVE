package example;
import model.Student;
import java.sql.SQLException;
import java.util.List;

public interface StudentService {
	
	public List<Student> getAllStudents() throws SQLException;

	public Student createStudent(Student student) throws SQLException;
}
