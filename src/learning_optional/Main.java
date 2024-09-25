package learning_optional;

import java.util.*;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//      Client client1 = new Client("Ismael Palliano", Optional.of(new Address("Rua Curumim", "467", "Gravtaí", "Rio Grande do Sul")));
//      Client client2 = new Client("Ismael Palliano", Optional.of(new Address("Rua Curumim", "467", "Gravtaí", "Rio Grande do Sul")));
        Product product0 = new Product("josé","Pastel", 12.0);
        Product product1 = new Product("josé","Carne", 10.0);
        Product product2 = new Product("Lucas","Carne", 12.0);
        List<Product> list = List.of(product0, product1, product2);
        //List<Product> list2 = new ArrayList<>();
        Product.allProducts(list);
        //Product.allProducts(product1);
//      Product.listProductsCategory(list);
        Product.listProductsPriceMax(list);
        System.out.println(Product.listProductsGroupByCategory(list));
        System.out.println(Product.listProductsPriceMedia(list));
        System.out.println(Product.listProductsNames(list));

//      System.out.println(client1.getName()+" - "+client1.getAddress());
//      client1.addressExists();
//      System.out.println(Client.comparateAddress(client1.getAddress(), client2.getAddress()));


    }
}
