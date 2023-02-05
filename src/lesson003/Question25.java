package lesson003;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// Girilen sayının asal olup olmadığını bulan programı yazınız:
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		
		int sayi = scanner.nextInt();
		
		for (int i =2;i<sayi;i++) {
			if (sayi % i ==0) {
				System.out.println("Sayı asal değildir.");
				break;
			}
			
			else {
				System.out.println("Sayı asaldır.");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
