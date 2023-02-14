package Usuarios;

import Produtos.ValidaAutenticacao;
import Produtos.Produto;

import java.util.Scanner;

public class Administrador extends ClientePessoFisica implements ValidaAutenticacao {

    private String tipoUsuario = "ADM";


    public Administrador(String nome, String sobrenome, String nomeUsuario, String sexo, String dataNascimento, String senha, String cpf) {
        super(nome, sobrenome, nomeUsuario, sexo, dataNascimento, senha, cpf);
        this.setTipoUsuario(tipoUsuario);
    }

    public static void cadastrarProduto(){
        /*String textoMenu = """
                MENU CADASTRAR PRODUTO
                                
                Escolha uma opção abaixo para continuar:
                1 - Cadastrar Produto
                2 - Visualizar lista de Produtos
                3 - Editar produto
                4 - Remover produto
                
                """;
        System.out.printf(textoMenu);
        String opcaoEscolhida = scanner.next();

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
        MENU CADASTRAR PRODUTO
        
        Escolha a categoria do Produto:
        """);
        Produto.listarCategoria();
        String categoria = String.valueOf(Produto.CATEGORIAS[scanner.nextInt()]);

        System.out.println("Informe o ID do Produto: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o nome do Produto: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o preço do Produto: ");
        Double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Informe a marca do Produto:");
        String marca = scanner.nextLine();

        Produto produto = new Produto(id,nome,preco,categoria,marca);
        System.out.println(produto);
        Produto.listaDeProdutos.add(produto);
    }
    public static void visualizarListaDeProdutos(){
        System.out.println(Produto.listaDeProdutos);
    }

    public void editarProduto(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ID do Produto que deseja editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Produto produto : Produto.listaDeProdutos){
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

    public void removerProduto(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ID do Produto que deseja remover: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < Produto.listaDeProdutos.size(); i++) {
            if (Produto.listaDeProdutos.get(i).getId() == id) {
                //System.out.println(listaDeProdutos.get(i));
                Produto.listaDeProdutos.remove(Produto.listaDeProdutos.get(i));
            }
        }
    }

    @Override
    public boolean validaLoginAdm() {
        return true;
    }
}
