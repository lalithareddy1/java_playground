package interfaces;

/*
	Interface is like blue print of the class.
	Through Interface we can achieve abstraction and multiple inheritance
	Like abstract class we cannot create object for interface
	Through Interface we can achieve loose coupling
	By default variables are public static final
	By default methods are public abstract 
	Since Java 8, we can have method body in interface but we need to make it as default and static methods.
	Since Java 9, we can have private methods in an interface.
	Before Java 1.8 Interface cannot have concrete and static methods
	Since java Interfaces can have concrete and static methods
*/
public interface InterfaceDemo {
	
	void sample1();
	void sample2();
	int i = 100;
	
	default void msg() {
		System.out.println("Printing message");
		
	}

}
