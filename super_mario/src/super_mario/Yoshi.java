package super_mario;

public class Yoshi extends Personagens{

	private int quantidadeFrutasComidas;
	private int velocidade;
	
	public Yoshi(String nome, int idade, double altura) {
		super(nome, idade, altura);
		this.quantidadeFrutasComidas = 0;
		this.velocidade = 10;
	}
	
	public void comerFruta() {
		quantidadeFrutasComidas++;
		if (this.quantidadeFrutasComidas % 2 == 0) {
			this.velocidade *= 2;
		}
	}
	
	public int getVelocidade() {
		return velocidade;
	}

	@Override
	public void crescer() {
		this.altura = this.altura * 1.10;
		
	}
		
}
