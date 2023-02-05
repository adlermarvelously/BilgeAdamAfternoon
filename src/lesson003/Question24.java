package lesson003;

public class Question24 {

	public static void main(String[] args) {
	
		// 1 den 100 e kadar olan çift sayıların toplamının tek sayıların toplamına oranını bulan program
		
		int toplamTek=0;
		int toplamCift =0;
		
		for (int j = 2; j<101; j+=2) {
			
			toplamCift = toplamCift + j;
		
		}
		for (int k=1; k<101; k+=2) {
			toplamTek = toplamTek + k;
		}
		int oran = toplamCift / toplamTek;
		
		System.out.println(oran);
		
	}

}
