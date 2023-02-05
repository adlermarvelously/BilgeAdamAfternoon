package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		
		//Kullanıcıdan alınan vize ve final notlarını hesaplayarak
		//Geçip geçmediğini hesaplayan program
		
		//vize%40
		//final %60
		//50 den büyük ve eşitse geçti
		//50 den küçükse kaldı.
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen vize sınav notunu giriniz: ");
		double ilkSinav = scanner.nextDouble();
		
		System.out.println("Lütfen final sınav notunu giriniz: ");
		double ikinciSinav = scanner.nextDouble();
		
		double ortalama = (ilkSinav * 0.4) + (ikinciSinav * 0.6);
		
		if (ortalama>=50) {
			System.out.println("Dersten geçtiniz!");
		}
		else {
			System.out.println("Dersten kaldınız!");
		}
		
		
		
		
		
		
		
		
		
	}

}
