package lesson004;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		
		// Verilen kelimenin içinde kaç tane "e" olduğunu bulan algoritmayı yazalım
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir metin giriniz:");
		
		String metin = scanner.nextLine();
		int sayac =0;
		
		for (int i =0;i<metin.length();i++) {
			if (metin.charAt(i)=='e')
			
			sayac++;
			
		}
		System.out.println(sayac);
		
		
		String upperText = metin.toUpperCase();
		System.out.println(upperText);
		
		String lowerText = metin.toLowerCase();
		System.out.println(lowerText);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
