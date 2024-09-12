package learning_OOP;


import learning_OOP.MobilePhone.*;
import learning_OOP.Playlist.*;

import java.util.*;

public class Main extends Thread {
    public void run(){
        for(int i=0;i<10000000; i++) {
            System.out.println("Thread Running"+i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Started");
        for(int i=0; i<=10; i++){
            System.out.println("Contando: "+i);
        }
        Thread.sleep(5000);
        Main main = new Main();
        main.start();

        for(int i=0; i<=1000000; i++){
            System.out.println("2 Contando: "+i);
        }
    }
}
