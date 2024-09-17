public class Desenho <T>{
    private T forma;
    private static final int number = 0;


    public Desenho(){

    }
    public Desenho(T forma) {
        this.forma = forma;
    }

    public void desenhar(T forma){
        System.out.println(forma);
    }

    public void desenhar(){
        System.out.println(forma);
    }

    public void desenhar(T forma, String lapis){

    }

    public static String formaDesenho(){
        return "desenho é uma forma";
    }

    public T getForma(){
        return forma;
    }

    public int getNumber(){
        return number;
    }
    //procurar um sentido para o uso final no metodo
    public final String qualquer(String alterar){
        return alterar;
    }

    public void setForma(T forma){
        this.forma = forma;
    }
}
