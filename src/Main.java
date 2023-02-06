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

import DAO.AdministradorDAO;
import Produtos.CategoriasInterface;
import Produtos.Produto;
import Usuarios.Administrador;

public class Main {
    public static void main(String[] args) {

        Administrador admin1 = new Administrador(1001,"João","Silva","M","28/12/19980","11122233344");
        System.out.println(admin1);

        Produto produto1 = new Produto(1001,"Smartphone Samsung S20 FE 128GB",2000.00, 1, "Samsung");
        Produto produto2 = new Produto(1002,"IPhone 14 256GB",5000.00, 1, "Apple");
        //System.out.println(produto1);

        AdministradorDAO.listaDeProdutos.add(produto1);
        AdministradorDAO.listaDeProdutos.add(produto2);
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
    }
}