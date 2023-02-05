package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// Araştırma ödevi:
		// Javada primitive tipler nelerdir?
		// Birbirinden farkları nelerdir?
		
		
		
		// Verilen isim ve soy isim değerlerini hello( isim), (soyisim) şeklinde yazdıralım
		
		
		// Değişken tanımlarken anlaşılabilir olmalı.
		
		String isim = "Merve";
		String soyIsim = "Adler";
				System.out.println("Hello " + isim + " " + soyIsim + "!");
		
		
		// girilen isim ve soyisimleri yazdıran
				
				
				// Burada input nesnesi oluşturduk, oluştururken Scanner sınıfını kullandık.
				Scanner scanner = new Scanner(System.in);
				System.out.println("Lütfen isim giriniz: ");
		
				String ad = scanner.nextLine();
		
				System.out.println("Lütfen soyisim giriniz: ");
				
				String soyisim = scanner.nextLine();
				
				
		System.out.println("Hello " + ad + " " + soyisim + "!");
		
		scanner.close();
		
	}

}
