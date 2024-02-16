package classlar;

public class kamyon extends Arac{
	private double trafikCezaTutari;
	public kamyon() {
		// TODO Auto-generated constructor stub
	}
	
	public kamyon(Long id, String aracIsmi, String renk, double fiyat, int lastikSayisi, String model, String marka, double trafikCezaTutari) {
		setId(id);
		setAracIsmi(aracIsmi);
		setRenk(renk);
		setFiyat(fiyat);
		setLastikSayisi(lastikSayisi);
		setMarka(marka);
		setModel(model);
		this.trafikCezaTutari = trafikCezaTutari;
	}

	@Override
	public void aracBilgileriGoster() {
		super.aracBilgileriGoster();
		System.out.println("ID         : " + getId());
		System.out.println("ARAC İSMİ  : " + getAracIsmi());
		System.out.println("ARAC RENK  : " + getRenk());
		System.out.println("FİYAT       : " + getFiyat());
		System.out.println("LASTİK SAYİSİ : " + getLastikSayisi());
		System.out.println("MARKASİ     : " + getMarka());
		System.out.println("MODELİ      : " + getModel());
	}

	@Override
	public void trafikCezasiOde(double cezaTutar) {
		super.trafikCezasiOde(cezaTutar);
		System.out.println(getAracIsmi() + "tipli aracın trafik cezası tutarı : " + getTrafikCezaTutari());
		
	}

	public double getTrafikCezaTutari() {
		return trafikCezaTutari;
	}

	public void setTrafikCezaTutari(double trafikCezaTutari) {
		this.trafikCezaTutari = trafikCezaTutari;
	}
	
	
}
