import java.util.*;

public class DiferentsLists {
    public static ArrayList<Number> creatArrayList(){
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }
    public static void sendAllArrayList(ArrayList<Number> list){
        list.forEach(System.out::println);
    }
//                Class<? extends type/objeto>
    public static LinkedList<Number> creatLinkedList(){
        LinkedList<Number> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }

    public static void sendAllLinkedList(LinkedList<Number> list){
        list.forEach(System.out::println);
    }

    public static Queue<Number> creatQueueLinkedList(){
        Queue<Number> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }

    public static void sendAllQueueLinkedList(Queue<Number> list){
        list.forEach(System.out::println);
    }

    public static Stack<Number> creatStackList(){
        Stack<Number> list = new Stack<>();


        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }

    public static void sendAllStackList(Stack<Number> list){
        list.forEach(System.out::println);
    }
}
