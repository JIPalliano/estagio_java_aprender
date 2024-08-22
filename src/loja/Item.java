package loja;
//classe abstrata
public abstract class Item {
    //Atributos (título, autor, ano de publicação, ID)
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int id;
    private boolean livroAlugado;

    //metodo construtor da classe item.
    public Item(String titulo, String autor, int anoPublicacao, int id, boolean livroAlugado){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.id = id;
        this.livroAlugado = livroAlugado;
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
    public Boolean getLivroAlugado(){
        return livroAlugado;
    }
    public void setLivroAlugado(Boolean livroAlugado){
        this.livroAlugado=livroAlugado;
    }

    public Boolean livroDisponivel(){
        if (livroAlugado == true) {
            System.out.println("O livro "+titulo+" esta alugado, tente alugar outro!");
            return true;
        }else{
            System.out.println("O livro "+titulo+" esta disponivel!");
            return false;
        }
    }

    public void marcaLivro(){
        if(livroAlugado == true){

        }
    }

    private void emprestado(){

    }

    public String toString(){
        return "Titulo do livro: "+titulo+"%m Autor do livro: "+autor
                +"%m Ano da Publicação: "+anoPublicacao+"%m Id do livro: "+id;
    }
}
