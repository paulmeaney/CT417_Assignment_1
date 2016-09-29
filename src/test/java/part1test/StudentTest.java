package part1test;

import static org.junit.Assert.*;

import org.junit.Test;

import part1.Student;


public class StudentTest {

	@Test
	public void testGetUsername() {
		String name = "Paul";
		String age = "21";
		Student testStudent = new Student(name, "02/08/95", age, "13245643");
		assertEquals("Paul21", testStudent.getUsername());
		
	}

}
