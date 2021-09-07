package super_mario;

public abstract class Personagens {

	private String nome;
	protected double altura;
	private int idade;
	private int estamina;
	private int quantidadesMoedas;
	private int vidas;

	public Personagens(String nome, int idade, double altura) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		this.estamina = 100;
		this.quantidadesMoedas = 0;
		this.vidas = 1;
	}

	public void revigorar() {
		this.estamina = 100;
	}

	public void morrer() {
		this.vidas--;
		this.estamina = 0;

		if (this.vidas < 0) {
			vidas = 0;
		} else {
			revigorar();
		}
	}

	public void pegarMoedas() {
		this.quantidadesMoedas++;

		if (this.quantidadesMoedas % 10 == 0) {
			this.vidas++;
		}
	}

	public void caracteristicas() {

		System.out.println("O nome dele é " + nome);
		System.out.println("A altura é " + altura);
		System.out.println("A idade é " + idade);
		System.out.println("Estamina é " + estamina);
		System.out.println("Ele tem " + quantidadesMoedas + " Moedas!");
		System.out.println("vidas " + vidas);

	}
	
	

	public void saltar() {
		this.altura = this.altura * 0.5;
		System.out.println("O " + this.nome + " está pulando " + altura);

	}

	public void saltar(double obstaculo) {

		System.out.println("Altura do Obstaculo: " + obstaculo + " -- A altura do pulo de " + this.nome + " foi: "
				+ obstaculo * 1.5);
	}

	public void perderEstamina() {
		this.estamina = this.estamina - 10;
		if (this.estamina < 0) {
			this.estamina = 0;
		}
	}

	public void ganharEstamina() {
		this.estamina = this.estamina + 5;
		if (this.estamina > 100) {
			this.estamina = 100;
		}
	}

	public abstract void crescer();

}
