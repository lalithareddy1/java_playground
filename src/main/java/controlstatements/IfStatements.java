package controlstatements;

public class IfStatements {
	
	public static void if_example() {
		int a = 20;
		int b = 12;
		if(a > b)
			System.out.println( a + " is greater than " + b);
		
		
	}
	
	public static void if_else_example() {
		int a = 20;
		int b = 30;
		if(a > b)
			System.out.println( a + " is greater than " + b);
		else
			System.out.println(b + "is greater than " + a);
				
	}
	
	public static void if_else_if_example() {
		String prog_language = "Java";
		if(prog_language == "Python")
			System.out.println("Python");
		else if(prog_language == "C++")
			System.out.println("C++");
		else
			System.out.println("Java");
		
	}
	
	public static void nested_if_else_example() {
		int a = 12;
		int b = 14;
		if(a <= b) {
			System.out.println(a +" is less than or equalto " + b);
			if( a >= b) {
				System.out.println(a + " is greater than or equalto " +b);
			}
			else {
				System.out.println("a is less than b ");
			}
		}
	}
	
	public static void main(String[] args) {
		if_example();
		if_else_example();
		if_else_if_example();
		nested_if_else_example();
	}

}
