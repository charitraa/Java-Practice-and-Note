package week2.day3;

public class StudentTest {
	public static void main(String []args) {
		Student s1;
		s1 = new Student();
		s1.sid=1;
		s1.fullName="Raj Thapa";
		s1.course="BSc";
		s1.sid=2;
		s1.fullName="Raj Bdr Thapa";
		System.out.println(s1.sid);//2
		System.out.println(s1); //week2.day3.Student@626b2d4a
		System.out.println(s1); //it calls toString() method of class
	}
}
