import java.util.Scanner;

public class kodlmaVaktıIsPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sayi;
		
		System.out.println("lutfen sayi giriniz: ");
		sayi = scanner.nextInt();
		System.out.println(isPalindrom(sayi));
	}

	 static boolean isPalindrom(int input) {
			int temp,ters=0,kalan;
			temp = input;
			
			while(temp!=0) {
				kalan = temp % 10;
				ters = ters*10+kalan;
				temp /=10;
				
			}
			if(input == ters) {
				return true;
			}
			else {
				return false;
			}
	}
	
	
	
	
}
