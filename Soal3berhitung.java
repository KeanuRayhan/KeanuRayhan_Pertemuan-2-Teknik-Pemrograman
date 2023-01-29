import java.util.Scanner;

public class soal3berhitung {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		long a = keyboard.nextLong();
		char operator = keyboard.next().charAt(0);
		long b = keyboard.nextLong();
		keyboard.close();
		
		//Menentukan operator perhitungan sesuai input
		if(operator == '+') {
			long hasil = (long) a + b;
			System.out.println(hasil);
		} else if(operator == '-') {
			long hasil = (long) a - b;
			System.out.println(hasil);
		} else if(operator == '*') {
			long hasil = (long) a * b;
			System.out.println(hasil);
		} else if(operator == '/') {
			long hasil = (long) a / b;
			if(a % b == 0) {
				System.out.println(hasil);
			} else {
				System.out.println("a tidak habis dibagi b");
			}
		} else if(operator == '%') {
			long hasil = (long) a % b;
			System.out.println(hasil);
		}

	}
}
