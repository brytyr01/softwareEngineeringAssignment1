package com.codebind;

import org.joda.time.DateTime;

public class Driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create student objects with attributes
				Student student0 = new Student("adam",1,21,"CSIT");
				Student student1 = new Student("brittany",2,20,"CSIT");
				Student student2 = new Student("chad",3,60,"CSIT");
				Student student3 = new Student("dierde",4,21,"CSIT");
				Student student4 = new Student("eoin",5,23,"CSIT");
				Student student5 = new Student("fia",6,22,"CSIT");
				Student student6 = new Student("grace",7,21,"Engin");
				Student student7 = new Student("hugh",8,22,"Engin");
				Student student8 = new Student("iain",9,55,"Engin");
				Student student9 = new Student("jack",10,23,"Engin");
				Student student10 = new Student("katie",11,24,"Engin");
				Student student11 = new Student("laura",12,19,"Engin");
				Student student12 = new Student("matt",13,21,"Engin");
				Student student13 = new Student("niamh",14,20,"Engin");
				Student student14 = new Student("olivia",15,40,"Engin");
				
				//add first 6 students to CT123 module
				Modules CT123 = new Modules("CT123","1");
				CT123.addStudent(student0);
				CT123.addStudent(student1);
				CT123.addStudent(student2);
				CT123.addStudent(student3);
				CT123.addStudent(student4);
				CT123.addStudent(student5);
				
				//add second 6 students to EE456 module
				Modules EE456 = new Modules("EE456","2");
				EE456.addStudent(student6);
				EE456.addStudent(student7);
				EE456.addStudent(student8);
				EE456.addStudent(student9);
				EE456.addStudent(student10);
				EE456.addStudent(student11);
				
				//add second 6 students to EE456 module
				Modules EE987 = new Modules("EE987","3");
				EE987.addStudent(student12);
				EE987.addStudent(student13);
				EE987.addStudent(student14);
				
				DateTime startdate = new DateTime(2018, 10, 10, 9, 0, 0, 0);
				
				DateTime enddate = new DateTime(2019, 5, 12, 5, 30, 0, 0);
				// IT course
				CourseProgram CSIT = new CourseProgram("CSIT",startdate,enddate);
				CSIT.AddModule(CT123);
				
				
				DateTime startdate1 = new DateTime(2018, 10, 15, 9, 0, 0, 0);
				
				DateTime enddate1 = new DateTime(2017, 5, 14, 4, 30, 0, 0);
				// Engineering course
				CourseProgram Engin = new CourseProgram("CSIT",startdate1,enddate1);
				Engin.AddModule(EE456);
				Engin.AddModule(EE987);
				
				
				
				
				System.out.println("IT course printing out its modules");
				// IT course printing out its modules
				CSIT.printModuleInfo();
				System.out.println("****************************************");
				
				System.out.println("Engineering course printing out its modules");
				// Engineering course printing out its modules
				Engin.printModuleInfo();
				
				System.out.println("****************************************");
				
				System.out.println("IT module printing out its student list");
				// IT module printing out its student list
				CT123.printModuleStudentInfo();
				
				System.out.println("****************************************");
				
				System.out.println("Engineering module printing out its student list");
				// Engineering module printing out its student list
				EE987.printModuleStudentInfo();
				
				System.out.println("****************************************");
				
				System.out.println("a module printing out the course its in");
				// a module printing out the course its in 
				CT123.printCourseInfo();
				
				System.out.println("****************************************");
				
				System.out.println("IT printing out its full student list");
				// IT printing out its full student list
				CSIT.getStudentList();
				
				System.out.println("****************************************");
				
				System.out.println("Engineering printing out its full student list");
				// IT printing out its full student list
				Engin.getStudentList();
				
				System.out.println("****************************************");
				
				System.out.println("IT printing academic dates");
				// IT printing academic dates
				CSIT.getAcedemicScedule();
				
				System.out.println("****************************************");
				
				System.out.println("Engineering printing academic dates");
				// engineering printing academic dates
				Engin.getAcedemicScedule();
			}
}
