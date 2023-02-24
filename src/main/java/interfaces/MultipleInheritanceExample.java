package interfaces;

public class MultipleInheritanceExample implements Printable, Showable{

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method is from Printable Interface");
		
	}
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show method is from Showable Interface");

		
	}
	
	public static void main(String[] args) {
		
		MultipleInheritanceExample example = new MultipleInheritanceExample();
		example.display();
		example.show();
		
	 
		
	}

	

}
