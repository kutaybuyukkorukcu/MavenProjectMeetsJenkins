package com.freetime.exercises.introToProg;

import java.util.Scanner;

public class P18_FaktoriyelRecursion {

	public static void main(String[] args) {

		System.out.print("Bir sayi giriniz : ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();

		System.out.println(fact(sayi));
		input.close();
	}

	static int fact(int j) {

		if (j == 1)
			return 1;

		return fact(j - 1) * j;
	}

}
