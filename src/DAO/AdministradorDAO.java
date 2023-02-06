package DAO;

import Produtos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdministradorDAO {

    public static List<Produto> listaDeProdutos = new ArrayList<>();

    public AdministradorDAO(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    @Override
    public String toString() {
        return "AdministradorDAO{" +
                "listaDeProdutos=" + listaDeProdutos +
                '}';
    }

    public static void cadastrarProduto(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
        Escolha a categoria do Produto:
        0 - Livro
        1 - Informatica
        2 - Mercado 
        """);
        int categoria = scanner.nextInt();

        System.out.println("Informe o ID do Produto: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o nome do Produto: ");
        String nome = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Informe o preço do Produto: ");
        Double preco = scanner.nextDouble();
        scanner.nextLine();

       System.out.println("Informe a marca do Produto:");
       String marca = scanner.nextLine();

       scanner.close();

        Produto produto = new Produto(id,nome,preco,categoria,marca);
        System.out.println(produto);
        listaDeProdutos.add(produto);
    }

    public static void visualizarListaDeProdutos(){
        System.out.println(listaDeProdutos);
    }

    public static void listarCategoria(){
        System.out.println("""
                0 - Livro
                1 - Informatica
                2 - Mercado
                """);
    }
    public static void editarProduto(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ID do Produto que deseja editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Produto produto : listaDeProdutos){
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

                switch (opcaoEscolhida){
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
                        listarCategoria();
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

            }else {
                System.out.println("F no chat");
            }
        }
    }

    public static void removerProduto(){

    }
}
