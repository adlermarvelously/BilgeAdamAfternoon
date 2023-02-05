package lesson001;

public class Question3 {

	public static void main(String[] args) {
		
		
		// Verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar olduğunu biliyoruz 
		// Verilen ürünün ham fiyatını bulan program
		
		double satisFiyat = 500;
		double kdv = satisFiyat * 0.18;
		double kar = satisFiyat * 0.15;
		
		
		double hamFiyat = satisFiyat - (kdv + kar) ;
		
		
		System.out.println("Ürünün ham fiyatı: " + hamFiyat);
		
		
		// int double float default değerleri sıfır olarak kabul ediliyor.
		
		
	
		
		

	}

}
