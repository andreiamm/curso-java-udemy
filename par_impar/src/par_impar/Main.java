package par_impar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, x;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if (x == 0) {
				System.out.println("NULO");
			} else {
				if (x % 2 == 0) {
					System.out.print("PAR ");
				} else {
					System.out.print("IMPAR ");
				}
				
				if (x < 0) {
					System.out.println("NEGATIVO");
				} else {
					System.out.println("POSITIVO");
				}
			}
		}
		
		sc.close();
	}

}
