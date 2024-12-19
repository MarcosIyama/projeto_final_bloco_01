package comercio;

import java.util.InputMismatchException;
import java.util.Scanner;

import comercio.util.Cores;
import comercio.model.ProdutoCalcado;
import comercio.model.ProdutoCamiseta;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//ProdutoCalcado pcl1 = new ProdutoCalcado("Chinelo", "Preto", 42, 1, 15.99f, false);
		//pc1.visualizar();
		ProdutoCamiseta pcm1 = new ProdutoCamiseta("Camiseta maneira", "Branca", 38, 2, 29.99f, 3);
		pcm1.visualizar();
		
		int opcao;

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
				opcao = 0;
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

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os Produtos\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Buscar Produto pelo ID\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar Produto\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar Produto\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
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

}
