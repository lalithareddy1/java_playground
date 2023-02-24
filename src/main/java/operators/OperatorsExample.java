package operators;

public class OperatorsExample {

	public static void prefix(int a) {
		System.out.println("======== Unary Prefix ===============");

		System.out.println(++a); // 11
		System.out.println(--a); // 10

	}

	public static void postfix(int b) {
		System.out.println("========= Unary Postfix ==============");

		System.out.println(b++); // prints 15 first in the console and then assign value from 15 to 16 in the
									// memory
		System.out.println(b); // 16
		System.out.println(b--); // 16
		System.out.println(b); // 15
	}

	public static void arithmeticOperators(int a, int b) {
		System.out.println("========= Arithmetic Operators ==============");

		System.out.println("Addition :" + (a + b));
		System.out.println("Substraction :" + (a - b));
		System.out.println("Multiplication :" + (a - b));
		System.out.println("Division :" + (a / b)); // returns quotient
		System.out.println("Modulo division :" + (a % b)); // returns reminder

	}

	public static void logicalOperators(int a, int b, int c) {
		System.out.println("========= Logical AND Operators ==============");
		// && doesn't check the second condition if first condition is false
		System.out.println(a < b && b < c);// true && true -- true
		System.out.println(a > b && b > c);// false && false -- false
		System.out.println(a > b && c > b);// false && true -- false
		System.out.println(a < b && b > c);// true && false -- false

		System.out.println("========= Logical OR Operators ==============");
		// || doesn't check the second condition if first condition is true

		System.out.println(a < b || b < c);// true && true -- true
		System.out.println(a > b || b > c);// false && false -- false
		System.out.println(a > b || c > b);// false && true -- true
		System.out.println(a < b || b > c);// true && false -- true
	}

	public static void bitwiseOperators(int a, int b, int c) {
		System.out.println("========= Bitwise AND Operators ==============");
		// & always checks both conditions whether first condition is true or false
		System.out.println(a < b & b < c);// true && true -- true
		System.out.println(a > b & b > c);// false && false -- false
		System.out.println(a > b & c > b);// false && true -- false
		System.out.println(a < b & b > c);// true && false -- false

		System.out.println("========= Bitwise OR Operators ==============");
		// | always checks both conditions whether first condition is true or false

		System.out.println(a < b | b < c);// true && true -- true
		System.out.println(a > b | b > c);// false && false -- false
		System.out.println(a > b | c > b);// false && true -- true
		System.out.println(a < b | b > c);// true && false -- true
	}

	public static void shift_operators(int a, int b) {
		System.out.println("========= Left shift Operators ==============");
		// binary value of a is 1010
		b = a << 2;
		System.out.println("Value of b :" + b);

		System.out.println("========= Right shift Operators ==============");
		// binary value of b is 1111
		b = a >> 2;
		System.out.println("value of b :" + b);

	}
	
	public static void ternary_operator() {
		int num = 10;
		String output =(num%2 == 0)?"even number":"odd number";
		System.out.println(num +" " +output);
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 15;
		int c = 20;
		prefix(a);
		postfix(b);
		arithmeticOperators(a, b);
		logicalOperators(a, b, c);
		shift_operators(a, b);
		ternary_operator();

	}
}
