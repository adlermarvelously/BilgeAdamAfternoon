package lesson001;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		
		
		// Verilen iki sayıdan hangisinin büyük olduğunu bulan program
		
		
		int sayi3 = 5;
		int sayi4 = 10;
		
		if (sayi3>sayi4) {
			System.out.println("Birinci sayı ikinci sayıdan büyüktür.");
		}
		
		else {
			System.out.println("İkinci sayı birinci sayıdan büyüktür.");
		}
		
		
		
		System.out.println("***************");
		
		
		// girilen iki sayıdan hangisinin büyük olduğunu bulan program
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("İlk sayıyı giriniz: ");
		
		int sayi1 = scanner.nextInt();
		
		System.out.println("İkinci sayıyı giriniz: ");
		
		int sayi2 = scanner.nextInt();
		
		if (sayi1>sayi2) {
			System.out.println("Birinci sayı ikinci sayıdan büyüktür.");
		}
		
		else if (sayi1<sayi2) {
			System.out.println("İkinci sayı birinci sayıdan büyüktür.");
		}
		else {
			System.out.println("Sayılar eşittir.");
		}
		
		
		
		
		
		
		
		
	}

}
