package week2.day4;

public class Student {
	int sid;
	String fullName;
	String course;
	// default constructor
	public Student() { 
		this.sid=0;
		this.fullName="";
		this.course="";
	}
	// parameterized constructor
	public Student(int sid, String fullName, String course) {
		this.sid=sid;
		this.fullName=fullName;
		this.course=course;
	}
}

//Create default and parameterized constructors. CW
//Create setters, getters and toString() methods. HW