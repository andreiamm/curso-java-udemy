package terreno;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 double largura, comprimento, valorM2, area, preco;
		 
		 System.out.print("Digite a largura do terreno: ");
		 largura = sc.nextDouble();
		 System.out.print("Digite o comprimento do terreno: ");
		 comprimento = sc.nextDouble();
		 System.out.print("Digite o valor do metro quadrado: ");
		 valorM2 = sc.nextDouble();
		 
		 area = largura * comprimento;
		 preco = area * valorM2;
		 
		 System.out.println("Area do terreno = " +  String.format("%.2f", area));
		 System.out.println("Preco do terreno = " + String.format("%.2f", preco));		 
		 
		 sc.close();
	}

}
