
public class calisan {
	
	public int no;
	public String isim;
	public String soyİsim;
	public double maas;
	public int deneyim;
	
	public calisan() {
		// 
	}
	
	
	public calisan(int no , String isim , String soyİsim , int deneyim , double maas) {
		this.no=no;
		this.isim=isim;
		this.soyİsim=soyİsim;
		this.deneyim=deneyim;
		this.maas=maas;
	}
	
	public void calisanBilgileriGoster() {
		System.out.println("*****CALİSAN BİLGİLERİ*****");
		System.out.println("NO : " + this.no);
		System.out.println("İSİM : " + isim);
		System.out.println("SOYİSİM : " + soyİsim);
		System.out.println("DENEYİM : " + deneyim);
		
	}
	public void zamYap(int zamDegeri) {
		System.out.println("maasiniza " + zamDegeri + " TL zam yapıldı");
		System.out.println("suanki guncel maasiniz : "+ (maas+zamDegeri));
	}
	
	public void formatAt(String isletiSistemi , String kim) {
		System.out.println(kim + " suanda " + isletiSistemi + " isletim sistemine format atıyor");
	}
	
	
	
}
