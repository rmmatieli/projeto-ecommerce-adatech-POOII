package Produtos;

import java.lang.reflect.Array;
import java.util.*;

public class VisualizarListaDeProdutos {
    public static void visualizarListaDeProdutos(){
        for (Produto produto : Produto.listaDeProdutos){
            System.out.println(produto);
        }
    }

    public static void filtrarLista(String atributoProduto, String valorAtributo){
        boolean existe = false;
        switch (atributoProduto){
            case "categoria":
                for (int i = 0; i < Produto.listaDeProdutos.size(); i++) {
                    Produto produto = Produto.listaDeProdutos.get(i);
                    if (valorAtributo.equals(produto.getCategoria())) {
                        System.out.println(produto);
                        existe = true;
                    }
                }
                break;
            case "marca":
                for (int i = 0; i < Produto.listaDeProdutos.size(); i++) {
                    Produto produto = Produto.listaDeProdutos.get(i);
                    if (valorAtributo.equals(produto.getMarca())) {
                        System.out.println(produto);
                        existe = true;
                    }
                }
                break;
            default:
                System.out.println("O campo não existe ou ainda não foi configurado o filtro!");
        }

        if (!existe){
            System.out.printf("Nenhum produto cadastrado. Filtro de %s: %s%n", atributoProduto, valorAtributo);
        }
    }

    public static void ordenarLista(String atributoProduto){
        List<String> listaOrdenadaDeProdutos = new ArrayList<>();
        String maior;

        switch (atributoProduto){
            case "nome":
                Produto.listaDeProdutos.sort(new Comparator<Produto>() {
                    public int compare(Produto p1, Produto p2) {
                        return p1.getNome().compareTo(p2.getNome());
                    }
                });
                break;
            case "preco":
                Produto.listaDeProdutos.sort(new Comparator<Produto>() {
                    public int compare(Produto p1, Produto p2) {
                        return p1.getPreco().compareTo(p2.getPreco());
                    }
                });
                break;
            default:
                System.out.println("O campo não existe ou ainda não foi configurado a ordenação!");
        }
        visualizarListaDeProdutos();
    }
}
