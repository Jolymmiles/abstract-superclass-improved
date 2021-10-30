package Shape;

public class Circle extends AbstractEllipse {
    public Circle(double r) {
        this.r1 = r;
        this.r2 = r;
    }

    @Override
    public String toString() {
        return "Circle\n" +
                "R: " + r1 +
                super.toString();
    }
}
