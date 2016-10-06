package part1test;

import static org.junit.Assert.*;

import org.junit.Test;

import part1.Student;


public class StudentTest {

	@Test
	public void testGetUsername() {
		String name = "Paul";
		Student testStudent = new Student(name, "02/08/1995", 13436908);
		assertEquals("Paul21", testStudent.getUsername());
	}
	
	@Test
	public void testGetAge() {
		
		Student testStudent = new Student("Test", "01/01/1999", 00000000);
		String age = "17";
		assertEquals(age, testStudent.getAge());
	}

}
