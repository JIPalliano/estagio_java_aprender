import java.util.ArrayList;

import learning_OOP.SortedArray;
import loja.*;
//import lombok.*;

public class Main {
    Float f = 12.0F;
    char c = 'a';
    String qualquer = "12adev";
    public static void main(String[] args) {
//        Pagamento teste = new Pagamento();

        Pagamento pagamento = new Pix(100, "pagamento", "cpf");
        Pix pix = new Pix(100, "pix", "cpf");
//        AbsPagamento pagamento1 = new AbsPagamento(12, "me ajuda");
        pix.jogar();
        pix.alou();

        //System.out.println(pix.jogar2());
        System.out.println(pagamento.testizinho());
        //System.out.println(pix.teste());
//        System.out.println(teste.pagar());
//        teste.valor();
//        System.out.println(pagamento.pagar());
//        pagamento1.valor();
//        Pix pix = new Pix(100, "pagamento", "cpf");
//        System.out.println(pagamento.pagar());




//        pagamento.estorno();
//        pix.estorno();
//        System.out.println(pagamento.isA());
//        System.out.println(pagamento.getB());
//        System.out.println(pagamento.pagar());
//        System.out.println(pagamento.estorno());
//        System.out.println(pix.estorno());
    }
}
