
public class Account {
	
	private String hesapNo;
	private double bakiye;
	private String isim;
	
	private String telNo;
	
	
	
	public Account() {
		System.out.println();
	}
	
	public Account(String hesapNo , double bakiye , String isim , String telNo) {
		this.hesapNo=hesapNo;
		this.bakiye=bakiye;
		this.isim=isim;
		this.telNo=telNo;
	}
	
	
	public void paraYatir(double miktar) {
		bakiye+=miktar;
		System.out.println("yeni bakiye : " +bakiye);
	}
		public void paraCekme(double miktar) {
		if(miktar > 1000) {
			System.out.println("bir günde 100 tlden fazla para cekemezsiniz...");
		}
		else if(miktar > bakiye) {
			System.out.println("hesabinizda bulunan miktardan fazla cekemezsiniz" + bakiye);
		}
		else {
			bakiye -=miktar;
			System.out.println("yeni bakiyeniz : " + bakiye);
		}
		}
}
