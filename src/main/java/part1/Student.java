package part1;

public class Student {
	
	

	private String name, dob, age, id, username;

	public Student(String name, String dob, String age, String id) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.id = id;
	}

	public String getUsername (){
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

	public void setAge(String age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
