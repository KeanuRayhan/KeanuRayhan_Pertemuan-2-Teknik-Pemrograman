import java.math.BigInteger;
import java.util.Scanner;

public class Soal6BigNumber {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		BigInteger A = keyboard.nextBigInteger();
		BigInteger B = keyboard.nextBigInteger();
		keyboard.close();
		
		//Melakukan operasi pertambahan pada Big Integer
		BigInteger add = A.add(B);
		//Melakukan operasi perkalian pada Big Integer
		BigInteger multiply = A.multiply(B);
		
		System.out.println(add);
		System.out.println(multiply);
		
	}

}
