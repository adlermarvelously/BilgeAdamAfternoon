package lesson003;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		
		// Girilen sayıya kadar tek olan sayıların toplamını veren program
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz.");
		int sayi = scanner.nextInt();
		
		int toplam =0;
		
		for (int i=1;i<=sayi;i++) {
			if (sayi % 2 != 0 ) {
				toplam = toplam + i;
			}
			else {
				continue;
			}
		}
		System.out.println(toplam);
		
		
		
		
		
	}

}
