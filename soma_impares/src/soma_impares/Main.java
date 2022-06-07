package soma_impares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y, troca, soma = 0;
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (y < x) {
			troca = x;
			x = y;
			y = troca;
		}
		
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		sc.close();

	}

}
