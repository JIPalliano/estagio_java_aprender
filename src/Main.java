public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and welcome!");
        //"Aceita números de até 3 unidades decimais, sem o (byte).
        //byte x = 100;
        //"Aceita números de até 5 unidades decimais.
        //short x = 10000;
            //"Aceita números de até 10 unidades decimais.
            //int x = 1000000000;
            //"Aceita números de até 10 unidades decimais.
            //long x = 1000000000;
        //olha
        //int x = 2_147_483_647;
        //System.out.println(x);
        Teste car = new Teste();
        car.setMake("alo");
        car.setColor("vermelho");
        car.setModel("Pegeuot");
        car.setDoors(4);
        car.setConvertible(true);
        System.out.println(car.getConvertible());
    }
}