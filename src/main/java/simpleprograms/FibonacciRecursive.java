package simpleprograms;

public class FibonacciRecursive {
	
	static int n1=0,n2=1, n3;
	
	
	public static void fibonacci_resursion(int count) {
		if(count>0) {
			
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			fibonacci_resursion(count-1);
			
		}
	}
	
	public static void main(String[] args) {
		int number = 10;
		System.out.println(n1 + " " + n2);
		fibonacci_resursion(number-2);
	}

}
