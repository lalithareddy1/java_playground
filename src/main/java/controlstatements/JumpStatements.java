package controlstatements;

public class JumpStatements {
	public static void break_example() {
		int a = 5;
		for(int i =0; i<10; i++) {
			if(i == a) {
				break;
			}
			System.out.println(i);

		}
		
	}
	
	public static void continue_example() {
		System.out.println("======= continue ====");
		int a = 5;
		for(int i =0; i<10; i++) {
			if(i == a) {
				continue;
			}
			System.out.println(i);

		}
		
	}
	
	public static void main(String[] args) {
		break_example();
		continue_example();
	}

}