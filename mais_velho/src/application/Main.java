package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, maiorIdade;
		String maisVelho;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		maiorIdade = idades[0];
		maisVelho = "";
		for (int i = 1; i < n; i++) {
			if (maiorIdade < idades[i]) {
				maiorIdade = idades[i];
				maisVelho = nomes[i];
			}
		}	
		
		System.out.println("PESSOA MAIS VELHA: " + maisVelho);
		
		sc.close();
	}

}
