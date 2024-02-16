import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("lutfen ebobunu bulmak istediginiz birinci sayiyi giriniz : ");
		int birinciSayi = scanner.nextInt();
		System.out.println("lutfen ebobunu bulmak istediginiz ikinci sayiyi giriniz : ");
		int ikinciSayi = scanner.nextInt();
		System.out.println("iki sayinin ebobu : " + ebobBulma(birinciSayi, ikinciSayi));

	}
	public static int ebobBulma(int sayi1 , int sayi2) {
		int  ebob =1;
		for(int i =1 ; i<=sayi1 && i<=sayi2 ; i++) {
			if((sayi1 % i ==0) && (sayi2 % i ==0)) {
				ebob=i;
			}
		}
		return ebob;
	}
}
