package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) throws StringVaziaException, NumeroForaIntervaloException {
		
		try {
			Aluno aluno = new Aluno("", -7);
			Validar.aluno(aluno);
			
			
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}
		
		Validar.aluno(null);
		System.out.println("Fim :)");
	}

}
