package constructors;

public class ParameterizedConstructor {
	
	int marks;
	String name;
	
	public ParameterizedConstructor(int m, String n) {
		// TODO Auto-generated constructor stub
		marks = m;
		name = n;
	}
	public void display() {
		System.out.println(marks + " " + name);
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor c1 = new ParameterizedConstructor(95, "Krish");
		c1.display();
	}


}
