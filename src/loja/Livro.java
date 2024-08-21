package loja;

public class Livro {
    //Atributos(número de páginas, editora)
    private int numeroDePaginas;
    private String editora;

    //Metodo construtor da classe "Livro"
    public Livro(int numeroDePaginas, String editora){
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
    public String editora(String editora){
        return editora;
    }
    public void setEditora(String editora){
        this.editora=editora;
    }
}
