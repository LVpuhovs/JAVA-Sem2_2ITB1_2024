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
	public int value() {
		return value;
	}
	public Student student() {
		return student;
	}
	public Course course() {
		return course;
	}
	
	
}
