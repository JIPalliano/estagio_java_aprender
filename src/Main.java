import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, ArrayList<Number>> map = new HashMap<>();

        long tempoInicial = System.currentTimeMillis();

        DiferentsLists.creatHashMapList();
        DiferentsLists.sendAllHashMapList();

        long tempoFinal = System.currentTimeMillis() - tempoInicial;
        System.out.println("O método foi executado em " + tempoFinal+" ms");
    }
}
