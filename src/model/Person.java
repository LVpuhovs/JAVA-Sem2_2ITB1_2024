package model;

public class Person {
	private String name;
	private String surname;
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public void setName(String name) {
		if (name != null && name.matches("[A-Z]{1}+[a-z]+"))
		this.name = name;
	}
	public void setSurname(String surname) {
		if (name != null && name.matches("[A-Z]{1}+[a-z]+"))
		this.surname = surname;
	}
	public Person() {
		
		setName("Juris");
		setSurname("Berzins");
	}
	public Person(String name, String surname) {
		
		setName(name);
		setSurname(surname);
	}
	public String toString() {
		return name + " " + surname;
	}
}
