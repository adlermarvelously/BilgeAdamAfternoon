package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		// Girilen sayının tek mi çift mi olduğunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz:");
		
		int sayi = scanner.nextInt();
		
		if (sayi == 0) {
			System.out.println("Girilen sayı sıfırdır.");
		}
		
		else if (sayi%2 == 0) {
			System.out.println("Girilen sayı çifttir. ");
		}
		else {
			System.out.println("Girilen sayı tektir.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
