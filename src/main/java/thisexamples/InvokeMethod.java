package thisexamples;

// this - used to invoke current class method
public class InvokeMethod {

	int id;
	String name;
	String college;
	
	public void initialize(int id, String name, String college) {
		this.id = id;
		this.name = name;
		this.college = college;
		this.display(); // display();
		
	}
	
	public void display() {
		System.out.println("ID :" + id +" Name :" + name + " College :" + college);

	}
	
	
	public static void main(String[] args) {
		
		InvokeMethod e1 = new InvokeMethod();
		e1.initialize(1, "XYZ", "Santhiram Engg College");
		
		
	}
}
