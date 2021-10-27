package Shape;

public class BaseRectangle extends AbstarctRectangle{

    public BaseRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Rectangle\n" +
                "Width: " + this.width +
                ", Height: " + this.height +
                ", Area: " + getArea() +
                ", Perimetr: " + getPerimetr() +
                ", Color: " + getColor() +
                ", Filled: " + isFilled();
    }
}
