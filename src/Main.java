import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList list = DiferentsLists.creatArrayList();

//        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        String horaFormatada = LocalTime.now().format(df);
//
//        System.out.println(horaFormatada);

        LinkedList<Number> list1 = DiferentsLists.creatLinkedList();

        long tempoInicial = System.currentTimeMillis();

//        list1.addLast(20);
//        list.add(1000000, 1);
//

        long tempoFinal = System.currentTimeMillis() - tempoInicial;
        System.out.println("O método foi executado em " + tempoFinal+" ms");
    }
}
