public abstract class AbsPagamento extends Pagamento {

    public AbsPagamento(int valor, String nome) {
        super(valor, nome);
    }

    public Boolean pagar(){
        return true;
    }
}
