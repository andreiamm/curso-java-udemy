package pares_consecutivos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, soma;
		
		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();
		
		while (x != 0) {
			if (x % 2 != 0) {
				x++;
			}
			
			soma = 5 * x + 20;
			System.out.println("SOMA = " + soma);
			System.out.print("Digite um numero inteiro: ");
			x = sc.nextInt();
		}
		
		sc.close();
	}

}
