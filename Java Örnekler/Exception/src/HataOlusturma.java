import java.util.Scanner;

public class HataOlusturma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
	/*	String a = null;
		
		a.toString();
		//şimdi baktıgımızda calıstırmadan önce java bir hata yok diyor am calıstırınca nullpointerexception hatasıını veriyor ve sadece14.satıra kadar olan kodlar calısyor
		//bizim istediğimiz bir hata varsada kodun calısmaya devam etmesini 14.satırdan sonraki kodlarında calısamsını saglamak bunun için işte exceptions kullanılır.
		
		System.out.println("kodun son bolumu......");*/
		
	
		//baska bir hata yapalım:
	/*	int [] dizi = {1,2,3,4,5,6};
		System.out.println(dizi[10]);//bu dizinin 10.indexsi olmamasına ragemn yazdırmak istiyorum ve java hata yok diyor clıstırmadan önce
		
		System.out.println("devammmiiiiii.......");*/
		
		
		// buraya kadar hataları gördük şimdi bunları nasıll engelliyecez:
		//try catch blokları:
		//hatanın olusabilecegi yerlere try catch blokları koyuyoruz.
		
		
	//	int [] dizi = {1,2,3,4,5,6}; bunu burdan alıp try blogunun içine koyduk.
	
		//hatanın olusabilecegi kod satırını try blogunun içine alıyoruz
		/*
		try {
			int [] dizi = {1,2,3,4,5,6};
			//System.out.println("dizinni 10.indeks degeri :"+dizi[10]);//şimdi burada hata olusacak.
			//eger ben buradan herhangi bir hata alırsam catch bloklarına dusecek.
			
			String a ="k";
			Integer.parseInt(a);
		} catch (ArrayIndexOutOfBoundsException e) {//catch parantezinin içinde hatanın turunu yazıyoz.
			// TODO: handle exception
			System.out.println("lutfen gecerli bir index degeri gir");
		}
		// birden fazla cactch blogu kullanabiliriz.
		catch (NullPointerException e) {
			//şimdi nullpointerexception hatası runtimeexception sınıfını miras almıs ustune gelip tıkladıgmızda packageına gittigimizde bunu gördük 
			//biz soyle birsey yapabilirz eger bir hatayı yakalamak istersek burda oldugu gibi kendi adını yazabilriz yada miras aldıgı sub classı yani burda NullPointerException
			//yerine runtimeexception da yazabiliriz sıkıntı olmaz yine aynı hatayı yakalırız.
			//biz ama söyle birsey yapamayız mesela ustte Exception var asagısna bir tane daha catch blogu acıp oraya da nulltimeexceptions yazamyız hata alırız
			//hatada şöyle dere sen zaten bir tane handle etmişşisin ikinciye gerek yok der .
			 * o yuzden biz hatalraımızı özelden genele yazmamız gerekiyor en alttakilerden baslamamız gerekiyor. subclasslardan baslayarak  asagı dogru supclassslara gşrmemiz lazım
			 * mesela soyle yapınca hata vermez ustte nullpontierexception altta exception(ikininci catch blogunda) olursa hata vermez
			
			// TODO: handle exception
			//burda nullpointexceptions hatası olursa sen yakala diyoruz
			System.out.println("nullpointerexceptions hatası olustu");
		}
		catch (NumberFormatException e) {
			// bu da bu hata olursa yakalasın NumberFormatException
			System.out.println("NumberFormatException hatası verdi program ");
		}
		finally {
			//finally blockları hata olsun olmasın her zman calısırlar
			System.out.println("fianlly blocku her zman calısır");
		}
		
		System.out.println("program kaldıgı yerden devam ediyor");
		
	}*/

	
		/*
		 eger biz yukarıda try içinde herahngi hata olacak birsey yapmasatıdık mesela dizinin2.indeksini yazdırsaydık şöyle olurdu consola 2.index yazılırdı
		 ve derleyici catch bloguna girmezdi atlar gecerdi cunku hata yoktu.
		 *
*/
		
		
		
		
		
		System.out.println("merhaba uygulama hosgelfdin");
		System.out.println("************************");
		 /*
		  * yukarıdaleri yorum satırına aldım burada bunları anlatacaz karısmasın diye:s 
		  1-throw (atmak,fırlatmak)
		  2-throws
		  3-checked ve unchecked farkı  
		  
		  biz yukarıda hata almak için kendimiz ortam olusturyorduk işte string a= null;  a.tolowercasefilan diyorduk 
		  biz istersek kendi kendimize böyle birsey yapmadanda hata olusturabiliriz.
		  iştebunu  throw ile yapıyoz yani ille hata olmasına gerek yok istersem ben yapabilirim
		  */
		
		
			/* burası unchecked kısmı checekde kısmı asagıda onu anlayabilmek için bu kısmı yorum satırına aldım.
 			  Scanner scanner  = new Scanner(System.in);
			System.out.println("lutfen bir sayi girin: ");
			int sayi = scanner.nextInt();
			try {
				kontrol(sayi);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("numberformatexception yakaladim");
			}*/
			
		
		//burası checked kısmı
		Scanner scanner  = new Scanner(System.in);
		System.out.println("lutfen bir sayi girin: ");
		int sayi = scanner.nextInt();
		try {
			kontrol(sayi);
		} catch (Exception e) {
			//burada Exception sınıfı bir checked exception oldugunudan java bildi bizi uyardı hata verdi yani burayı try catche al diye
			// TODO Auto-generated catch block
			System.out.println("excedptionsu yakaladim");
		}//şimdi asagıyı hallettik ama burada hata verdi java bunun bir checkde exceptions oldugunu anladı : ve hata verdi bunu try catch bloklarına al diyor.aldım
		
		
	
	
		System.out.println("program kaldıgı yerden devam ediyor");
		
		
		
		
		
		
	}
	
	/*  burası unchecked kısmı checekde kısmı asagıda onu anlayabilmek için bu kısmı yorum satırına aldım.
	  public static void kontrol(int sayi) {
		if(sayi>5) {
			throw new NumberFormatException();//şimdi burada olan hata türü unchecked exceptions tmmı java bunun hata cıkaracagını iblmiyor ve bizi uyarmıyor.	
			//ve bu hatayı olacagını bu yuzden kendim dusunup try catch bloklarına almalıyım.
		}*/
	
	
	
	//burası checked kısmı
	public static void kontrol(int sayi) throws Exception {//bunun  anlamı:kontrol metodu exceptions fırlatır demek istiyor burada
		if(sayi>5) {
			throw new Exception();//bu bir checked exception bunu yazdıgımda java hata verdi bunu throws ile declare et dedi bana bnde ettim ve yukarı eklendi bak throws exception diye
		}

	
		
		
		
		/*
		 * bu yukarıda hatayı main içinde yakaladım istersem böyle metot içindede yakalayabilirim(yukarıda derken burada unchchecked daki kısmı yakaladım)
		
		 
		 Scanner scanner = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		
		kontrolEt(sayi);
		
		
			public static void kontrolEt(int sayi){
		try {
			if(sayi >5) {
				throw new NumberFormatException();
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("hatayi yakaladim");
		}
	}
		 */
	}
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
