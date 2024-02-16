import java.util.Scanner;

public class atmornegi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String islemSecenekleri = "bakiye goruntuleme...1"
				+ "para cekmek...2"
				+ "farklı hesapa par yatırmak...3"
				+ "cıkıs için q tusuna basiniz...";
		
		
		double bilalBakiye = 2450.0;
		String bilalIBAN = "TR 1265 0780 127 985 345 7572 13 89";
		String bilalKullanici ="bilal12";
		String bilalSifre = "123";
		
		
		double enesBakiye = 1200.0;
		String enesIBAN = "TR 1265 0780 127 985 345 7572 13 89";
		String enesKullanici ="enes55";
		String enesSifre = "456";
		
		System.out.println("atm ye hosgeldiniz: ");
		System.out.println("lutfen bilgilerinizi giriniz: ");
		
		System.out.print("kullanici adi : ");
		String kullaniciAdi = scanner.nextLine();
		
		System.out.println("sifreyi giriniz : ");
		String sifre = scanner.nextLine();
		
		
		if(kullaniciAdi.equals("bilal12") && sifre.equals("123")) {
			System.out.println("blalin hesabina giris yapildi....");
			System.out.println(islemSecenekleri);
			String secim = scanner.nextLine();
			switch(secim) {
			case "1":
				System.out.println("bakiyeniz : " + bilalBakiye);
				break;
				
			case "2":
				System.out.print("cekmek istdeginiz tutari giriniz : ");
				int cekilecekTutar = scanner.nextInt();
				if(bilalBakiye>=cekilecekTutar) {
					bilalBakiye-=cekilecekTutar;
					System.out.println("kalan tutar : " + bilalBakiye);
				} else {
					System.out.println("bakiyenizden fazla para cekemezsiniz...");
				}
				break;
			case "3":
				System.out.print("ne kadar para yatirmak istiyorsunuz : ");
				int yatirilacakTutar =scanner.nextInt();
				if(yatirilacakTutar<=bilalBakiye) {
					System.out.println("iban giriniz :");
					scanner.nextLine();
					String yatirilacakIBAN =scanner.nextLine();
					if(yatirilacakIBAN.equals(enesIBAN)) {
						System.out.println("para enes bayram adlı kisiye atiliyor....");
						bilalBakiye-=yatirilacakTutar;
						enesBakiye+=yatirilacakTutar;
						System.out.println("bakiyeniz : "+ bilalBakiye);
						System.out.println("enesin bakiye : " + enesBakiye);
					}
				}
				
				break;
			
			}
		}
		else if(kullaniciAdi.equals("enes55") && sifre.equals("456")) {
			System.out.println("enesin hesapına giris yapildi...");
			System.out.println(islemSecenekleri);
			
		}
		else {
			System.out.println("hatalı giris yaptiniz....");
		}

	}

}
