package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		
		// Verilen iki sayının çarpımını bulan program:
		
		int sayi1 = 5;
		int sayi2 = 10;
		int carpim = sayi1 * sayi2;
		System.out.println("İki sayının çarpımı: " + carpim);
		
		System.out.println("****************");
		
		
		// Girilen iki sayının çarpımını bulan program:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İlk sayıyı giriniz: " );
		int x = scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz : ");
		int y = scanner.nextInt();
		
		int carpimi = x * y;
		
		System.out.println("Girilen iki sayının çarpımı: " + carpimi);
		
		
		
		
		//ilk scanner küçük sonrası büyük olsaydı hata verirdi
		// long olanın başına int koymak gerekir.
		
		
	}

}
