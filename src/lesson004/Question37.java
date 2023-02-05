package lesson004;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		
		
		// kullanıcdan
				//email, password, repassword alalım
				
				//emaili kontrol edicez '@hotmil.com', '@outlook.com' var mı?
				//emailiniz email formatına uygun değildir
				
				//password repassword 
				//ikisi aynı değilse passwordler uyuşmuyo
				//password min 8 karakter olsun
				
				//
		
		
		Scanner scanner = new Scanner(System.in);
		
		boolean check1 = true;
		boolean check2 = true;
		
		while (check1) {
			System.out.println("Mail giriniz: ");
			String mail = scanner.nextLine();
			
				if (!(mail.contains("@gmail.com") || mail.contains("@outlook.com"))){
					System.out.println("Mail formatına uygun değildir!");
				}
				else {
					while (check2) {
						System.out.println("Şifrenizi giriniz: ");
						String password = scanner.nextLine();
						
						System.out.println("Şifrenizi tekrar giriniz: ");
						String rePassword = scanner.nextLine();
						
						if (password.equals(rePassword) && (password.length()>=8)) {
							System.out.println("Giriş yaptınız --> " + mail);
							check2 =false;
							check1 =false;
						}
						else {
							System.out.println("Şifreleriniz uyuşmuyor ya da karakter 8 den küçük!");
						}
						
					}
				}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
