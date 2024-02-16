import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		try (// basit atm örnegi while kullanarak yapcaz 
				//islemler para cekme para yatırma bakiye ogrenme ve cıkıs
				//kullanıncı cıkıs için q harfine basacak
		Scanner scanner = new Scanner(System.in)) {
			int bakiye = 1000;
			String islemler = "1.islem : BAKİYE OGRENME \n"
							+ "2. islem : PARA CEKME \n"
							+ "3.islem : Para yatirma \n"
							+ "4.islem : Cikis icin q' a basiniz ";
							
					System.out.println("**********");
					System.out.println(islemler);
					System.out.println("*************");
					
					while(true) {
						System.out.print("islemi seciniz : ");
						String islem = scanner.nextLine();
						if(islem.equals("q")) {
							System.out.println("programdan ckiliyor");
							break;
						}
						else if(islem.equals("1")) {
							System.out.println("BAKİYENİZ : " +bakiye);
							break;
						}
						else if(islem.equals("2")) {
							
							System.out.print("lutfen ne kadar para cekmek istediginizi giriniz : ");
							int cekilenTutar = scanner.nextInt();
							if(cekilenTutar>bakiye) {
								System.out.println("hesabinizda bulunan miktardan fazla para cekmek istediniz islem gerceklesmedi");
								break;
							}
							else {
								System.out.println("isleminiz basari ile gerceklesti lutfen paranizi alin ");
								bakiye-=cekilenTutar;
								System.out.println("iste kalan bakiyeniz : " + bakiye);
							}
							break;
						}
						else if(islem.equals("3")) {
							System.out.print("lutfen yatirmak istediginiz tutari giriniz : ");
							int yatanTutar = scanner.nextInt();
							System.out.println("isleminiz basarı ile gerceklesti ");
							bakiye+= yatanTutar;
							System.out.println("iste hesabinizin yeni bakiyesi : " + bakiye);
							break;
						}
					}
		}

	}

}
