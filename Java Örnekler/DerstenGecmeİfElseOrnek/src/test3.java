import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.print("adinizi giriniz: ");
		String isim = scanner.nextLine();
		
		System.out.print("soyadinizi giriniz: ");
		String soyAd = scanner.nextLine();
		
		System.out.print("dersin adini giriniz: ");
		String dersAd = scanner.nextLine();
		
		System.out.print("vize1 notunu giriniz : ");
		double vize1 = scanner.nextDouble();
		
		System.out.print("vize2 notunu giriniz : ");
		double vize2 = scanner.nextDouble();
		
		System.out.print("final notunu giriniz : ");
		double finalNot = scanner.nextDouble();
		
		double sonuc = (vize1*0.3) + (vize2*0.3) + (finalNot*0.4);
		
		if (sonuc>=60) {
			System.out.println(isim + " " + soyAd + " adli ogrenci " + dersAd + " dersinden" + sonuc + " ortalamayla gecmistir" );
		}
		else {
			System.out.println(isim + " " + soyAd + " adli ogrenci" + dersAd + sonuc + " ortalamayla kalmistir");
		}
	}

}
