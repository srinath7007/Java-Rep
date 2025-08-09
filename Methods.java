package Assesment;

import java.util.Scanner;

public class Methods {
	double lenght;
	double breath;
	
	public Methods(double l,double b) {
		lenght=l;
		breath=b;
		
	}
	public double getarea() {
		return lenght*breath;
	}
	public double getpriemeter() {
		return 2*(lenght*breath);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		double lenght=scan.nextDouble();
		System.out.print("Enter breadth of rectangle: ");
		double breath=scan.nextDouble();
		
	
		Methods rect = new Methods(lenght,breath);
		System.out.println(rect.getarea());
		System.out.println(rect.getpriemeter());
		
		
	}

}
