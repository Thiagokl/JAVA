package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {

	
	public static void main(String[] args) {
		
			
	Locale pointLocale = new Locale("en", "US");
	Scanner entrada = new Scanner(System.in).useLocale(pointLocale);


		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe  nota ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {			
			total += nota;
			quantidadeDeNotas++;
		  } else if(nota != -1) {
			System.out.println("Nota Inválida!!!; D ");	
		}
	}
		
		// Calcular a Média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		

		entrada.close();
		
	}
}
