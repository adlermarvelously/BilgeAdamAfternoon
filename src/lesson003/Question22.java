package lesson003;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Girilen sayı için çarpım tablosunu veren programı yazalım
		//6*1
		//6*2 ...

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		int carpim =1;
		
		for (int i = 1;i<11;i++) {
			carpim = sayi * i;
		
		System.out.println(sayi +"*" + i + "=" + carpim);
		}
		
		// iç içe for kullanalım
		// bütün çarpım tablosunu yazdıralım
		
		
		
		
		
		
		
		
		
		
	}

}
