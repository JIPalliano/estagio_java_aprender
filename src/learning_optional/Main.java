package learning_optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ismael Palliano", Optional.of(new Address("Rua Curumim", "467", "Gravtaí", "Rio Grande do Sul")));
        Client client2 = new Client("Ismael Palliano", Optional.of(new Address("Rua Curumim", "467", "Gravtaí", "Rio Grande do Sul")));
        System.out.println(client1.getName()+" - "+client1.getAddress());
        client1.addressExists();
        System.out.println(Client.comparateAddress(client1.getAddress(), client2.getAddress()));


    }
}
