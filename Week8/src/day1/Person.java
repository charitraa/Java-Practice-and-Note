package day1;

public class Person {
	private int pid;
	private String name;
	public Person() {//Default constructor
		super();
		this.pid = 0;
		this.name = "";
	}
	public Person(int pid, String name) {//Parameterized constructer
		super();
		this.pid = pid;
		this.name = name;
	}
	public int getPid() {//getter
		return pid;
	}
	public void setPid(int pid) {//setter
		this.pid = pid;
	}
	public String getName() {//getter
		return name;
	}
	public void setName(String name) {//setter
		this.name = name;
	}
	@Override
	public String toString() {//toString 
		return "Person [pid=" + pid + ", name=" + name + "]";
	}
	
}
