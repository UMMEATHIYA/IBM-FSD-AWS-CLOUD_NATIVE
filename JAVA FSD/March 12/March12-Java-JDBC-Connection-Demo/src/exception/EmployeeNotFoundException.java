package exception;

public class EmployeeNotFoundException extends Exception {
	private String messaage;

	public EmployeeNotFoundException(String messaage) {
		super();
		this.messaage = messaage;
	}

	public String getMessaage() {
		return messaage;
	}
}
