package model2;

public class A extends B{
	//super() kavaramını kullanmak için
	//1- super() en üstte olmalı kodların
	//2- yapıcı metot içinde kullanılmalı
	
	
	public int aDegisken1;
	public int aDegisken2;
	
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("A sinifinin yapıcı methodunun içerisindeyiz");
	}

	public A(int aDegisken1, int aDegisken2) {
		super(aDegisken1, aDegisken2);
	}
	
	public void aSinifiMetodu() {
		System.out.println("a sinifinin içindeki metoddayım");
		super.bSinifiMetodu();  //üst class yani mirası veren kişi anlamına geliyor yani miras aldıgımız classın içini temsil ediyor
	}
	
}
