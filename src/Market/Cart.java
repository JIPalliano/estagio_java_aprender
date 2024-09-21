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


    public ArrayList<Item> listItems(){
        return items.stream().toList();
    }
}
