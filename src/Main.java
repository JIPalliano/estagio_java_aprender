import java.util.ArrayList;
import loja.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and welcome!");
        //"Aceita números de até 3 unidades decimais, sem o (byte).
        //byte x = 100;
        //"Aceita números de até 5 unidades decimais.
        //short x = 10000;
            //"Aceita números de até 10 unidades decimais.
            //int x = 1000000000;
            //"Aceita números de até 10 unidades decimais.
            //long x = 1000000000;
        //olha
        //int x = 2_147_483_647;
        //System.out.println(x);
        //Dvd cd = new Dvd();

        Revista revista = new Revista("teste", 4.5,"mares do bem", "fafa de belem",
                2024, 1);
        Dvd dvd = new Dvd(2, "Terror","mares do bem", "fafa de belem",
                2024, 1);
        Livro livro = new Livro(200, "darkside","mares do bem", "fafa de belem",
                2024, 1);
        Livro livro2 = new Livro(250, "Brasil","Fortnite", "epic games",
                2022, 2);
        //Entendendo o final, mesmo declarando ele como um objeto ele não muda o valor que esta dentro dele.
        final Integer x = 1;
        x.valueOf(4);
        System.out.println(x);
        //System.out.println(revista);
        //revista.setAutor("Julio cocielo");
        //System.out.println(revista.eVerdadeEsseBilhete());
        System.out.println(livro.nomeMarca());
        //System.out.println(dvd.getDetalhes());
        //System.out.println(revista.getTipo());
        //System.out.println(revista.getDetalhes());
        System.out.println(Livro.nomeItem());
        System.out.println(InterfaceMarca.nomeStatico());
        //duas chamadas de metodos diferentes
        System.out.println(Livro.nomeLivro());
        String wRapper = "teste";
        //Integer wRapper2 = Integer.valueOf("10");
        //wRapper.describeConstable();
        System.out.println(wRapper.describeConstable());
        //System.out.println(wRapper2.hashCode());
        //System.out.println(livro2.getDetalhes());
        //Void como não retorna nada, ele ira retornar só a string, mas não seria um retorno e sim uma saída de dado.
        //livro2.emprestado();
        //livro.emprestado();
        //Testei também especificação de cada objeto, no caso acima chamei o metodo emprestado em dois objetos, os dois mostram que foram emprestado, logo abaixo chamei novamento o objeto e ele mostra que esta indisponivel.
        //livro2.emprestado();


    }
}