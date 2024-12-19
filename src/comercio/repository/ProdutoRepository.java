package comercio.repository;

import comercio.model.Produto;

public interface ProdutoRepository {
	
	public void adicionarProduto(Produto produto);
	public void listarTodos();
	public void procurarPorNumero(int numero);
	public void atualizar(Produto produto); 
	public void deletar(int numero);
	
}
