import com.alisparlak.model.calisan;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calisan calisan1 = new calisan();
		
		calisan1.setId(27L);
		calisan1.setMaas(7500);
		
		System.out.println("calisanin İD 'si : " + calisan1.getId());
		System.out.println("calisanin maasi : " + calisan1.getMaas());
		//degiskeni private olarak sakladım 
		//set metodu ile erisip deger atadım
		//get metodunu kullanarak degerine eristim
	}

}
