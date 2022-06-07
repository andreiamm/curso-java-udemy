package combustivel;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, alcool = 0, gasolina = 0, diesel = 0;
		
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		codigo = sc.nextInt();
		
		while (codigo != 4) {
			switch (codigo) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}
			
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
