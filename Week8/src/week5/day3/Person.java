package week5.day3;

public class Person {
	private int pid;
	private String name;
	
	public Person() {
		this.pid=0;
		this.name="";
	}
	public Person(int pid, String name) {
		this.pid=pid;
		this.name=name;
	}
	//getters
	public int getPID() {
		return this.pid;
	}
	public String getName() {
		return this.name;
	}
	//setters
	public void setPID(int pid) {
		this.pid=pid;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return this.pid+", "+this.name;
	}
}
