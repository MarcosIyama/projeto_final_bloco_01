package comercio.model;

public class ProdutoCamiseta extends Produto {
	
	private int tipo;

	public ProdutoCamiseta(String nome, String cor, int numeracao, int identificacao, float valor, int tipo) {
		super(nome, cor, numeracao, identificacao, valor);
		this.setTipo(tipo);
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		super.visualizar();
		switch (tipo) {
		case 1 -> System.out.println("Manga longa ");
		case 2 -> System.out.println("Manga curta ");
		case 3 -> System.out.println("Regata ");
		default -> System.out.println("Tipo não identificado.");
		}
	}
	
}
