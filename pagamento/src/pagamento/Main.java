package pagamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valorHora;
		int horasTrabalhadas;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		System.out.printf("O pagamento para %s deve ser de %.2f\n", nome, valorHora * horasTrabalhadas);
		
		sc.close();
	}

}
