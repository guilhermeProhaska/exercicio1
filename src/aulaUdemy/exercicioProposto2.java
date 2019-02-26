package aulaUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exercicioProposto2 {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert the value for radius:");
		double raio = sc.nextDouble();
		
		double pi = 3.14159;
		double A = pi * raio * raio;
		
		System.out.printf("Calculate the area%nA = %.4f", A);
		
		sc.close();
		
	}

}
