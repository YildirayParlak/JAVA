
public class test2 {

	public static void main(String[] args) {
		
		//string tipinden integer tipine donusturme
		String a = "5";
		String c ="10";
		System.out.println(a+c);
		//bak mesela burada ikisini toplamaya calıstıgımızda 510 yazıyor cunku derleyivi iki string ifadeyi birlestiriyor integer değil ki toplasın
		int b = Integer.valueOf(a);
		//burada bir cevirme metodumuz valueof stringden inte ceviriyor burada a stringini integere ceveirdi 
		//ve bizde onu b değişkenine atadık b yi yazdırdıgımızda 5 yazmalı
		System.out.println(b);
		System.out.println(b+2);
		//bir diger stringden inte cevirme metodumuz parseInt
		int d = Integer.parseInt(c);
		System.out.println(d);
		
		//ınt tipinden string tipine cevirme
		int e = 21;
		String k = String.valueOf(e);
		System.out.println(k+5);//eger stringe cevrilmeseydi 215 yerine consolda 26 yazardı
		
		
		double f =5.50;
		//simdi doubledan inte cevirem metodu yok type casting diye birsey yapcaz bu işlem doubledaki degerin virgülden
		//sonrasını siliyıor ve int kalıyor otomatik
		int l = (int)f;
		System.out.println(l);//console da 5 yazdı yani cevirdi.
		//intden doublea cevirme
		int i =5;
		double n = (double)i;
		System.out.println(n);//consoleda 5.0 yazdı yani doublea  cevrildi
		//float tipinden long tipine degistirme
		float r =5.12f;
		long z = (long)r;
		System.out.println(z);//console da 5 yazdı yani longa cevirdi
		//long tipinden stringe donusturme
		long x =5;
		String yeni= String.valueOf(x);
		System.out.println(yeni);
		//sagalamsını bir alt satırda yaptım
		System.out.println(yeni+5);
		
		
	}

}
