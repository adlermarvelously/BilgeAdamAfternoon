package lesson002;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		
		// Kullanıcıdan aldığımız sayı haftanın hangi gününe denk geliyo
		// Bugün hafta sonu mu hafta içi mi kontrol edelim
		// switch case ile
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-7 arasında bir sayı giriniz: ");
		int gun = scanner.nextInt();
		
		String durum = "Hafta içi";
		if(gun >=6 && gun<=7)  {
			durum = "Hafta sonu";
		}
		 switch (gun) {
		 case 1:
			 System.out.println("Pazartesi " + durum);
			 break;
			 
		 case 2:
			 System.out.println("Salı " + durum);
			 break;
			 
		 case 3:
			 System.out.println("Çarşamba " + durum);
			 break;
			 
		 case 4:
			 System.out.println("Perşembe " + durum);
			 break;
			 
		 case 5:
			 System.out.println("Cuma " + durum);
			 break;
			 
		 case 6:
			 System.out.println("Cumartesi " + durum);
			 break;
			 
			default: 
				break;
		
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }
		
		
		
		
		
		

	}

}
