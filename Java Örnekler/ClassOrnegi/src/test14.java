import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		
		
		System.out.println("*****UYGULAMAYA HOSGELDİNİZ*****");
		
		 Scanner scanner = new Scanner(System.in); {
			System.out.print("lutfen calisanin no degerini giriniz : ");
			int no = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("lutfen calisanin ismini giriniz : ");
			String isim = scanner.nextLine();
			
			System.out.print("lutfen calisanin soyadini giriniz : ");
			String soyİsim = scanner.nextLine();
			
			System.out.print("lutfen calisanin deneyimini giriniz : ");
			int deneyim = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("lutfen calisanin maasini giriniz : ");
			double maas = scanner.nextDouble();
			
			scanner.nextLine();
			
			calisan calisan1 = new calisan(no, isim, soyİsim, deneyim, maas);
			
			String islemler ="1-calisan bilgilerini göster\n"
					+ "2-zam yap\n"
					+ "3-format at";
			System.out.println(islemler);
			System.out.println("----------------------");
			int secim = scanner.nextInt();
			
			scanner.nextLine();
			
			switch (secim) {
			case 1:
				calisan1.calisanBilgileriGoster();
				break;
			case 2:
				System.out.print("lutfen calisana yapilacak zam degerini giriniz : ");
				int zamDegeri = scanner.nextInt();
				scanner.nextLine();
				calisan1.zamYap(zamDegeri);
				break;
			case 3:
				System.out.print("lutfen kim format atacak giriniz : ");
				String kisi = scanner.nextLine();
				System.out.print("lutfen format atilacak isletim sistemini yaziniz : ");
				String isletimSistemi = scanner.nextLine();
				calisan1.formatAt(isletimSistemi, kisi);
				break;

			default:
				System.out.println("lutfen belirtilen aralikta deger secimi yapiniz");
				break;
			}
		}
	}

}
