package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {

	private double valorbolsa;

	public AlunoBolsista() {

	}

	public AlunoBolsista(Long matricula, String nome, double valorbolsa) {
		super(matricula, nome);
		this.valorbolsa = valorbolsa;
	}

	public double getValorbolsa() {
		return valorbolsa;
	}

	public void setValorbolsa(double valorbolsa) {
		this.valorbolsa = valorbolsa;
	}

}
