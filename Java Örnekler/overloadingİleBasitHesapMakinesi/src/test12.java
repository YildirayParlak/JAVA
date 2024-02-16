import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// method overloading kullanrak basit hesap makinesi
		//toplama ve carpma metotlarını 2 veya 3 parametre alacak sekilde tasarlayın
		Scanner scanner = new Scanner(System.in);
		String islemler= "1.toplama islemi\n"
						+ "2.cikarma islemi\n"
						+ "3.carpma islemi\n"
						+ "4.bolme islemi\n"
						+ "5.cıkmak icin q ya basın";
		System.out.println("***********************");
		System.out.println(islemler);
		System.out.println("***********************");
		
		while(true) {
			System.out.println("islemi seciniz : ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("programdan cikiliyor");
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("kac deger toplayacaksiniz : (2 veya 3)");
				int kacSayi = scanner.nextInt();
				
				if(kacSayi == 2) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("girilen sayilarin toplami : " + (toplama(a, b)));
					
				}
				else if(kacSayi == 3) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					int c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("girilen sayilarin toplami : " + (toplama(a, b, c)));
				}
				else {
					System.out.println("yanlis tuslama yaptiniz bunun icin uygun metot henüz bulunmuyor... ");
					break;
				}
			}
			else if(islem.equals("2")) {
				System.out.print("a : ");
				int a = scanner.nextInt();
				System.out.print("b : ");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("girilen sayilarin farki : " + (cikarma(a, b)));
			}
			else if(islem.equals("3")) {
				System.out.println("kac deger carpacaksiniz : (2 veya 3)");
				int kacSayi = scanner.nextInt();
				
				if(kacSayi == 2) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("girilen sayilarin carpimi : " + (carpma(a, b)));
					
				}
				else if(kacSayi == 3) {
					System.out.print("a : ");
					int a = scanner.nextInt();
					System.out.print("b : ");
					int b = scanner.nextInt();
					int c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("girilen sayilarin toplami : " + (carpma(a, b, c)));
				}
				else {
					System.out.println("yanlis tuslama yaptiniz bunun icin uygun metot henüz bulunmuyor... ");
					break;
				}
				
			}
			else if(islem.equals("4")) {
				System.out.print("a : ");
				int a = scanner.nextInt();
				System.out.print("b : ");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("girilen sayilarin bolumu : " + (bolme(a, b)));
			}
		}
		
		
	}
	public static int cikarma(int a ,int b) {
		return (a-b);
	}
	public static double bolme(int a ,int b) {
		return ((double) a / b);
	}
	public static int carpma(int a ,int b) {
		return a*b;
	}
	public static int carpma(int a, int  b, int c) {
		return a*b*c;
	}
	public static int toplama(int a , int b , int c) {
		return a+b+c;
	}
	public static int toplama(int a , int b) {
		return a+b;
	}
}
