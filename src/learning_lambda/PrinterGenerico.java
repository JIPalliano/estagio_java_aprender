package learning_lambda;

//classe dinamica que recebe valores dinamicos como Intenger, String, double e etc.
public class PrinterGenerico <T>{
    T print;
    public PrinterGenerico(T print){
        this.print=print;
    }

    public void imprimir(){
        System.out.println(print);
    }

    public T imprimirResultado(){
        return print;
    }
}
