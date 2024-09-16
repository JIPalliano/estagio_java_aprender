public class Desenho {
    private String forma;
    private static final int number = 0;


    public Desenho(){

    }
    public Desenho(String forma) {
        this.forma = forma;
    }

    public static String formaDesenho(){
        return "desenho é uma forma";
    }

    public String getForma(){
        return forma;
    }

    public int getNumber(){
        return number;
    }
    //procurar um sentido para o uso final no metodo
    public final String qualquer(String alterar){
        return alterar;
    }

    public void setForma(String forma){
        this.forma = forma;
    }
}
