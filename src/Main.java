import java.util.ArrayList;
import java.util.Scanner;

import learning_OOP.SortedArray;
import loja.*;

public class Main {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Scanner input = new Scanner(System.in);
        while (true) {
            String nomeProduto = input.nextLine();
            Integer quantidadeProduto = input.nextInt();
            input.nextLine();
            carrinho.setProduto(nomeProduto);
            carrinho.setQuantidade(quantidadeProduto);
            carrinho.criaObjeto(nomeProduto, quantidadeProduto);
            carrinho.print();
        }
    }
}
