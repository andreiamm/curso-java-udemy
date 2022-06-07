package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			int n, qtdeNegativos = 0;
			
			System.out.print("Qual a ordem da matriz? ");
			n = sc.nextInt();
			
			int[][] mat = new int[n][n];
			
			for (int i = 0; i < mat.length; i++) {
				for(int j = 0; j < mat[i].length; j++) {
					System.out.printf("Elemento [%d,%d]: ", i, j);
					mat[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("DIAGONAL PRINCIPAL:");
			for (int i = 0; i < mat.length; i++) {
				System.out.print(mat[i][i] + " ");
			}
			
			for (int i = 0; i < mat.length; i++) {
				for(int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] < 0) {
						qtdeNegativos++;
					}
				}
			}			
			
			System.out.println();
			System.out.println("QUANTIDADE DE NEGATIVOS = " + qtdeNegativos);
		
		sc.close();
	}
}
