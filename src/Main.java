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

        //Entrada da hora
        String hora = "20:00";

        //Criando um objeto de tipo DateTimeFormatter, ele vai dar o formato da hora:minutos
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");

        //Formatando a string para horas.
        df.parse(hora);

        //Validando horas, método matches contém um parâmetro que vai entender cada unidade da hora e minutos, e validar
        //os limites.
        if(hora.matches("^(0[9-9]|1[0-9]):[0-5][0-9]$")) {
            System.out.println(hora);
        }else{
            System.out.println("horario invalido");
        }
//        Pessoa pessoa = new Pessoa("ismael");
        //pessoa.setNome(nome);
        //pessoa.nome = "delicia";
//        String pessoaNome = pessoa.getNome();
//
//        System.out.println("Nome do delicia: \n"+pessoaNome);
//
//        Auth tokenAuth = new TokenAuth("1", "banana", "senha", 45);
//        tokenAuth.authenticate("token");

//        PasswordAuth passwordAuth = new PasswordAuth("1");
//        List<Auth> list2 = new ArrayList<>();
//        Collection<String> x = new Stack<>();
//        list2.add(new PasswordAuth("6", "senha", 45));
//        list2.add(new TokenAuth("6", "senha", "45", 32));
//        System.out.println(list2.get(1).authenticate("password"));
//        System.out.println(list2.get(0).authenticate("senha"));


//        System.out.println(tokenAuth.getAuthentication(tokenAuth));
//        System.out.println(passwordAuth.getAuthentication(passwordAuth));

//        ArrayList<Number> list = new ArrayList<>();
//        list.add(Integer.parseInt("1"));
//        list.add(Float.parseFloat("1"));
//        list.add(Long.parseLong("1"));
//        long tempoInicial = System.currentTimeMillis();

//        DiferentsLists.creatLinkedList().add(500000, 10);
//        DiferentsLists.sendAllArrayList(list);

//        DiferentsLists.creatArrayList().forEach(System.out::println);
//        DiferentsLists.creatLinkedList().forEach(System.out::println);

//        long tempoFinal = System.currentTimeMillis() - tempoInicial;
//        System.out.println("O método foi executado em " + tempoFinal+" ms");
    }
}
