import java.util.*;
import java.util.stream.Collectors;

public class DiferentsLists {

    //Listas
    public static ArrayList<? super Integer> creatArrayList(ArrayList<Integer> list) {
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
        for (double i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }

    public static void sendAllLinkedList(){
        creatLinkedList().forEach(System.out::println);
    }
    //Queues
    public static Queue<Integer> creatQueueLinkedList(){
        Queue<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }

    public static void sendAllQueueLinkedList(){
        creatQueueLinkedList().forEach(System.out::println);
    }

    public static Stack<Number> creatStackList(){
        Stack<Number> list = new Stack<>();


        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }

    public static void sendAllStackList(){
        creatStackList().forEach(e -> System.out.println(e));
    }

    //Set
    public static Set<Number> creatSetList(){
        Set<Number> list = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
            list.add(i);
        }
        return list;
    }

    public static void sendAllSetList(){
        creatSetList().forEach(System.out::println);
    }

    public static Set<Integer> creatTreeSet(){
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < 1000000; i++){
            set.add(i);
        }
        return set;
    }

    public static void sendAllTreeSet(){
        creatTreeSet().forEach(System.out::println);
    }

    public static Set<Integer> creatSetLinkedList(){
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < 1000000; i++){
            set.add(i);
        }
        return set;
    }

    public static void sendAllSetLinkedSet(){
        creatSetLinkedList().forEach(System.out::println);
    }

    //map
    public static Map<Integer,Integer> creatHashMapList(){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            map.put(i, i);
        }
        return map;
    }

    public static void sendAllHashMapList(){
        creatHashMapList().forEach((integer, list) -> System.out.println(integer.toString()+ " : "+ list.toString()));
    }

    public static Map<Integer, Integer> creatLinkedHashMapList(){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < 1000000; i++) {
            map.put(i, i);
        }
        return map;
    }
    public static void sendAllLinkedHashMapList(){
        creatLinkedHashMapList().forEach((integer, list) -> System.out.println(integer.toString()+ " : "+ list.toString()));
    }

    public static Map<Integer, Integer> creatTreeMap(){
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 1000000; i++) {
            map.put(i, i);
        }
        return map;
    }

    public static void sendAllTreeMap(){
        creatTreeMap().forEach((integer, list) -> System.out.println(integer.toString()+ " : "+ list.toString()));
    }

}
