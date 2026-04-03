package elementoComposto;

import interfaces.ItemLoja;

import java.util.ArrayList;
import java.util.List;

public class Kit implements ItemLoja {
    private final String nomeKit;
    private final List<ItemLoja> produtos = new ArrayList<>();

    public Kit(String nomeKit) {
        this.nomeKit = nomeKit;
    }

    @Override
    public String getNome() {
        return nomeKit;
    }

    @Override
    public double getPreco() {
        double precoTotal = 0;
        for(ItemLoja item : produtos) {
            precoTotal += item.getPreco();

        }
        return precoTotal;
    }

    public void adicionar(ItemLoja item) {
        produtos.add(item);
    }

    public void remover(ItemLoja item) {
        ItemLoja itemRemover = null;
        for(ItemLoja produto : produtos) {
            if(produto.equals(item)) {
                itemRemover = produto;
                break;
            }
        }
        if(itemRemover == null) {
            System.out.println("Não foi possivel remover um item não existente");
        }
        else {
            produtos.remove(itemRemover);
        }
    }

    @Override
    public void exibir(String prefixo) {
        System.out.printf("%s + Kit: %s | Total: %.2f R$%n", prefixo, getNome(), getPreco());
        for(ItemLoja item : produtos) {
            item.exibir(prefixo + "  ");
        }
    }
}
