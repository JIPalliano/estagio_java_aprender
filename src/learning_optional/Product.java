package learning_optional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String name, category;
    private Double price;

    public Product(String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static List<Product> allProducts(List<Product> product){
        return product;
    }

    public static void listProductsCategory(List<Product> products){
        allProducts(products)
                .stream()
                .filter(e-> e.getCategory().equals("Carne"))
                .forEach(System.out::println);
    }

    public static void listProductsPriceMax(List<Product> products){
        allProducts(products)
                .stream()
                .max(Comparator.comparing(Product::getPrice))
                .ifPresentOrElse((e)-> System.out.println("Valor: "+e.getPrice()), () -> System.out.println("Valor não encontrado"));
    }

    @Override
    public String toString(){
        return getName()+" - "+getCategory()+" - "+getPrice();
    }



}
