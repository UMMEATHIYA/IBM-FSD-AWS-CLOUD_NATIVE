package factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private  static Connection connection;

	private ConnectionFactory() throws SQLException {
		
		Properties properties=new Properties();
		properties.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/hr");
		properties.setProperty("jdbc.user", "root");
		properties.setProperty("jdbc.password", "pass@word1");
			//step-1 Register The Driver
			DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
			//Step-2 Create Connection
			connection=DriverManager.getConnection(properties.getProperty("jdbc.url"), 
					properties.getProperty("jdbc.user"), properties.getProperty("jdbc.password"));
		
	}
	
	public static Connection getMyConnection() throws SQLException {
	
		if(connection==null)
		{
			new ConnectionFactory();
		}
	return connection;
	

}

}
