package classlar;

public class Arac {
	private Long id;
	private String aracIsmi;
	private String renk;
	private double fiyat;
	private int lastikSayisi;
	private String model;
	private String marka;
	
	public Arac() {
		// TODO Auto-generated constructor stub
	}

	public Arac(Long id, String aracIsmi, String renk, double fiyat, int lastikSayisi, String model, String marka) {
		this.id = id;
		this.aracIsmi = aracIsmi;
		this.renk = renk;
		this.fiyat = fiyat;
		this.lastikSayisi = lastikSayisi;
		this.model = model;
		this.marka = marka;
	}
	
	public void aracBilgileriGoster() {
		System.out.println("ARAC BİLGİLERİ ");
		System.out.println("-----------------------");
	}
	
	public void trafikCezasiOde(double cezaTutar) {
		System.out.println("trafik cezası:");
		System.out.println("-----------------------");
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAracIsmi() {
		return aracIsmi;
	}

	public void setAracIsmi(String aracIsmi) {
		this.aracIsmi = aracIsmi;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public int getLastikSayisi() {
		return lastikSayisi;
	}

	public void setLastikSayisi(int lastikSayisi) {
		this.lastikSayisi = lastikSayisi;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	
	
}
