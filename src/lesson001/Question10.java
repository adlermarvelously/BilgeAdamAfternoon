package lesson001;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		
		
		//Girilen 3 sayıdan en büyük olanı ekrana yazdıran program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz: ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("İkinci sayıyı giriniz: ");
		int sayi2 = scanner.nextInt();
		
		System.out.println("Üçüncü sayıyı giriniz: ");
		int sayi3 = scanner.nextInt();
		
		
		int enBuyuk = sayi1;
		if(sayi2>enBuyuk) {
			enBuyuk = sayi2;
		}
		if(sayi3>enBuyuk) {
			enBuyuk =sayi3;
		}
		System.out.println("En büyük sayı: " + enBuyuk);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
