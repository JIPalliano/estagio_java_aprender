public class Teste  implements InterfaceLearning{
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public Teste(String make, String model, String color, int doors, boolean convertible){
        this.make=make;
        this.model=model;
        this.color=color;
        this.doors=doors;
        this.convertible=convertible;
        //descricaoCarro();
    }
    public String toString() {
        return doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible": "");
    }

    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getDoors(){
        return doors;
    }
    public void setDoors(Integer doors){
        this.doors = doors;
    }
    public Boolean getConvertible(){
        return convertible;
    }
    public void setConvertible(Boolean convertible){
        this.convertible = convertible ;
    }

    //public void descricaoCarro(){
        //System.out.println(doors + "-Door " +
                //color + " " +
                //make + " " +
                //model + " " +
                //(convertible ? "convertible": ""));
    //}
    public void learn() {
        System.out.println("Método learn criado.");
    }
    public String getName(){
        return "Método getName criado";
    }
}
