package Produtos;

import java.util.Scanner;

public class EditarProduto {
    public static void editarProduto(boolean validarUsuarioAdm){
        if (validarUsuarioAdm) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o ID do Produto que deseja editar: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            for (Produto produto : Produto.listaDeProdutos) {
                if (produto.getId() == id) {
                    System.out.println("""
                            Informe o que deseja alterar:
                            1 - Nome
                            2 - Preco
                            3 - Categoria
                            4 - Marca
                            """);
                    int opcaoEscolhida = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoEscolhida) {
                        case 1:
                            System.out.println("Informe o novo nome: ");
                            String novoNome = scanner.nextLine();

                            produto.setNome(novoNome);
                            break;
                        case 2:
                            System.out.println("Informe o novo preço: ");
                            Double novoPreco = scanner.nextDouble();
                            scanner.nextLine();

                            produto.setPreco(novoPreco);
                            break;
                        case 3:
                            System.out.println("Selecione uma nova categoria: ");
                            //listarCategoria();
                            int novaCategoria = scanner.nextInt();
                            scanner.nextLine();

                            produto.setCategoria(String.valueOf(novaCategoria));
                            break;
                        case 4:
                            System.out.println("Selecione uma nova marca: ");
                            String novaMarca = scanner.nextLine();

                            produto.setMarca(novaMarca);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                }
            }

        }
    }
}
