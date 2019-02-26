package aulaUdemy;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 0;
		System.out.print("Enter N: ");
		
		while (N <= 0) {
			
			N = sc.nextInt();
			
			if (N <= 0) {
				
				System.out.print("N must be a positive! Try again: ");
			}
			
		}
		
		int aux = 0;
		for (int i = 1; i <= N; i++) {
			
			System.out.printf("Value #" + i + ": ");
			int value = sc.nextInt();
			
			if (value >= aux) {
				
				aux = value;
				
			} 
			
		}
		
		System.out.println("Higher = " + aux);
		
		sc.close();

	}

}
