import java.util.Scanner;

public class Soal5BukaTutupJalan {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Menginput 4 plat nomor mobil
		String mobil = keyboard.nextLine();
		
		keyboard.close();
		
		//Mengganti spasi yang ada di input, menjadi tidak ada spasi
		String gabung = mobil.replaceAll(" ",""); 
		
		//Mengubah String variabel gabung, menjadi Long di variabel gabungLong 
		Long gabungLong = Long.parseLong(gabung);
		
		//Mentnukan apakah mobil tersebut harus berhenti atau jalan
		if((gabungLong - 999999) % 5 == 0) {
			System.out.println("jalan");
		} else {
			System.out.println("berhenti");
		}

	}

}
