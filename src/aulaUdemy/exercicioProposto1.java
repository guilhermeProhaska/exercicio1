package aulaUdemy;

import java.util.Scanner;

public class exercicioProposto1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insert two integers numbers:%nFirst number: ");
		int n1 = sc.nextInt();
		System.out.printf("%nSecond number: ");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.printf("%nSOMA = %d%n", soma);		
		
		sc.close();
		
	}

}
