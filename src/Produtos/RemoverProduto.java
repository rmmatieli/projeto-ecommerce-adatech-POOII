package Produtos;

public class RemoverProduto {
    public static void removerProduto(boolean validarUsuarioAdm, int idProdutoRemove){
        if (validarUsuarioAdm) {
            for (int i = 0; i < Produto.listaDeProdutos.size(); i++) {
                Produto produto = Produto.listaDeProdutos.get(i);
                if (produto.getId() == idProdutoRemove) {
                    //System.out.println(listaDeProdutos.get(i));
                    Produto.listaDeProdutos.remove(Produto.listaDeProdutos.get(i));
                    System.out.printf("Produto %s - %s removido com sucesso!%n", produto.getId(), produto.getNome());

                }
            }
        }

    }
}
