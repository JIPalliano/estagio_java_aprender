public abstract class Pagamento{
    private int valor;
    private String nome;
//    private boolean a;
//    private Boolean b;

    public Pagamento(int valor, String nome){
        this.valor = valor;
        this.nome = nome;
    }

    public Pagamento(){
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //metodo abstract com default
    abstract Boolean pagar();
    abstract void valor();

    public Boolean testizinho(){
        return pagar();
    }

//    public String estorno(){
//        return "não foi possivel";
//    }
//
//    public boolean isA() {
//        return a;
//    }
//
//    public void setA(boolean a) {
//        this.a = a;
//    }
//
//    public Boolean getB() {
//        return b;
//    }
//
//    public void setB(Boolean b) {
//        this.b = b;
//    }
}
