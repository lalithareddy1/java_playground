package abstraction;

public class AbstractChildclass extends AbstractDemo{
	
	

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}
	
	public static void main(String[] args) {
		AbstractChildclass c = new AbstractChildclass();
		c.display();
		c.add(10, 20);
		AbstractDemo.substraction(40, 20);
		c.final_method();
		
	}

}
