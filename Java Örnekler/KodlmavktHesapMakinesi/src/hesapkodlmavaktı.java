import java.util.Scanner;

public class hesapkodlmavaktı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int secim;
		int sayi1,sayi2;
		System.out.print("lutfen birinci sayiyi giriniz : ");
		sayi1 = scanner.nextInt();
		System.out.print("lutfen ikinci sayiyi giriniz : ");
		sayi2 = scanner.nextInt();
		System.out.println("lutfen yapmak istediginiz islemi seciniz : ");
		System.out.println("1-toplama\n2- cıkarma\n3- carpma\n4- bolme ");
		System.out.println("seciminiz : ");
		secim = scanner.nextInt();
		 switch(secim) {
		 case 1:
			 System.out.println("toplam sonucu : " + (sayi1 + sayi2));
			 break;
		 case 2:
			 System.out.println("cıkarma sonucu : " + (sayi1 - sayi2));
			 break;
		 case 3:
			 System.out.println("carpma sonucu : " + (sayi1*sayi2));
			 break;
		 case 4:
			 System.out.println("carpma sonucu : " + (sayi1/sayi2));
			 break;
			 default :
				 System.out.println("gecersiz bir tuslama yaptiniz   : ");
		 }

	}

}
