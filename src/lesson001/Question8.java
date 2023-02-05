package lesson001;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		
	//Kenarları girilen üçgenin nasıl bir üçgen olduğunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci kenar uzunluğunu giriniz: ");
		int kenar1 = scanner.nextInt();
		
		System.out.println("İkinci kenar uzunluğunu giriniz: ");
		int kenar2 = scanner.nextInt();
		
		System.out.println("Üçüncü kenar uzunluğunu giriniz: ");
		int kenar3 = scanner.nextInt();
		
		if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0) {
		
		
			if (kenar1 != kenar2 && kenar1 != kenar3 && kenar2 != kenar3) {
			System.out.println("Çeşitkenar üçgendir.");
			
			}
			
			else if (kenar1 == kenar2 && kenar2 == kenar3 && kenar3 == kenar1) {
			System.out.println("Eşkenar üçgendir.");
			}
		
			else if (kenar1==kenar2 || kenar2==kenar3 || kenar1 == kenar3) {
			System.out.println("İkizkenar üçgendir. ");
		
			}
			
		}
		else {
			System.out.println("Üçgen oluşturamazsınız!");
		}
		
		

	}

}
