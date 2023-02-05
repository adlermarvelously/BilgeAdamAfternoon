package lesson003;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) { 
		
		// Girilen sayıda hangi basamakta hangi sayı var onu bulan program
		// birler basamağı 5
		// onlar basamağı 7
		// yüzler basamağı 1    şeklinde
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		
		int sayi = scanner.nextInt();
		
		int i =1;
		while (sayi>0) {
			System.out.println(i + "ler basamağı " + sayi%10);
			sayi = sayi/10;
			i =i*10;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
