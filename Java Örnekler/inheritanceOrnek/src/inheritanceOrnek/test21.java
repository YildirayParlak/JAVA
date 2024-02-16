package inheritanceOrnek;

import java.util.Scanner;

import classlar.kamyon;
import classlar.motorSiklet;

public class test21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("ARAC UYGULAMASİNA HOSGELDİNİZ.... ");
		System.out.println("lutfen bir secim yapiniz : ");
		String giris = "1-kamyon\n"
				+ "2-motorsiklet";
		System.out.println(giris);
		int secim = scanner.nextInt();
		if(secim == 1) {
			//kamyon işlemleri
			int trafikCezaTutari = 200;
			kamyon kamyon1 = new kamyon(1L, "truck", "siyah",500000.0 , 12, "2023", "Mercedes", 200.0);
			System.out.println("1- kamyonun bilgilerini göster\n"
				+	"2-trafik cezasini öde");
			int kamyonSecim = scanner.nextInt();
			if(kamyonSecim == 1) {
				kamyon1.aracBilgileriGoster();
			}
			else if(kamyonSecim == 2) {
				kamyon1.trafikCezasiOde(trafikCezaTutari);
			}
			else {
				System.out.println("lutfen kamyon için gecerli bir rakam giriniz");
			}
		}
		else if(secim == 2) {
			//motorsiklet islemleri
			int trafikCezaTutari = 500;
			motorSiklet motorSiklet1 = new motorSiklet(1L, "motorcycle", "mavi", 2500000.0, 2, "2022", "kuba", 100.0);
			System.out.println("1- motorsikletin bilgilerini göster\n"
					+	"2-trafik cezasini öde");
			int motorSikletSecim = scanner.nextInt();
			if(motorSikletSecim == 1) {
				motorSiklet1.aracBilgileriGoster();
			}
			else if(motorSikletSecim == 2) {
				motorSiklet1.trafikCezasiOde(trafikCezaTutari);
			}
			else {
				System.out.println("lutfen motorsiklet için gecerli bir rakam giriniz");
			}
		}
		else {
			//gecersiz islem alanı
			System.out.println("gecersiz bir tusa bastiniz lutfen belirtilen aralikta bir deger giriniz");
		}
	}

}
