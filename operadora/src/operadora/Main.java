package operadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valor;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		valor = 50.00;
		if (minutos > 100) {
			valor += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		
		sc.close();
	}

}
