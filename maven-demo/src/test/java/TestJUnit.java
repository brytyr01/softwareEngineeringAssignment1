

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

import com.codebind.CourseProgram;
import com.codebind.Modules;
import com.codebind.Student;

public class TestJUnit {
	
	public Student student = new Student("hugh", 7, 15, "CSIT");	
	public Modules module = new Modules("CT123", "123");
	
	DateTime startdate1 = new DateTime(2018, 10, 15, 9, 0, 0, 0);
	
	DateTime enddate1 = new DateTime(2017, 5, 14, 4, 30, 0, 0);
	
	public CourseProgram course = new CourseProgram("CSIT", startdate1,enddate1);
	
	@Test
	public void checkUserName() {
		assertNotEquals("hugh 14",student.getUserName());
		assertEquals("hugh 15",student.getUserName());	
	}
	
	@Test
	public void checkID() {
		assertNotEquals(5,student.getID());
		assertEquals(7,student.getID());	
	}
	
	@Test
	public void checkName() {
		assertNotEquals("katie",student.getName());
		assertEquals("hugh",student.getName());	
	}
	
	@Test
	public void checkAge() {
		assertNotEquals(12,student.getAge());
		assertEquals(15,student.getAge());	
	}
	
	@Test
	public void getmoduleName() {
		assertNotEquals("CT124",module.getmoduleName());
		assertEquals("CT123",module.getmoduleName());	
	}
	@Test
	public void getmoduleID() {
		assertNotEquals("321",module.getmoduleID());
		assertEquals("123",module.getmoduleID());	
	}
	
	

}
