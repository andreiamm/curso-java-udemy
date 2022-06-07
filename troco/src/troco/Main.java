package troco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		double preco, recebido, troco;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		recebido = sc.nextDouble();
		
		troco = recebido - quantidade * preco;
		
		System.out.printf("TROCO = %.2f%n", troco);
		
		sc.close();
	}

}
