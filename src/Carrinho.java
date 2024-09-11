import lombok.*;

import java.util.ArrayList;
import java.util.Collection;


@Data
public class Carrinho {
    private String produto;
    private Integer quantidade;
    public Collection<Carrinho> carrinho = new ArrayList();

    public Carrinho(String produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Carrinho(){}

    public void criaObjeto(String produto, Integer quantidade){
        produto = getProduto();
        quantidade = getQuantidade();
        Carrinho carrinho = new Carrinho(produto, quantidade);
        addItemCarrinho(carrinho);
    }

    public void addItemCarrinho(Carrinho carrinho){
        this.carrinho.add(carrinho);
    }


    public void print(){
        for (Carrinho item : carrinho) {
            System.out.println(item);
        }
    }


    @Override
    public String toString() {
        return produto+" - "+quantidade;
    }
}
