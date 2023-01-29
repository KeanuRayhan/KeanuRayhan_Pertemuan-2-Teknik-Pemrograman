import java.util.Scanner;

public class Soal2InputandOutput {
	
	public static void main(String[] args) {
		//Membuat scanner baru
		Scanner keyboard = new Scanner(System.in);
		
		//Menggunakan scanner dan menyimpannya di variabel
		String bahasa = keyboard.next();
		int value = keyboard.nextInt();
		
		String bahasa2 = keyboard.next();
		int value2 = keyboard.nextInt();
		
		String bahasa3 = keyboard.next();
		int value3 = keyboard.nextInt();
		keyboard.close();
		
		//Mengubah format variabel integer menjadi format angka 3 digit
		String value3digit = String.format("%03d", value);
		String value3digit2 = String.format("%03d", value2);
		String value3digit3 = String.format("%03d", value3);
		
		for(int i = 0; i <= 32; i++)
			System.out.print("=");
		System.out.println();
		
		//Menampilkan output sesuai yang sudah dimasukkan ke dalam variabel dan angka nya yang telah disesuaikan
		System.out.println(bahasa + "		" + value3digit);
		System.out.println(bahasa2 + "		" + value3digit2);
		System.out.println(bahasa3 + "		" + value3digit3);
		
		for(int i = 0; i <= 32; i++)
			System.out.print("=");
		
	}
}
