
public class Dikdortgen extends geometrikSekil{
	private int kisaKenar;
	private int uzunKenar;
	
	public Dikdortgen() {
		// TODO Auto-generated constructor stub
	}
	
	public Dikdortgen(int kisaKenar, int uzunKenar,String isim) {
		this.kisaKenar=kisaKenar;
		this.uzunKenar=uzunKenar;
		super.isim = isim;
		
	}
	
	@Override
	public void alanHesapla() {
		// TODO Auto-generated method stub
		System.out.println(super.isim + " nin alani : " + (getKisaKenar()*getUzunKenar()));
	}

	public int getKisaKenar() {
		return kisaKenar;
	}

	public void setKisaKenar(int kisaKenar) {
		this.kisaKenar = kisaKenar;
	}

	public int getUzunKenar() {
		return uzunKenar;
	}

	public void setUzunKenar(int uzunKenar) {
		this.uzunKenar = uzunKenar;
	}
	
}
