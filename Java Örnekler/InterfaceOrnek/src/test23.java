
public class test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		YazilimMuhendisi yazilimMühendisi = 
				new YazilimMuhendisi("mehmet", "parlak", 2, 15000, new String[] {"c","java","html","css"});
		
		MakineMuhendisi makineMuhendisi = new MakineMuhendisi("hamza", "parlak", 3, 12000,new String[] {"c#","java","html","javascript"});
		
		
		System.out.println("YAZİLİM MÜHENDİSİ");
		muhendisBilgileriYazdir(yazilimMühendisi);
		System.out.println("***********************");
		System.out.println("MAKİNE MÜHENDİSİ");
		muhendisBilgileriYazdir(makineMuhendisi);
		
	}
	public static void muhendisBilgileriYazdir(Imuhendis muhendis) {
		muhendis.bilgileriYazdir();
		muhendis.askerlikYapildiMi(false);
	}
}
