package Shape;

public abstract class AbstarctShape {
    private String color;
    private boolean filled;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();

    public abstract double getPerimetr();

    @Override
    public String toString() {
        return "Area:" + getArea() +
                ", Perimeter: " + getPerimetr() +
                ", Color: " + getColor() +
                ", Filled: " + isFilled();
    }
}
