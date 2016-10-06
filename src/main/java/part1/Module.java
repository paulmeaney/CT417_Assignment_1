package part1;

import java.util.ArrayList;

public class Module {
	
	private String name, courseid;
	public ArrayList<Student> students = new ArrayList<Student>();
	
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
	
	public Student getStudent(int index){
		return students.get(index);
	}
	
	public int getClassSize(){
		return students.size();
	}
	

	
	
	
	
}
