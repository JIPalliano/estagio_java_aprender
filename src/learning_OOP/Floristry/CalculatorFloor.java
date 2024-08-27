package learning_OOP.Floristry;

public class CalculatorFloor {
    public Floor floor;
    public Carpet carpet;

    public CalculatorFloor(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea() + carpet.getCost();
    }

}
