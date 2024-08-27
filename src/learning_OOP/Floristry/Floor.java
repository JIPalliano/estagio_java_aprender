package learning_OOP.Floristry;

public class Floor {
    private double width,height;
    public Floor(double width, double height) {
        this.width = width < 0 ? 0:width;
        this.height = height < 0 ? 0:height;
    }
    double getArea() {
        return width * height;
    }
}
