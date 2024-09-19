import java.util.*;

import com.sun.management.GarbageCollectionNotificationInfo;
import learning_OOP.SortedArray;
import loja.*;

import javax.sound.midi.SysexMessage;

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
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long tempoInicial = System.currentTimeMillis();
        //for(int i=0; i<1000000; i++ ){
            //System.out.println(list.get(i));
        //}
        //list.add(500001,12);

        //for(Integer i : list){
            //System.out.println(i);
        //}
        list.get(7);
        list.indexOf(7);
        list.stream().forEach(System.out::println);
        //System.out.println(list.size());


        //list.indexOf();

        long tempoFinal =System.currentTimeMillis() - tempoInicial;
        System.out.println("O método foi executado em " + tempoFinal+" ms");

    }
}
