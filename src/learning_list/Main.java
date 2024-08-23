package learning_list;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //ArrayList = 11 milissegundo
        //vector = 14 milissegundo
        //LinkedList = 14 milissegundo
        long time1 = System.currentTimeMillis();
        LinkedList<Integer> listaLojas = new LinkedList<>();
        for(int i=0;i<=500000;i++) {
            listaLojas.add(1);
            listaLojas.add(2);

            //System.out.println(listaLojas);
            //listaLojas.remove("Americanas");
            //listaLojas.remove("Panvel");
        }
        System.out.println(listaLojas.peek());
        long time2 = System.currentTimeMillis();

        System.out.println(time2-time1);

    }
}
