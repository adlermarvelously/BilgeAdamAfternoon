package lesson002;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doğduğunuz ayı giriniz: ");
		int ay = scanner.nextInt();
		
		System.out.println("Doğduğunuz günü giriniz: ");
		int gün = scanner.nextInt();
		
		
		
		
		switch (ay) {
		case 1:
			
			if(gün <= 22) {
				System.out.println("Oğlak burcusunuz.");
			} 
			else {
				System.out.println("Kova burcusunuz.");
			}
			
			break;
			
		case 2:
			
			if(gün <= 22) {
				System.out.println("Kova burcusunuz.");
			} 
			else {
				System.out.println("Balık burcusunuz.");
			}
			
			break;
			
		default:
			System.out.println("Lütfen 1 ile 12 arasında bir sayı giriniz!");
			break;
		}
		
		

	}

}
