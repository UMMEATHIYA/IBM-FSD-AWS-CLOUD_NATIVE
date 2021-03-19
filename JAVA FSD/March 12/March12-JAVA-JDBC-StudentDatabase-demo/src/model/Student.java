package model;

public class Student {
	private int StudentID;
	private String firstName;
	private String lastName;
	private int cls;
	private float GPA;
	
	public Student() {
		super();
	}
	public Student(int studentId, String firstName, String lastName, int cls, float gPA) {
		super();
		this.StudentID = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cls = cls;
		this.GPA = gPA;
	}
	public int getStudentId() {
		return StudentID;
	}
	public void setStudentId(int studentId) {
		StudentID = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getCls() {
		return cls;
	}
	public void setCls(int cls) {
		this.cls = cls;
	}
	public float getGPA() {
		return GPA;
	}
	public void setGPA(float gPA) {
		GPA = gPA;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentID + ", firstName=" + firstName + ", lastName=" + lastName + ", Class="
				+ cls + ", GPA=" + GPA + "]";
	}
	

}
