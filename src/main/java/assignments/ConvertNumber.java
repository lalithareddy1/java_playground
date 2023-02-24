package assignments;

public class ConvertNumber {
	
	
	public static void convert_binary(int num) {
		System.out.println(1/2);
		String str = " ";
		while(num != 0) {
			
			int reminder = num%2;
			str = reminder + str;
			num = num/2;
		
		}
		System.out.println("Integer to Binary : " + str);
		
	}
	
	public static void convert_octal(int num) {
		
		String octal = "";
		while(num != 0) {
			int reminder = num%8;
			octal = reminder + octal;
			num = num/8;
			
		}
		System.out.println("Integer to Octa : "+octal);
		
	}
	
	
	public static void convert_hexal(int num) {
		
		
		char[] list = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hexa_value = "";
		while(num >0) {
			
			int remider = num %16;
			hexa_value = list[remider] + hexa_value;
			num = num/16;
		}
		System.out.println("Integer to Hexa : " +hexa_value);
	}
	
	
	public static void main(String[] args) {
		int number = 10;

	/*	System.out.println("Binary Number " + Integer.toBinaryString(number));
		System.out.println("Octa Number " + Integer.toOctalString(number));
		System.out.println("Hexadecimal Number " + Integer.toHexString(number));
	*/
		convert_binary(number);	
		convert_octal(number);
		convert_hexal(number);
		
		
	}

}
