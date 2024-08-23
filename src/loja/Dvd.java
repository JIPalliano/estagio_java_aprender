package loja;

public class Dvd extends Item{
    //Atributos (duração, gênero)
    private int duracao;
    private String genero;

    public Dvd(int duracao, String genero, String titulo, String autor, int anoPublicacao, int id){
        super(titulo, autor, anoPublicacao, id);
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

    @Override
    public String getTipo(){
        return "Dvd";
    }
    @Override
    public String getDetalhes(){
        return "Titulo do livro: "+getTitulo()+"\nAutor do livro: "+getAutor()
                +"\nDuração do filme: "+getDuracao()+"\nGênero do filme: "+getGenero()
                +"\nAno da Publicação: "+getAnoPublicacao()+"\nId do livro: "+getId();
    }
}
