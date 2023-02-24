package abstraction;


/*
 Abstraction : 
	Hiding the implementation details and showing the functionality to the user.
	Hiding Unnecessary Data to the end users

Points
	1. Class which is declared with abstract keyword is known as Abstract class.
	2. It can have abstract methods and Non abstract methods.
	3. Method which is declared with abstract keyword and does not have implementation is known as abstract method.
	4. Abstract class can have constructors and static methods.
	5. If Abstract class is extended,  we have to implement the methods of abstract class.
	6. We cannot create an Object for Abstract class.
	7. Abstract class can have final methods but we cannot change the body of the methods when we implement it.
	8. If there is abstract method in class then class must be Abstract.

*/
public abstract class AbstractDemo {
	
	abstract void display();
	
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers : " + c);
	}
	
	public static void substraction(int a, int b) {
		int c = a - b;
		System.out.println("Substraction of two numbers : " + c);

	}
	
	public final void final_method() {
		System.out.println("We cannot override the final method in child classe");
		
	}
	
	

}
