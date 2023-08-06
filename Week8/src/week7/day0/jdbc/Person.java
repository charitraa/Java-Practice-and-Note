package week7.day0.jdbc;
import java.io.Serializable;

public class Person implements Serializable {
	int pid;
	String name;
	
	public Person() {	
		this.pid = 0;
		this.name = "";
	}
	
	public Person(int pid, String name) {	
		this.pid = pid;
		this.name = name;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
	}	
}