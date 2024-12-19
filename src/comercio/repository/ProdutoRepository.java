package comercio.repository;

import comercio.model.Produto;

public interface ProdutoRepository {
	
	public void adicionarProduto(Produto produto);
	public void listarTodos();
	public void procurarPorId(int identificacao);
	public void atualizar(Produto produto); 
	public void deletar(int identificacao);
	
}
