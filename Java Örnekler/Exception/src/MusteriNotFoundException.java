
public class MusteriNotFoundException extends Exception{
//şimdi burda hatayı fırlatmamız için bir sınıf olusturmalıyız olusturduk ama bu sınıf eger biz bir checked exceptions olmasını istiyorsak Exceptionu miras alırız,
	//yok eger unchecekd exception olmasını istiyorsak RuntimeException ı miras almalıyız burda  biz checekded yaptık o yuzden exceptionu miras aldık
	
	public MusteriNotFoundException(String mesaj) {
		// TODO Auto-generated constructor stub
		super(mesaj);
	}
	
}
