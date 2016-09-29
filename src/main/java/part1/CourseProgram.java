package part1;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class CourseProgram {
	private String name;
		private ArrayList<Module> modules;
	private DateTime startDates, endDates;
	public CourseProgram(String name, int startYear, int startMonth, int startDay,int endYear, int endMonth, int endDay) {
		super();
		this.name = name;
		this.startDates = new DateTime(startYear, startMonth, startDay, 0, 0);
		this.endDates = new DateTime(endYear, endMonth, endDay, 0, 0);
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
		this.startDates = new DateTime(year, month, day, 0, 0);
	}
	
	public String getStartDate(){
		return startDates.toString();
	}
	public void setEndDate(int year, int month, int day){
		this.endDates = new DateTime(year, month, day, 0, 0);
	}
	
	public String getEndDate(){
		return endDates.toString();
	}
	
}
