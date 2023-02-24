package simpleprograms;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberExample {
	
	public static void prime_between_numbers() {
		
		int number = 30;
		int count = 2;
		List<Integer> list_primenumbers = new ArrayList<>();
		
		while(count < number) {
			if(count == 2) {
				list_primenumbers.add(count);

			}
			else if(count%2 !=0) {
				list_primenumbers.add(count);
			}
			count++;
			
		}
		
		System.out.println(list_primenumbers);
	}
	
	public static void validate_prime_number(int num) {
		int flag = 0;
		int m = num/2;
		System.out.println("Value of m " + m);
		if(num == 0 || num == 1) {
			System.out.println(num +" is not a prime number");
		}
		else if(num == 2) {
			System.out.println(num + " is a prime number");
		}
		else if(num %2 !=0) {
			System.out.println(num + " is a prime number");
		}
		else
			System.out.println(num + " is not a prime number");
		
		/*else {
			for(int i=2; i<=m; i++) {
				if(num % i == 0) {
					System.out.println(num +" is not a prime number");
					flag = 1;
					break;

				}
			}
			
			if(flag == 0) {
				System.out.println(num + " is a prime number");
			}
		}
		*/
	}
	
	
	public static void main(String[] args) {
		int num = 20;
		validate_prime_number(num);
		prime_between_numbers();
		
	}

}
