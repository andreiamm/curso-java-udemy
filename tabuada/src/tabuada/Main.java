package tabuada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d%n", n, i, n * i);
		}
		
		sc.close();
	}

}
