import java.util.Scanner;

public class deneme19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String isim = "Sümeyra Güçlü";
		String parola = "1984";
		int giris_hakki = 3;
		
		System.out.println("Kullanıcı Giriş ");
		System.out.println("                ");
		
			while(true) {
				System.out.print("Kullanıcı adınız:");
				String a = scanner.nextLine();
				System.out.print("Kullanıcı şifreniz:");
				String b = scanner.nextLine();
				
				
				if(isim.equals(a) && parola.equals(b)) {
					System.out.println("Hoşgeldiniz...");
					break;
				}
				else if(isim.equals(a) && !parola.equals(b)) {
					System.out.println("Şifre hatalı. Tekrar deneyiniz.");
					giris_hakki-=1;
					System.out.println("Kalan giriş hakkı: "+ giris_hakki);
				}
				
				else if(!isim.equals(a) && parola.equals(b)) {
					System.out.println("Kullanıcı adını yanlış girdiniz."
							+ " Tekrar deneyiniz.");
					giris_hakki-=1;
					System.out.println("Kalan giriş hakkı: "+ giris_hakki);
				}
				else {
					System.out.println("Kullanıcı adını ve şifreyi "
							+ "yanlış girdiniz. Tekrar deneyiniz.");
					giris_hakki-=1;
					System.out.println("Kalan giriş hakkı: "+ giris_hakki);
				}
				
				if(giris_hakki==0) {
					System.out.println("İşlem başarısız. Giriş "
							+ "hakkınız kalmadı...");
					break;
				}
			}
			
			scanner.close();
			
		

	}

}
