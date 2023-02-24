package constructors;

public class DefaultConstructor {
	
	int marks;
	String name;
	
	public void display() {
		System.out.println(marks + " " + name);
	}
	
	public static void main(String[] args) {
		DefaultConstructor c1 = new DefaultConstructor();
		c1.display();
	}

}
