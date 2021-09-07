package super_mario;


public class Mario extends Personagens {
	
	private Yoshi yoshi;

	public Mario(String nome, int idade, double altura) {
		super(nome, idade, altura);
	}
	
	public void montarNoYoshi(Yoshi yoshi) {
		this.yoshi = yoshi;
	}
	
	public void imprimeMontadoYoshi() {
		if (this.yoshi != null) {
			System.out.println("Mario est� montado no Yoshi!");
		}
		else {
			System.out.println("Mario n�o est� montado no Yoshi!");
		}
		
	}
		
	@Override
	public void crescer() {
		this.altura = this.altura * 1.50;
		
	}

	
}
