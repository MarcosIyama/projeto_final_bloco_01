package comercio;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import comercio.util.Cores;
import comercio.controller.ProdutoController;
import comercio.model.ProdutoCalcado;
import comercio.model.ProdutoCamiseta;

public class Menu {

	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();

		Scanner leia = new Scanner(System.in);
		
		
		// Produtos para teste
		ProdutoCalcado pcl1 = new ProdutoCalcado(1, "Chinelo", "Preto", 42, produtos.gerarNumero(), 15.99f, false);
		produtos.adicionarProduto(pcl1);
		
		ProdutoCalcado pcl2 = new ProdutoCalcado(1, "Pisante", "Branco", 40, produtos.gerarNumero(), 199.99f, true);
		produtos.adicionarProduto(pcl2);
		
		ProdutoCamiseta pcm1 = new ProdutoCamiseta(2, "Camiseta maneira", "Branca", 38, produtos.gerarNumero(), 29.99f, 1);
		produtos.adicionarProduto(pcm1);
		
		ProdutoCamiseta pcm2 = new ProdutoCamiseta(2, "Camiseta confortável", "Verde", 50, produtos.gerarNumero(), 13.99f, 3);
		produtos.adicionarProduto(pcm2);
		
		
		int opcao, tipo, numeracao, identificacao, manga;
		String nome, cor;
		float valor;
		boolean cadarco;
		

		while (true) {

			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_RED_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  LOJINHA DO PERIGO                  ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto pelo ID               ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 9;
			}

			if (opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nSistema Finalizado.");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Adicionar Produto\n\n");
				
				System.out.println("-----------------------");
				System.out.println("   Categorias: ");
				System.out.println("     1 - Calçados");
				System.out.println("     2 - Camisetas");
				System.out.println("-----------------------");
				System.out.println("\nDigite a tipo do Produto: ");
				tipo = leia.nextInt();
				
				System.out.println("Digite o nome do Produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				
				System.out.println("Digite a cor: ");
				leia.skip("\\R?");
				cor = leia.nextLine();
				
				System.out.println("Digite a numeração: ");
				numeracao = leia.nextInt();
				
				System.out.println("Digite o valor (R$): ");
				valor = leia.nextFloat();
				
				switch(tipo) {
					case 1 -> {
						System.out.println("O calçado tem cadarço? (true ou false)");
						cadarco = leia.hasNextShort();
						produtos.adicionarProduto(new ProdutoCalcado(tipo, nome, cor, numeracao, produtos.gerarNumero(), valor, cadarco));
					}
					case 2 -> {
						System.out.println("-----------------------");
						System.out.println("   Tipos de camiseta:");
						System.out.println("     1 - Manga longa");
						System.out.println("     2 - Manga curta");
						System.out.println("     3 - Regata");
						System.out.println("-----------------------");
						System.out.println("\nDigite a tipo da camiseta: ");
						manga = leia.nextInt();
						produtos.adicionarProduto(new ProdutoCamiseta(tipo, nome, cor, numeracao, produtos.gerarNumero(), valor, manga));
					}
				}
				
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os Produtos\n\n");
				produtos.listarTodos();

				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Buscar Produto pelo ID\n\n");
				
				System.out.println("Digite o ID do produto: ");
				identificacao = leia.nextInt();
				
				produtos.procurarPorId(identificacao);
				
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar Produto\n\n");
				
				System.out.println("Digite o ID do produto: ");
				identificacao = leia.nextInt();
				
				var buscaProduto = produtos.buscarNaCollection(identificacao);
				
				if (buscaProduto != null) {
					
					System.out.println("-----------------------");
					System.out.println("   Categorias: ");
					System.out.println("     1 - Calçados");
					System.out.println("     2 - Camisetas");
					System.out.println("-----------------------");
					System.out.println("\nDigite a tipo do Produto: ");
					tipo = leia.nextInt();
					
					System.out.println("Digite o nome do Produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					
					System.out.println("Digite a cor: ");
					leia.skip("\\R?");
					cor = leia.nextLine();
					
					System.out.println("Digite a numeração: ");
					numeracao = leia.nextInt();
					
					System.out.println("Digite o valor (R$): ");
					valor = leia.nextFloat();
					
					switch(tipo) {
						case 1 -> {
							System.out.println("O calçado tem cadarço? (true ou false)");
							cadarco = leia.hasNextShort();
							produtos.atualizar(new ProdutoCalcado(tipo, nome, cor, numeracao, produtos.gerarNumero(), valor, cadarco));
						}
						case 2 -> {
							System.out.println("-----------------------");
							System.out.println("   Tipos de camiseta:");
							System.out.println("     1 - Manga longa");
							System.out.println("     2 - Manga curta");
							System.out.println("     3 - Regata");
							System.out.println("-----------------------");
							System.out.println("\nDigite a tipo da camiseta: ");
							manga = leia.nextInt();
							produtos.atualizar(new ProdutoCamiseta(tipo, nome, cor, numeracao, produtos.gerarNumero(), valor, manga));
						}
					}
				} else {
					System.out.println("Produto não encontrado!");
				}
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar Produto\n\n");
				
				System.out.println("Digite o ID do produto: ");
				identificacao = leia.nextInt();
				
				produtos.deletar(identificacao);
				
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n-----------------------------------------------------");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println(" Marcos Iyama - marcosiyama@gmail.com");
		System.out.println(" github.com/MarcosIyama/projeto_final_bloco_01");
		System.out.println("-----------------------------------------------------");

	}
	
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter.");

		}
	}

}
