package learning_optional;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

    public static List<Product> allProducts(List<Product> products){
        return products;
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

    public static Double listProductsPriceMedia(List<Product> products){
        return allProducts(products)
                .stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0);
    }

    public static Map<String, List<Product>> listProductsGroupByCategory(List<Product> products){
        return products
                .stream()
                .collect(Collectors
                        .groupingBy(Product::getCategory));
    }

    public static Set<String> listProductsNames(List<Product> products){
        return products
                .stream()
                .map(Product::getName)
                .collect(Collectors.toSet());
    }

    @Override
    public String toString(){
        return getName()+" - "+getCategory()+" - "+getPrice();
    }



}
