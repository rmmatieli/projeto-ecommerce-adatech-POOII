package Produtos;

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
}
