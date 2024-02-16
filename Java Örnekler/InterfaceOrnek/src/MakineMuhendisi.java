
public class MakineMuhendisi extends Muhendis implements Imuhendis{

	public MakineMuhendisi() {
		// TODO Auto-generated constructor stub
	}
	
	public MakineMuhendisi(String isim ,String soyİsim, int tecrübe, int maas, String[] diller) {
		setIsim(isim);
		setSoyİisim(soyİsim);
		setTecrube(tecrübe);
		setMaas(maas);
		setDiller(diller);
	}
	
	@Override
	public void bilgileriYazdir() {
		// TODO Auto-generated method stub
		System.out.println("isim : " +	getIsim());
		System.out.println("soyisim : " + getSoyİisim());
		System.out.println("tecrube : " + getTecrube());
		System.out.println("maas : " + getMaas());
		System.out.println("askerlik durum : " + getAskerlikDurum());
		System.out.println("diller : ");
		for(String dil : getDiller()) {
			System.out.println(dil+ " , ");
		}
		
	}

	@Override
	public void askerlikYapildiMi(boolean deger) {
		// TODO Auto-generated method stub
		if(deger) {
			setAskerlikDurum("askerlik yapildi");
		}
		else {
			setAskerlikDurum("askerlik yapilmadi");
		}
	}

}
