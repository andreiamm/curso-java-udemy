package medidas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaQuadrado, areaTriangulo, areaTrapezio;
		
		System.out.print("Digite a medida A: ");
		A = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		B = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		C = sc.nextDouble();
		
		areaQuadrado = Math.pow(A, 2);
		areaTriangulo = A * B / 2;
		areaTrapezio = (A + B) / 2 * C;
		
		System.out.printf("AREA DO QUADRADO = %.4f%n", areaQuadrado);
		System.out.printf("AREA DO TRIANGULO = %.4f%n", areaTriangulo);
		System.out.printf("AREA DO TRAPEZIO = %.4f%n", areaTrapezio);
		
		sc.close();
	}

}
