package aulaUdemy;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira 3 números separados em espaços:");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x >= y) {
			if (x >= z) {
				System.out.printf("Higher = %d",x);
			} else {
				System.out.printf("Higher = %d", z);
			}
			
		} else if (y >= z) {
			System.out.printf("Higher = %d", y);
		} else {
			System.out.printf("Higher = %d", z);
		}
		
		
		sc.close();
		
	}
}
