package lanchonete;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtde;
		double pagar;
		
		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		qtde = sc.nextInt();
		
		pagar = 0;
		switch (codigo) {
		case 1:
			pagar = qtde * 5.0;
			break;
		case 2:
			pagar = qtde * 3.5;
			break;
		case 3:
			pagar = qtde * 4.8;
			break;
		case 4:
			pagar = qtde * 8.9;
			break;
		case 5:
			pagar = qtde * 7.32;
			break;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", pagar);
		
		sc.close();
	}

}
