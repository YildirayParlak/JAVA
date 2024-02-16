package model;

public class hayvan {//miras alınan yani miras veren sınıfa üst class yani super class denir
	
	public 	Long id;
	public String hayvanİsmi;
	public int yas;
	public String renk;
	protected int ayakSayisi;
	
	public void sesVer() {
		System.out.println("hayvan ses verdi ...");
	}
	
}
