package Shape;

public class Squre extends AbstarctRectangle{
    public Squre(double side) {
        this.height = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return  "Square\n" +
                "Side: " + this.height +
                super.toString();
    }
}
