package switchexample;

import java.util.Scanner;

public class PrintDayoftheWeek {
	
	
	public void printName(int number) {
		switch (number) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Please enter a valid number to display the day of the week");
			break;
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		PrintDayoftheWeek week = new PrintDayoftheWeek();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Numbers between 1 and 7 :");
		int number = scanner.nextInt();
		week.printName(number);
		
	}

}
