package com.freetime.exercises.introToProg;

import java.util.Scanner;

public class P3_EkrandanSayiOkuma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Ekrandan okuma icin gerekli kisim
		System.out.print("Lutfen bir sayi giriniz : ");
		int var = input.nextInt();
		System.out.println("Girdiginiz sayi : " + var);
		
		input.close();
	}
}
