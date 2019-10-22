package com.freetime.exercises.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIO {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inp);

		System.out.print("Bir text giriniz : ");

		String str = br.readLine();

		System.out.print("Girdiginiz text : " + str);
	}
}
