package comercio.model;

public class ProdutoCalcado extends Produto {
	
	private boolean cadarco;

	public ProdutoCalcado(int tipo, String nome, String cor, int numeracao, int identificacao, float valor, boolean cadarco) {
		super(tipo, nome, cor, numeracao, identificacao, valor);
		this.setCadarco(cadarco);
		
	}

	public boolean isCadarco() {
		return cadarco;
	}

	public void setCadarco(boolean cadarco) {
		this.cadarco = cadarco;
	}
	
	public void visualizar() {
		super.visualizar();
		if (cadarco != false) {
			System.out.println("Possui cadarço.");
		} else {
			System.out.println("Sem cadarço.");
		}
	}
}
