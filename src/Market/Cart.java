package Market;

import Market.Items.*;
import learning_optional.Address;

import java.util.*;

public class Cart {
    public List<Item> addItems(List<Item> items){
        return items;
    }


    public void listItems(List<Item> items) {
        addItems(items).forEach(System.out::println);
    }


}
