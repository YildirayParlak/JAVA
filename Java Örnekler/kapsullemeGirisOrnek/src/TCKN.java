import java.util.Random;

public class TCKN {
	private Long id;
	
	private String tckn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTckn() {
		return tckn;
	}
	boolean kontrol = true;
	
	public void setTckn(String tckn) {
		if(tckn.length()==11) {//burada girilen tcknonun 11 karakter olup olamdıgını sorguladım
			for(int i =0 ; i<tckn.length() ; i++) {//egere oyleyse donguye giriyor ve dongude girilen butun karrakterlerin rakam olup olamdıgını kontrol ediyoz
				char karakter = tckn.charAt(i);
				if(Character.isDigit(karakter)) {
					kontrol = true;
				}
				else {
					kontrol = false;
					break;
				}
			}
			if(kontrol) {
				//random rastgele deger üretmek için kullanılan sınıftır bunu burada gise no için kullandık
				this.tckn = tckn;
				Random random = new Random();
				int giseNo = random.nextInt(100);
				sonucYazdir("gise no : " +giseNo);
			}
			else {
				sonucYazdir("luıtfen butun karakterleri rakam olacak sekilde girin");
			}
		}
		else {
			sonucYazdir("tc 11 karakter olmak zorundadir..");
		}
		
		
	}
	
	public void sonucYazdir(String sonuc) {
		System.out.println(sonuc);
	}
}
