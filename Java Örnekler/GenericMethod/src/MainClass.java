
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//şimdi biz istersek genreic methodda tanımlayabiliriz ki baya iyi birsey:
		
		//yine bir örnek üzerinden gidelim:
		//şimdi bizim Integer,String ve Double tiipnde 3 tane dizim olsun bunları yazdırmak istiyom önce yine genericsiz hali:
		
		Integer[] intDizi  = {1,2,3,4,5,2,27};
		String[] stringDizi = {"acı","mamet","evde","kal","orantanı","sevde kal"};
		Double[] doubleDizi = {12.3,56.8,59.9};
		
		System.out.println("int dizi: ");
		System.out.println("---------------------------");
		yazdir(intDizi);
		System.out.println("string dizi: ");
		System.out.println("---------------------------");
		yazdir(stringDizi);
		System.out.println("double dizi: ");
		System.out.println("---------------------------");
		yazdir(doubleDizi);
		
		
	}
	//genericli hali:
	public static <T> void yazdir(T[] dizi) {//tek bir metot yazarak 3 farklı tipi yazdırıdık
		for (T deger : dizi) {
			System.out.println(deger);
		}
	}
	
	
	
	
	
	
	
	//geenricsiz hali : şimid biz bu üç diziyi yazdırmak için mecbur 3 tane metot yazmalıyız:
	//bu kod günü kurtarır
	/*public static void yazdir(Integer[] dizi) {
		for(Integer deger : dizi) {
			System.out.println(deger);
		}
	}
	
	
	public static void yazdir(String[] dizi) {
		for(String deger : dizi) {
			System.out.println(deger);
		}
	}
	
	public static void yazdir(Double[] dizi) {
		for(Double deger : dizi) {
			System.out.println(deger);
		}
	}*/
	
	
	
	
	
}
