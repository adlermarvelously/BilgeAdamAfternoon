package lesson002;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
		// telefona maille bir kod gelecek bu kodları biz tanımlayacağız
		// kullanıcıdan maile ve telefona gelen kodu isteyeceğiz
		// eğer onun mailine ve telefonuna giden kod ile uyuşuyorsa
		// sisteme kayıt oldunuz diyelim
		// ya maili hatalıdır ya telefonu ya da ikisi de hatalıdır
		// durum hakkında kullanıcıyı bilgilendireceğiz.
		
		
		
		int mailKod = 2145;
		int telefonKod = 5246;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Emailinize gelen kodu giriniz :");
		int x1 = scanner.nextInt();
		
		System.out.println("Telefonunza gelen kodu giriniz :");
		int x2 = scanner.nextInt();
		
		
		if(x1 == 2145 && x2 ==5246) {
			System.out.println("Sisteme kayÄ±t oldunuz");
		}
		else if(x1 != 2145 && x2 == 5246) {
			System.out.println("email kodunuz hatalÄ± girdiniz");
		}
		else if(x1 == 2145 && x2 != 5246) {
			System.out.println("telefon kodunuz hatalÄ± girdiniz");
		}else {
			System.out.println("iki kodda hatalÄ± girdiniz");		
			scanner.close();
			
			
}




	}

}
