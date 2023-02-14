/*
Deve existir dois perfis de usuários (ADMINISTRADOR E CLIENTE [PF e PJ] )

Deverá ser desenvolvido as seguintes funcionalidades para o ADMINISTRADOR do sistema

1 - Cadastrar produto - Os produtos devem possuir os seguintes atributos: nome, preco, categoria, marca - Incluir produtos das seguintes categorias: LIVRO, INFORMATICA, MERCADO (Adicionar atributos / comportamentos especificos para cada categoria)

2 - Visualizar lista de produtos

3 - Editar produto

4 - Remover produto

Deverá ser desenvolvido as seguintes funcionalidades para o CLIENTE do sistema

PRODUTOS
1 - Visualizar lista de produtos

2 - Filtrar por categoria

3 - Filtrar por marca

4 - Ordenar por nome (ordem crescente e decrescente)

5 - Ordernar por preço (ordem crescente e decrescente)
 */

import Produtos.*;
import Usuarios.Administrador;
import Usuarios.ClientePessoFisica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Usuários Cadastrados --------------");
        ClientePessoFisica usuario1 = new ClientePessoFisica("João", "Silva", "joao.silva", "M", "28/12/1998","senha1","11122233344");
        System.out.println(usuario1);

        Administrador administrador1 = new Administrador("Lucas", "Almeida", "lucas.almeida", "M", "01/01/1999","senha2","99988877766");
        System.out.println(administrador1);

        System.out.println();
        System.out.println("--------------- Cadastrando Produtos --------------");
        Produto produto1 = new Produto(1001, "Smartphone Samsung S20 FE 128GB", 2000.00, CategoriasInterface.CATEGORIAS[1], "Samsung");
        Produto produto2 = new Produto(1002, "IPhone 14 256GB", 5000.00, CategoriasInterface.CATEGORIAS[1], "Apple");
        Produto produto3 = new Produto(1003, "Livro Legal", 35.00, CategoriasInterface.CATEGORIAS[0], "LivrariaCultura");

        CadastrarProduto.cadastrarProduto(usuario1.validaLoginAdm(), produto1);
        CadastrarProduto.cadastrarProduto(administrador1.validaLoginAdm(), produto1);
        CadastrarProduto.cadastrarProduto(administrador1.validaLoginAdm(), produto2);
        CadastrarProduto.cadastrarProduto(administrador1.validaLoginAdm(), produto3);

        System.out.println();
        System.out.println("--------------- Visualizando Lista de Produtos --------------");
        VisualizarListaDeProdutos.visualizarListaDeProdutos();

        System.out.println();
        System.out.println("--------------- Filtrar por Categoria --------------");
        VisualizarListaDeProdutos.filtrarLista("categoria", "Livro");
        VisualizarListaDeProdutos.filtrarLista("categoria", "Informática");
        VisualizarListaDeProdutos.filtrarLista("categoria", "Mercado");

        System.out.println();
        System.out.println("--------------- Filtrar por Marca --------------");
        VisualizarListaDeProdutos.filtrarLista("marca", "Samsung");
        VisualizarListaDeProdutos.filtrarLista("marca", "Motorola");

        System.out.println();
        System.out.println("--------------- Ordernar por Nome --------------");
        VisualizarListaDeProdutos.ordenarLista("nome");

        System.out.println();
        System.out.println("--------------- Ordernar por Preço --------------");
        VisualizarListaDeProdutos.ordenarLista("preco");

        System.out.println();
        System.out.println("--------------- Editar Produto --------------");
        EditarProduto.editarProduto(usuario1.validaLoginAdm());
        EditarProduto.editarProduto(administrador1.validaLoginAdm());

        System.out.println();
        System.out.println("--------------- Remover Produto --------------");
        RemoverProduto.removerProduto(usuario1.validaLoginAdm(), 1001);
        RemoverProduto.removerProduto(administrador1.validaLoginAdm(), 1001);

        System.out.println();
        System.out.println("--------------- Forma De Pagamento --------------");
        FinalizarCarrinho.validaPagamento("Cartão de Crédito", 2000.01);
        FinalizarCarrinho.validaPagamento("Cartão de Crédito", 1000.01);



        /*
        Administrador admin1 = new Administrador(1001, "João", "Silva", "M", "28/12/19980", "Administrador","11122233344");
        System.out.println(admin1);

        Produto produto1 = new Produto(1001, "Smartphone Samsung S20 FE 128GB", 2000.00, 1, "Samsung");
        Produto produto2 = new Produto(1002, "IPhone 14 256GB", 5000.00, 1, "Apple");
        //System.out.println(produto1);

        //AdministradorDAO.listaDeProdutos.add(produto1);
        //AdministradorDAO.listaDeProdutos.add(produto2);
        AdministradorDAO.visualizarListaDeProdutos();

        //Cadastrar Produto
        System.out.println("CADASTRANDO UM NOVO PRODUTO");
        AdministradorDAO.cadastrarProduto();
        AdministradorDAO.visualizarListaDeProdutos();

        //Editar Produto
        System.out.println("EDITANDO PRODUTO");
        AdministradorDAO.editarProduto();
        AdministradorDAO.visualizarListaDeProdutos();

        //Removendo Produto
        System.out.println("REMOVENDO PRODUTO");
        AdministradorDAO.removerProduto();
        AdministradorDAO.visualizarListaDeProdutos();

         */
    }

}
