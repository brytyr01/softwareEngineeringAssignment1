package com.codebind;
import java.util.ArrayList;

public class Modules {
//Variable declaration
private String ModuleName,ModuleID;	
private ArrayList<Student> StudentList;	
private ArrayList<String> CoursesList;


//Constructor
public Modules(String ModuleName, String ModuleID) {
	this.ModuleName=ModuleName;
	this.ModuleID=ModuleID;
	CreateStudentList();
}
//Initializes the student list
private void CreateStudentList() {
		StudentList=new ArrayList<Student>();	
}

//Adds a student to the module 
public void addStudent(Student student) {	
		//Adds student to list of students taking module
		StudentList.add(student);
		
		// adds module to students list of modules
		student.AddModuleList(ModuleName);
}

//prints the students in the module object
public void printModuleStudentInfo() {	
	for(int i =0; i<(StudentList.size()); i++) {
		Student temp =StudentList.get(i);
		System.out.println(temp.getUserName());
	}	
}

//Adds course name to a list of course name the module is assigned to
public void addCourseName(String courseName) {
	CoursesList = new ArrayList<String>();
	CoursesList.add(courseName);
}

//Prints the courses the module is assigned to
public void printCourseInfo() {
	
	String temp =CoursesList.get(0);
	System.out.println(temp);
}

//Returns the modules name
public String getmoduleName() {	
	return ModuleName;	
}

//Returns the modules ID
public String getmoduleID() {	
	return ModuleID;	
}
}
