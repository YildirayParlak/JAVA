
public class test {

	public static void main(String[] args) {
		/*
		 * Bir kuruyemi�ci toptanc�dan; 12 kilo leblebiyi kilosunu 3.5 TL 25 kilo f�nd�k
		 * , kilosunu 15.7 TL 40 kilo badem , kilosunu 22 TL den alm��t�r.
		 * 
		 * bu �r�nleri satarken , --> leblebinin kilosunu %50 fazlas� satm�� --> f�nd�k
		 * ise , %40 fazlas�na --> badem ise , %60 fazlas�na satm��t�r.
		 * 
		 * kuruyemisci o g�nk� kazand��� para ile d�kkan�n�n kiras�n� �demek
		 * istemektedir.
		 * 
		 * kira tutar� : 500 TL kazand��� para 500 TL den y�ksek ise kiray� �deyebilsin
		 * de�ilse �deyemesin...
		 * 
		 */
		//fiyatlar
		double leblebi =3.5;
		double findik =15.7;
		double badem =22;
		double maliyetTutar =(leblebi*12) + (findik*25) + (badem*40);
		double satisTutar = ((leblebi*1.5)*12) + ((findik*1.4)*25) + ((badem*1.6)*40);
		double kar = satisTutar - maliyetTutar;
		if(kar> 500) {
			System.out.println("kirayı ödeyebilir");
			
		}
		else {
			System.out.println("kirayı ödemek için yeterli para yok");
		}
		System.out.println("maliyet tutar :" +maliyetTutar);
		System.out.println("satıs tutar : " +satisTutar);
		System.out.println("adamın karı :" +kar);
		
	}

}
