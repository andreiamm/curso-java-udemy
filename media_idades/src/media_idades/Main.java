package media_idades;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, contagem = 0;
		double soma = 0, media;
		
		System.out.println("Digite as idades:");
		idade = sc.nextInt();
		
		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			while (idade >= 0) {
				soma += idade;
				contagem++;
				idade = sc.nextInt();			
			}
			
			media = soma / contagem;
			
			System.out.printf("MEDIA = %.2f%n", media);
		}
		
		sc.close();
	}
}
