package Market;

import Market.Items.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Chair chair = new Chair();
        Table table = new Table();
        Cart cart = new Cart();
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("A");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        while(true){
            System.out.println("Nome\n");
            chair.setName(input.nextLine());
            System.out.println("Descrição\n");
            chair.setDescription(input.nextLine());
            System.out.println("Preço\n");
            chair.setPrice(input.nextDouble());
            System.out.println("Quantidade\n");
            chair.setQuantity(input.nextInt());
            System.out.println("Está disponivel\n");
            chair.setDisponable(input.nextLine());
            System.out.println("Nome\n");
            table.setName(input.nextLine());
            System.out.println("Descrição\n");
            table.setDescription(input.nextLine());
            System.out.println("Preço\n");
            table.setPrice(input.nextDouble());
            System.out.println("Quantidade\n");
            table.setQuantity(input.nextInt());
            System.out.println("Está disponivel\n");
            table.setDisponable(input.nextLine());
            break;
        }

        List<Item> items = List.of(chair, table);

        cart.addItems(items);
        cart.listItems(items);
        input.close();
    }
}
