package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("year?");
		int n1 = in.nextInt();
		boolean first = n1 % 4 == 0;
		boolean second = n1 % 100 != 0;
		boolean third = n1 % 400 == 0;
		boolean leapYear = (first && second) || (third);
		System.out.println(leapYear);
		

	}

}
