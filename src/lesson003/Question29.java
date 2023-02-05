package lesson003;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) { 
		
		//  Kullanıcıdan sürekli sayı alacağız
		// Kullanıcı sıfıra basınca aldığımız sayıların çarpımını yazdıracağız
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sürekli sayı giriniz 0'a bastığınızda girdiğiniz sayıların çarpımını göreceksiniz.");
		
		int sayi = scanner.nextInt();
		int carpim = 1;
		int ilkDeger = 0;

		while (sayi != 0 ) {
			carpim = carpim * sayi;
			System.out.println("Bir sayı daha giriniz, çıkmak için 0'a basınız.");
			sayi = scanner.nextInt();
			ilkDeger =1;
			
		}
		
		if (sayi == 0 ) {
			System.out.println("Programdan çıktınız!");
		}
		else
			System.out.println(carpim);
		
		
		
		
		
		

	}

}
