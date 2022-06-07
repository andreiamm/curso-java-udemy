package media_ponderada;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double nota1, nota2, nota3, media;
		
		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite tres numeros:");
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();
			
			media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;
			System.out.printf("MEDIA = %.1f%n", media);
		}
		
		sc.close();
	}

}
