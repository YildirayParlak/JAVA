package com.alisparlak.model;

public class calisan {
	private Long id;
	
	private String isim;
	
	private String soyİsim;
	
	private int maas;
	//simdi bunlar private oldukları için erisemiyoruz bunlara erisip deger atamanın iki yolu var 
	//1- constructor yoluyla
	//2-kapsülleme yani getter setter ile
		public calisan() {
		
		}
	public calisan(Long id, String isim, String soyİsim, int maas) {
		super();
		this.id = id;
		this.isim = isim;
		this.soyİsim = soyİsim;
		this.maas = maas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyİsim() {
		return soyİsim;
	}
	public void setSoyİsim(String soyİsim) {
		this.soyİsim = soyİsim;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		if(maas>=1000 && maas<=5000) {
			this.maas = maas;
		}
		
	}
		
		
		
}
