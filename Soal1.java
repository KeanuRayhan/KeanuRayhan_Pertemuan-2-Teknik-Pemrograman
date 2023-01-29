import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		//Membuat scanner baru
		Scanner keyboard = new Scanner(System.in);
		
		String text = keyboard.nextLine();
		keyboard.close();
		
		//Memisahkan string dari karakter, yang nantinya string akan ditampung ke dalam variabel array
		String[] pisah = text.split("[ , ', !, ?, ., _, @]");
		
		//Menampilkan jumlah panjang index pada variabel pisah bertype array
		System.out.println(pisah.length);
		//Menampilkan string sesuai index array
		for(String hasil : pisah) {
			System.out.println(hasil);
		}
	}

}
