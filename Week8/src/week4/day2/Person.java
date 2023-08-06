package week4.day2;

public class Person {
	private int pid;
	private String fullname;
	private String address;
	public Person() { //constructors
		this.pid=0; //this-> current class
		this.fullname="";
		this.address="";
	}
	public Person(int pid, String fullname, String address) {
		this.pid=pid;
		this.fullname=fullname;
		this.address=address;
	}
	//Getters
	public int getPID() {
		return this.pid;
	}
	public String getFullName() {
		return this.fullname;
	}
	public String getAddress() {
		return this.address;
	}
	//Setters
	public void setPID(int pid) {
		this.pid=pid;
	}
	public void setFullName(String fullname) {
		this.fullname=fullname;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	//toString
	public String toString() {
		return this.pid+", "+this.fullname+", "+this.address;
	}
}
