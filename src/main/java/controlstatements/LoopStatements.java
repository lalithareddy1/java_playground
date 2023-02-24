package controlstatements;

public class LoopStatements {
	
	
	public static void for_loop_example() {
		int sum = 0;
		for(int i =1; i<=10; i++) {
			sum = sum + i;
			System.out.println("Sum of 10 Natural numbers :" + sum);
		}
		
	}
	
	public static void for_each_example() {
		String[] fruits = {"Apple", "Banana", "Cantaloupe"};
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}
	
	public static void while_example() {
		int i = 1;
		while(i <= 10) {
			if( i % 2 == 0) {
				System.out.println(i);
			}
			i ++;
		}
		
	}
	
	public static void dowhile_example() {
		int i = 1;
		System.out.println("Printing the list of odd numbers");
		do {
			System.out.println(i);
			i = i + 2;
		}while(i<=10);
	}
	
	public static void main(String[] args) {
		for_loop_example();
		for_each_example();
		while_example();
		dowhile_example();
	}

}
