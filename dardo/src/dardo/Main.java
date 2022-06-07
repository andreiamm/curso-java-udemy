package dardo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double arremesso1, arremesso2, arremesso3, maiorDistancia;
		
		System.out.println("Digite as tres distancias:");
		arremesso1 = sc.nextDouble();
		arremesso2 = sc.nextDouble();
		arremesso3 = sc.nextDouble();
		
		if (arremesso1 > arremesso2 && arremesso1 > arremesso3) {
			maiorDistancia = arremesso1;
		} else if (arremesso2 > arremesso3) {
			maiorDistancia = arremesso2;
		} else {
			maiorDistancia = arremesso3;
		}
		
		System.out.printf("MAIOR DISTANCIA = %.2f%n", maiorDistancia);
		
		sc.close();
	}

}
