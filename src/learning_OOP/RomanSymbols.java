package learning_OOP;

public enum RomanSymbols {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    private int value;

    private RomanSymbols(Integer val){
        this.value = val;
    }

    public Integer getValue(){
        return this.value;
    }

    public String intToRoman(int num){
        //Criando uma lista como String
        StringBuilder sb = new StringBuilder();
        //Percorrendo a lista de constantes.
        for(RomanSymbols s : RomanSymbols.values()){
            //validando os valores.
            while(num >= s.getValue()){
                if(num == s.getValue()) {
                    sb.append(s.toString());
                    num -= s.getValue();
                }else{
                    return "Valor desse número romano não existe.";
                }
            }
        }
        return sb.toString();
    }


}
