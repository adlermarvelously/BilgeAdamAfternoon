package lesson005;

public class Question40 {

	public static void main(String[] args) {
		
		// a ile biten kelimelerin yerine ? koyacağız
		// 0. indexi değişti ---?
		
		
		
		String[] dizi = { "Amerika", "Almayna", "İsveç", "Türkiye", "Danimarka" };
		
		for (int i =0;i<dizi.length;i++) {
			
			if (dizi[i].endsWith("a")) {
				dizi[i] = "?";
				String yeniDeger = dizi [i];
				System.out.println(i + ". indexi değişti yeni değer " + yeniDeger);
			}
			
				
		}
		
	}
}


