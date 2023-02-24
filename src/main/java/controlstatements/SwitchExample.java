package controlstatements;

public class SwitchExample {
	
	public static void main(String[] args) {
		
		String day = "Saturday";
		
		switch (day) {
		case "Sunday":
			System.out.println("Sunday");
			break;
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		
		default:
			System.out.println("Saturday");
			break;
		}
	}

}
