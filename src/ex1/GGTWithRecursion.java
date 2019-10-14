package ex1;
import java.util.Scanner;

public class GGTWithRecursion {

	public static int calculation(int number1, int number2) {
		int rest = number1 % number2;
		if (rest == 0) {
			return rest;
		} else {
			calculation(number2, rest);
			return rest;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert the first number:");
		int number1 = sc.nextInt();
		System.out.println("Insert the second number:");
		int number2 = sc.nextInt();
		//System.out.println("num1:" + number1 + " num2" + number2);
		
		int result = calculation(number1, number2);
		System.out.println("Result: " + result);
		
	}
	
	
	
}
