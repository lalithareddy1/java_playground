package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();		
		arraylist1.add(10);
		arraylist1.add(20);
		arraylist1.add(30);
		
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();		
		arraylist2.add(40);
		arraylist2.add(50);
		arraylist2.add(60);
		arraylist2.add(70);
		arraylist2.add(80);
		arraylist2.add(90);

		
		arraylist1.addAll(arraylist2);
		
		for(Integer number : arraylist1) {
			System.out.println(number);
		}
		
		arraylist2.remove(5); // pass the index number you want to delete	
		System.out.println("After deleting the element at index 5  in Arraylist2 : " + arraylist2);
		
		arraylist1.removeAll(arraylist2);
		System.out.println("After deleting the collection of elements : " + arraylist1);

		
		ArrayList<Integer> arraylist3 = new ArrayList<Integer>();		
		arraylist3.add(1);
		arraylist3.add(2);
		arraylist3.add(3);
		arraylist3.add(4);
		arraylist3.add(5);

		
		ArrayList<Integer> arraylist4 = new ArrayList<Integer>();		
		arraylist4.add(1);
		arraylist4.add(2);
		arraylist4.add(3);
		arraylist4.add(70);
		arraylist4.add(80);
		arraylist4.add(90);
		
		arraylist3.addAll(arraylist4);

		System.out.println("Before Deleting the collection of array list" + arraylist3);
	
		
		arraylist3.removeAll(arraylist4);
		System.out.println("After Deleting the collection of array list" + arraylist3);

		

	}

}
