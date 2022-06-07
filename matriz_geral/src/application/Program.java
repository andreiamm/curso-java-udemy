package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double somaPositivos = 0.0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > 0) {
					somaPositivos += mat[i][j];
				}
			}
		}
		
		System.out.printf("%nSOMA DOS POSITIVOS: %.1f%n%n", somaPositivos);
		System.out.print("Escolha uma linha: ");
		int linha = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA:");
		for (int j = 0; j < mat[linha].length; j++) {
			System.out.printf(" %.1f", mat[linha][j]);
		}	
		
		System.out.print("\n\nEscolha uma coluna: ");
		int coluna = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA:");
		for (int i = 0; i < mat.length; i++) {
			System.out.printf(" %.1f", mat[i][coluna]);
		}		
		
		System.out.print("\n\nDIAGONAL PRINCIPAL:");
		for (int i = 0; i < mat.length; i++) {
			System.out.printf(" %.1f", mat[i][i]);
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}
		
		System.out.print("\n\nMATRIZ ALTERADA:\n");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
