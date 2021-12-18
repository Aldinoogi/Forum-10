import java.util.InputMismatchException;
import java.util.Scanner;
public class WahanaPermainanSyariah {
	public static void main (String[]args) {
		Scanner scanl = new Scanner (System.in);
		int Tinggibadan = 0;
		String gender;
		System.out.print ("Berapa Tinggi Badan Anda (Hanya Angka) :");
		try {
			Tinggibadan = scanl.nextInt ();
			if(Tinggibadan>=150) {
				Scanner scan2 = new Scanner (System.in);
				System.out.print("Apakah Anda Laki-laki atau Perempuan? Pilihan (laki-laki/perempuan) : ");
				gender = scan2.nextLine();
				if (gender.toLowerCase().equals("laki-laki")) {
					System.out.println ("Silahkan Memasuki Wahana melalui Pintu Kanan");
				}else if (gender.toLowerCase () .equals ("perempuan")) {
					System.out.println ("Silahkan Memasuki Wahana melalui Pintu Kiri");
				}else {
					System.out.println ("Input Anda Tidak Sesuai");

				}

			}else {
				System.out.println ("Tinggi tidak mencukupi, Anda Tidak Boleh Memasuki Wahana");

			}

		}catch (InputMismatchException a) {
			System.out.print("Anda tidak memasukan Angka");
		}
	}
}
