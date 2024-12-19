package comercio.model;

public abstract class Produto {

	private String nome;
	private String cor;
	private int numeracao;
	private int identificacao;
	private float valor;

	public Produto(String nome, String cor, int numeracao, int identificacao, float valor) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.numeracao = numeracao;
		this.identificacao = identificacao;
		this.valor = valor;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		
		System.out.println("\n\n");
		System.out.println("Dados do Produto:");
		System.out.println("\nNome: " + this.nome);
		System.out.println("Cor: " + this.cor);
		System.out.println("Numeração: " + this.numeracao);
		System.out.println("ID: " + identificacao);
		System.out.println("Valor : R$" + this.valor);
	}

}
