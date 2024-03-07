package service;

import java.util.ArrayList;

import model.Course;
import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;

public class MainService {
	
		private static  ArrayList<Professor> allProferssors = new ArrayList<Professor>();
		private static ArrayList<Student> allStudents = new ArrayList<Student>();
		private static ArrayList<Course> allCourse = new ArrayList<Course>();
		private static ArrayList<Grade> allGrade = new ArrayList<Grade>();
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 		
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Markuss", "Puhovs", Degree.bsc);
		
		
		allProferssors.add(pr1);
		allProferssors.add(pr2);
		
		for(Professor tempPro : allProferssors) {
			System.out.println(tempPro);
		}
		
		Student st1 = new Student();
		Student st2 = new Student("Gatis", "Kandis");
		System.out.println(st1);
		System.out.println(st2);
		
		allStudents.add(st1);
		allStudents.add(st2);
		
		for(Student tempStu : allStudents) {
			System.out.println(tempStu);
		}
		
		Course c1 = new Course();
		Course c2 =  new Course("Datu strukturas un pamatalgoritmi", 2 , pr2);
		Course c3 = new Course("Programmaturas Inzenierija", 2, pr2);
		
		allCourse.add(c1);
		allCourse.add(c2);
		allCourse.add(c3);
		
		for(Course temp : allCourse) {
			System.out.println(temp);
		}
		
		Grade gr1 = new Grade();
		Grade gr2 = new Grade(4, c1, st2);
		Grade gr3 = new Grade(10, c2, st2);
		Grade gr4 = new Grade(5, c2, st1);
		
		
		allGrade.add(gr1);
		allGrade.add(gr2);
		allGrade.add(gr3);
		allGrade.add(gr4);
		
		for(Grade temp : allGrade) {
			System.out.println(temp);
		}
		

			try {
				System.out.println(calculatedGrade(st2));
				System.out.println(weightedAverage(st2));
				System.out.println(calculateAvgCourse(c2));
				System.out.println(calculateCourses(pr2));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}
	
	public static float calculatedGrade(Student student) throws Exception {
		if (student == null) throw new Exception("Problems with student input");
		
		float sum = 0;
		int howMany = 0;
		
		for (Grade tempgr: allGrade) {
			if(tempgr.getStudent().equals(student)) {
				sum = sum + tempgr.getvalue();
				howMany++;
			}
		}
		if (howMany == 0) throw new Exception("There are no course");
		return sum/howMany;
	}
	public static float weightedAverage(Student student) throws Exception {
		if (student == null) throw new Exception("Problems with student input");
		
		float sum = 0;
		int howMany = 0;
		
		for (Grade tempgr: allGrade) {
			if(tempgr.getStudent().equals(student)) {
				sum = sum + tempgr.getvalue()*tempgr.getcourse().getCP();
				howMany = howMany + tempgr.getcourse().getCP();
			}
		}
		if (howMany == 0) throw new Exception("There are no course");
		return sum/howMany;
	}
	
	public static float calculateAvgCourse(Course course) throws Exception {
		if (course == null) throw new Exception("Problems with course input");
		float sum = 0;
		int howMany = 0;
		
		for (Grade tempgr: allGrade) {
			if(tempgr.getcourse().equals(course)) {
				sum += tempgr.getvalue();
				howMany++;
			}
		}
		if (howMany == 0) throw new Exception("There are no grades in this course");
		
		return sum/howMany;
	}
	public static long calculateCourses(Professor professor) throws Exception {
		if (professor == null) throw new Exception("Problems with course input");
		int howMany = 0;
		
		for (Course tempgr: allCourse) {
			if (tempgr.getprofessor().equals(professor)) {
				howMany++;
			}
		}
		if (howMany == 0) throw new Exception("There are no course for this professor");
		return howMany;
	}
	
	// create
	// TODO pielikt personas kodu
	public static void createStudent(String name, String surname) throws Exception {
		if (name == null || surname == null)  throw new Exception("Problems with input arguments");
		
		boolean isFound = false;
		
		for (Student temp: allStudents) {
			if (temp.getName().equals(name) && temp.getSurname().equals(surname)) {
				isFound = true;
				throw new Exception(name + " " + surname + " is already registered");
			}
		}
		
			Student st = new Student(name, surname);
			allStudents.add(st);
		
	}
	
	//retrieve by surname
	//TODO atgriezt pec personas koda
	public static Student retrieveStudentbySurname(String surname) throws Exception {
		if (surname == null) throw new Exception("Problems with input arguments");
		for (Student temp: allStudents) {
			if (temp.getSurname().equals(surname)) {
				return temp;
			}
		}
		throw new Exception(surname + "is not in the system");
	}
	
	//TODO retrieve all students - pec nepieciesamibas
	
	public static void updateStudentByNameAndSurname(String name,String surname,String newSurname) throws Exception {
		if (name == null || surname == null)  throw new Exception("Problems with input arguments");
		
		for (Student temp: allStudents) {
			if (temp.getName().equals(name) && temp.getSurname().equals(surname)) {
				if (!surname.equals(newSurname)){
					temp.setSurname(newSurname);
					return;
				}
			}
		}
		throw new Exception(surname + "is not in the system");
	}
	

}
