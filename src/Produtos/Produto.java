package Produtos;

import java.util.ArrayList;
import java.util.List;

public class Produto implements CategoriasInterface{

    private int id;
    private String nome;
    private Double preco;
    private String categoria;
    private String marca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Produto(int id, String nome, Double preco, String categoria, String marca) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public static List<Produto> listaDeProdutos = new ArrayList<>();

    public static void listarCategoria(){
        int indiceMenu = 0;
        for (String a : CategoriasInterface.CATEGORIAS) {
            System.out.printf("%s - %s %n", indiceMenu, a);
            indiceMenu++;
        }
        /*
        System.out.println("""
                0 - Livro
                1 - Informatica
                2 - Mercado
                """);

         */
    }
}
