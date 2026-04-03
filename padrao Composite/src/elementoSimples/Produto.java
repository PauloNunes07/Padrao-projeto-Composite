package elementoSimples;

import interfaces.ItemLoja;

public class Produto implements ItemLoja {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.printf("%s - Produto: %s | Preço: %.2f%n",prefixo, getNome(), getPreco());
    }
}
