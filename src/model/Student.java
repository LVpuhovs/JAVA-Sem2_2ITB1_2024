package model;

public class Student {
	
	private long st_ID;
	private String name;
	private String surname;
	
	private static long counter = 10000;
	
	public long getst_ID() {
		return st_ID;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	public void setName(String name) {
		if (name != null && name.matches("[A-Z]{1}+[a-z]+ "))
		this.name = name;
	}
	public void setst_ID() {
		this.st_ID = counter;
		counter++;
	}
	public void setSurname(String surname) {
		if (name != null && name.matches("[A-Z]{1}+[a-z]+ "))
		this.surname = surname;
	}
	
	public Student() {
		setst_ID();
		setName("Juris");
		setSurname("Berzins");
	}
	
	public Student(String name, String surname) {
		setst_ID();
		setName(name);
		setSurname(surname);
	}
	
	public String toString() {
		return st_ID + ": " + name + " " + surname;
	}
}
