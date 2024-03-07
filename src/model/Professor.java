package model;

public class Professor extends Person{
	//1. variables
	
	private long pID;

	private Degree degree;
	
	
	private static long counter = 0;
	//2. get and set
	
	public long getpID() {
		return pID;
	}

	public Degree getDegree() {
		return degree;
	}
	
	
	
	public void setpID() {
		this.pID = counter;
		counter++;
	}
	public void setDegree(Degree degree) {
		if (degree != null)
		this.degree = degree;
		else
			this.degree  = Degree.other;
	}
	
	
	//3. constructors
	public Professor() {
		
		super(); //person konstruktors
		setpID();
		setDegree(Degree.other);
	}
	
	public Professor(String name, String surname, Degree degree) {
		
		super(name,surname);
		setpID();
		setDegree(degree);
	}
	//4. toString function
	public String toString() {
		return pID + ": " +degree + ". " + super.toString();
	}
	//5. other function
	
	
}
