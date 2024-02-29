package model;

public class Course {
	private long c_ID;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 100000;
	
	public long getc_ID() {
		return c_ID;
	}
	public String gettitle() {
		return title;
	}
	public int getCP() {
		return creditPoints;
	}
	public Professor getprofessor() {
		return professor;
	}
	
	public void settitle(String title) {
		if (title != null && title.matches(""))
		this.title = title;
		else
			this title = "undefinied";
	}
	public void setc_ID() {
		this.c_ID = counter;
		counter++;
	}
	public void setCP(int creditPoints) {
		if (creditPoints > 0 && creditPoints < 4)
		this.creditPoints = creditPoints;
	}
	public void setprofessor(Professor professor) {
		this.professor = professor;
	}
	
	public Course() {
		setc_ID();
		settitle("prog JAVA");
		setCP(4);
		setprofessor(professor);
	}
	
	public Course(String title,int creditPoints, Professor professor) {
		setc_ID();
		settitle(title);
		setCP(creditPoints);
		setprofessor(professor);
	}
}
