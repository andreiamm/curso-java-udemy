package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double somaElementos = 0.0, media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vet.length; i++) {
			somaElementos += vet[i];
		}
		
		media = somaElementos / vet.length;
		System.out.printf("%nMEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < media) {
				System.out.printf("%.1f%n", vet[i]);
			}
		}		
		
		sc.close();
	}

}
