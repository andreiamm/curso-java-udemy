package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] vetA = new int[n];
		int[] vetB = new int[n];
		int[] vetC = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vetB.length; i++) {
			vetB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetC.length; i++) {
			vetC[i] = vetA[i] + vetB[i];
		}	
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < vetC.length; i++) {
			System.out.println(vetC[i]);
		}	
		
		sc.close();
	}

}
