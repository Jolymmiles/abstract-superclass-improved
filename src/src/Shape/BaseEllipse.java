package Shape;

public class BaseEllipse extends AbstractEllipse {
    public BaseEllipse(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        return "Ellipse\n" +
                "R1: " + r1 +
                ", R2: " + r2 +
                super.toString();
    }
}
