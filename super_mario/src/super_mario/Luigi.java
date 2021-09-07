package super_mario;

public class Luigi extends Personagens{
      
	public Luigi(String nome, int idade, double altura) {
		super(nome, idade, altura);
	}
	
	public void voar() {
		System.out.println("Luigi está voando!");
	}

	@Override
	public void crescer() {
	    this.altura = this.altura * 1.75;
		
	}

}
