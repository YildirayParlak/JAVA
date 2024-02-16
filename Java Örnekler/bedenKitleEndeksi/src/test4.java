import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// beden kitle endeksi kilo/boy(m)*boy(m)* yapılarak bulunur
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("beden kitle endeksi bulan programa hosgeldiniz:  ");
		System.out.println("************");
		
		System.out.print("lutfen kilonuzu girin : ");
		
		int kilo = scanner.nextInt();
		System.out.print("lutfen boyunuzu metre cinsinden giriniz:");
		double boy = scanner.nextDouble();
		
		double kitleEndeks = kilo / (boy * boy);
		
		System.out.println("beden kitle endeksiniz : " + kitleEndeks);
		
		if(kitleEndeks<18.5) {
			System.out.println("kisi zayiftir ");
		}
		else if(kitleEndeks>18.5 && kitleEndeks<25.0) {
			System.out.println("kisi normaldir");
		}
		else if(kitleEndeks>25.0 && kitleEndeks<30) {
			System.out.println("kisi kiloludur");
		}
		else{
			System.out.println("kisi obezdir yemis yemis sicmamis amk");
		}
		
		
		
		//bir aracın kilometrede ne kadar yaktıgını ve kac kilometre yaptıgı bilgileri alınacak ve sürücünün toplam nekadar  ödemesi gerektiğini bulunuz
		
	/*	System.out.print("lutfen aracinizin kac km gittiğini giriniz : ");
		int km = scanner.nextInt();
		System.out.print("lutfen aracinizin kilometrede kac kurus yaktigini giriniz: ");
		double kurus = scanner.nextDouble();
		double maliyet = km *kurus;
		System.out.println("aracinizn yol boyunca maliyeti : " + maliyet);
		*/
	}

}
