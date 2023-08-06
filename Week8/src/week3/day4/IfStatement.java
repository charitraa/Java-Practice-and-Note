package week3.day4;

public class IfStatement {

	public static void main(String[] args) {
		//Example-1
		/*
		byte bn = 1;
		if(bn==1)
			System.out.println("One");
		if(bn==2)
			System.out.println("Two");
		if(bn==3)
			System.out.println("Three");
		*/
		
		//Example-2
		/*
		byte bn = 10;
		if(bn!=0)
			System.out.println("Non zero");
		*/
		
		//Example-3
		/*
		byte bn =8;
		if(bn!=0) {
			System.out.println("Non");
			System.out.println(" Zero");
		}
		System.out.println("Bye!");
		*/
		
		//Example-4
		/*
		byte bn = 0;
		if (bn==0)
			System.out.println("Zero");
		else
			System.out.println("Not Zero");
		*/
		
		//Example-5
		/*
		byte bn = 5;
		if(bn==0) {
			System.out.println("Zero");
		}
		else if(bn==1) {
			System.out.println("One");
		}
		else {
			System.out.println("Other");
		}
		*/
		
		//Example-6
		/*
		byte n1=7, n2=8, n3=9, n4=0;
		if(n1>n2)//outer
			if(n1>n3)//inner
				n4=n1;
		if(n2>n1)
			if(n2>n3)
				n4=n2;
		if(n3>n1)
			if(n3>n2)
				n4=n3;
		System.out.println("Result : "+n4);
		*/
		
		//Example-7 if statement with multiple conditions
		/*
		byte n1=9, n2=8, n3=3, n4=0;
		if((n1>n2) && (n1>n3))
			n4=n1;
		//add others
		System.out.println(n4);
		*/
		
		//Example-8
		byte sub1 = 75;
		byte sub2 = 56;
		final byte PM = 40; //read only variable
		String result = "FAIL";
		//Calculate result i.e. PASS or FAIL.
		if(sub1>=PM)
			if(sub2>=PM)
				result = "PASS";
		System.out.println("Result : "+result);
		
		// && Operator
		// || Operator
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
