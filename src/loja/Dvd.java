package loja;

public class Dvd {
    //Atributos (duração, gênero)
    private int duracao;
    private String genero;

    public Dvd(int duracao, String genero){
        this.duracao = duracao;
        this.genero = genero;
    }

    public int getDuracao(){
        return duracao;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}
