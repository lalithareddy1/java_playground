package thisexamples;

// this - used to invoke current class instance variables.
public class InvokeInstance {
	
	int id;
	String name;
	String college;
	
	public void display(int id, String name, String college) {
		this.id = id;
		this.name = name;
		this.college = college;
		System.out.println("ID :" + id +" Name :" + name + " College :" + college);
	}
	
	
	public static void main(String[] args) {
		
		InvokeInstance e1 = new InvokeInstance();
		e1.display(1, "XYZ", "Santhiram Engg College");
		
		
	}

}
