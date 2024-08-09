package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarturbo;
	private boolean ligarAr;
	
	public Ferrari() {
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super (velocidadeMaxima);
		setDelta(15);
		
		
	}
//	@Override
	public void ligarTurbo() {
		ligarturbo = true;
	}
	
     	
	@Override
	public void desligarTurbo() {
		ligarturbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarturbo && !ligarAr) {
			return 35;
		} else if (ligarturbo && ligarAr) {
			return 30;
		} else if (!ligarturbo && !ligarAr) {
			return 20;
		} else {
			return 15;
	}
		
		
//	@Override
//	public void acelerar() {
//			super.acelerar();
//	}
		
}
}
	
	
	
	
		



