package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// if (....) sentença; ou {}  ______ vai definir se vai excutar ou não
		// while (....) sentença; ou {} ________ se for verdadeira ele vai repetir uma única sentença ou bloco de códigos
		// for (...,...;...) sentença; ou {}________ uma única sequência ou bloco de código com 1 ou mais sequencias 
		
		// do {} while(....); pelo menos 1 vez será executada
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do { 
			System.out.println("Você precisa falar " + "as palavras mágicas...");
			System.out.print("Quersair?");
			texto = entrada.nextLine();
			
			
		} while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado!");

		entrada.close();
	

		
		
		
		
	}
}
