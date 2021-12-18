import java.util.InputMismatchException;
import java.util.Scanner;
public class NilaiSkorIQ {
	public static void main (String[]args) {
		Scanner scanl = new Scanner (System.in);
		int skoriq = 0;
		System.out.print ("Berapa Skor Anda (Hanya Angka) :");
		try {
			skoriq = scanl.nextInt ();
			if(skoriq>=111) {
				System.out.println("IQ Anda Tinggi");
				if (skoriq>=130) {
					System.out.println ("Anda adalah Orang yang Sangat Cerdas");
				}else if (skoriq<=130) {
					System.out.println ("Anda adalah Orang yang Cerdas");

				}else {
					System.out.println ("Input Anda Tidak Sesuai");

				}
			}else if (skoriq>= 90) {
				System.out.println ("IQ Anda Rata-rata");



			}else {
				System.out.println ("Tingkatkan Kembali");

			}

		}catch (InputMismatchException a) {
			System.out.print("Anda tidak memasukan Angka");
		}
	}
}
