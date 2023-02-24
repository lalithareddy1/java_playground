package leapyear;

import java.util.ArrayList;
import java.util.List;

public class LeapYear {

	public void displayleapyear() {
		
		List<Integer> leap_year_list = new ArrayList<Integer>();
		List<Integer> nonleap_year_list = new ArrayList<Integer>();
				
		for(int i=2000; i<=2100; i++) {
			if((i%400) == 0) {
				leap_year_list.add(i);
			}
			else if((i%100) == 0) {
				nonleap_year_list.add(i);
			}
			else if((i%4) == 0) {
				leap_year_list.add(i);
			}
			else {
				nonleap_year_list.add(i);
	
			}
			
			
		}
		System.out.println("Leap years between 2000 and 2100 is :" +leap_year_list);
//		System.out.println("Non Leap years between 2000 and 2100 is :" +nonleap_year_list);


	}

	public static void main(String[] args) {

		LeapYear year = new LeapYear();
		year.displayleapyear();

	}

}
