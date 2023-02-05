package lesson002;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
		
	//	girilen 3 sayıyı büyükten küçüğe sıralayan program
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. sayıyı giriniz: ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("2. sayıyı giriniz: ");
		int sayi2 = scanner.nextInt();
		
		System.out.println("3. sayıyı giriniz: ");
		int sayi3 = scanner.nextInt();
		
		
		
		if (sayi1==sayi2 || sayi1==sayi3 || sayi2==sayi3) {
			System.out.println("Birbirinden farklı sayılar giriniz.");
		}
		
		else if (sayi1 > sayi2 && sayi1> sayi3) {
			if (sayi2>sayi3) {
				System.out.println(sayi1 + ">" + sayi2 + ">" + sayi3);
			}
			else {
				System.out.println(sayi1 + ">" + sayi3 + ">" + sayi2);
			}
		}
		
		else if (sayi2 > sayi1 && sayi2 >sayi3) {
			
			if (sayi1>sayi3) {
				System.out.println(sayi2 + ">" + sayi1 + ">" + sayi3);
			}
			else {
				System.out.println(sayi2 + ">" + sayi3 + ">" + sayi1);
			}
			
		}
		
		else if (sayi3 > sayi1 && sayi3 >sayi2) {
			
			if (sayi2>sayi1) {
				System.out.println(sayi3 + ">" + sayi2 + ">" + sayi1);
			}
			else {
				System.out.println(sayi3 + ">" + sayi1 + ">" + sayi2);
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
