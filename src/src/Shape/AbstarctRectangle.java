package Shape;

public abstract class AbstarctRectangle extends AbstarctShape {
    protected double width;
    protected double height;

    @Override
    public double getArea() {
        return this.width*this.height;
    }

    @Override
    public double getPerimetr() {
        return 2*(this.height*this.width);
    }
}
