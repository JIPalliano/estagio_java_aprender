public class Teste {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

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

    public void descricaoCarro(){
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible": ""));
    }
}
