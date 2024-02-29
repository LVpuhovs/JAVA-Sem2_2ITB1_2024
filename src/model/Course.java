package model;

public class Course {
	private long c_ID;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 0;
	
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
		this.title = title;
	}
	public void setst_ID() {
		this.c_ID = counter;
		counter++;
	}
	public void setCP(int creditPoints) {
		this.creditPoints = creditPoints;
	}
	public void setprofessor(Professor professor) {
		this.professor = professor;
	}
}
