package week5.day3;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		//Any numbers; any type
		ArrayList persons = new ArrayList();
		Person p1=new Person();
		Person p2 = new Person(2, "Raj Rai");
		p1.setPID(1);
		p1.setName("Rajan Thapa");
		
		persons.add(p1);
		persons.add(p2);
		
		
		
		
		

	}

}
