package comercio.model;

public class ProdutoCamiseta extends Produto {
	
	private int manga;

	public ProdutoCamiseta(int tipo, String nome, String cor, int numeracao, int identificacao, float valor, int manga) {
		super(tipo, nome, cor, numeracao, identificacao, valor);
		this.setManga(manga);
		
	}

	public int getManga() {
		return manga;
	}

	public void setManga(int manga) {
		this.manga = manga;
	}
	
	public void visualizar() {
		super.visualizar();
		switch (manga) {
		case 1 -> System.out.println("Manga longa ");
		case 2 -> System.out.println("Manga curta ");
		case 3 -> System.out.println("Regata ");
		default -> System.out.println("Estilo não identificado.");
		}
	}
	
}
