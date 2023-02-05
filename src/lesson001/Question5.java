package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		
		//Girilen TL değerini USD ye çeviren programı yazalım
		//1 USD 18.90 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("TL değerini giriniz: ");
		
		float tl = scanner.nextFloat();
		
		float kur = 18.50f;
		
		float USD = tl / kur;
		
		String kusuratsizSayi = String.format("USD Değeri: %.2f", USD);
		
		System.out.println(kusuratsizSayi);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
