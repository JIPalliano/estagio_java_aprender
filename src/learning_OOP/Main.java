package learning_OOP;


import learning_OOP.MobilePhone.*;
import learning_OOP.Playlist.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Album album = new Album("Judas", "Lady Gaga");


        Contact contact = Contact.createContact("Ismael","81823207");
        Contact contact2 = Contact.createContact("Patricia","1234856");
        MobilePhone mobile = new MobilePhone(contact.getPhoneNumber());
        mobile.addNewContact(contact);
        mobile.addNewContact(contact2);
        mobile.addNewContact(Contact.createContact("Lucas","6543321"));
        //testando validação




    }
}
