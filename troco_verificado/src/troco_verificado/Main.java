package troco_verificado;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		double preco, dinheiro;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		if (dinheiro < preco * quantidade) {
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", preco * quantidade - dinheiro);
		} else {
			System.out.printf("TROCO = %.2f%n",  dinheiro - preco * quantidade);
		}
		
		sc.close();
	}

}
