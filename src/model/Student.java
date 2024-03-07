package model;

public class Student extends Person{
	
	private long st_ID;
	
	private static long counter = 10000;
	
	public long getst_ID() {
		return st_ID;
	}
	
	
	
	public void setst_ID() {
		this.st_ID = counter;
		counter++;
	}
	
	
	public Student() {
		super();
		setst_ID();
		
	}
	
	public Student(String name, String surname) {
		super(name,surname);
		setst_ID();
	}
	
	public String toString() {
		return st_ID + ": " + super.toString();
	}
}
