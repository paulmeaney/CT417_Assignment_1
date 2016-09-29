package part1;

import java.util.ArrayList;

public class Module {
	
	private String name, courseid;
	private ArrayList<Student> students;
	
	public Module(String name, String courseid) {
		super();
		this.name = name;
		this.courseid = courseid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	
	public void addStudent(Student student){
		
		students.add(student);
		
	}
	
	public String[] listStudents(){ //Note wont work as it will return a string representation of student objects
		
		String output, list[];
		output = students.toString();
		list = output.split(",");
		
		return list;
	
	}
	
	
}
