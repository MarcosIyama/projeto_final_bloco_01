package comercio.controller;

import java.util.ArrayList;

import comercio.model.Produto;
import comercio.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int identificacao = 0;

	@Override
	public void adicionarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println(produto.getNome() + ": Foi adicionado com sucesso.");
		
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void procurarPorId(int identificacao) {
		var produto = buscarNaCollection(identificacao);
		
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("Produto não localizado.");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getIdentificacao());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("Produto atualizado com sucesso.");
			
		} else
			System.out.println("Produto não foi encontrado.");
		
	}

	@Override
	public void deletar(int identificacao) {
		var produto = buscarNaCollection(identificacao);
		
		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nProduto removido com sucesso. ");
		} else
			System.out.println("\nProduto não foi encontrado.");
		
	}
	
	public int gerarNumero() {
		return ++ identificacao;
	}
	
	public Produto buscarNaCollection(int identificacao) {
		for (var produto : listaProdutos) {
			if(produto.getIdentificacao() == identificacao) {
				return produto;
			}
		}
		
		return null;
	}

}
