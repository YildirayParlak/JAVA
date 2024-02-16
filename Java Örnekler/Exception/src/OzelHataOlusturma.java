import java.util.Scanner;

public class OzelHataOlusturma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Musteri [] musteriListesi = {new Musteri(1L, "naber", "nolsun"),new Musteri(2L, "iyi", "ugrasıyoz"),new Musteri(3L, "senden", "aynı")};
		try {
	
			musteriKontrolEt(musteriListesi, 12L);
		} catch (MusteriNotFoundException e) {
			
			// TODO Auto-generated catch block
		System.out.println(e);
		}
		
	}
	
	public static void musteriKontrolEt(Musteri[] dizi,Long id) throws MusteriNotFoundException {
		boolean varMi = false;
		
		
		for (Musteri musteri : dizi) {
			if(id==musteri.getId()) {
				varMi = true;
				System.out.println("aradıgınız musteri bulundu sistemde var yani");
				System.out.println(musteri);
				break;
			}
		}
		if(varMi == false) {//eger musteri yoksa kendimize ait bir hata fırlatcaz
			throw new MusteriNotFoundException("musteri bulunamadi");//burada aslında biz bir nesne olusturuyoz oyuzden bu sınıfın constructoruna gidiyor burda verdiğimizmesajı da sup classın 
			//cosntructoruna iletiyor.
		}
	}
}
