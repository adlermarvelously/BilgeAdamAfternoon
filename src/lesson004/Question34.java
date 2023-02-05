package lesson004;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		
		
		// Verilen kelimenin harflerini alt alta yazdıralım:
		// Java
		
		String test = "java";
		System.out.println(test.length());
		
		for(int i=0;i<test.length();i++) {
			System.out.println(test.charAt(i));
		}
		
		// Kullanıcıdan bir String değeri alalım
		// Aldığımız değeri 
		// 0. indexi -> ...
		// 1. indexi -> ... 
		// şeklinde yazdıralım
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir metin giriniz: ");
		String metin = scanner.nextLine();
		
		for (int i =0;i<metin.length();i++) {
			System.out.println(i + ". indexi: " + metin.charAt(i) );
		}
		
		
		
		
		
		
		

	}

}
