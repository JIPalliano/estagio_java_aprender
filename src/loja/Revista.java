package loja;

public class Revista extends Item{
    //Atributos(edição, periodicidade)
    private String edicao;
    private double periocidade;

    //Metodo construtor da classe Revista.
    public Revista(String edicao, double periocidade, String titulo, String autor, int anoPublicacao, int id){
        super(titulo, autor, anoPublicacao, id);
        this.edicao = edicao;
        this.periocidade = periocidade;
    }

    //Metodos getters e setters da classe Revista
    public String getEdicao(){
        return edicao;
    }
    public void setEdicao(String edicao){
        this.edicao = edicao;
    }
    public double getPeridciodade(){
        return periocidade;
    }
    public void setPeriocidade(double periocidade){
        this.edicao = edicao;
    }


}
