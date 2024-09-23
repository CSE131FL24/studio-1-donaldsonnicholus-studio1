package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int Year = in.nextInt();
		
		boolean IsDivisibleBy4 = Year % 4 == 0;
		boolean IsNotDivisibleBy100 = Year % 100 != 0;
		boolean IsDivisibleBy400 = Year % 400 == 0;
		boolean leapYear = (IsDivisibleBy4 && IsNotDivisibleBy100) || IsDivisibleBy400;
		System.out.println(Year + " is a leap year: " + leapYear);
		

	}

}
