package lesson005;

import java.util.Random;
import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		
		
		// Sayı tahmin uygulaması yapalım;
		// Sürekli kullanıcıdan sayıyı tahmin etmesini isteyeceğiz
		// Eğer kullanıcının girdiği sayı bulması gereken sayıdan az ise
		// Tahmininizi yükseltin
		// Fazla ise azaltın diyelim
		// Doğru tahmin ettiği zaman kaçıncı denemesinde bulduğunu kullanıcıya söyleyelim.
		
		// int rastgele = (int) (Math.random() *100);

		// Random int sayı üretmemiz lzım
		// Random sayıyı üretelim 0 ile 100 arasında bunu yazdıralım
		
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int rastgele = random.nextInt(0,101);
		
		int tahminSayisi =0;
		int secim = -1;
		
		while (secim!=0) {
			System.out.println("Üretilen: " + rastgele);
			int tahmin = scanner.nextInt();
			
			if(tahmin == rastgele) {
				System.out.println("Tebrikler! "+ tahminSayisi + " denemede buldunuz.");
				System.out.println("Devam etmek istiyor musunuz? Evetse 1 hayırsa 0 a basınız.");
				secim = scanner.nextInt();
				tahminSayisi =0;
				rastgele = random.nextInt(0,101);
			}
			else if (tahmin > rastgele ) {
				System.out.println("Sayıyı azaltın: ");
			} 
			else {
				System.out.println("Sayıyı artırın: ");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
