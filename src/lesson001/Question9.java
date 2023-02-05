package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
	
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("İlk sınavı giriniz: ");
		int ilkSinav = scanner.nextInt();
		
		System.out.println("İkinci sınavı giriniz: ");
		int ikinciSinav = scanner.nextInt();
		
		double ortalama = (ilkSinav * 0.5) + (ikinciSinav * 0.5);
		
		if(ortalama<60) {
			System.out.println("FF ile kaldınız!");
		}
		else if (ortalama>=60 && ortalama<70) {
			System.out.println("DD ile geçtiniz!");
		}
		else if (ortalama>=70 && ortalama<80) {
			System.out.println("CC ile geçtiniz!");
		}
		else if (ortalama>=80 && ortalama<90) {
			System.out.println("BB ile geçtiniz!");
		}
		else if (ortalama>=90) {
			System.out.println("AA ile geçtiniz!");
		}
		

	}

}
