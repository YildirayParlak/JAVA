import model.A;
import model.hayvan;
import model.kedi;
import model.kopek;

public class test19 {

	public static void main(String[] args) {
		// inheritance : kalıtımın en güzel avantajı üst sınıflarda tanımlanan metot ve değişkenkeri tekrar tekrar yazmaktan kurtarmasidir.
		
	/*	hayvan hayvan1 = new hayvan();
		hayvan1.nefesVer();
		System.out.println("-----------");
		
		kopek kopek1 = new kopek();
		kopek1.nefesVer();
		*/
		
		//bir classı yüzlerce class miras alabilir ama bir class sadece bir kişiyi miras alabilir.
		//protected ersim belirleyici nedir:
		//protected private ile public arasında diyebiliriz bir kendi sınıfından erisilebilir birde miras verdiği sınıftan bir metot içerisinde erisilebilir
		
		//yapıcı methodların calısma yapısı: 
		
		A aNesnesi = new A();
		//simid normalde calıstırdıgımızda ilk önce a classındaki consctructoru calıstırmasını bekleriz ama öyle olmayacak
		//soyle olacak a b'yi miras aldıgı için b de c yi miras aldıgı için ilk c nin constructoru calısacak sonra b sonra a calısacak inheritanceden dolayı
		
			kedi kedi1 = new kedi();
			kedi1.sesVer();//simid burada calıstırdıgımızda hayvan sınıfındaki methodun içindeki çalısıyor ben onun yerine basaka birseyin calısmasını istersen 
			//iste ozaman override kullanırım
			hayvan hayvan1 = new hayvan();
			hayvan1.sesVer();
			
			kopek kopek1 = new kopek();
			kopek1.sesVer();
	}

}
