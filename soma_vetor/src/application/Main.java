package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES =");
		for (int i = 0; i < vet.length; i++) {
			System.out.printf(" %.1f", vet[i]);
			soma += vet[i];
		}
		
		System.out.printf("%nSOMA = %.2f", soma);
		System.out.printf("%nMEDIA = %.2f", soma / vet.length);
		
		sc.close();
	}

}
