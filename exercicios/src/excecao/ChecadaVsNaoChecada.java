package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
	try {	
		geraErro1();
	} catch (RuntimeException e) {
		System.out.println(e.getMessage());
		
	}
		
		
		geraErro2();
		
		System.out.println("Fim :)");
	}
	// Exceção Não checada ou NÃO verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	// Exceção checada ou verificada
	static void geraErro2() {
	try {
		throw new RuntimeException("Ocorreu um erro bem legal #02!");
	} catch (Exception e) {
		System.out.println("que legal!");
	   }
	}
		
}
	

