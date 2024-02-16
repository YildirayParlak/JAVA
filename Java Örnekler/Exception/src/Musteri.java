
public class Musteri {
	private Long id;
	 
	private String ad;
	
	private String soyAd;
	
	
	
	public Musteri() {
		// TODO Auto-generated constructor stub
	}



	public Musteri(Long id, String ad, String soyAd) {
		this.id = id;
		this.ad = ad;
		this.soyAd = soyAd;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public String getSoyAd() {
		return soyAd;
	}



	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}


	
}	
