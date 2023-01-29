import java.util.Scanner;

public class Soal4GajiAgent {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int gajiPokok = 500000;
		int hargaItem = 50000;
		int penjualan = keyboard.nextInt();
		keyboard.close();
		
		//Menghitung gaji dengan bonus nya sesuai ketentuan pada soal
		if (penjualan > 80) {
			int gaji = gajiPokok + (hargaItem * penjualan * 35/100);
			System.out.println(gaji);
		} else if (penjualan >= 40) {
			int gaji = gajiPokok + (hargaItem * penjualan * 25/100);
			System.out.println(gaji);
		} else if (penjualan < 15) {
			int gaji = gajiPokok - (((15 - penjualan) * hargaItem) * 15/100);
			System.out.println(gaji);
		} else {
			int gaji = gajiPokok + (hargaItem * penjualan * 10/100);
			System.out.println(gaji);
		}
		
	}
}
