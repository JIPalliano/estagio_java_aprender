package Market;

import Market.Items.*;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items;

    public ArrayList<Item> addItems(Item item){
        items = new ArrayList<>();
        items.add(item);
        return items;
    }


    public void listItems(){
        for(Item item : items){
           String name = item.getName();
           String discription = item.getDescription();
           Double price = item.getPrice();
           Boolean disponable = item.getDisponable();
           System.out.println("Nome: "+name+"\nDescrição: "+discription+"\nPreço: "+price+"\nDisponivel: "+disponable);
        }
    }
}
