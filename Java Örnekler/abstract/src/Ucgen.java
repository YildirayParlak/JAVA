
public class Ucgen extends geometrikSekil{
//biz buradaki gibi bir abstract classı miras aldıgımızda o abstract classı içindeki abstract metotları override etmek zorundayız burada oldugu gibi
	
	private int taban;
	private int yukseklik;
	
	public Ucgen() {
		// TODO Auto-generated constructor stub
	}
	
	public Ucgen(int taban,int yukseklik) {
		this.taban=taban;
		this.yukseklik=yukseklik;
		isim ="ucgen";//geometrik sekilde tanımladıgım protected erisim belirleyicisine sahip olan  isim değişkenine burada degerini atadım.
	}
	
	@Override
	public void alanHesapla() {
		// TODO Auto-generated method stub
		System.out.println(isim + " nin alani : " +(getTaban()*getYukseklik())/2);
	}

	public int getTaban() {
		return taban;
	}

	public void setTaban(int taban) {
		this.taban = taban;
	}

	public int getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}
	
}
