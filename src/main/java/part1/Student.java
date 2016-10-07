package part1;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Student {
	
	

	private String name, username, dob, age;
	private int id;
	

	public Student(String name, String dob, int id) {
		super();
		this.name = name;
		this.age = getAge(dob);
		this.id = id;
		//this.dob = dob;
	}
	
	public String getAge(String birthday){  //This method calculates Age based on given Date of Birth
		String[] date = birthday.split("/");
		int year = Integer.parseInt(date[2]);
		if (year > 9999)						//This is just a default year if a 5 digit year is generated; incompatible with LocalDate
			year = 1999;
		
		this.dob = date[0]+"/"+date[1]+"/"+Integer.toString(year);
		
		LocalDate dobi = new LocalDate(year, Integer.parseInt(date[1]), Integer.parseInt(date[0]));
		LocalDate now = new LocalDate();
		Years agep = Years.yearsBetween(dobi, now);
		String age = agep.toString();
		age = age.replaceAll("[^\\d.]", "");  //removes all Letters from the string
		return age;
		
	}

	public String getUsername (){ //Method to generate username for the user
		String uname;
		uname = name + age;
		this.username = uname;
		return username;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAge() {
		return age;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
