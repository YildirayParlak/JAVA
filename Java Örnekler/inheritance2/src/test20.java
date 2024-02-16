import model2.A;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//this, super, super() kavaramları ve kullanılması
		//super() kavramı ise miras aldıgın classın yapıcı methodu demektir.miras aldıgın constructor ına gitmek için kullanılır.
		
		A aNesnesi = new A(5,8);
	// burda super kavramı kullandım	aNesnesi.aSinifiMetodu();
		System.out.println("b degiskeni1: " +aNesnesi.bDegisken1);
		System.out.println("b degiskeni2: " +aNesnesi.bDegisken2);
	}

}
