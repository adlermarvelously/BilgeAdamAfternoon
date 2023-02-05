package lesson005;

public class Question42 {

	public static void main(String[] args) {
		
		// Bu sayılar çifttir tektir şeklinde çıktı alalım
		// Dizideki tüm sayıların toplamını veren program
		
		// Dizinin içindeki elemanların toplamını yazalım
		
		
		

		int[] sayilar = { 2, 4, 10, 5 };

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {
			toplam = toplam + sayilar[i];
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " sayısı çifttir.");
			} else {
				System.out.println(sayilar[i] + " sayısı tektir");
			}
		}
		System.out.println(toplam);

	}

}
