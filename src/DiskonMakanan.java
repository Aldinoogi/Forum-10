
import java.util.InputMismatchException;
import java.util.Scanner;
public class DiskonMakanan {
public static void main (String[]args) {
	System.out.println ("Diskon Berlaku Untuk Usia 20 Tahun Ke Atas");
	Scanner scanl = new Scanner (System.in);
	int beratbadan = 0;
	String jomblo;
	
	System.out.print ("Berapa Berat Anda (Hanya Angka) :");
	try {
		beratbadan = scanl.nextInt ();
		if(beratbadan<=45) {
			Scanner scan2 = new Scanner (System.in);
			System.out.print("Apakah Anda Jomblo? (Ya/Tidak) : ");
			jomblo = scan2.nextLine();
			if (jomblo.toLowerCase().equals("ya")) {
				System.out.println ("Selamat Anda Mendapatkan Diskon Sebesar 15%");
			}else if (jomblo.toLowerCase () .equals ("tidak")) {
				System.out.println ("Selamat Anda Mendapatkan Diskon Sebesar 10%");
			}else {
				System.out.println ("Input Anda Tidak Sesuai");
				
			}
		
	}else {
		System.out.println ("Maaf Anda Kurang Kurus");
		
	}

}catch (InputMismatchException a) {
	System.out.print("Anda tidak memasukan Angka");
}
}
}
