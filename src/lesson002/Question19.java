package lesson002;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {

		// Girilen sayının ünlü mü ünsüz mü olduğunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		System.out.println("Bir karakter giriniz: ");
		
		int ascii = ch;
		switch (ch) {
			case 65,69,73,79,85,97,101,105,111,117:
				System.out.println("Ünlü harf");
			break;
			default:
				System.out.println("Ünlü değil");
			break;
		}
		
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
			System.out.println("Ünlü harftir.");
		}
		else {
			System.out.println("Ünsüz bir harftir.");
		}
		
		
		
		
	}

}
