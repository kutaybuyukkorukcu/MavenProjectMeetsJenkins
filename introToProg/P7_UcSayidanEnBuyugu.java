package com.freetime.exercises.introToProg;

import java.util.Scanner;

public class P7_UcSayidanEnBuyugu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();

		if (x > y && y > z) {
			System.out.println("En b�y�k sayi: " + x);
			System.out.println("En k���k sayi: " + z);
		} else if (x > y && z > y && x > z) {
			System.out.println("En b�y�k sayi: " + x);
			System.out.println("En k���k sayi: " + y);
		} else if (y > x && x > z) {
			System.out.println("En b�y�k sayi: " + y);
			System.out.println("En k���k sayi: " + z);
		} else if (y > x && z > x && y > z) {
			System.out.println("En b�y�k sayi: " + y);
			System.out.println("En k���k sayi: " + x);
		} else if (z > x && x > y) {
			System.out.println("En b�y�k sayi: " + z);
			System.out.println("En k���k sayi: " + y);
		} else if (z > x && y > x && z > y) {
			System.out.println("En b�y�k sayi: " + z);
			System.out.println("En k���k sayi: " + x);
		}
		input.close();
	}
}
