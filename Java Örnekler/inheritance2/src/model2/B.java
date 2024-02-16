package model2;

public class B extends C{
	
	public int bDegisken1;
	public int bDegisken2;
	
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("B sinifinin yapıcı methodunun içerisindeyiz");
	}
	
	
	
	public B(int bDegisken1) {
		this.bDegisken1 = bDegisken1;
	}



	public B(int bDegisken1, int bDegisken2) {
		this.bDegisken1 = bDegisken1;
		this.bDegisken2 = bDegisken2;
	}



	public void bSinifiMetodu() {
		System.out.println("b sinifinin içindeki metoddayım");
	}
	
	
}
