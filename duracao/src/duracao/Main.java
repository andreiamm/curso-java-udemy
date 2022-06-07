package duracao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int duracao, horas, minutos, segundos;
		
		System.out.print("Digite a duracao em segundos: ");
		duracao = sc.nextInt();
		
		horas = duracao / 3600;
		minutos = (duracao % 3600) / 60;
		segundos = (duracao % 3600) % 60;
		
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		
		sc.close();
	}

}
