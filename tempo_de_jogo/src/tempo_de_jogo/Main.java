package tempo_de_jogo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, duracao;
		
		System.out.print("Hora inicial: ");
		inicio = sc.nextInt();
		System.out.print("Hora final: ");
		fim = sc.nextInt();
		
		if (inicio < fim) {
			duracao = fim - inicio;
		} else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
