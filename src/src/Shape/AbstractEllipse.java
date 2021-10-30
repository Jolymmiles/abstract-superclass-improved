package Shape;

public class AbstractEllipse extends AbstarctShape{
    protected double r1;
    protected double r2;

    @Override
    public double getArea() {
        return Math.PI*this.r1*this.r2;
    }

    @Override
    public double getPerimetr() {
        return 4*((Math.PI*this.r1*this.r2 + (this.r1 + this.r2))/(this.r1 + this.r2));
    }

}
