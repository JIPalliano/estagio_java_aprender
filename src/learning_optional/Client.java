package learning_optional;

import java.util.Optional;

public class Client{
    private String name;
    private Optional<Address> address;

    public Client(String name, Optional<Address> address) {
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address.map(Address::toString).orElse("Endereço vazio");
    }

    public void addressExists(){
        address.ifPresentOrElse(e->System.out.println(">> "+getName()),()->System.out.println("a"+getAddress()));
    }

    public static Boolean comparateAddress(String address1, String address2){
        return address1.equals(address2);
    }
}
