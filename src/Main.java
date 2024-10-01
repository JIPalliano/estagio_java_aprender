import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList list = DiferentsLists.creatArrayList();
        Stack stack = DiferentsLists.creatStackList();
        Queue queue = DiferentsLists.creatQueueLinkedList();

        TreeSet<Integer> treeSet = DiferentsLists.creatTreeSet();

//        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        String horaFormatada = LocalTime.now().format(df);
//
//        System.out.println(horaFormatada);

        LinkedList<Number> list1 = DiferentsLists.creatLinkedList();
        stack.add(1);
        long tempoInicial = System.currentTimeMillis();


        DiferentsLists.sendAllStackList();
        long tempoFinal = System.currentTimeMillis() - tempoInicial;
        System.out.println("O método foi executado em " + tempoFinal+" ms");
    }
}
