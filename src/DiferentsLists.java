import java.util.*;
import java.util.stream.Collectors;

public class DiferentsLists {
    public static ArrayList<? super Integer> creatArrayList(){
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }
    public static void sendAllArrayList(ArrayList<? extends Number> list){
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
        list.forEach(e -> System.out.println(e));
    }

    public static Set<Number> creatSetList(){
        Set<Number> list = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }

    public static void sendAllSetList(Set<Number> list){
        list.forEach(System.out::println);
    }

    public static Map<Integer,Integer> creatHashMapList(){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            map.put(i, i);
        }
        return map;
    }

    public static void sendAllHashMapList(){
        creatHashMapList().forEach((integer, list) -> System.out.println(integer.toString()+ " : "+ list.toString()));
        //map.forEach((integer, list) -> System.out.println(integer.toString()+ " - "+ list.stream().distinct().count()));
    }
}
