package com.freetime.exercises.thread;

public class TestRunnable {

	Thread printA = new Thread(new CharYaz('X', 5));
	Thread printB = new Thread(new CharYaz('Y', 5));
	Thread print5 = new Thread(new SayiYaz(10));

	public static void main(String[] args) {

		new TestRunnable();
	
	}

	public TestRunnable() {

		printA.start();
		printB.start();
		print5.start();
		
	}

	class CharYaz implements Runnable {
		private char harf;
		private int kacKez;

		public CharYaz(char c, int t) {
			harf = c;
			kacKez = t;
		}

		public void run() {
			for (int i = 0; i < kacKez; i++) {
				System.out.print(harf);
			}
		}
	}

	class SayiYaz implements Runnable {
		private int sonSayi;
		
		public SayiYaz(int n) {
			sonSayi = n;
		}
		
		public void run() {
			for (int i = 0; i < sonSayi; i++) {
				System.out.print(" " + i);
			}
		}
	}
}
