package com.freetime.exercises.introToProg;

import java.util.Scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class P4_3_GunSayisi {

	public static void main(String[] args) {
		try {
			SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
			Scanner input = new Scanner(System.in);
			System.out.print("Birinci tarihi giriniz (Ornek : 01/01/2018) : ");
			String tarihF = input.nextLine();
			System.out.print("Ikinci tarihi giriniz (Ornek : 01/01/2018) : ");
			String tarihS = input.nextLine();

			Date date1 = myFormat.parse(tarihF);
			Date date2 = myFormat.parse(tarihS);
			long diff = date2.getTime() - date1.getTime();
			System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
			input.close();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}