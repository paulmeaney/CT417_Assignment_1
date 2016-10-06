package part1;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class CourseProgram {
	private String name;
		private ArrayList<Module> modules = new ArrayList<Module>();
	private LocalDate startDates, endDates;
	public CourseProgram(String name, int startYear, int startMonth, int startDay,int endYear, int endMonth, int endDay) {
		super();
		this.name = name;
		this.startDates = new LocalDate(startYear, startMonth, startDay);
		this.endDates = new LocalDate(endYear, endMonth, endDay);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addModule(Module m){
		modules.add(m);
	}
	
	public void setStartDate(int year, int month, int day){
		this.startDates = new LocalDate(year, month, day);
	}
	
	public String getStartDate(){
		return startDates.toString();
	}
	public void setEndDate(int year, int month, int day){
		this.endDates = new LocalDate(year, month, day);
	}
	
	public String getEndDate(){
		return endDates.toString();
	}
	
	public int getModuleCount(){
		return modules.size();
	}
	
	public void printRegister(){
		System.out.println("Students registered for " + this.getName());
		System.out.println("Course" + "\t" + "Name" + "\t" +"Module");
		for (int i = 0; i < this.getModuleCount(); i++){
			for (int j=0; j< modules.get(i).getClassSize(); j++){
				System.out.println(this.getName() + "\t" + modules.get(i).getStudent(j).getName() + "\t" 
			+ modules.get(i).getStudent(j).getId() +"\t" + modules.get(i).getStudent(j).getAge() +"\t" 
						+ modules.get(i).getStudent(j).getDob() +"\t" + modules.get(i).getName() +" " + modules.get(i).getCourseid());
			}
		}
	
	}
	
}
