import java.util.*;

import com.sun.management.GarbageCollectionNotificationInfo;
import learning_OOP.SortedArray;
import loja.*;

public class Main {

    public void testeIf(){
        for(long i=0;i<100000000; i++){
            if(i==100000000){
                System.out.println("é verdade "+i);
            }
        }
    }

    public void testeSwitch(){
        for(int i=1;i<100000000; i++){
            switch(i) {
                case 100000000:
                    System.out.println("número é"+i);
            }
        }
    }

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
//        Scanner input = new Scanner(System.in);
        Main main = new Main();
        String[] x = new String[]{"abcdefgh","teste"};
        Collection<String> xlist = new LinkedList<>();
        Collection<Integer> ylist = new LinkedList<>();
        ylist.add(1);
        ylist.add(2);
        ylist.add(3);
        ylist.add(4);
        ylist.add(5);
        ylist.add(6);
        xlist.add("nome1");
        xlist.add("nome2");
        xlist.add("nome3");
        xlist.add("nome4");
        xlist.add("nome5");
        carrinho.tipoProduto(xlist);
//        System.out.println();
        long start = System.currentTimeMillis();

        //main.testeIf();
        main.testeSwitch();

        long elapsed = System.currentTimeMillis() - start;
        //System.out.println("Elapsed time: " + elapsed + "ms");

//        while (true) {
//            String nomeProduto = input.nextLine();
//            Integer quantidadeProduto = input.nextInt();
//            input.nextLine();
//            carrinho.setProduto(nomeProduto);
//            carrinho.setQuantidade(quantidadeProduto);
//            carrinho.criaObjeto(nomeProduto, quantidadeProduto);
//            carrinho.print();
//        }
    }
}
