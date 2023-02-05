package lesson003;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		
		
		// Girilen sayının faktoriyelini bulan program
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Sayı giriniz: ");
		 int sayi = scanner.nextInt();
		 
		 int fakt = 1;
		 for (int i=1;i<=sayi;i++) {
			 fakt = fakt* i;
		 }
		
		System.out.println(fakt);
		
		
		
		
		
		
		
	}

}
