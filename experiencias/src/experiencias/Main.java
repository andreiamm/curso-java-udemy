package experiencias;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdeCobaias, coelhos = 0, ratos = 0, sapos = 0, total;
		char tipoCobaia;
		double coelhosPercentual, ratosPercentual, saposPercentual;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			qtdeCobaias = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipoCobaia = sc.next().charAt(0);
			
			if (tipoCobaia == 'C') {
				coelhos += qtdeCobaias;
			} else if (tipoCobaia == 'R') {
				ratos += qtdeCobaias;
			} else {
				sapos += qtdeCobaias;
			}
		}
		
		total = coelhos + ratos + sapos;
		coelhosPercentual = (double)coelhos / total * 100.0;
		ratosPercentual = (double)ratos / total * 100.0;
		saposPercentual = (double)sapos / total * 100.0;
		
		System.out.println();
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f%n", coelhosPercentual);
		System.out.printf("Percentual de ratos: %.2f%n", ratosPercentual);
		System.out.printf("Percentual de sapos: %.2f%n", saposPercentual);
		
		sc.close();
	}

}
