package validacao_de_nota;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		while (nota1 < 0 || nota1 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota1 = sc.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		while (nota2 < 0 || nota2 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota2 = sc.nextDouble();
		}
		
		System.out.printf("MEDIA = %.2f%n", (nota1 + nota2) / 2.0);
		
		sc.close();
	}

}
