package week4.day2;
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setPID(1);
		p1.setFullName("Aanik");
		p1.setAddress("Imadole");
		System.out.println(p1);
		p1.setFullName("Aanik Magar");
		System.out.println(p1);
	}
}
