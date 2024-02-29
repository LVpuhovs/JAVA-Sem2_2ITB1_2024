package model;

public class Grade {
	private long g_ID;
	private int value;
	private Student student;
	private Course course;
	
	private static long counter = 200000;
	
	public long getg_ID() {
		return g_ID;
	}
	public int getvalue() {
		return value;
	}
	public Student getStudent() {
		return student;
	}
	public Course getcourse() {
		return course;
	}
	
	public void setg_ID() {
		this.g_ID = counter;
		counter++;
	}
	public void setvalue(int value) {
		if (value > 0 && value <= 10)
		this.value = value;
		else
			this.value = 0;
	}
	public void setStudent(Student student) {
		if (student != null)
			this.student= student;
		else
			this.student= new Student();
	}
	public void setCourse(Course course) {
		if (course != null)
			this.course = course;
		else
			this.course = new Course();
	}
	
	public Grade() {
		setg_ID();
		setvalue(4);
		setCourse(new Course());
		setStudent(new Student());
	}
	public Grade(int value, Course course, Student student) {
		setg_ID();
		setvalue(value);
		setCourse(course);
		setStudent(student);
	}
	public String toString() {
		return student.getName() + " " + student.getSurname() + " gets " + value + " in course " + course;
	}
}
