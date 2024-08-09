package observer;

public class Namorada implements ChegadaAniversarianteObserver {
	
		@Override
		public void chegou(ChegadaAniversarianteEvent event) {
		     System.out.println("Apagar as Luzes...");	
		     System.out.println("Fazer silêncio...");	
		     System.out.println("Surpresa!!!");	
	}

}
