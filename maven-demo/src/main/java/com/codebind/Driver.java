package com.codebind;

public class Driver {

	public static void main(String[] args) {
		// create student objects with attributes
		Student student1 = new Student("bryan",52,21,"CSIT");
		Student student2 = new Student("brianna",69,20,"CSIT");
		Student student3 = new Student("brianan",79,60,"CSIT");
		
		Modules CT123 = new Modules("CT123","1");
		CT123.addStudent(student1);
		CT123.addStudent(student2);
		
		Modules CT124 = new Modules("CT124","2");
		CT124.addStudent(student3);
		
		
		
		
		CourseProgram CSIT = new CourseProgram("CSIT");
		CSIT.AddModule(CT123);
		CSIT.AddModule(CT124);
		
		// a course printing out its modules
		CSIT.printModuleInfo();
		
		// a module printing out its student list
		CT123.printModuleStudentInfo();
		CT124.printModuleStudentInfo();
		
		// a module printing out the courses its in 
		CT124.printCourseInfo();
		CT123.printCourseInfo();
		
		CSIT.getStudentList();
	}

}
