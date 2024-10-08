package loja;
//classe abstrata
public abstract class Item implements InterfaceMarca{
    //Atributos (título, autor, ano de publicação, ID)
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int id;
    private boolean disponivel = true;
    //metodo que vai diferenciar os tipos de cada classe filha
    abstract String getTipo();
    abstract String getDetalhes();

    //sobrescrevendo metodo da interface, apliquei na mãe e as filhas já importaram o metodo.
    @Override
    public String nomeMarca() {
        return "teste interface";
    }


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


    public Boolean estaDisponivel(){
        return disponivel;
    }

    //metodos estaticos mesmo em classes abstract conseguem ser chamadas sem estanciar a classe
    public static String nomeItem(){
        return "teste aqui";
    }

    public void emprestado(){
        if(estaDisponivel()){
            disponivel = false;
            System.out.println("Item emprestado.");
        }else{
            System.out.println("Item indisponivel.");
        }
    }

    public void devolvido(){
        if(!estaDisponivel()){
            disponivel = true;
            System.out.println("Item devolvido.");
        }else{
            System.out.println("Item indisponivel.");
        }
    }

    @Override
    public String toString(){
        return "Titulo do livro: "+titulo+"\n Autor do livro: "+autor
                +"\n Ano da Publicação: "+anoPublicacao+"\n Id do livro: "+id;
    }
}
