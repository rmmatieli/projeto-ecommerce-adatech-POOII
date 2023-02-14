package Produtos;

public class FinalizarCarrinho {
    public static void validaPagamento(String formaPagamento, Double total){
        if (formaPagamento == FormasDePagamento.FORMASDEPAGAMENTO[2] && total >= 2000){
            System.out.println("Pagamento Rejeitado!");
        } else if (formaPagamento == FormasDePagamento.FORMASDEPAGAMENTO[1] && total >= 1000) {
            System.out.println("Pagamento Rejeitado!");
        } else if (formaPagamento == FormasDePagamento.FORMASDEPAGAMENTO[0]) {
            System.out.println("Pagamento Aprovado!");
        }else if (formaPagamento == FormasDePagamento.FORMASDEPAGAMENTO[3]) {
            System.out.println("Pagamento Aprovado!");
        }else {
            System.out.println("Pagamento Aprovado!");
        }
    }
}
