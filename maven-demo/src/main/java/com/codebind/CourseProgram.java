package com.codebind;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class CourseProgram {
//	A course programme class containing course name (CS & IT or ECE, etc.), list of
//	modules, list of students that are enrolled, academic start date and end date.
//	Start and end dates should use Joda Time classes (i.e. DateTime), which must be
//	added as a project dependency.
	
	private String CourseName;
	private ArrayList<Modules> ModuleList;
	private DateTime startDate,endDate;
	
public CourseProgram(String CourseName, DateTime startdate , DateTime enddate) {
		this.CourseName=CourseName;
		CreateModuleList();
		CreateAcedemicScedule(startdate,enddate);
	}

private void CreateAcedemicScedule(DateTime startDate,DateTime endDate) {
	this.startDate=startDate;
	this.endDate=endDate;
}

private void CreateModuleList() {
	ModuleList=new ArrayList<Modules>();
	
}


public void AddModule(Modules Module) {
	ModuleList.add(Module);
	
	Module.addCourseName(CourseName);
}

public void printModuleInfo() {
	
	
	for(int i =0; i<(ModuleList.size()); i++) {
	
			Modules temp =ModuleList.get(i);
			System.out.println(temp.getmoduleName());
		}
	
}

public void getStudentList() {

	for(int i =0; i<(ModuleList.size()); i++) {
	
		Modules module =ModuleList.get(i);
		module.printModuleStudentInfo();
	}
}
public void getAcedemicScedule() {

	System.out.println("the acedemic start date for this course is: "+startDate);
	System.out.println("the acedemic end date for this course is: "+endDate);
}
}
