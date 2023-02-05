package lesson003;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		
		// Girilen sayının 5 in kuvveti olup olmadığını bulan program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		if (sayi%5 ==0) {
			System.out.println("Sayı 5'in katıdır.");
			
		}
		else
			System.out.println("Sayı 5'in katı değildir.");
		
		
	}

}
