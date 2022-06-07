package dentro_fora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n, x, dentro = 0, fora = 0;
	
	System.out.print("Quantos numeros voce vai digitar? ");
	n = sc.nextInt();
	
	for (int i = 0; i < n; i++) {
		System.out.print("Digite um numero: ");
		x = sc.nextInt();
		
		if (x < 10 || x > 20) {
			fora++;
		} else {
			dentro++;
		}
	}
	
	System.out.println(dentro + " DENTRO");
	System.out.println(fora + " FORA");
	
	sc.close();
	}

}
