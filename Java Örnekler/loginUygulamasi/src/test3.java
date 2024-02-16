import java.util.Scanner;

public class test3 {
	static boolean aktif = true;//ilk basta kullanıcının hesabı aktif olsun
	static int hakSayisi =3;
	public static void main(String[] args) {
		// login uygulaması : kullanıcının sitemize giriş yapmasını saglayalım 3 hakkı olsun
		// 3 hakkını da doldurgu zaman hesabını disable yapalım dogru girersease zaten girer
		Scanner scanner = new Scanner(System.in);
		
		if(aktif) {
		
			if(hakSayisi>0) {
				while(true) {
					System.out.print("kullanici adiniz : ");
					String username = scanner.nextLine();
					System.out.print("sifreniz : ");
					String password = scanner.nextLine();
					boolean sonuc = login(username, password);
					if(sonuc) {
						System.out.println("basarıyla uygulamaya giris yaptiniz");
						break;
					}
					else {
						if(hakSayisi ==0) {
							aktif = false;
							break;
						}
					}
					
				}
				if(aktif== false) {
					System.out.println("hak sayiniz dolmustur hesabınız bloke olmustur");
				}			
			}
			
		}
		else {
			System.out.println("hesabiniz aktif degildir yönetici ile iletisime gecin lutfen");
		}
		

	}
	public static boolean login(String username , String password) {
		//hamza 2735 giris bu sekilde olsun
		if(username.equals("hamza") && password.equals("2735")) {
			return true;
		}
		else {
			hakSayisi--;
			System.out.println("kullanici adi veya sifreniz hatalidir");
			return false;
		}
	}

}
