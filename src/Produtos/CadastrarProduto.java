package Produtos;

import java.util.ArrayList;
import java.util.List;

public class CadastrarProduto {

    public static void cadastrarProduto(boolean validarUsuarioAdm, Produto produto){
        if (validarUsuarioAdm) {
            Produto.listaDeProdutos.add(produto);
            System.out.printf("Produto %s - %s cadastrado com sucesso!%n", produto.getId(),produto.getNome());
        }
    }
}
