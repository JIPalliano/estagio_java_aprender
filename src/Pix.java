import loja.InterfaceTeste;

public class Pix extends Pagamento implements InterfaceTeste {
    private String chave;
    String qualquer = "12adev";

    public Pix() {
    }

    public Pix(int valor, String nome, String chave) {
        super(valor, nome);
        this.chave = chave;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    @Override
    public Boolean pagar() {
        return null;
    }

    @Override
    void valor() {

    }


    @Override
    public void jogar() {
        System.out.println("acessar método da interface pelo pix");
    }

    @Override
    public String jogar2() {
        return "acessar metodo da interface";
    }

    @Override
    public void alou() {
        System.out.println("Pix alou");
    }
    @Override
    public String teste(){
        return "pix entrou aqui.";
    }
}
