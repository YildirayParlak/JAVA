
public class Kullanici {
	
	private String kullaniciAdi ="mehmet";
	private String sifre ="1325";
	
	//bu enum kullanmdan böyle yaparız
	//public int kontrolEt(String kullaniciAdi , String sifre){
		//if(kullaniciAdi.equals(this.kullaniciAdi) && sifre.equals(this.sifre)) {
			//return 1; //simdi burada ki sıkıntı şöyle burda basarılı ise 1 dödür basarısızsa 0 dödür tmmda bua kısa bir kod için analsılan birsey ama 
			//cok uzun bir kod oldugunda bunu kim akılda tutacak işte bu ve benzeri anlamsızları gidermek için enum kullanırız
			//enum kodun okunabiliriliğini artırıyor bu sayede
	//	}
		//else {
		//	return 0;
		//}
	//}
	
	
	
	//ENUM KULLANARAK YAPILMIS HALİ
	
	public GirisSonuc kontrolEt(String kullaniciAdi , String sifre){
		
		if(kullaniciAdi.equals(this.kullaniciAdi) && sifre.equals(this.sifre)) {
			return GirisSonuc.BASARILI; 
		}
		else {
			return GirisSonuc.BASARISIZ;
		}
	}
	
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	
	
}
