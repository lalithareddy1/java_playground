package thisexamples;

public class InvokeConstructor {
	
	int id;
	String name;
	String college;
	

	public InvokeConstructor(int id, String name, String college) {
		this();

		this.id = id;
		this.name = name;
		this.college = college;
		
	}
	
	public InvokeConstructor() {
		System.out.println("Calling default constructor from parameterized constructor. ");
		
	}
	
	public void display() {
		System.out.println("ID :" + id +" Name :" + name + " College :" + college);

	}
	
	
	public static void main(String[] args) {
		
		InvokeConstructor e1 = new InvokeConstructor(1, "XYZ", "Santhiram Engg College");		
		e1.display();
		
		
	}

}
