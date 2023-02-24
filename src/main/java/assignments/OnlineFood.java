package assignments;

import java.util.Scanner;

public class OnlineFood {
	double chicken_biriyani_price = 200.00;
	double fish_curry_price = 150.00;
	double chicken65_price = 120.00;
	double mutton_gravy_price = 220.00;
	double chicken_fired_price = 180.00;

	double panner_tikka_price = 120.00;
	double cashew_puloa_price = 150.00;
	double veg_fired_rice_price = 130.00;
	double gobi65_price = 100.00;
	double veg_tali_price = 140.00;

	int food_category;
	int quantity;
	double price;

	Scanner scanner = new Scanner(System.in);

	public void take_away(int number) {
		select_category();
		if (food_category == 1) {
			display_dishes(food_category);
			select_food(food_category);
		} else if (food_category == 2) {
			display_dishes(food_category);
			select_food(food_category);

		} else {
			System.out.println("Please enter valid input");

		}

	}

	public int select_category() {
		System.out.println("Please select the category from the below list : ");
		System.out.println("[1] vegetarian");
		System.out.println("[2] Non-vegetarian");
		System.out.println("Please enter the option : ");
		//scanner = new Scanner(System.in);
		food_category = scanner.nextInt();

		return food_category;

	}

	public void display_dishes(int food_category_number) {
		if (food_category_number == 1) {
			System.out.println("Below are the dishes available currently to order : ");
			String dish1 = "1. Paneer tikka - " + panner_tikka_price + "  (per item)";
			String dish2 = "2. Cashew pulao - " + cashew_puloa_price + "  (per item)";
			String dish3 = "3. Veg fried rice - " + veg_fired_rice_price + "  (per item)";
			String dish4 = "4. Gobi 65 - " + gobi65_price + "  (per item)";
			String dish5 = "5. Veg. thali - " + veg_tali_price + "  (per item)";
			System.out.println(dish1);
			System.out.println(dish2);
			System.out.println(dish3);
			System.out.println(dish4);
			System.out.println(dish5);
			System.out.println();

		} else {
			System.out.println("Below are the dishes available currently to order : ");
			String dish1 = "1. Chicken briyani - " + chicken_biriyani_price + " (per item))";
			String dish2 = "2. Fish curry - " + fish_curry_price + " (per item)";
			String dish3 = "3. Chicken 65 - " + chicken65_price + "  (per item)";
			String dish4 = "4. Mutton gravy - " + mutton_gravy_price + "  (per item)";
			String dish5 = "5. Chicken fried rice - " + chicken_fired_price + "  (per item)";
			System.out.println(dish1);
			System.out.println(dish2);
			System.out.println(dish3);
			System.out.println(dish4);
			System.out.println(dish5);
			System.out.println();
		}

	}

	public void calculate_price(double price) {
		System.out.println("Price in Calculate method" + price);
		double final_amount = 0;
		double gst = (price * 6) / 100;
		double charge = 30.00;
		double amount = price + gst + charge;
		if (amount > 1000) {
			double discount = ((amount * 10) / 100);
			final_amount = final_amount + (amount - discount);
		}
		if (amount > 1500) {
			double discount = ((amount * 15) / 100);
			final_amount = final_amount + (amount - discount);
		}
		if(amount < 1000) {
			final_amount = amount;
		}

		System.out.println("Final Amount " + final_amount);
		//return final_amount;

	}

	public double select_food(int food_category) {
		System.out.println("Please enter the number you want to buy from the available dishes : ");
		int dish_number = scanner.nextInt();
		if (dish_number == 1 && food_category == 2) {
			quantity = quantity();
			price = price + (chicken_biriyani_price * quantity);
		}
		 else if (dish_number == 2 && food_category == 2) {
			quantity = quantity();
			price = price + (fish_curry_price * quantity);
		}
		else if (dish_number == 3 && food_category == 2) {
			quantity = quantity();
			price = price + (chicken65_price * quantity);
		} else if (dish_number == 4 && food_category == 2) {
			quantity = quantity();
			price = price + (mutton_gravy_price * quantity);
		} else if (dish_number == 5 && food_category == 2) {
			quantity = quantity();
			price = price + (chicken_fired_price * quantity);
		}

		else if (dish_number == 1 && food_category == 1) {
			quantity = quantity();
			price = price + (panner_tikka_price * quantity);
		} else if (dish_number == 2 && food_category == 1) {
			quantity = quantity();
			price = price + (cashew_puloa_price * quantity);
		} else if (dish_number == 3 && food_category == 1) {
			quantity = quantity();
			price = price + (veg_fired_rice_price * quantity);
		} else if (dish_number == 4 && food_category == 1) {
			quantity = quantity();
			price = price + (gobi65_price * quantity);
		} else if (dish_number == 5 && food_category == 1) {
			quantity = quantity();
			price = price + (veg_tali_price * quantity);
		} 

		else {
			System.out.println("Enter valid Number");
		}

		order_more(food_category);
		//calculate_price(price);
		return price;

	}

	public int quantity() {
		System.out.println("Please enter the quantity you would like to order :");
		int quantity = scanner.nextInt();
		//System.out.println("Quantity is " + quantity);
		return quantity;
	}

	public void order_more(int food_category) {
		int veg_category = 1;
		int nonveg_category = 2;
		
		System.out.println("Would you like to order one more dish from same category ? [Y] or [N] :");
		String order_more_value = scanner.next();
		
		if (order_more_value.equals("Y") || order_more_value.equals("y")) {
			if (food_category == veg_category) {
				display_dishes(veg_category);
				select_food(veg_category);

			} else if (food_category == nonveg_category) {
				display_dishes(nonveg_category);
				select_food(nonveg_category);
			}

		}

		else if (order_more_value.equals("N") || order_more_value.equals("n")) {
			System.out.println("Would you like to order from other category ? [Y] or [N] :");
			order_more_value = scanner.next();
			if (order_more_value.equals("Y") || order_more_value.equals("y")) {
				if (food_category == veg_category) {
					display_dishes(nonveg_category);
					select_food(nonveg_category);

				} else if (food_category == nonveg_category) {
					display_dishes(veg_category);
					select_food(veg_category);
				}
			}
			else {
				double p = price;
				calculate_price(p);
			}

		}
	}

	public void dine_in(int number) {
		select_category();
		if (food_category == 1) {
			display_dishes(food_category);
			select_food(food_category);
		} else if (food_category == 2) {
			display_dishes(food_category);
			select_food(food_category);

		} else {
			System.out.println("Please enter valid input");

		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello Welcome to Numpy Ninja restaurant :");
		System.out.println("Please select the service offering from below list :");
		System.out.println("[1] dine-in");
		System.out.println("[2] take-away");
		System.out.println("Please enter the option : ");
		int number = scanner.nextInt();
		OnlineFood food = new OnlineFood();
		if (number == 1) {
			food.dine_in(number);
		} else if (number == 2) {
			food.take_away(number);
		} else {
			System.out.println("Please enter valid input");

		}

	}

}
