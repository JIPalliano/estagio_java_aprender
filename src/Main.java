import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {


    public static class Auth {
        String id;
        String password;
        Integer number;

        public Auth(String id, String password, Integer number) {
            this.id = id;
            this.password = password;
            this.number = number;
        }

//        public <T extends Auth> T getAuthentication(Auth auth) {
//            return new TokenAuth("1", "");
//        }

        public boolean authenticate(String method) {
            return true;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

    }

    public static class TokenAuth extends Auth {
        String token;

        public TokenAuth(String id, String token, String password, Integer number) {
            super(id, password, number);
            this.token = token;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        @Override
        public boolean authenticate(String method) {
            return false;
        }
    }

    public static class PasswordAuth extends Auth {
        String password;

        public PasswordAuth(String id, String password, Integer number) {
            super(id, password, number);
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        @Override
        public boolean authenticate(String method) {
            return false;
        }
    }


//
//    public void authenticate(Auth<? extends Auth> auth) {
//        auth.authenticate("password");
//    }
//      Estudar mais sobre esse método
//    public static LinkedList<? extends Auth> creatLinkedList(){
//        LinkedList<? extends Auth> list = new LinkedList<>();
//        for (int i = 0; i < 1000000; i++) {
//            list.add();
//        }
//        return list;
//    }
//    public void testeIf(){
//        for(long i=0;i<100000000; i++){
//            if(i==100000000){
//                System.out.println("é verdade "+i);
//            }
//        }
//    }
//
//    public void testeSwitch(){
//        for(int i=1;i<100000000; i++){
//            switch(i) {
//                case 100000000:
//                    System.out.println("número é"+i);
//            }
//        }
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Pix pix = new Pix();

//        //Entrada da hora
//        String hora = "20:00";
//
//        //Criando um objeto de tipo DateTimeFormatter, ele vai dar o formato da hora:minutos
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
//
//        //Formatando a string para horas.
//        df.parse(hora);
//
//        //Validando horas, método matches contém um parâmetro que vai entender cada unidade da hora e minutos, e validar
//        //os limites.
//        if(hora.matches("^(0[9-9]|1[0-9]):[0-5][0-9]$")) {
//            System.out.println(hora);
//        }else{
//            System.out.println("horario invalido");
//        }
        ArrayList<Integer> list = new ArrayList<>();

        long tempoInicial = System.currentTimeMillis();

        DiferentsLists.creatArrayList().add(500000, 10);
        DiferentsLists.sendAllArrayList(list);

        DiferentsLists.creatArrayList().forEach(System.out::println);
        DiferentsLists.creatLinkedList().forEach(System.out::println);

        long tempoFinal = System.currentTimeMillis() - tempoInicial;
        System.out.println("O método foi executado em " + tempoFinal+" ms");
    }
}
