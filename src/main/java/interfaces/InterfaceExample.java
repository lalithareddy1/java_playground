package interfaces;



public class InterfaceExample implements InterfaceDemo {

	public void sample1() {
		// TODO Auto-generated method stub
		System.out.println("Sample1");
		
	}

	public void sample2() {
		// TODO Auto-generated method stub
		System.out.println("Sample2");

		
	}
	
	
	public static void main(String[] args) {
		InterfaceExample e = new InterfaceExample();
		e.sample1();
		e.sample2();
		System.out.println(e.i);
		


	}
}
