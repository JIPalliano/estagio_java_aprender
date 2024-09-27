import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

//        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        String horaFormatada = LocalTime.now().format(df);
//
//        System.out.println(horaFormatada);


        long tempoInicial = System.currentTimeMillis();

//        DiferentsLists.creatArrayList(list).add(500000, 1);
//        DiferentsLists.creatArrayList(list).get(500000);
//        DiferentsLists.creatArrayList(list).remove(500000);
//        DiferentsLists.creatArrayList(list).removeAll(list);
//        DiferentsLists.creatArrayList(list).set(500000, 20);
//        DiferentsLists.sendAllArrayList(list);

//        DiferentsLists.creatTreeSet().add(1);
//        DiferentsLists.sendAllTreeSet();

//        DiferentsLists.creatLinkedList().add(500000, 20);
//        DiferentsLists.creatLinkedList().addFirst( 20);
//        DiferentsLists.creatLinkedList().addLast(10);
//        DiferentsLists.creatLinkedList().get(500000);
//        DiferentsLists.creatLinkedList().remove(500000);
//        DiferentsLists.creatLinkedList().set(500000, 20);
//        DiferentsLists.sendAllLinkedList();

        long tempoFinal = System.currentTimeMillis() - tempoInicial;
        System.out.println("O método foi executado em " + tempoFinal+" ms");
    }
}
