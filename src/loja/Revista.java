package loja;

public class Revista {
    //Atributos(edição, periodicidade)
    private String edicao;
    private double periocidade;

    //Metodo construtor da classe Revista.
    public Revista(String edicao, double periocidade){
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
