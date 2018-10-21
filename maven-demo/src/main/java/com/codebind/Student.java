package com.codebind;

import java.util.ArrayList;

public class Student {
	
private String name,course,Modules,username;
private int ID,age;
private ArrayList<String> ModuleList;
//constructor
public Student(String name,int ID, int age, String course){
	
	this.name=name;
	this.ID=ID;
	this.age=age;
	this.course=course;
	// for the student object it creates an module list 
	//to keep track of the modules the student is in
	CreateModuleList();
	//creates a username
	setUserName(name,age);
	
}
// Initializes the module list for the student object
private void CreateModuleList() {
	// TODO Auto-generated method stub
	ModuleList = new ArrayList<String>();
}

// when a student is added to a module the module name will be put in this list
public void AddModuleList(String module) {
	// TODO Auto-generated method stub
	ModuleList.add(module);
}


public void setUserName(String name, int age) {
	
	username = (name+age);
		
}

public String getUserName() {
	
	username = (name+" "+age);
	
	return username;	
}

public String getName() {
	return name;
}

public int getID() {
	return ID;
}

public int getAge() {
	return age;
}


}
