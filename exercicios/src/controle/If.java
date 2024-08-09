package controle;

import java.util.Locale;
import java.util.Scanner;


public class If {

		public static void main(String[] args) {
		
		Locale pointLocale = new Locale("en","US");	
		Scanner entrada = new Scanner(System.in).useLocale(pointLocale);	
		        
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7.0){
			System.out.println("Aprovado!");
		    System.out.println("Parabéns!");
        }
		if(media <7 && media >=4.5) {
			System.out.println("Recuperação");
		}
		
		boolean criterioReprovacaoAtingido = media <4.5 &&media >=0;
		if(media <4.5 && media >=0) {
			System.out.println("reprovado");
		}
		
		entrada.close();
		
	}
}
