package lesson004;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		
		// Klavyeden girilen sıfır ile yüz arasında yüz dahil beş adet sayıdan 
		// en büyük ve en küçüğünü yazdıran program
		
		Scanner scanner = new Scanner(System.in);
		
		int enKucuk =101;
		int enBuyuk =-1;
		int i =0;
		int sayi;
		
		
		while (i<5) {
			System.out.println("Sayı giriniz: ");
			sayi = scanner.nextInt();
			
			if (sayi <= 100 && sayi >=0) {
				if (sayi>enBuyuk) {
					enBuyuk = sayi;
				}
				if (sayi<enKucuk) {
					enKucuk= sayi;
				}
				i++;
			}
			else {
				System.out.println("Lütfen geçerli bir sayı giriniz: ");
			}
		}
		System.out.println("max: " + enBuyuk);
		System.out.println("min: " + enKucuk);
		
		
		
		
		
		
		
		
	}

}
