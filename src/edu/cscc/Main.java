package edu.cscc;
import java.util.Arrays;
import java.util.Scanner;

/*
Jonah Young
9/17/2019
Organizes phone prices
 */

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	int [] prices = new int[10];


	System.out.print("Enter all smartphone prices: ");

	for(int i = 0; i < prices.length; i++) {

	    prices[i] = input.nextInt();
    }
	Arrays.sort(prices);

	System.out.println("Three Most Expensive Phones");

	for (int i = 9; i > 6; i-- ) {
	    System.out.println(prices[i]);
    }

	System.out.println("Three Cheapest Phones");

		for (int i = 0; i < 3; i++ ) {
			System.out.println(prices[i]);
		}
    }
}
