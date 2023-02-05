package lesson002;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		// int olarak dışarıdan iki tane sayısal değer alalım
		//iki sayının toplamı çift ise true değil ise false yazdıralım
		// en sonda da sayıların toplamının yarısını yazdıralım
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		boolean tekMi;
		int sayi1,sayi2;
		double toplam;
		
		System.out.println("Birinci sayıyı giriniz: ");
		
		sayi1 = scanner.nextInt();
		
		System.out.println("İkinci sayıyı giriniz: ");
		
		sayi2 = scanner.nextInt();
		
		toplam = sayi1 + sayi2;
		if(toplam%2 == 0) {
			tekMi = true;
		}
		else {
			tekMi = false;
		}
		
		System.out.println(tekMi);
		System.out.println(toplam/2);
		
		
		
		
		

	}

}
