package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, qtdePares = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				qtdePares++;
				System.out.print(vet[i] + " ");
			}
		}		
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + qtdePares);
		
		sc.close();
	}

}
