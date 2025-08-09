package Assesment;

import java.util.Scanner;

public class Div {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	
	int num = scan.nextInt();
	if (num%3==0 && num%5==0) {
		System.out.println("Fizz Buzz");
	}
	else if (num%3==0) {
		System.out.println("Fizz");
	}
	else if (num%5==0) {
		System.out.println("Buzz");
	}
	}
}
		

	



