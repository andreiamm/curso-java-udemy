package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdePares = 0, somaPares = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vet.length; i++)  {
			if (vet[i] % 2 == 0) {
				qtdePares++;
				somaPares += vet[i];
			}
		}
		
		if (qtdePares == 0) {
			System.out.printf("NENHUM NUMERO PAR");
		} else {
			System.out.printf("MEDIA DOS PARES = %.1f%n", (double)somaPares / qtdePares);
		}
					
		sc.close();
	}

}
