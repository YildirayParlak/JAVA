
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kullanici kullanici = new Kullanici();
		//bu enum kullanmadan böyle yaparız
		//int sonuc = kullanici.kontrolEt("mehmet", "1325");
		//if(sonuc == 1) {
		//	System.out.println("giris basarili");
	//	}
		//else {
			//System.out.println("giris basarisiz");
		//}
		
		
		
		//ENUM KULLANARAK YAPILMIS HALİ
		GirisSonuc sonuc = kullanici.kontrolEt("mehmet", "1325");
		if(sonuc == GirisSonuc.BASARILI) {
			System.out.println("giris basarili");
		}
		else {
			System.out.println("giris basarisiz");
		}
		
	}

}
