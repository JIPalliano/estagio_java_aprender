package loja;

public interface InterfaceTeste {
    default void jogar(){
        System.out.println("Jogando");
    }
    default String jogar2(){
        return teste();
    }
    default public String teste(){
        return "p";
    }
    public void alou();
}
