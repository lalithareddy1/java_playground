package constructors;

public class CopyConstructor {
	
	int id;
	String name;
	
	public CopyConstructor(int i, String n) {
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}
	
	public CopyConstructor(CopyConstructor cp) {
		id = cp.id;
		name = cp.name;
	}
	
	public CopyConstructor() {
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		CopyConstructor cp1 = new CopyConstructor(101, "Abc");
		CopyConstructor cp2 = new CopyConstructor(cp1);
		cp1.display();
		cp2.display();
		
		CopyConstructor cp3 = new CopyConstructor(102, "Java");
		CopyConstructor cp4 = new CopyConstructor();
		cp4.id = cp3.id; // assigning one object value to another object
		cp4.name = cp3.name;
		cp3.display();
		cp4.display();
		
		
	}

}
