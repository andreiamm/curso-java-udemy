package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdeMenores = 0;
		double somaAltura = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			somaAltura += alturas[i];
			if (idades[i] < 16) {
				qtdeMenores++;
			}
		}
		
		System.out.printf("Altura m�dia: %.2f%n", somaAltura / n);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (double)qtdeMenores / n * 100);
		
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}		
		
		sc.close();
	}

}
