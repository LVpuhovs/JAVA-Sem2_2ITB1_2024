package model;

public class Professor {
	//1. variables
	
	private long pID;
	private String name;
	private String surname;
	private Degree degree;
	
	
	private static long counter = 0;
	//2. get and set
	
	public long getpID() {
		return pID;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public Degree getDegree() {
		return degree;
	}
	
	
	public void setName(String name) {
		if (name != null && name.matches("[A-Z]{1}+[a-z]+"))
		this.name = name;
	}
	public void setpID() {
		this.pID = counter;
		counter++;
	}
	public void setSurname(String surname) {
		if (name != null && name.matches("[A-Z]{1}+[a-z]+"))
		this.surname = surname;
	}
	public void setDegree(Degree degree) {
		if (degree != null)
		this.degree = degree;
		else
			this.degree  = Degree.other;
	}
	
	
	//3. constructors
	public Professor() {
		setpID();
		setName("Juris");
		setSurname("Berzins");
		setDegree(Degree.other);
	}
	
	public Professor(String name, String surname, Degree degree) {
		setpID();
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
	//4. toString function
	public String toString() {
		return pID + ": " +degree + ". " + name + " " + surname;
	}
	//5. other function
	
	
}
