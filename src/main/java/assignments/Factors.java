package assignments;

import java.util.ArrayList;
import java.util.List;

public class Factors {
	
	
	public void display_factors(int num) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=num; i++) {
			if(num %i == 0) {
				list.add(i);
			}
			
		}
		System.out.println("Factors for " + num +" is :" + list);
		System.out.println("Size is :" + list.size() );
		
	}
	
	public static void main(String[] args) {
		
		Factors factor = new Factors();
		factor.display_factors(60);
	}

}
