package loja;
//classe abstrata
public abstract class Item {
    //Atributos (título, autor, ano de publicação, ID)
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int id;

    //metodo construtor da classe item.
    public Item(String titulo, String autor, int anoPublicacao, int id){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.id = id;
    }

    //metodos Getters e Setters, onde vão receber o valor e setar o valor.
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao=anoPublicacao;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public Boolean valorValido(){
        return true;
    }
}
