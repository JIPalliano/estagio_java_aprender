package loja;

public class Livro extends Item{
    //Atributos(número de páginas, editora)
    private int numeroDePaginas;
    private String editora;
    //private boolean disponivel = true;

    //Metodo construtor da classe "Livro"
    public Livro(int numeroDePaginas, String editora,String titulo, String autor, int anoPublicacao, int id){
        super(titulo, autor, anoPublicacao, id);
        this.numeroDePaginas = numeroDePaginas;
        this.editora = editora;
    }

    //Metodos getters e setters da classe "Livro"
    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas=numeroDePaginas;
    }
    public String getEditora(){
        return editora;
    }
    public void setEditora(String editora){
        this.editora=editora;
    }



    //@Override esta sobrescrevendo o metodo da classe mãe, o nome do metodo tem que ser igual ao da classe mãe.
    @Override
    public String getTipo(){
        return "Livro";
    }
    @Override
    public String getDetalhes(){
        return "Id do livro: "+getId()+"\nTitulo do livro: "+getTitulo()+"\nAutor do livro: "+getAutor()
                +"\nNúmero de páginas: "+getNumeroDePaginas()+"\nEditora: "+getEditora()
                +"\nAno da Publicação: "+getAnoPublicacao();
    }
}
