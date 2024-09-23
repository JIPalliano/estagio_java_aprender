package learning_optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ismael Palliano", Optional.empty());
        System.out.println(client1.getName()+" - "+client1.getAddress());


    }
}
