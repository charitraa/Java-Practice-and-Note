package week3.day1;

public class StringTest {

	public static void main(String[] args) {
		// int	compareTo(String anotherString)
		/*
		String str1 = new String("pcps college");
		String str2 = new String("Pcps college");
		int result = str1.compareTo(str2);
		System.out.println(result);
		*/
		
		//int	compareToIgnoreCase(String str)
		/*
		String str1 = new String("pcps");
		String str2 = new String("PCPS");
		int result = str1.compareToIgnoreCase(str2);
		System.out.println(result);
		*/
		
		//int	length()
		//String str1 = new String ("PCPS");
		String str1 = new String ("Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.");
		int result = str1.length();
		System.out.println(result);
		
	}
}
