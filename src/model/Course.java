package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
	private long c_ID;
	private String title;
	private int creditPoints;
	private ArrayList<Professor> professors;
	
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
	public ArrayList<Professor> getprofessor() {
		return professors;
	}
	
	public void settitle(String title) {
		if (title != null)
		this.title = title;
		else
			this.title = "undefinied";
	}
	public void setc_ID() {
		this.c_ID = counter;
		counter++;
	}
	public void setCP(int creditPoints) {
		if (creditPoints > 0 && creditPoints < 20)
		this.creditPoints = creditPoints;
		else
			this.creditPoints = 2;
	}
	public void setprofessor(ArrayList<Professor> professors) {
		if (professors != null)
			this.professors = professors;
		else
		
			this.professors = new ArrayList<Professor>(Arrays.asList(new Professor()));
	}
	
	public Course() {
		setc_ID();
		settitle("prog JAVA");
		setCP(4);
		ArrayList<Professor> temp = new ArrayList<Professor>(Arrays.asList(new Professor()));
	}
	
	public Course(String title, int creditPoints, ArrayList<Professor>professors) {
		setc_ID();
		settitle(title);
		setCP(creditPoints);
		setprofessor(professors);
	}
	
	public String toString() {
		return c_ID + ": " + title + "(" + creditPoints+ ") KP, " + professors;
	}
	
	public void addProfessor(Professor professor) {
		if (!professors.contains(professor)) {
			professors.add(professor);
		}
	}
	public void removeProfessor(Professor professor) {
		if (!professors.contains(professor)) {
			professors.remove(professor);
		}
	}
}
